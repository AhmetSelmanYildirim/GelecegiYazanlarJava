
public class C extends B {

	public C(String text) {
		//Kalıtım halinde eğer ata sınıfın constructor ı parametre alıyorsa 
		//alt sınıf da aynı parametreyi alıp super(parametreler) şeklinde ilk satırda üst sınıfa göndermelidir.
		super(text);
		System.out.println("C ctor");
	}
	
}
