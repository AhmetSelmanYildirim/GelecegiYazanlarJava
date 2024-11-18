import java.util.Objects;

public class Bisiklet {
	
	private String brand;
	private int gearCount;
	
	public Bisiklet() {
		
	}
	
	public Bisiklet(String brand, int gearCount) {
		this.brand = brand;
		this.gearCount = gearCount;
	}
	public Bisiklet(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getGearCount() {
		return gearCount;
	}

	public void setGearCount(int gearCount) {
		this.gearCount = gearCount;
	}

	@Override
	public String toString() {
		return "Bisiklet [brand=" + brand + ", gearCount=" + gearCount + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, gearCount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bisiklet other = (Bisiklet) obj;
		return Objects.equals(brand, other.brand) && gearCount == other.gearCount;
	}
	
	

}
