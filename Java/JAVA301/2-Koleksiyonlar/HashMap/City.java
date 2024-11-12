import java.io.Serializable;
import java.util.Objects;

public class City implements Serializable {

	private String name;
	private long population;
	public City(String name, long population) {
		super();
		this.name = name;
		this.population = population;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, population);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", population=" + population + "]";
	}
	
	
	
}
