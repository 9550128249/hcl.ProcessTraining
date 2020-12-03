package hcl.interfacehandson;

import java.util.*;
import java.util.Scanner;

public class MainStall {

	public static void main(String[] args) {
		String stallname;
		String ownername;
		int cost;
		int screen;
		int tvset;
		int projector;
		String details;
		String ba;
		int choice;
		Scanner s1 = new Scanner(System.in);
		GoldStall s = new GoldStall();
		PremiumStall s0 = new PremiumStall();
		ExecutiveStall s2 = new ExecutiveStall();
		System.out.println("Enter the choice");
		System.out.println("1.GoldStall");
		System.out.println("2.PremiumStall");
		System.out.println("3.ExecutiveStall");
		choice = s1.nextInt();
		s1.nextLine();
		switch (choice) {
		case 1:
			System.out.println("Enter Stall Details");
			ba = s1.nextLine();
			String c2[] = ba.split(",");
			s.setStallname(c2[0]);
			s.setCost(Integer.valueOf(c2[1]));
			s.setOwnername(c2[2]);
			s.settvset(Integer.valueOf(c2[3]));
			s.Display();

			break;
		case 2:
			System.out.println("Enter stall Details");
			ba = s1.nextLine();
			String c3[] = ba.split(",");
			s0.setStallname(c3[0]);
			s0.setCost(Integer.valueOf(c3[1]));
			s0.setOwnername(c3[2]);
			s0.setProjector(Integer.valueOf(c3[3]));
			s0.Display();

			break;
		case 3:
			System.out.println("Enter stall Details");
			ba = s1.nextLine();
			String c4[] = ba.split(",");
			s2.setStallname(c4[0]);
			s2.setCost(Integer.valueOf(c4[1]));
			s2.setOwnername(c4[2]);
			s2.setScreen(Integer.valueOf(c4[3]));
			s2.Display();

			break;
		}

	}
}
