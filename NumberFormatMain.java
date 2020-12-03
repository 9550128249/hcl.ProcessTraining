package hcl.exception;
import java.util.*;
public class NumberFormatMain {

	public static void main(String[] args) {
		String name;
		try
		{
			String deposit,costperday;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the item type details:");
			System.out.println("enter the name:");
			name=sc.nextLine();
			System.out.println("enter the deposit:");
			deposit=sc.nextLine();
			Integer I=Integer.valueOf(deposit);
			System.out.println("enter the cost per day:");
			costperday=sc.nextLine();
			Integer I2=Integer.valueOf(costperday);
			System.out.println("Enter the details of item typoe:");
			System.out.println("Name:"+name);
			System.out.println("deposit:"+I);
			System.out.println("costperday:"+I2);
			
		}
catch(NumberFormatException Ne)
		{
	System.out.println(Ne);
		}
		}
	

}