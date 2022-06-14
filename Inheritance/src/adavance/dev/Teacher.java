package adavance.dev;
//Dan xuat
public class Teacher extends Person {
	private double hsl;
	private String mgv;
	
	public Teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public Teacher(String name, int age, double hsl, String mgv) {
		super(name, age);
		this.hsl = hsl;
		this.mgv = mgv;
	}
	public double getHsl() {
		return hsl;
	}
	public void setHsl(double hsl) {
		this.hsl = hsl;
	}
	public String getMgv() {
		return mgv;
	}
	public void setMgv(String mgv) {
		this.mgv = mgv;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Name:%s - Age:%d - hsl:%.2f", name, age, hsl);
	}

}
