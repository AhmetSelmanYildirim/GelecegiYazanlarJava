import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

public class Car implements Serializable {

	private String brand;
	private String model;
	private Engine engine;
	
	public Car() {
		
	}

	public Car(String brand, String model, Optional<Engine> engine) {
		this.brand = brand;
		this.model = model;
		/*
		if(engine == null) {
			throw new IllegalArgumentException("Engine null olamaz");
		}
		*/
		this.engine = engine.orElseThrow(()->  new IllegalArgumentException("Engine null olamaz"));
		/*this.engine = engine.orElseThrow(new Supplier<IllegalArgumentException>() {

			@Override
			public IllegalArgumentException get() {
				return new IllegalArgumentException("Engine null olamaz");
			}
		});*/
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

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, engine, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(engine, other.engine)
				&& Objects.equals(model, other.model);
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", engine=" + engine + "]";
	}
	
	
	
}
