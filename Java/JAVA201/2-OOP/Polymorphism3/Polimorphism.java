
public class Polimorphism {

	public static void main(String[] args) {
		/*
		Worker worker = new Worker("Ahmet", "Backend", 60000);
		worker.summary();
		
		Developer dev = new Developer("Selman", "Frontend", 50000);
		dev.setUnit("E-ticaret");
		dev.summary();
		*/
		
		Worker worker = new Developer("Selman", "Frontend", 50000, "Eticaret");
		// worker.setUnit worker da olmadığı için constructordan alınabilir.
		worker.summary();
		
	}
	
}
