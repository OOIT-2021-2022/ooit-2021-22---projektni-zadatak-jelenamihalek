package Geometry;

import java.awt.Graphics;

public abstract class Shape {
	
	private boolean selected;
	

	
	
	public Shape() {};
	public Shape(boolean selected)
	{
		this.selected=selected;
		
	}
	
	public abstract boolean contains (int x, int y);//ne pravi se telo metode, jer imamo vise oblika
	
	public abstract void draw(Graphics g);
	
	public boolean isSelected()
	
	{
		return selected;
		}
	public void setSelected (boolean selected)
	{
		this.selected=selected;
		}
	}


