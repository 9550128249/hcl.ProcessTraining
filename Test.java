package hcl.assignmentp7;

import java.util.Scanner;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long over;
		Long ball;
		Long runs;
		String batsman;
		String bowler;
		String nonStriker;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the over");
		over=sc.nextLong();
		System.out.println("Enter the ball");
		ball=sc.nextLong();
		System.out.println("Enter the runs");
		runs=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the batsman");
		batsman=sc.nextLine();
		System.out.println("Enter the bowler");
		bowler=sc.nextLine();
		System.out.println("Enter the nonStriker");
		nonStriker=sc.nextLine();
		Delivery d=new Delivery(over,ball,runs,batsman,bowler,nonStriker);
		System.out.println("over:"+d.getOver());
		System.out.println("ball:"+d.getBall());
		System.out.println("runs:"+d.getRuns());
		System.out.println("batsman:"+d.getBatsman());
		System.out.println("bowler:"+d.getBowler());
		System.out.println("nonstriker:"+d.getNonStriker());

	}

}
