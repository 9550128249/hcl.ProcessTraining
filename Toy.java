package hcl.interfacehandson;

import java.util.*;

public class Toy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double len = 4.5, bre = 5.5;
		Polygon p = new Square();
		Polygon p1 = new Rectangle();
		System.out.println("enter len an dbre of a square");
		sc.nextLine();
		System.out.println("enter side ");
		sc.nextLine();
		System.out.println("perimeter of rectangle:" + p1.calcPeri(len, bre));
		sc.nextLine();
		System.out.println("Area of rectangle:" + p1.Area(len, bre));
		sc.nextLine();
		System.out.println("perimeter of square :" + p.calcPeri(len, bre));
		sc.nextLine();
		System.out.println("Area of square is:" + p.Area(len, bre));
	}
}
