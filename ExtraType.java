package hcl.assignmentp6;

import java.util.*;

public class ExtraType {
	public static void main(String[] args) {
		String name, newString;
		long runs;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Extra Type Details:");
		newString = sc.next();
		System.out.println("ExtraType details");
		String s2[] = newString.split("#");
		System.out.println("Extra Type:" + s2[0]);
		System.out.println("Runs:" + s2[1]);
	}
}
