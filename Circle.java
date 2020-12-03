package hcl.inheritanceshapes;

public class Circle extends Shape {
 double Radius;
public Circle() {
	// TODO Auto-generated constructor stub
}
public Circle(double area,double radius) {
	super(area);
	Radius = radius;
}
public double getRadius() {
	return Radius;
}
public void setRadius(double radius) {
	Radius = radius;
}
public void ComputeArea(double Radius)
{
	super.ComputeArea();
	Area=(22/7)*(Radius*Radius);
	Area=Math.round(Area*100.0)/100.0;
	System.out.println("Area of Circle:"+Area);
	
}

                                                                                                                             
}

