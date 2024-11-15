
public class Driver {

	public static void main(String[] args) {

		Hello hello = () -> "Merhaba";
		System.out.println(hello.hi());
		
		Hello2 hello2 = (s) -> "Merhaba " + s;
		System.out.println(hello2.hi("Ahmet"));
		
		Sum sum = (a,b) -> a+b;
		System.out.println(sum.sum(1, 3));
		
	}

}
