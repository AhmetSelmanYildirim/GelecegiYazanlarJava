import java.util.Objects;

public class Worker{
	
	private String tcNo;
	private String name;
	
	public Worker(String tcNo, String name) {
		super();
		this.tcNo = tcNo;
		this.name = name;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Worker [tcNo=" + tcNo + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(tcNo);
	}
	// uniquelik durumunda eğer değerler aynıysa bu sefer equals methoduna bakılır
	@Override
	public boolean equals(Object obj) {
		Worker other = (Worker) obj;
		return Objects.equals(tcNo, other.tcNo);
	}
	

}
