package collections;

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return String.format("[ id - %d, name - %s ]", id, name);
	}

	@Override
	public int compareTo(Student that) {
		return Integer.compare(this.id, that.id); // 순서 반대로 하고 싶으면 this와 that 순서 바꾸기 (that.id, this.id)
	}
}
