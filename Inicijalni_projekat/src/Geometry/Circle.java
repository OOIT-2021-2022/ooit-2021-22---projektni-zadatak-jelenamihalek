package Geometry;

import java.awt.Graphics;

public class Circle extends Shape {

	protected Point center; //protected da bi sve klase koje nasledjuju mogke da vide
	private int radius;
	private boolean selected;
	

	public Circle() {

	}

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		setSelected(selected);
	}

	public boolean contains (int x, int y)
	{
		return center.distance(x,y)<=radius;
	}
	
	public boolean contains (Point clickPoint)//click point .getx, 
	{
		return center.distance(clickPoint.getX(), clickPoint.getY())<=2;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle pomocni = (Circle) obj;
			if (this.center.equals(pomocni.center) && this.radius == pomocni.radius) {
				return true;
			} else {
				return false;
			}
		} else 
			return false;
		}
	

	public void draw (Graphics g)
	{
		//todo auto-generated method stub
		g.drawOval(center.getX()-radius, center.getY()-radius, radius*2,radius*2);	
	}
	
	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public Point getCenter() {
		return this.center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	
	public double area() {
		return this.radius * this.radius * Math.PI;
	}

	public double circumference() {
		return 2 * this.radius * Math.PI;
	}
	
	public String toString() {
		// Center=(x,y), radius= radius
		return "Center=" + center + ", radius=" + radius;
	}
}
