package hcl;


	import java.util.*;
	class Player
	{
	String name;
	String country;
	String skill;
	Player(String name,String country,String skill)
	{
	this.name=name;
	this.country=country;
	this.skill=skill;
	}
	}
	class assignmentp2
	{
	public static void main(String[] args)
	{
	String name,country,skill;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name:");
	name=sc.nextLine();
	System.out.println("Enter the country:");
	country=sc.nextLine();
	System.out.println("Enter the skill:");
	skill=sc.nextLine();
	Player p=new Player(name,country,skill);
	System.out.println("Player Details:");
	System.out.println("Player name:"+p.name);
	System.out.println("Player country:"+p.country);
	System.out.println("Player skill:"+p.skill);
	}
	}


