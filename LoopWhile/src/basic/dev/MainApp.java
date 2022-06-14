package basic.dev;

import java.util.Iterator;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0.5;
		double eps = 0.00001;
		int mu = 1;		
		double s = 1;
		int dau = 1;
		
		double f = s;
		s = f + dau * (double)giaiThuaLe(mu) / giaiThuaChan(mu * 2) * Math.pow(x, mu);
		
		while(Math.abs(f-s) > eps) {
			mu++;
			dau = -dau;
			f = s;
			s = f + dau * (double)giaiThuaLe(mu) / giaiThuaChan(mu * 2) * Math.pow(x, mu);
		}
		
		System.out.println(f);
	}
	
	static int giaiThua(int n) {
		if(n == 1) return 1;
		return n * giaiThua(n - 1);
	}
	
	static int giaiThuaChan(int n) {
		int rs = 1;
		for (int i = 2; i <= n; i += 2) {
			rs = rs * i;
		}
		return rs;
	}
	
	static int giaiThuaLe(int n) {
		int rs = 1;
		for (int i = 1; i <= n; i += 2) {
			rs = rs * i;
		}
		return rs;
	}

}
