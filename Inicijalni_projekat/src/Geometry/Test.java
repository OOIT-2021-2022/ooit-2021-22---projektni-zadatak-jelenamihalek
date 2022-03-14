package Geometry;

public class Test {
	
	
	public static void main (String [] args)
	{
		System.out.println("Kreiranje objekata");
		Point p=new Point();
	
		System.out.print(p.getX());
		p.setX(10);
		p.setY(10);
		System.out.print(p.distance(15, 25));
	}

}
