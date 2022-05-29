package Geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

	protected Point center; //protected da bi sve klase koje nasledjuju mogke da vide
	private int radius;
	
	

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
	
	public void moveTo(int x,int y)
	{
		center.moveTo(x,y);
		
	}
	
	public void moveBy(int x,int y)
	{
		center.moveBy(x, y);
		
	}
	public int compareTo(Object obj)
	{
		if(obj instanceof Circle)
		{
			Circle circleToCompare=(Circle)obj;
			return (int)(this.area()-circleToCompare.area());
		}
		return 0;
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
		if (isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(center.getX() - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() - radius - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() + radius - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() - 2, center.getY() - radius - 2, 4, 4);
			g.drawRect(center.getX() - 2, center.getY() + radius - 2, 4, 4);
			g.setColor(Color.black);
		}
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

	public void setRadius(int radius) throws Exception {
		if(radius<0)
		{
			throw new Exception("Mora biti veci od 0");
		}
		else this.radius = radius;
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
