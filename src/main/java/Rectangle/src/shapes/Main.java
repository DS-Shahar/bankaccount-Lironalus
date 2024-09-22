package shapes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length1 = scan.nextInt();
		int width1 = scan.nextInt();
		int length2 = scan.nextInt();
		int width2 = scan.nextInt();
		
		Rectangle rec1 = new Rectangle(length1,width1);
		Rectangle rec2 = new Rectangle(length2,width2);
		
		rec1.draw();
		rec2.draw();
		
		rec1.scale(2);
		
		System.out.println(rec1.calcPerimeter() + rec2.calcPerimeter());
		System.out.println(rec1.calcArea() + rec2.calcArea());
		
		
		 System.out.println(rec1.toString());
	     System.out.println(rec2.toString());        

	}

}
