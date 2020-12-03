package hcl.exception;
import java.util.*;
public class Mismatch {

	public static void main(String[] args) {
	
		try
		{
			int input;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the integer input:");
			input=sc.nextInt();
			System.out.println("entered value is:"+input);
			
		}
catch(InputMismatchException Me)
		{
	System.out.println(Me);
		}
		}
	

}
