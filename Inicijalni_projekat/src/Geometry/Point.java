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
		return d;
		}
	
	
	
	
	
	
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


	public boolean isSelected() {
		return selected;
	}




	public void setSelected(boolean selected) {
		this.selected = selected;
	}




	public int getY() {
		return y;
	}


	//vezba 4

	public Point () {};
	public Point (int x, int y)
	{
		this.x=x;
		this.y=y;    //potpis metode(ime, redosled i broj tipova podataka) ne smeju biti isti, overloading-preklapanje naziva
		//vise metpda koje se isto nazivaju
	}
	public Point (int x, int y, boolean selected) 
	{//this.x=x;
	//this.y=y; 
		this(x,y);
	this.selected=selected;	
	
	};


	
	/*objct je roditeljska klasa, sve ostale nasledjuju 
	 * njene osobine 
	 * r1=r2    prenosi se i vrednost i referenca
	 * r1==r2 porede se reference, i imace iste vrednosti,uvek true
	 * ako imamo new onda su dva objekta, dve raylicite refenrece
	 * equals dal su jednake vrednosti
	 * overwriting predefinisanje metode
	 */
	
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point pomocna = (Point) obj;
			/*downcast objekat pretvaramo u tacku, konvertivanje*/
			if (this.x == pomocna.x && this.y == pomocna.y)
				return true;
			else
				return false;
		} else
			return false;
	}



	public String toString() {
		return "(" + x + "," + y + ")";
		//return x; ne moze, konkatenacija
	}

	
	
}
