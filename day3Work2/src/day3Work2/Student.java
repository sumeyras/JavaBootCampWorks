package day3Work2;

public class Student extends User {
	
	private int grade;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int grade) {
		super();
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}


}
