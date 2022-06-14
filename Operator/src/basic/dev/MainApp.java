package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a");
		a = sc.nextInt();
		
		System.out.println("Nhap b");
		b = sc.nextInt();
		
		int tong = a + b;
		int hieu = a - b;
		int tich = a * b;
		float thuong = (float)a / b;
		
		System.out.format("%d + %d = %d", a, b, tong).println();
		System.out.format("%d - %d = %d", a, b, hieu).println();
		System.out.format("%d * %d = %d", a, b, tich).println();
		System.out.format("%d / %d = %.2f", a, b, thuong).println();
		
		boolean c = a > b;
		System.out.format("%d > %d : %b", a, b, c).println();
		c = a < b;
		System.out.format("%d < %d : %b", a, b, c).println();
		c = a >= b;
		System.out.format("%d >= %d : %b", a, b, c).println();
		c = a <= b;
		System.out.format("%d <= %d : %b", a, b, c).println();
	}

}
