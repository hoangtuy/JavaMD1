package advance.dev.models;

public class Triangle extends Shape{
	private double a;
	private double b;
	private double c;
	
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double chuVi() {
		return a + b + c;
	}

	@Override
	public double dienTich() {
		double p = chuVi() / 2;
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
	}

	public String toString() {
	    return String.format("%s ; Cv= %.2f ; dt= %.2f", "Hinh tam giac" , chuVi(), dienTich());
	}
}
