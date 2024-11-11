
// TreeSet sınıfları comparable interfaceini implement etmelidir.
public class City implements Comparable {
	
	private String plateNo;
	private String name;
	
	public City(String plateNo, String name) {
		super();
		this.plateNo = plateNo;
		this.name = name;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "City [plateNo=" + plateNo + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {
		City city = (City) o;
		return Integer.valueOf(this.plateNo) - Integer.valueOf(city.plateNo);
	}
	
	

}
