package Geometry;

public class Test {

	// vezbe2
	public static void main(String[] args) {
		System.out.println("Kreiranje objekata");
		Point p = new Point();

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
								// staviti null,jer ne postoji referenca
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
		
		System.out.println("-------------------------------------------------------");

//Vezbe 4
		/*
		 * 1.Postaviti koordinatu x centra ranije kreiranog kruga k na vrednost zbira
		 * vrednosti poluprecnika kruga k i vrednosti koja predstavlja udaljenost
		 * pocetne i krajnje tacke prethodno kreirane linije lin (NE duzine). Sve
		 * objekte kreirati samostalno.
		 */
		/*
		 * c1.getCenter().setX(c1.getRadius()+(int)(l1.getStartPoint().distance(l1.
		 * getEndPoint().getX(), l1.getEndPoint().getY())));
		 * 
		 * /* Point p=new Point(); d0,0, false public void, ne pise se tip podatka ,
		 * Point (){};
		 */

		Point p2 = new Point(5, 5);

		System.out.println(p2.getX());

		Point p3 = new Point(5, 5, false);
		System.out.println(p3.isSelected());

		System.out.println(p3);
		System.out.println(l1);

		Point p4 = new Point(10, 15);
		Point p5 = new Point(15, 20);
		System.out.println(p4.equals(p5));
		System.out.print(p4 == p5);

		p4 = p5;
		System.out.println(p4.equals(p5));
		System.out.print(p4 == p5);

		Point p6 = new Point(10, 15);
		Point p7 = new Point(10, 15);
		System.out.print(p6 == p7);
		System.out.print(p6.equals(p7));

		// vezbe 5

		Point clickPoint = new Point(10, 15);
		System.out.println(p7.contains(clickPoint.getX(), clickPoint.getY()));

		Line lin = new Line();
		System.out.println(lin.contains(clickPoint.getX(), clickPoint.getY()));

		// Donut donut=new Donut(new Point(12,27),20,10,true);

		// vezbe 6

		Shape shape = new Point(10, 15);
		// System.out.println(shape)

	}
}
