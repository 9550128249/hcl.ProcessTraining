package hcl.exception;
import java.util.*;
public class MainEventType {
		static long g;
		public static boolean valid(Long id) throws EventDoesNotExist
		{
			Scanner s=new Scanner(System.in);
			EventTypeDoesNotExist e=new EventTypeDoesNotExist();
			do
			{
				if(id<=3)
					g=id;
				return true;
		}
		while(id>=3);
}
	
public static void main(String[] args)
{
	String s1;
	int n;
	long id;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of events");
	n=sc.nextInt();
	sc.nextLine();
	EventType e=new EventType();
	EventTypeDoesNotExist e1=new EventTypeDoesNotExist();
	String str1[]=new String[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("enter the details:"+(i+1));
		s1=sc.nextLine();
		str1[i]=s1;
	}
	System.out.println("name"+"\t"+"detail"+"\t"+"ownername"+"\t"+"typeid");
	}
}


