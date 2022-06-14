package advance.dev;

import java.util.Scanner;

import advance.dev.models.Circle;
import advance.dev.models.Rect;
import advance.dev.models.Shape;
import advance.dev.models.Triangle;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shapes[] = new Shape[5];
		
		input(shapes);
		print(shapes);
	}
	
	static void input(Shape shapes[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhap hinh tron thu " + (i+1));
			System.out.println("Ban kinh");
			double bk = sc.nextDouble();
			sc.nextLine();
			
			shapes[i] = new Circle(bk);
		}
		
		for (int i = 2; i < 4; i++) {
			System.out.println("Nhap hinh chu nhat " + (i+1));
			System.out.println("Canh a");
			double a = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Canh b");
			double b = sc.nextDouble();
			sc.nextLine();
			
			shapes[i] = new Rect(a, b);
		}
		
		System.out.println("Nhap hinh tam giac");
		System.out.println("Canh a");
		double a = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Canh b");
		double b = sc.nextDouble();
		sc.nextLine();

		System.out.println("Canh c");
		double c = sc.nextDouble();
		sc.nextLine();
		
		shapes[4] = new Triangle(a, b, c);
		sc.close();
	}
	
	static void print(Shape shapes[]) {
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
	}

}
