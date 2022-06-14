package advance.dev.dao;


import advance.dev.models.Student;

public interface StudentDao{
	public void add(Student std);
	public void remove(int index);
	public void clear();
	public void print();
	public void findBestStudent();
	public void sort();
	
	
}
