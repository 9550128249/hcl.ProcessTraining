package hcl.LambdaExpressions;
import java.util.*;
 interface LambdaLE1 
 {
int add(int a,int b);
}
public class TestLE1
{
	public static void main(String[] args)
	{
		LambdaLE1 l=(a,b)->a+b;
		System.out.println("the sum is"+l.add(10,20));
	}
}

