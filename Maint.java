package hcl.assignmentp3;

import java.util.*;

class Delivery {
	Long over;
	Long ball;
	Long runs;
	String batsman;
	String bowler;
	String nonstriker;

	Delivery(Long over, Long ball, Long runs, String batsman, String bowler, String nonstriker) {
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonstriker = nonstriker;
	}
}

class Maint {
	public static void main(String[] args) {
		Long over;
		Long ball;
		Long runs;
		String batsman;
		String bowler;
		String nonstriker;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the over");
		over = sc.nextLong();
		System.out.println("Enter the ball");
		ball = sc.nextLong();
		System.out.println("Enter the runs");
		runs = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the batsman");
		batsman = sc.nextLine();
		System.out.println("Enter the bowler");
		bowler = sc.nextLine();
		System.out.println("Enter the nonstriker");
		nonstriker = sc.nextLine();
		Delivery d = new Delivery(over, ball, runs, batsman, bowler, nonstriker);
		System.out.println("Player Details:");
		System.out.println("over:" + d.over);
		System.out.println("ball:" + d.ball);
		System.out.println("runs:" + d.runs);
		System.out.println("batsman:" + d.batsman);
		System.out.println("bowler:" + d.bowler);
		System.out.println("nonstriker:" + d.nonstriker);
	}
}
