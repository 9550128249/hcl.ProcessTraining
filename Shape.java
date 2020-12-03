package hcl.inheritanceshapes;

public class Shape {
	protected double Area;
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public Shape(double area) {
		super();
		Area = area;
	}
	public double getArea() {
		return Area;
	}
	public void setArea(double area) {
		Area = area;
	}
	public void ComputeArea()
	{
		Area=0;
	}

}
