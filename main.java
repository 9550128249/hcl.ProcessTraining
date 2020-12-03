package hcl.inheritancebankdetails;
import java.util.*;
public class main {
	public static void main(String[] args) 
	{
String ba;
int choice;
System.out.println("choose account Type");
System.out.println("1.savings Account");
System.out.println("2.current account");
Scanner s=new Scanner(System.in);
choice=s.nextInt();
s.nextLine();
SavingsAccount sa=new SavingsAccount();
CurrentAccount ca=new CurrentAccount();
switch(choice)
{
case 1:
	System.out.println("Enter Account Details");
	ba=s.nextLine();
	String c2[]=ba.split(",");
	sa.setAcntname(c2[0]);
	System.out.println("account name:"+sa.getAcntname());
	sa.setAcntno(c2[1]);
	System.out.println("account no:"+sa.getAcntno());
	sa.setBankname(c2[2]);
	System.out.println("Bank name:"+sa.getBankname());
	sa.setOrgName(c2[3]);
	System.out.println("account name:"+sa.getOrgName());
	break;
case 2:
	System.out.println("Enter Account Details");
	ba=s.nextLine();
	String c3[]=ba.split(",");
	sa.setAcntname(c3[0]);
	System.out.println("account name:"+ca.getAcntname());
	sa.setAcntno(c3[1]);
	System.out.println("account no:"+ca.getAcntno());
	sa.setBankname(c3[2]);
	System.out.println("Bank name:"+ca.getBankname());
	ca.setTinNumber(c3[3]);
	System.out.println("account name:"+ca.getTinNumber());
	
	break;
}

}
}
