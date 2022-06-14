package adavance.dev;

public class Student extends Person {

	private double toan;
	private double ly;
	private double hoa;
	
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}	
	
	public Student(String name, int age, double toan, double ly, double hoa) {
		super(name, age);
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}

	public double diemTrungBinh() {
		return (toan + ly + hoa) / 3;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Name:%s - Age:%d - DTB:%.2f", name, age, diemTrungBinh());
	}
}
