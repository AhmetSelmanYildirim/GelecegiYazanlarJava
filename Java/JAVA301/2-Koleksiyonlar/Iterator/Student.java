import java.util.Iterator;

public class Student implements Iterable<Integer> {
	
	private String name;
	private int[] scores;
	private int index =0;
	
	public Student(String name, int[] scores) {
		super();
		this.name = name;
		this.scores = scores;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			
			@Override
			public Integer next() {
				return scores[index++];
			}
			
			@Override
			public boolean hasNext() {
				return index < scores.length;
			}
		};
	}
	
	

}
