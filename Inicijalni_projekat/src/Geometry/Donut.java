package Geometry;
//eksplicinto navodimo da donut nasledjuje circle
public class Donut extends Circle{
	
	private int innerRadius;
	
public Donut() {}

public Donut(Point center, int radius, int innerRadius, boolean selected ) 
{
	this.center=center;
	this.setRadius(radius);
	//is.Radius=radius ne moye er je private
	 this.setSelected(selected);
	 this.innerRadius=innerRadius;
	}
/*
public Donut(Point center, int radius, int innerRadius, boolean selected ) {
super (center, radius, selected);
this.innerRadius=innerRadius;
}  */ 
/* iy nadredjene klase poziva tu metodu sa super*/
public int getInnerRadius() {
	return innerRadius;
}
//donut je instanca kruga, moramo definisati, downkastikng

public void setInnerRadius(int innerRadius) {
	this.innerRadius = innerRadius;
};

public boolean equals(Object obj) {
	if (obj instanceof Donut) {
	Donut pomocni=(Donut) obj;
	/*f (this.center.equals(pomocni.center) &&
				this.getCenter() ==pomocni.getRadius()) {
			return true;
		} else {
			return false;
		}
	} else 
		return false;*/
	if(super.equals(pomocni) && this.innerRadius==pomocni.innerRadius) {
		return true;}
	else
		return false;} }
		
}
 
public boolean contains (Point clickPoint)
{
	
	return super.contains(clickPoint) && center.distance(clickPoint.getX(), clickPoint.getY())>=innerRadius;
}

public double area()
{
	return super.area()-innerRadius*innerRadius*Math.PI;
}

public String toString() {
	// Center=(x,y), radius= radius
	return super.toString()+ ", innerRadius="+innerRadius;
}
}
