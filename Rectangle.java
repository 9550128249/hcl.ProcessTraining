package hcl.inheritanceshapes;

public class Rectangle extends Shape {
	double length;
	double breadth;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public void ComputeArea(double length,double breadth)
	{
		super.ComputeArea();
		Area=(length*breadth);
		Area=Math.round(Area*100.0)/100.0;
		System.out.println("Area of Rectangle:"+Area);
		
	}
	

}
