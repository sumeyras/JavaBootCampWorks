package day2Work1;



public class Course {

	
	private int id;
	private String name;
	private String explanation;
	private boolean free;
	private String instructorName;
	
	public Course() {
		System.out.println("Course çalýþtý");
	}

	public Course(int id, String name, String explanation, boolean free, String instructorName) {
		this();
		this.id = id;
		this.name = name;
		this.explanation = explanation;
		this.free = free;
		this.instructorName = instructorName;
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

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
}
