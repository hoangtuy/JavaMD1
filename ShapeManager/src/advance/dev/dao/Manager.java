package advance.dev.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import advance.dev.models.Shape;

public class Manager implements IManager{
	private List<Shape> shapeList = new ArrayList<Shape>();
	
	
	public List<Shape> getShapeList() {
		return shapeList;
	}

	public void setShapeList(List<Shape> shapeList) {
		this.shapeList = shapeList;
	}

	@Override
	public void add(Shape shape) {
		shapeList.add(shape);
		
	}

	@Override
	public void print() {
		for (Shape shape : shapeList) {
			System.out.println(shape);
		}
		
	}

	@Override
	public void findBigShape() {
		Collections.sort(shapeList);
		Shape shape = shapeList.get(shapeList.size()-1);
		System.out.println("Hinh co dien tich lon nhat la: " + shape);
	}

	@Override
	public void sort() {
		
		
		
	}
	
}
