package advance.dev.models;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private double diem;
	public Student(String name, int age, double diem) {
		super();
		this.name = name;
		this.age = age;
		this.diem = diem;
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
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	
	public String toString() {
	    return String.format("Name: %s - Age: %d - Diem:= %.2f", name , age, diem);
	}
	
	public int compareTo(Student o) {
		return this.diem > o.diem ? 1 : diem == o.diem ? 0 : -1;
	}
}

