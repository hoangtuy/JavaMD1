package advance.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import advance.dev.dao.IManager;
import advance.dev.dao.Manager;
import advance.dev.models.Circle;
import advance.dev.models.Rect;
import advance.dev.models.Triangle;

/*
 * Tao project co ten ShapeManage thuc hien cac cong viec sau x
 * 1. Tao lop abstract Shape trong package advance.dev.models x
 * Co 2 phuong thuc truu tuong			
 * public abstract double chuVi(); 		x
 * public abstract double dienTich();	x
 * 2. Tao 3 lop Circle, Rect, Triangle extends lop Shape trong advance.dev.models   x
 * 3. Tao interface IManager nam trong package advance.dev.dao co cac phuong thuc sau   
 * void add(Shape shape); // Them hinh
 * void print();// In danh sach hinh
 * void findBigShape();// Tim hinh co dien tich lon nhat
 * 4. Tao lop Manager Implements IManager nam trong package advance.dev.dao co chua
 * private List<Shape> shape List = new ArrayList<Shape>();
 * 5. 
 * tao lop MainApp co chua ham main thuc hien viec doc du lieu tu tap tin in.txt
 * #circle1
 * 5
 * #rect1
 * 3
 * 5
 * #triangle1
 * 5
 * 6
 * 8
 * Thuc hien cac phuong thuc trong cau so 3
 */

public class MainApp {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		FileInputStream fis = new FileInputStream("in.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line;
		IManager imanager = new Manager();
		
		while((line = br.readLine()) != null){
			if(line.startsWith("#circle1")) {
				double bk = Double.parseDouble(br.readLine());
				imanager.add(new Circle(bk));
			}
			if(line.startsWith("#rect1")) {
				double a = Double.parseDouble(br.readLine());
				double b = Double.parseDouble(br.readLine());
				imanager.add(new Rect(a, b));
			}
			if(line.startsWith("#triangle1")) {
				double a = Double.parseDouble(br.readLine());
				double b = Double.parseDouble(br.readLine());
				double c = Double.parseDouble(br.readLine());
				imanager.add(new Triangle(a, b, c));
			}
		}
		
		imanager.print();
		imanager.findBigShape();
		imanager.sort();
	}

}
