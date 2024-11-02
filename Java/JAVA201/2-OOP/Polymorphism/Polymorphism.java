
public class Polymorphism {

	public static void main(String[] args) {

		/*
		 * Animal animal = new Animal();
		 * animal.voice();
		 * 
		 * Cat cat = new Cat();
		 * cat.voice();
		 * 
		 * Dog dog = new Dog();
		 * dog.voice();
		 */

		// Çok biçimlilik
		// alt sınıf üst sınıf referansından türüyebilir ve onun metodlarını
		// özelleştirebilir.
		Animal animal = new Dog();
		animal.voice();

		// Compile time polymorphism
		Animal animal2 = new Cat();
		animal2.voice();

		Animal animal3 = new Bird();
		animal3.voice();

	}

}
