package advance.dev.models;

public class Circle extends Shape {
	private double bk;
	
	public Circle(double bk) {
		super();
		this.bk = bk;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * bk;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * bk * bk;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name:Circle - cv:%.2f - dt:%.2f", chuVi(), dienTich());
	}

}
