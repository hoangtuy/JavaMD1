package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student arrStudent[] = new Student[5];
		input(arrStudent);
		print(arrStudent);
	}
	
	static void input(Student arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 5 sinh vien");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhap vao sinh vien thu" + (i+1));
			Student std = new Student();
			
			System.out.println("Nhap ten");
			std.setName(sc.nextLine());
			
			System.out.println("Nhap tuoi");
			std.setAge(sc.nextInt());
			sc.nextLine();
			
			System.out.println("Nhap dia chi");
			std.setAddress(sc.nextLine());
			
			System.out.println("Nhap diem");
			std.setMark(sc.nextDouble());
			sc.nextLine();
			
			arr[i] = std;
		}
		sc.close();
	}
	
	static void print(Student arr[]) {
		for (int i = 0; i < arr.length; i++) {
			Student std = arr[i];
			System.out.format("Name:%s - Age:%d - Address:%s - Mark:%.2f", std.getName(), std.getAge(), std.getAddress(), std.getMark()).println();
		}
	}

}
