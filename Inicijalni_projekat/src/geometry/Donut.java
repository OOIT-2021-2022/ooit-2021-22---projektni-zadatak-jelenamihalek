package geometry;

import java.awt.Color;
import java.awt.Graphics;

//eksplicitno navodimo da donut nasledjuje circle
public class Donut extends Circle {

	private int innerRadius;

	public Donut() {
	}
    public Donut (Point center, int radius, int innerRadius) {
    	//this.center=center;
    	//setRadius(radius);
    	super(center,radius);
    	this.innerRadius=innerRadius;
    }
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		//this.center = center;//jer je definisano kao protected u circle
	   //	setRadius(radius);//jer je private,iako se ne nalazi u Donut, odlazi u circle i tamo pronalazi metodu
		// is.Radius=radius ne moze jer je private
		this(center,radius,innerRadius);
		setSelected(selected);
	}
		
	public int compareTo(Object obj)
	{
		if(obj instanceof Donut)
		{
			Donut donutToCompare=(Donut)obj;
			return (int)(this.area()-donutToCompare.area());
		}
		return 0;
	}

	public int getInnerRadius() {
		return innerRadius;
	}
//donut je instanca kruga, moramo definisati, downkastikng

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	};

	public boolean equals(Object obj) {
		if (obj instanceof Donut) {
			Donut pomocni = (Donut) obj;
			/*
			 * f (this.center.equals(pomocni.center) && this.getCenter()
			 * ==pomocni.getRadius()) { return true; } else { return false; } } else return
			 * false;
			 */
			if (super.equals(pomocni) && this.innerRadius == pomocni.innerRadius) {
				return true;
			} else
				return false;}
		else return false;
		}
	

	public void draw (Graphics g)
	{
		//todo auto-generated method stub
		super.draw(g);
		g.drawOval(center.getX()-innerRadius, center.getY()-innerRadius, innerRadius*2, innerRadius*2);
		if (isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(center.getX() - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() - innerRadius - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() + innerRadius - 2, center.getY() - 2, 4, 4);
			g.drawRect(center.getX() - 2, center.getY() - innerRadius - 2, 4, 4);
			g.drawRect(center.getX() - 2, center.getY() + innerRadius - 2, 4, 4);
			g.setColor(Color.black);
		}

	
		
	}

	public boolean contains(int x, int y) {

		return super.contains(x,y) && center.distance(x,y) >= innerRadius;
	}

	public double area() {
		return super.area() - innerRadius * innerRadius * Math.PI;
	}

	public String toString() {
		// Center=(x,y), radius= radius
		return super.toString() + ", innerRadius=" + innerRadius;
	}
}
