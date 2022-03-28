package Geometry;

public class Test {
	
	//vezbe2
	public static void main (String [] args)
	{
		System.out.println("Kreiranje objekata");
		Point p=new Point();
	
		System.out.print(p.getX());
		p.setX(10);
		p.setY(10);
		System.out.print(p.distance(15, 25));
	
	//vezbe3
	p.setSelected(true);
	
	
	Point p1=new Point();
	p1.setX(20);
	p1.setY(25);
	
	Line l1=new Line();
	System.out.println(l1.getStartPoint()+" "+l1.getEndPoint());
	
	 Rectangle r1=new Rectangle();
	 Circle c1=new Circle();
		System.out.println(p.getX());

	 p.setX(p1.getY());
		System.out.println(p.getX());
		
		
		l1.setStartPoint(p);
		l1.setEndPoint(p1);
		System.out.println(l1.getStartPoint().getX()+" "+l1.getStartPoint().getY());
		System.out.println(l1.getEndPoint().getX()+" "+l1.getEndPoint().getY());


l1.getEndPoint().setY(23);
System.out.println(l1.getEndPoint().getY());

l1.getStartPoint().setX(l1.getEndPoint().getY());


l1.getEndPoint().setX((int)(l1.length()-(l1.getStartPoint().getX()+l1.getStartPoint().getY())));


//r1.setUpperLeftPoint(new Point(p.getX(),p.getY()))
                             
r1.setUpperLeftPoint(p);
r1.getUpperLeftPoint().setX(10);
r1.getUpperLeftPoint().setY(15);

c1.setCenter(r1.getUpperLeftPoint());
r1.setHeight(10);
r1.setWidth(20);
c1.getCenter().setX(r1.area()-l1.getStartPoint().getY());
System.out.println(c1.getCenter().getX());

//Vezbe 4
		/*
		 * 1.Postaviti koordinatu x centra ranije kreiranog kruga k na vrednost zbira
		 * vrednosti poluprecnika  kruga k i vrednosti koja predstavlja udaljenost
		 * pocetne i krajnje tacke prethodno kreirane linije lin (NE duzine). Sve
		 * objekte kreirati samostalno.
		 */

c1.getCenter().setX(c1.getRadius()+(int)(l1.getStartPoint().distance(l1.getEndPoint().getX(), l1.getEndPoint().getY())));

/* Point p=new Point(); d0,0, false
 * public void, ne pise se tip podatka , Point (){};
 */


Point p2=new Point(5,5);

System.out.println(p2.getX());

Point p3=new Point (5,5, false);
System.out.println(p3.isSelected());

System.out.println(p3);
System.out.println(l1);


Point p4=new Point(10,15);
Point p5=new Point(15,20);
System.out.println(p4.equals(p5));
System.out.println(p4==p5);

p4=p5;
System.out.println(p4.equals(p5));
System.out.println(p4==p5);

Point p6=new Point(10,15);
Point p7=new Point(10,15);
System.out.println(p6==p7);
System.out.println(p6.equals(p7));
	}
}
