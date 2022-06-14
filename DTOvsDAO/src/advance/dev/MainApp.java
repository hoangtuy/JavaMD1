package advance.dev;

import java.util.Scanner;

import advance.dev.dao.StudentDAOImpl;
import advance.dev.dao.StudentDao;
import advance.dev.models.Student;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDao studentDao = new StudentDAOImpl();
		for(int i =  0; i < 3; i++) {
			System.out.println("Sinh vien thu: " + (i+1));
			System.out.println("ten: ");
			String name = sc.nextLine();
			
			System.out.println("tuoi: ");
			int age = sc.nextInt();
			
			System.out.println("diem: ");
			double diem = sc.nextDouble();
			sc.nextLine();
			
			studentDao.add(new Student(name, age, diem));
		}
		
		studentDao.print();
		
		studentDao.sort();
		studentDao.print();
		
		studentDao.findBestStudent();
		
		studentDao.remove(1);
		studentDao.print();
		
		studentDao.clear();
		sc.close();
	}

}
