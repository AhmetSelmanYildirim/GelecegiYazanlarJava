import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // RegEx bir string değer içinde arama yapmayı sağlar.
        /*
            ^ -> satır başlangıcı : "Benim isimin" = ^Benim
            [a-zA-Z0-9_-]
            0-9 -> rakam içeriyor mu
            _ -> _ içeriyor mu
            - -> - içeriyor mu
            {3,12} -> 3-12 karakter arası uzunluğunda mı
            $ -> string sonu

            ^ -> dışında : ^a-p = a-p karakterleri dışında
            - arasında
            \\. -> . karakteri var mı
            [a-e[p-t]] -> union : a-e arasında veya p-t arasında karakter
            && -> intersection
            . -> herhangi bir har gelebilir :"ahmet" = "..me."
            [abc] a b c harflerinden bir harf mi?
            [^abc] a b c  harfleri dışında bir harf mi?
            [a-zA-Z] a-z ya da A-Z arasında
            [a-z && [^bc]] a-z dahil bc hariç harfler mi
            [a-f&&[b-t]] b,c,d,e,f harflerinden birisi
        */

        Pattern pattern;
        Matcher matcher;

        String wordForSearch = "ahmet";
        String sentence = "Ahmet Selman YILDIRIM";
        pattern = Pattern.compile(wordForSearch, Pattern.CASE_INSENSITIVE); // pattern belirleniyor. (regex)
        matcher = pattern.matcher(sentence); // Verilen pattern eşleşiyorsa true döner

        if(matcher.find()) {
            System.out.println(wordForSearch + " -" + sentence + "- metni içinde var");
        }else{
            System.out.println(wordForSearch + " -" + sentence + "- metni içinde yok");
        }

        System.out.println(Pattern.matches(wordForSearch, sentence)); // regex ve input bekler. Doğrudan eşleşen bir metin var mı diye bakar.

        String expression = "kedi|kopek";
        String regex = "\\|"; // \\ ile | karakterine göre regex ayarlanır

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(expression);
        if(matcher.find()) {
            String[] animals = expression.split(regex);
            for(String animal : animals) {
                System.out.println(animal);
            }
        }

        // . karakteri -> herhangi bir harf olma durumu
        expression = "kalem";
        pattern = Pattern.compile(".al..");
        matcher = pattern.matcher(expression);
        System.out.println("5 harfli bir stringte 2. harf a 3. harf l mi ? " + matcher.find()+" " +expression);
        System.out.println("5 harfli bir stringte 2. harf a 3. harf l mi ? " + matcher.matches()+" "+expression);
        expression = "kiraz";
        matcher = pattern.matcher(expression);
        System.out.println("5 harfli bir stringte 2. harf a 3. harf l mi ? " + matcher.find()+" " +expression);

        // [abc]
        expression = "a";
        regex = "[abc]";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(expression);
        System.out.println("abc harflerinden bir harf var mı? "+ matcher.find()+" " +expression); // a true | at true

        // [^abc]
        expression = "acw";
        regex = "[^abc]";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(expression);
        System.out.println("abc harfleri dışında bir harf var mı? "+ matcher.find()+" " +expression); // acw true | ac false

        // [a-fA-Z]
        expression = "gF";
        regex = "[a-fA-Z]";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(expression);
        System.out.println("a-f A-Z arasında bir harf var mı? "+ matcher.find()+" " +expression); // g false | fF true

        // [a-e[k-y]] -> a-e arasında veya f-y arasında bir harf var mı?
        expression = "fF";
        regex = "[a-e[k-y]]";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(expression);
        System.out.println("a-f A-Z arasında bir harf var mı? "+ matcher.find()+" " +expression); // lF true | fF false -> expression içinde regex var mı diye bakar
        System.out.println("a-f A-Z arasında bir harf mi? "+ matcher.matches()+" " +expression); // lF false | fF false | a true | l true -> regex tüm ifade ile uyuşuyor mu diye bakar

        // [a-z&&[^f-k]] -> a-z arasında ve f-g arasında olmayan bir harf var mı?
        expression = "af";
        regex = "[a-z&&[^f-k]]";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(expression);
        System.out.println("a-z arasında ve f-k arasında olmayan bir harf var mı? "+ matcher.find()+" " +expression); // f false | af true
        System.out.println("a-z arasında ve f-k arasında olmayan bir harf mi? "+ matcher.matches()+" " +expression); // f false | af false

        // regEx Quantifiers
        /*
            a? a bir defa vardır ya da hiç yoktur.
            a+ a bir defa ya da birden fazla vardır.
            a* a hiç yoktur ya da birden fazla var.
            a{n} a'dan n defa vardır.
            a{n,} a en az n defa vardır.
            a{n,m} a en az n defa en fazla m defa vardır.
        */
        System.out.println("RegEx Quantifiers");
        System.out.println("a?");
        System.out.println(Pattern.matches("a?","a")); // true
        System.out.println(Pattern.matches("a?","aa"));// false
        System.out.println(Pattern.matches("a?",""));  // true
        System.out.println(Pattern.matches("a?","b")); // false
        System.out.println("a+");
        System.out.println(Pattern.matches("a+","a")); // true
        System.out.println(Pattern.matches("a+","aa"));// true
        System.out.println(Pattern.matches("a+",""));  // false
        System.out.println(Pattern.matches("a+","b")); // false
        System.out.println("a*");
        System.out.println(Pattern.matches("a*","a")); // true
        System.out.println(Pattern.matches("a*","aa"));// true
        System.out.println(Pattern.matches("a*",""));  // true
        System.out.println(Pattern.matches("a*","b")); // false
        System.out.println("a{n}");
        System.out.println(Pattern.matches("a{2}","a")); // false
        System.out.println(Pattern.matches("a{2}","aa"));// true
        System.out.println(Pattern.matches("a{2}",""));  // false
        System.out.println(Pattern.matches("a{2}","b")); // false
        System.out.println("a{n,}");
        System.out.println(Pattern.matches("a{2,}","a")); // false
        System.out.println(Pattern.matches("a{2,}","aaa"));// true
        System.out.println(Pattern.matches("a{2,}",""));  // false
        System.out.println(Pattern.matches("a{2,}","b")); // false
        System.out.println("a{n,m}");
        System.out.println(Pattern.matches("a{2,4}","a")); // false
        System.out.println(Pattern.matches("a{2,4}","aaa"));// true
        System.out.println(Pattern.matches("a{2,4}",""));  // false
        System.out.println(Pattern.matches("a{2,4}","b")); // false

        // Meta karakterler -> karakter bir harf mi? ifade mi?
        /*
            . herhangi bir karakter
            d rakam olan karakter - digit
            D rakam olmayan karakter - non-digit
            s boşluk olan karakter
            S boşluk olmayan karakter
            w kelime karakteri [a-zA-z_0-9]
            W kelime karakteri olmayan
            b kelime karakteri olan sınırı
            B kelime karakteri olmayan sınır
         */

        System.out.println(". Herhangi bir karakter olduğunu kontrol eden meta karakter");
        System.out.println(Pattern.matches(".hm.t","ahmet")); // true
        System.out.println(Pattern.matches(".","ahmet")); // false
        System.out.println(Pattern.matches(".","a")); // true
        System.out.println(Pattern.matches("\\.",".")); // true

        System.out.println("S boşluk olmadığını kontrol eden karakter");
        System.out.println(Pattern.matches(".hm\\St","ahmet")); // true
        System.out.println(Pattern.matches("\\S*","ahmet")); // true
        System.out.println(Pattern.matches("\\S","a")); // true
        System.out.println(Pattern.matches("\\S",".")); // true

        System.out.println("w kelime karakteri kontrolü yapan karakter");
        System.out.println(Pattern.matches(".hm\\wt","ahmet")); // true
        System.out.println(Pattern.matches("\\w*","ahmet")); // true
        System.out.println(Pattern.matches("[\\w^[ ]]*","ahmet selman")); // true
        System.out.println(Pattern.matches("\\w","a")); // true
        System.out.println(Pattern.matches("\\w",".")); // false

        System.out.println("W kelime karakteri olmayan kontrolü yapan karakter");
        System.out.println(Pattern.matches("\\W","ahm et")); // false
        System.out.println(Pattern.matches("\\W*","ahmet")); // false
        System.out.println(Pattern.matches("\\W","a")); // false
        System.out.println(Pattern.matches("\\W",".")); // true

        System.out.println("b kelime karakteri ile başlama kontrolü yapan karakter");
        System.out.println(Pattern.matches("\\bahmet\\b","ahmet")); // true
        System.out.println(Pattern.matches("\\b","a")); // false
        System.out.println(Pattern.matches("\\b",".")); // false

        System.out.println("B kelime karakteri ile başlamama kontrolü yapan karakter");
        System.out.println(Pattern.matches("ahmet!\\B","ahmet!")); // true
        System.out.println(Pattern.matches("[a-z\\W]*\\B","ahmet!")); // true
        System.out.println(Pattern.matches("\\B","a")); // false
        System.out.println(Pattern.matches("\\B",".")); // false






    }
}