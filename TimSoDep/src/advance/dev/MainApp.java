package advance.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap bien so cua ban: ");
		int bienSo = sc.nextInt();
		
		checkSoDep(bienSo);
//		tongChin(bienSo);
//		tienDeu(bienSo);
//		soGanh(bienSo);
	}

	private static void checkSoDep(int bienSo) {
		if(soGanh(bienSo) == true && tongChin(bienSo) == true) {
			System.out.println("Bien so cua ban la so ganh 9 diem");
		}else if(soGanh(bienSo) == true){
			System.out.println("Bien so cua ban la so ganh");
		}else if(tongChin(bienSo) == true) {
			System.out.println("Bien so cua ban tong 9 diem");
		}else if(tienDeu(bienSo) == true) {
			System.out.println("Bien so cua ban la so tien deu");
		}else {
			System.out.println("bien so cua ban k dep");
		}
	}

	private static boolean soGanh(int a) {
		int numb = a;
		int newNumb = 0;
		while(a != 0) {
			int soDu = a % 10;
			newNumb = newNumb * 10 + soDu;
			a = a/10;
		}
		if(numb == newNumb) {
			return true;
		}else {
			return false;
		}
	}

	private static boolean tienDeu(int a) {
		while(a != 0) {
			int soDu = a % 10;
			a = a/10;
			if(soDu != (a % 10 + 1)) {
				break;
			}
		}
		if(a == 0) {
			return true;
		}else {
			return false;
		}		
	}

	private static boolean tongChin(int a) {
		int tong = 0;
		while(a != 0) {
			tong += a % 10;
			a = a/10;
		}
		if((tong % 10) == 9) {
			return true;
		}
		else {
			return false;
		}		
	}
	
}
