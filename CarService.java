package hcl.interfacehandson;

public  class CarService implements Service {
int number;
int Years;
String brand;
int sum=0;
public CarService() {
	// TODO Auto-generated constructor stub
}

public CarService(int number, int years, String brand, int sum) {
	super();
	this.number = number;
	this.Years = years;
	this.brand = brand;
	this.sum = sum;
}

public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public int getYears() {
	return Years;
}
public void setYears(int years) {
	this.Years = years;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getSum() {
	return sum;
}
public void setSum(int sum) {
	this.sum = sum;
}
public void sum()
{
	int nu=this.number;
	while(nu!=0)
	{
		int a=nu%10;
		sum=sum+nu;
		nu=nu/10;
	}
	if(sum%2==0)
	{
		System.out.println("you can come on Tuesday,Thursday,Saturday");
	}
		else
		{
			System.out.println("you can come on monday ,wednesday or Friday");
		}
			
		}
public void year()
{
	int y=this.Years;
	if(y>4)
	{
		System.out.println("cra wash is not free");
	}
	else
	{
		System.out.println("car wash is free");
	
	}
}

public void brand()
{
	String c=this.brand;
	String s= "Maruthi";
	if (c.equals(s))
	{
		System.out.println("your service charge are :4750");
	}
	else
	{
		System.out.println("your service charge are:5000");
	}
	
	}
}
	
