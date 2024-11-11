import java.util.Objects;

public class Car {

	private String brand;
	private String model;
	private String plate;
	
	public Car(String brand, String model, String plate) {
		super();
		this.brand = brand;
		this.model = model;
		this.plate = plate;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", plate=" + plate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(plate);
	}

	@Override
	public boolean equals(Object obj) {
		Car other = (Car) obj;
		return Objects.equals(plate, other.plate);
	}
	
	
	
}
