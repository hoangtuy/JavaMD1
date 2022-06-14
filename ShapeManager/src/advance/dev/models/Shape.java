package advance.dev.models;

public abstract class Shape implements Comparable<Shape>{
	public abstract double chuVi();
	public abstract double dienTich();
	
	@Override
	public int compareTo(Shape o) {
		return chuVi() > o.chuVi() ? 1 : chuVi() == o.chuVi() ? 0 : -1;
	}
}
