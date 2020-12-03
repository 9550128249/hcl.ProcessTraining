package hcl.interfacehandson;

import java.util.*;

public class HDFC implements MutualFund {
	Scanner sc = new Scanner(System.in);
	static int amt;
	static int durn;

	public void amount() {
		System.out.println("Enter the amount you want to invest");
		amt = sc.nextInt();
	}

	public void duration() {
		System.out.println("Enter the duration of investment");
		durn = sc.nextInt();
	}

}
