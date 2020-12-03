package hcl.interfacehandson;

import java.util.*;

public class Axis implements MutualFund {
	Scanner sc = new Scanner(System.in);
	static int amnt;
	static int dur;

	public void amount() {
		System.out.println("Enter the amount you want to invest");
		amnt = sc.nextInt();
	}

	public void duration() {
		System.out.println("Enter the duration of investment");
		dur = sc.nextInt();
	}

}