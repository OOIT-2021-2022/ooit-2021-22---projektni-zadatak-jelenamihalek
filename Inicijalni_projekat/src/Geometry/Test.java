package Geometry;

import java.util.Arrays;

public class Test {

	// vezbe2
	//metoda instance se pozivaju nad objektnom
	//static metode se pozivaju nad klasama
	//main je ulazna tacka svakog programa
	public static void main(String[] args) {
		System.out.println("Kreiranje objekata");
		Point p = new Point(); //pozvan konstruktor klase Point, ugredjen je u klasu, nema parametre; sam postavlja 
		                       //defaultne vrednosti
		                       

		System.out.println(p.getX()); // stampa 0, jer nismo inicijalizovali vrednost
		p.setX(10);
		p.setY(10);
		System.out.println(p.distance(15, 25));
		System.out.println(p.distance(20, 20));

		p.setSelected(true);
		System.out.println(p.getX() + " " + p.getY() + " " + p.isSelected()); // 10 10 true

		// vezbe 3

		Point p1 = new Point();
		p1.setX(20);
		p1.setY(25);
		p1.setSelected(true);

		Line l1 = new Line(); // kreiran prazan konstruktor koji ce za pocetne vrednosti start/endPoint
								// staviti null pointer exception,jer ne postoji referenca
		                
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();

		// 1. Inicijalizovati x koordinatu tacke p
		// na vrednost y koordinate tacke p1
		p.setX(p1.getY());
		System.out.println(p.getX());

		// 2. Postaviti za pocetnu tacku linije l1 tacku p, a
		// za krajnju tacku linije l1 tacku p1
		l1.setStartPoint(p);
		l1.setEndPoint(p1);
		System.out.println(l1.getStartPoint().getX() + " " + l1.getStartPoint().getY());
		System.out.println(l1.getEndPoint().getX() + " " + l1.getEndPoint().getY());

		// 3. Postaviti y koordinatu krajnje tacke l1 na 23

		l1.getEndPoint().setY(23);
		System.out.println(l1.getEndPoint().getY());

//4. Inicijalizovati x koordinatu pocetne tacke linije l1
		// na vrednost y koordinate krajnje tacke linije l1
		l1.getStartPoint().setX(l1.getEndPoint().getY());

//5. Postaviti x koordinatu krajnje tacke l1 na vrednost
		// duzine linije l1 umanjene za vrednost zbira x i y
		// koordinate pocetne tacke linije l1
		l1.getEndPoint().setX((int) (l1.length() - (l1.getStartPoint().getX() + l1.getStartPoint().getY())));

//6. Postaviti x koordinatu tacke gore levo pravougaonika
		// r1 na vrednost 10 i y koordinatu na vrednost 15
//r1.setUpperLeftPoint(new Point(p.getX(),p.getY()))

		r1.setUpperLeftPoint(p);
		r1.getUpperLeftPoint().setX(10);
		r1.getUpperLeftPoint().setY(15);

//7. Postaviti centar kruga c1 na koordinate tacke
		// gore levo od r1

		c1.setCenter(r1.getUpperLeftPoint());
		System.out.println(c1.getCenter().getX()+" "+c1.getCenter().getY());;
//8. Postaviti x koordinatu centra kruga c1 na vrednost razlike
		// povrsine pravougaonika r1 i y koordinate pocetne tacke linije l1

		r1.setHeight(10);
		r1.setWidth(20);
		c1.getCenter().setX(r1.area() - l1.getStartPoint().getY());
		System.out.println(c1.getCenter().getX());
		
		System.out.println("---------------------Vezbe 3-kraj----------------------------------");

              //Vezbe 4
		

		Point p2 = new Point(5, 5); //sa new Point se kreira referenca na mesto u memoriji gde je kreiran objekat

		System.out.println(p2.getX());
		
		Line l2=new Line(p2,new Point(10,20));//selected je po defaultu falsu,ako nema tacke
		                                      // onda je false
	    System.out.println(l2);
		Rectangle r2=new Rectangle(p2,20,30);
		Circle c2=new Circle(p2,20);
		

		Point p3 = new Point(5, 5, false);
		System.out.println(p3.isSelected());

		System.out.println(p3);//pise ime paketa i odredjenje reference,bez metode string
		System.out.println(l1);//redefinicijom te metode dobijamo ispis (x1,y1)-->(x2,y2)
		//System.out.println(p3.toString) je isto
		System.out.println(r2);
		System.out.println(c2);
		
		System.out.println("---------------------Test equals i ==-------------");
		int a=5;
		int b=5;
		System.out.println(a==b);
		b=7;
		System.out.println(a==b);
		
		String c="abcd";
		String d="abc";//kreira se novi objekat
		System.out.println(c==d);
		String f="abc"; //referenca na postojeci objekat b
		System.out.println(f==d);

		Point p4 = new Point(15, 20);
		Point p5 = new Point(15, 20);
		System.out.println(p4.equals(p5));// true jer su iste vrednosti
		System.out.println(p4 == p5);//false jer su razlicite reference

		p4 = p5;//dodeljuje se u vrednosti i referenca;menjanjem vrenosti jedne tacke, menja se vrednost druge
		System.out.println(p4.equals(p5));
		System.out.println(p4 == p5);

		Point p6 = new Point(10, 15);
		Point p7 = new Point(10, 15);
		System.out.println(p6 == p7);
		System.out.println(p6.equals(p7));
		
		

		// vezbe 5
System.out.println("------------------------VEZBE 5-----------------");
		Point clickPoint = new Point(10, 15);
		System.out.println(p7.contains(clickPoint.getX(), clickPoint.getY()));

		Line lin = new Line();
	//PROVERIIIIII	System.out.println(lin.contains(clickPoint.getX(), clickPoint.getY()));
		System.out.println("------------------------VEZBE6------------------");

		// Donut donut=new Donut(new Point(12,27),20,10,true);

		// vezbe 6

		//Shape shape = new Point(10, 15);
		// System.out.println(shape)
		
		
		//vezbe 7
		System.out.println("---------------------------VEZBE 7-------------------");
		
		Point movePoint=new Point(10,15);
	    System.out.println(movePoint);
	    movePoint.moveBy(5, 5);
	    System.out.println(movePoint);
	    movePoint.moveTo(10, 15);
	    System.out.println(movePoint);
	    
	    Circle movedCircle=new Circle(new Point(20,30),15);
	    movedCircle.moveBy(5, 30);
	    System.out.println(movedCircle);
	    movedCircle.moveTo(15, 15);
	    System.out.println(movedCircle);
	    
	    //Comparable
	    
	    movePoint.compareTo(clickPoint);
	    
	    //NIZOVI
	    
	    Line []lines=new Line[3];
	   lines[0]=new Line(new Point(1,1),new Point(5,5));
	   lines[1]=new Line(new Point(6,6),new Point(7,7));
	   lines[2]=new Line(new Point(8,8),new Point(10,10));
	   System.out.println("Pre sortiranja");
		  for(int i=0;i<lines.length;i++)
		  { System.out.println(lines[i]);}
	  Arrays.sort(lines);
	  System.out.println("Posle sortiranja");
	  for(int i=0;i<lines.length;i++)
	  { System.out.println(lines[i]);}
	   Rectangle[] rectangles=new Rectangle[3];
	   rectangles[0]=new Rectangle(new Point (5,5), 20,20);
	   rectangles[1]=new Rectangle(new Point (10,10), 30,20);
	   rectangles[2]=new Rectangle(new Point (20,20), 10,50);
	   System.out.println("Pre sortiranja");
		  for(int i=0;i<lines.length;i++)
		  { System.out.println(rectangles[i]);}
		  Arrays.sort(rectangles);
		  System.out.println("Posle sortiranja");
		  for(int i=0;i<rectangles.length;i++)
		  { System.out.println(rectangles[i]);}
	   
	    

	}
}
