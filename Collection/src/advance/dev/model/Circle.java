package advance.dev.model;

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
	public double dienTic() {
		// TODO Auto-generated method stub
		return Math.PI * bk * bk;
	}

}
