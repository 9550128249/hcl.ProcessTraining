package hcl.LambdaExpressions;
import java.util.*;

public class TestLe2 {
public static void main(String args[])
{
	new Thread(()->{
		for(int i=0;i<5;i++)
			System.out.println("child thread");
	}).start();
	for(int i=0;i<5;i++)
		System.out.println("main thread");
}
}

