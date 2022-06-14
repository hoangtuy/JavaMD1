package advance.dev.models;

public class Rect extends Shape{
	private double a;
	private double b;
	
	
	public Rect(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double chuVi() {
		return 2 * (a + b);
	}

	@Override
	public double dienTich() {
		return a * b;
	}

	public String toString() {
	    return String.format("%s ; Cv= %.2f ; dt= %.2f", "Hinh chu nhat" , chuVi(), dienTich());
	}
}
