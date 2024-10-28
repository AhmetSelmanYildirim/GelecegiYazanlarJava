
public class AritmatikselOperatorler {

	public static void main(String[] args) {

		/*
		int x = 10;
		int y = 20;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y); // iki değişken de int olduğu için float bir değişken dönemiyor ve 0 dönüyor
		float z =20f;
		System.out.println(x/z);
		System.out.println(5%2);
		
		// Bütünleşik
		int a=10;
		//a=a+2;
		a+=2;
		System.out.println(a);
		
		// prefix postfix
		int q = 15;
		System.out.println(q++); // Kullanıldıktan sonra değer artar
		System.out.println(++q); // Kullanılmadan önce değer artar
		*/
		int i = 10; // 00000000 00000000 00000000 00001010 -> intler bellekte bu şekilde 32 bit yer kaplar
		System.out.println(~i); // binary bazlı tersini alır -11
		int x = 4; // 00000000 00000000 00000000 00000100
		System.out.println(i & x); // işlemler binary bazlı yapılır.
		System.out.println(i | x);  // 00000000 00000000 00000000 00001010
									// 00000000 00000000 00000000 00000100
									// 00000000 00000000 00000000 00001110 = 14
		System.out.println(x >> 1); // 00000000 00000000 00000000 00000010
		System.out.println(x << 1); // 00000000 00000000 00000000 00001000
		
	}

}
