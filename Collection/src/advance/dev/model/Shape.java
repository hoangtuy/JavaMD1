package advance.dev.model;

public abstract class Shape implements Comparable<Shape> {
	public abstract double chuVi();
	public abstract double dienTic();
	
	@Override
	public int compareTo(Shape o) {
		// TODO Auto-generated method stub
		return chuVi() > o.chuVi() ? 1 : chuVi() == o.chuVi() ? 0 : -1;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("cv:%.2f - dt:%.2f", chuVi(), dienTic());
	}
}
