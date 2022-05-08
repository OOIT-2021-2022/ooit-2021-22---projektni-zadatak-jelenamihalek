package Geometry;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[])
	{
		JFrame frame=new JFrame("Drawing");
		frame.setSize(800, 600);
		JPanel drawing= new Drawing();//kreiramo panel koji je instanca klase drawing
		frame.getContentPane().add(drawing);
		frame.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		Point p=new Point(10,15);
		p.draw(g);
		g.setColor(Color.red);
		Line line=new Line(new Point (20,30),new Point (40,50));
		line.draw(g);
		g.setColor(Color.BLACK);
		Donut donut=new Donut(new Point(60,70),50,30,true);
		donut.draw(g);
	}
	

}
