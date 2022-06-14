package advance.dev;

public class Student {
	private String name;
	private int age;
	private String address;
	private double mark;
	
	public Student() {}
	
	public Student(String name, int age, String address, double mark) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.mark = mark;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	
}
