import java.util.Date;

public class Driver {
	public static void main(String[] args) {
		
		Worker worker = new Worker("Ahmet");
		Worker worker2 = new Worker("Ahmet",70000);
		Worker worker3 = new Worker("Ahmet",70000, new Date());

		worker.print();
		worker2.print();
		worker3.print();
	}
}
