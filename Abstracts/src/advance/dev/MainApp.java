package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shapes[] = new Shape[5];
		input(shapes);
		print(shapes);
	}

	static void input(Shape shapes[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1: HT,2: HCN, 3: TG");
		int count = 0;
		while(count < shapes.length) {
			int n = sc.nextInt();
			sc.nextLine();
			switch (n) {
				case 1: 
					shapes[count] = readCircle(sc);
					break;
				case 2: 
					shapes[count] = readRect(sc);			
					break;
				case 3: 
					shapes[count] = readTriangle(sc);
					break;
			}
			count++;
		}
		
	}
	
	static Circle readCircle(Scanner sc) {
		System.out.println("Nhap ban kinh");
		double bk = sc.nextDouble();
		sc.nextLine();
		return new Circle(bk);
	}
	
	static Rect readRect(Scanner sc) {
		System.out.println("Nhap canh a");
		double a = sc.nextDouble();
		sc.nextLine();
		

		System.out.println("Nhap canh b");
		double b = sc.nextDouble();
		sc.nextLine();
		return new Rect(a, b);
	}
	
	static Triangle readTriangle(Scanner sc) {
		System.out.println("Nhap canh a");
		double a = sc.nextDouble();
		sc.nextLine();		

		System.out.println("Nhap canh b");
		double b = sc.nextDouble();
		sc.nextLine();	

		System.out.println("Nhap canh c");
		double c = sc.nextDouble();
		sc.nextLine();
		
		return new Triangle(a, b, c);
	}
	
	static void print(Shape shapes[]) {
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}
	}
}
