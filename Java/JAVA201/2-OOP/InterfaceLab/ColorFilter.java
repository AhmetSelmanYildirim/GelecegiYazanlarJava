
public class ColorFilter implements AppleFilter{

	@Override
	public boolean filter(Apple apple) {
		return apple.getColor().equals("Kırmızı");
	}

}
