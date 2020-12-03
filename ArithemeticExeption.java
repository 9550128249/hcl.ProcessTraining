package hcl.exception;

import java.util.*;

public class ArithemeticExeption {

	public static void main(String[] args) {
		int n;
		int c, days;
		try {
			Scanner sc = new Scanner(System.in);
			// System.out.println(days/n);
			System.out.println("Enter the cost of the item for n days:");
			days = sc.nextInt();
			System.out.println("Enter the value of n:");
			n = sc.nextInt();
			c = days / n;
			System.out.println("cost per day of the item:" + c);
		} catch (ArithmeticException Ae) {
			System.out.println(Ae.getMessage());
		}
	}
}
