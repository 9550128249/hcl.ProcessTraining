package hcl.interfacehandson;

import java.util.*;

public class Car {
	public static void main(String[] args) {
		int number;
		int Years;
		String brand;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the car number");
		number = sc.nextInt();
		System.out.println("how many years old car do you have");
		Years = sc.nextInt();
		sc.nextLine();
		System.out.println("car brand");
		brand = sc.nextLine();
		Service cs = new CarService(number, Years, brand, Years);
		cs.sum();
		cs.year();
		cs.brand();

	}

}
