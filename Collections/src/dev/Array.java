package dev;

import java.util.Scanner;


public class Array {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a[] = new int[10];
			creatArray(a);
			print(a);
			
			sort(a);
			print(a);
			
			findPrime(a);
			findNumberAmount(a);
			

			for (int i = 0; i < 10; i++) {
				a[i] = sc.nextInt();
			}

			for (int i = 0; i < 10; i++) {
				System.out.print(a[i] + " ");
}
		}
 }


	private static void findNumberAmount(int[] a) {
		// TODO Auto-generated method stub
		
	}


	private static void findPrime(int[] a) {
		// TODO Auto-generated method stub
		
	}


	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		
	}


	private static void print(int[] a) {
		// TODO Auto-generated method stub
		
	}


	private static void creatArray(int[] a) {
		// TODO Auto-generated method stub
		
	}
	
	// Tim trong mang co bao nhieu so nguyen to
	static boolean isPrime(int n) {
		if (n == 1 || n == 2) return true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) return false; 
				
			}
			return true;
		}
	 static void While(int n) {
	    int n1;
	         
	    // biến đếm số phần tử được nhập từ bàn phím có trong mảng
	    int count = 0;  
	    try (Scanner scanner = new Scanner(System.in)) {
			do {
			    System.out.println("Nhập vào số phần tử của mảng: ");
			    n1 = scanner.nextInt();
			} while (n1 < 0);
			     
			int A[] = new int[n1];
			     
			System.out.println("Nhập các phần tử cho mảng: ");
			for (int i = 0; i < n1; i++) {
			    System.out.print("Nhập phần tử thứ " + i + ": ");
			    A[i] = scanner.nextInt();
			}
			     
			// Đếm số lần xuất hiện của 1 phần tử được nhập từ bàn phím
			System.out.println("Nhập vào 1 số nguyên bất kỳ: ");
			int number = scanner.nextInt();
			     
			for (int i = 0; i < n1; i++) {
			    if (A[i] == number) {
			        count++;
			    }
			}
			     
			System.out.println("Số phần tử " + number + " có trong mảng = " + count);
		}
	}
	}
