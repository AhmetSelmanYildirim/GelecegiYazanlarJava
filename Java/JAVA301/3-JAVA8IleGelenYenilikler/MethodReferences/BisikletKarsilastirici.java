import java.util.Comparator;

public class BisikletKarsilastirici implements Comparator<Bisiklet> {

	@Override
	public int compare(Bisiklet o1, Bisiklet o2) {
		
		return o1.getGearCount()-o2.getGearCount();
	}

	
	
}
