
public class Driver {

	public static void main(String[] args) {
		Worker worker = new Worker();
		try {
			worker.setName("Ahmet YILDIRIM");
			worker.setSalary(-70000);
		} catch (WrongValue e) {
			System.out.println(e.getMessage());
		}
		System.out.println(worker.toString());
	}

}
