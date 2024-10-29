import java.util.Arrays;
import java.util.Iterator;

public class StaticveNormalMetodlar {
	
	private int x = 10;
	private static int y = 20;
	
	public static void main(String[] args) {
		StaticveNormalMetodlar snm = new StaticveNormalMetodlar();
		snm.normalMethod();
		
		StaticveNormalMetodlar.staticMethod();
		staticMethod();
		
		int max =(StaticveNormalMetodlar.max(1, 5, 3));
		System.out.println("max: "+max);
		
		double doubleMax = StaticveNormalMetodlar.max(5.8, 4.3, 1.99);
		System.out.println("doubleMax: "+ doubleMax);
		
		boolean majority = StaticveNormalMetodlar.majority(true, true, false);
		System.out.println("majority: "+majority);
		
		int[] x= {2,3,4};
		int[] y= {2,3,4};
		boolean equality = StaticveNormalMetodlar.equality(x,y);
		System.out.println("equality: "+equality);
		
		System.out.println(StaticveNormalMetodlar.cube(5));
		
		int[] arr= {2,4,5,9};
		System.out.println(StaticveNormalMetodlar.sum(arr));
		
		int[] eNumbers = {1,2,3,4,5,6,7,8,9,0};
		System.out.println(Arrays.toString(StaticveNormalMetodlar.evenNumbers(eNumbers)));
		
		int[] sNumbers = {2,3};
		System.out.println(Arrays.toString(sNumbers));
		StaticveNormalMetodlar.swap(sNumbers);
		System.out.println(Arrays.toString(sNumbers));
		
	}
	
	public void normalMethod() {
		System.out.println("Normal method çağrıldı");
		System.out.println("x: "+x);
		// statik değişkenler program ilk çalışırken bellekte yer alacağı için 
		// statik olmayan methodlarda kullanılabilirler.
		System.out.println("y: "+y);
	}
	
	public static void staticMethod() {
		System.out.println("Statik Method çağrıldı.");
		// x değişkeni statik olmadığı için instance alınmadan bellekte var olmazlar
		// o yüzden statik bir method içinde kullanılamazlar.
		//System.out.println("x: "+x);
		System.out.println("y: " +y);
	}
	
	public static int max(int x, int y, int z) {
		int max = x;
		if(y>max) max = y;
		if(z>max) max =z;
		return max;
	}
	
	public static double max(double x, double y, double z) {
		double max = x;
		if(y>max) max = y;
		if(z>max) max = z;
		return max;
	}
	
	public static boolean majority(boolean x, boolean y, boolean z) {
		return ( x&&y ) || ( x&&z ) || ( y&&z );
	}
	
	public static boolean equality(int[] x, int[] y) {
		boolean result = false;
		
		if(x.length == y.length){
			for(int i=0; i<x.length; i++) {
				if(x[i] != y[i]) {
					result = false;
					break;
				}else {
					result = true;
				}
			}
				
		}
		
		return result;
	}

	public static int cube(int x) {
		return (int)Math.pow(x, 3);
	}
	
	public static int sum (int[] x) {
		int result =0;
		for(int i=0; i<x.length; i++) {
			result += x[i];
		}
		return result;
	}

	public static int[] evenNumbers(int[] numbers) {
		int evenCount =0;
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i] % 2 == 0) evenCount++;
		}
		
		int[] result = new int[evenCount];
		int index =0;
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i] % 2 == 0) result[index++] = numbers[i];
		}
		return result;
	}
	
	public static void swap(int [] numbers) {
		int swap=numbers[0];
		numbers[0]=numbers[1];
		numbers[1]=swap;
	}
	
	
	
}
