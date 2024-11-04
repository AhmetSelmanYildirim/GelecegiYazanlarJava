
public class WeightFilter implements AppleFilter {

	@Override
	public boolean filter(Apple apple) {
		return apple.getWeight() >= 40;
	}

}
