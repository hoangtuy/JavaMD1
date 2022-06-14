package advance.dev.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import advance.dev.models.Student;

public class StudentDAOImpl implements StudentDao{
	private List<Student> studentList = new ArrayList<Student>(); 
	
	@Override
	public void add(Student std) {
		studentList.add(std);
		
	}

	@Override
	public void remove(int index) {
		studentList.remove(index);
		
	}

	@Override
	public void clear() {
		studentList.clear();
		
	}

	@Override
	public void print() {
		for (Student student : studentList) {
			System.out.println(student);
		}
		
	}

	@Override
	public void findBestStudent() {
		sort();
		Student std = studentList.get(studentList.size()-1);
		System.out.println("Best student la: " + std);
	}

	@Override
	public void sort() {
		Collections.sort(studentList);
	}

}
