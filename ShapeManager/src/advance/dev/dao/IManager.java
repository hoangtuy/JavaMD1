package advance.dev.dao;

import advance.dev.models.Shape;

public interface IManager {
	void add(Shape shape);
	void print();
	void findBigShape();
	void sort();
}
