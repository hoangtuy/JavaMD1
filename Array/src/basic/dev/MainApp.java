package basic.dev;

import java.util.Arrays;
import java.util.Random;

/**
 * Khai bao mang 5 phan tu so nguyen
 * a) Tim phan tu lon nhat va be naht
 * b) Tim xem mang co bao nhieu so chan, so le
 * c) Tim xem mang co bao nhieu so nguyen to
 * d) Sap xep mang theo thu tu tang dan
 * @author Aptech
 * Viet chuong trinh tim so dep so o to
 * Bien co 5 so goi la so dep neu thoa man mot trong cac dieu kien sau
 * Tong cac chu so co hang don vi la 9
 * So tien deu
 * So ganh
 */
public class MainApp {
	public static void main(String[] args) {
		int a[] = new int[5];
		creatArray(a);
		print(a);
		
		sort(a);
		print(a);
		
		findPrime(a);
		findNumberAmount(a);
		
		tongChin();
		tienDeu();
		soGanh();
	}

	private static void soGanh() {
		// TODO Auto-generated method stub
		
	}

	private static void tienDeu() {
		// TODO Auto-generated method stub
		
	}

	private static void tongChin() {
		// TODO Auto-generated method stub
		
	}

	private static void print(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("==========PRINT===========");
		System.out.println(Arrays.toString(a));
	}

	private static void findNumberAmount(int[] a) {
		// TODO Auto-generated method stub
		int max = a[0];
		int countMax = 1;
		
		int current = a[0];
		int countCurrent = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] == current) {
				countCurrent++;
			}
			else {
				if(countCurrent > countMax) {
					max = a[i-1];
					countMax = countCurrent;
				}
				current = a[i];
				countCurrent = 1;
			}
		}
		System.out.println("==========PRINT===========");
		System.out.format("Max:%d Count:%d", max, countMax).println();
	}

	private static void findPrime(int[] a) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if(isPrime(a[i])) count++;
		}
		System.out.println("==========PRINT===========");
		System.out.format("Mang co %d so nguyen to", count).println();
	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}

	private static void creatArray(int[] a) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
		}
	}
	
	static boolean isPrime(int n) {
		if(n == 1 || n == 2) return true;
		for (int i = 2; i < n; i++) {
			if(n % i == 0) return false;
			
		}
		return true;
	}
}
