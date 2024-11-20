import java.io.Serializable;
import java.util.Objects;

public class Engine implements Serializable{
	
	private int volume;
	
	public Engine() {
		
	}

	public Engine(int volume) {
		super();
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public int hashCode() {
		return Objects.hash(volume);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		return volume == other.volume;
	}

	@Override
	public String toString() {
		return "Engine [volume=" + volume + "]";
	}
	
	
	
	

}
