
public class WrongRadius extends RuntimeException {

	private int r;
	
	public WrongRadius(int r ) {
		super("Yarıçap "+ r + " olamaz.");
	}
	
}
