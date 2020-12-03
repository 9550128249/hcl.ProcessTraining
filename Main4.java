package hcl.assignmentproblem4;

import java.util.*;

public class Main4 {

	public static void main(String[] args) {
		String newString;
		Player4 p1 = new Player4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player details");
		newString = sc.next();
		System.out.println("player details");
		String a[] = newString.split(",");
		System.out.println("Player Name:" + a[0]);
		System.out.println("Player Country:" + a[1]);
		System.out.println("Player Skill:" + a[2]);

	}

}
