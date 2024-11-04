import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		
		Apple[] apples = new Apple[5];
		apples[0] = new Apple(5,"Yeşil");
		apples[1] = new Apple(10,"Sarı");
		apples[2] = new Apple(50,"Yeşil");
		apples[3] = new Apple(75,"Kırmızı");
		apples[4] = new Apple(35,"Yeşil");
		
		/*
		filterColor("Yeşil", apples);
		System.out.println("********");
		filterWeight(25,apples);
		System.out.println("********");
		filterWeight2(25,apples);
		*/
		
		ColorFilter colorFilter = new ColorFilter();
		WeightFilter weightFilter = new WeightFilter();
		filter(colorFilter,apples);
		System.out.println("*********");
		filter(weightFilter,apples);
		
		
	}
	
	public static void filterColor(String color, Apple[] apples) {
		for (int i =0; i < apples.length ; i++) {
			Apple apple = apples[i];
			if(apple.getColor().equals(color)) {
				System.out.println(apple.getColor()+" "+apple.getWeight());
			}
		}
	}
	
	public static void filterWeight(int weight, Apple[] apples) {
		for (int i =0; i < apples.length ; i++) {
			Apple apple = apples[i];
			if(apple.getWeight() >= weight) {
				System.out.println(apple.getColor()+" "+apple.getWeight());
			}
		}
	}
	
	public static void filterWeight2(int weight, Apple[] apples) {
		for (int i =0; i < apples.length ; i++) {
			Apple apple = apples[i];
			if(apple.getWeight() < weight) {
				System.out.println(apple.getColor()+" "+apple.getWeight());
			}
		}
	}
	
	public static void filter(AppleFilter appleFilter, Apple[] apples) {
		for (int i =0; i < apples.length ; i++) {
			Apple apple = apples[i];
			if(appleFilter.filter(apple)) {
				System.out.println(apple.getColor()+" "+apple.getWeight());
			}
		}
	}
	
}
