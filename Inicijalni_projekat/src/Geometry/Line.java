package Geometry;

import java.awt.Graphics;

public class Line extends Shape{

	private Point startPoint;
	private Point endPoint;
	
	public Line() {
	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		//this(startPoint, endPoint);
		//this.selected = selected;
		//setSelected(selected);
		super(selected); //poziv konstruktora iz nadredjene klase-shape
		this.startPoint=startPoint;
		this.endPoint=endPoint;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Line) {
			Line pomocna = (Line) obj;
			if (this.startPoint.equals(pomocna.startPoint) && this.endPoint.equals(pomocna.endPoint))
				return true;
			else
				return false;
		} else
			return false;
	}
	
	public boolean contains (int x, int y)
	{
		return this.startPoint.distance(x,y)+this.endPoint.distance(x,y)-length()<=2;
	}

	public double length() {
		return this.startPoint.distance(this.endPoint.getX(), this.endPoint.getY());

	}
	
	public void draw (Graphics g)
	{
		//todo auto-generated method stub
		g.drawLine(startPoint.getX(),startPoint.getY(),endPoint.getX(),endPoint.getY());
		//da su x,y protected , ne moye/komnpozicija...
		
	}

	public void setStartPoint(Point startPoint)

	{
		this.startPoint = startPoint;
	}

	public Point getStartPoint() {
		return this.startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}



	public String toString() {
		return startPoint + "-- >" + endPoint;
	}

}
