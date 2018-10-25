package FirstTask;

public class CatTaskOne {
	private String name;
	private double age;
	private String color;
	private String catBread;

	public CatTaskOne(String name, double age, String color, String catBread) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.catBread = catBread;
	}

	public CatTaskOne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCatBread() {
		return catBread;
	}

	public void setCatBread(String catBread) {
		this.catBread = catBread;
	}

	public void meow() {
		System.out.println("MEOW MEOW MEOW");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", color=" + color + ", catBread=" + catBread + "]";
	}

}
