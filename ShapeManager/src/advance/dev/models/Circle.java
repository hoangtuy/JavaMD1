package advance.dev.models;

public class Circle extends Shape{
	private double bk;
	
	
	public Circle(double bk) {
		super();
		this.bk = bk;
	}

	@Override
	public double chuVi() {
		return 2 * Math.PI * bk;
	}

	@Override
	public double dienTich() {
		return Math.PI * bk * bk;
	}
	
	public String toString() {			
	    return String.format("%s ; Cv= %.2f ; dt= %.2f", "Hinh tron" , chuVi(), dienTich());		
	}

}
