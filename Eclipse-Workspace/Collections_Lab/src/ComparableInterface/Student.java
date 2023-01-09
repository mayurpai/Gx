package ComparableInterface;

public class Student implements Comparable<Student>  {
	private int id;
	private String name;
	private int score;
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	public int compareTo(Student s)
	{
		return this.id-s.id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	

}
