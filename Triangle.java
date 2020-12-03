package hcl.inheritanceshapes;

public class Triangle extends Shape{
	double base;
	double height;
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void ComputeArea(double base,double height)
	{
		super.ComputeArea();
		Area=(1/2)*(base*height);
		Area=Math.round(Area*100.0)/100.0;
		System.out.println("Area of Triangle:"+Area);
		
	}

}
