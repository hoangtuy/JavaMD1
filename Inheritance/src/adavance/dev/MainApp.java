package adavance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person persons[] = new Person[3];
		input(persons);
		print(persons);
	}
	
	static void input(Person arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 2 sinh vien");
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhap vao sinh vien thu" + (i+1));
			
			System.out.println("Nhap ten");
			String name = sc.nextLine();
			
			System.out.println("Nhap tuoi");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Nhap dia chi");
			String address = sc.nextLine();
			
			System.out.println("Nhap diem toan");
			double toan = sc.nextDouble();
			sc.nextLine();

			System.out.println("Nhap diem ly");
			double ly = sc.nextDouble();
			sc.nextLine();

			System.out.println("Nhap diem hoa");
			double hoa = sc.nextDouble();
			sc.nextLine();
			
			Student std = new Student(name, age, toan, ly, hoa);
			arr[i] = std;
		}
		
		System.out.println("Nhap vao 1 giao vien");
		
		System.out.println("Nhap ten");
		String name = sc.nextLine();
		
		System.out.println("Nhap tuoi");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Nhap he so luong");
		double hsl = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Nhap ma giao vien");
		String mgv = sc.nextLine();
				
		Teacher teacher = new Teacher(name, age, hsl, mgv);
		arr[2] = teacher;
		sc.close();
	}
	
	static void print(Person arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void findBestTeacher(Person arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Teacher) {
				Teacher tc = (Teacher) arr[i];
			}
		}
	}


}
