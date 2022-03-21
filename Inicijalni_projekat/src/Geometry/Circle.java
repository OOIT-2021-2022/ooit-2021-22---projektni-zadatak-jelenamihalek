package Geometry;

public class Circle {
	
	private Point center;
	private int radius;

	
	public Point getCenter()
	{
		return this.center;
	}
	public void setCenter(Point center)
	{
		this.center=center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area()
	{
		return radius*radius*Math.PI;
	}
	public double circumference()
	{
		return 2*radius*Math.PI;
	}
}
