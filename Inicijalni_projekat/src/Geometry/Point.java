package Geometry;

public class Point {

	private int  x;
	private int  y;
	private boolean selected;
	
	
	public double distance (int xPoint2, int yPoint2)
	{
		double dx=this.x-xPoint2;
		double dy=this.y-yPoint2;
		double d=Math.sqrt(dx*dx+dy*dy);
		return d;}
	
	
	
	
	
	
	public int  getX()
	{
		return this.x;
	}
	public  void setX(int x)
	{
		this.x=x;
	}
	public void setY(int y)
	{
		this.y=y;
	}
	
	
	
}
