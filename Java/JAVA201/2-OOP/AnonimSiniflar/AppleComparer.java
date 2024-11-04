import java.util.Comparator;

public class AppleComparer implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Apple apple1 = (Apple) o1;
		Apple apple2 = (Apple) o2;
		return apple1.getWeight() - apple2.getWeight();
	}

}
