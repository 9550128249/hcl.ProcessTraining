package hcl.assignmentproblem2;
import java.util.*;
public class Mainp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name,country,skill;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the player name");
name=sc.nextLine();
System.out.println("Enter the country name");
country=sc.nextLine();
System.out.println("Enter the skill");
skill=sc.nextLine();
Player p=new Player(name,country,skill);
System.out.println("Player Details");
System.out.println("Player Name:"+p.getName());
System.out.println("Country Name:"+p.getCountry());
System.out.println("Skill:"+p.getSkill());
	}

}
