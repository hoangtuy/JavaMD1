package advance.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import advance.dev.model.Circle;
import advance.dev.model.Rect;
import advance.dev.model.Shape;
import advance.dev.model.Triangle;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> shapeList = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream("in.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String line;
			while((line = br.readLine()) != null) {
				if(line.startsWith("#circle"))
					shapeList.add(readCircle(br));
				if(line.startsWith("#rect"))
					shapeList.add(readRect(br));
				if(line.startsWith("#triangle"))
					shapeList.add(readTriangle(br));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		print(shapeList);
		Collections.sort(shapeList);
		System.out.println("==============");
		print(shapeList);
	}
	
	static Circle readCircle(BufferedReader br) throws NumberFormatException, IOException {
		double bk = Double.parseDouble(br.readLine());
		return new Circle(bk);
	}
	
	static Rect readRect(BufferedReader br) throws NumberFormatException, IOException {
		double a = Double.parseDouble(br.readLine());
		double b = Double.parseDouble(br.readLine());
		return new Rect(a, b);
	}
	
	static Triangle readTriangle(BufferedReader br) throws NumberFormatException, IOException {
		double a = Double.parseDouble(br.readLine());
		double b = Double.parseDouble(br.readLine());
		double c = Double.parseDouble(br.readLine());
		
		return new Triangle(a, b, c);
	}
	
	static void print(List<Shape> shapeList) {
		for (Shape shape : shapeList) {
			System.out.println(shape);
		}
	}
}
