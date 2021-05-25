package day2Work1;



public class Category {

	private int id;
	private String name;
	
	
	public Category() {
		
		System.out.println("Category çalýþtý");
		
	}

	public Category(int id, String name) {
		super();
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
}