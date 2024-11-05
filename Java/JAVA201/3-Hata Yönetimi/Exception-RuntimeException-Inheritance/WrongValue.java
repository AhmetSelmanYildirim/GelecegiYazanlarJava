
public class WrongValue extends Exception{

	public WrongValue(String var, Object value) {
		super(var+" "+value+" olamaz");
	}
	
}
