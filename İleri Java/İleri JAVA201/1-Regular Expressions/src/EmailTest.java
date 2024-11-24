import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailTest {

    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9_-]+\\.[a-zA-Z]{1,3}$";

    public EmailTest() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean validate(final String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {

        EmailTest emailTest = new EmailTest();
        System.out.println(emailTest.validate("ahmet.selman.yildirim@outlook.com"));// true
        System.out.println(emailTest.validate("ahmet232_yil-dirim@outlook.com"));   // true
        System.out.println(emailTest.validate("ahmet232_yil-$dirim@outlook.com"));  // false
        System.out.println(emailTest.validate("ahmet232_yil-$dirimoutlook.com"));   // false

        Scanner scanner = new Scanner(System.in);
        System.out.print("Email adresinizi giriniz: ");
        String email = scanner.nextLine();
        boolean result = emailTest.validate(email);
        System.out.println(result ? "Emailiniz geçerli.":"Emailiniz geçersiz");
    }


}
