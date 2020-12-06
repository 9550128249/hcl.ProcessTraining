package hcl.java8features;
public class DefaultMultipleInheritance implements Left,Right {
	public  void m1()
	{
		Left.super.m1();
	}
	public static void main(String[] args) {
		DefaultMultipleInheritance t= new DefaultMultipleInheritance();
		t.m1();
	}

}