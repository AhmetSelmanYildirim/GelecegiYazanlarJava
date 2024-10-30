
public class Driver {

	public static void main(String[] args) {
		Transporter transporter = new Transporter();
		transporter.setProducer("X");
		transporter.setCapacity(1000);
		
		TIR tir = new TIR();
		tir.setProducer("Y");
		tir.setCapacity(2000);
		tir.setContainerCount(20);
		
		
	}

}
