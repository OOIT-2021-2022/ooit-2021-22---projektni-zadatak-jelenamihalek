package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

import geometry.Circle;
import geometry.Donut;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import geometry.Shape;
import stack.DlgAddDelete;

public class PnlDrawing extends JPanel {
	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	private FrmDrawing frame;
	private Point startPoint;
	private Shape selected;

	/**
	 * Create the panel.
	 */
	
	public PnlDrawing() {
		setBackground(new Color(241, 245, 179));
		setBounds(100, 100, 470, 370);

	}
	

	public void DrawingPanel(FrmDrawing frame) {
		//super.paint(g);
		setBackground(Color.WHITE);
		this.frame=frame;
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				thisMouseClicked(e);
			}
		});
	}
	

	protected void thisMouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
		
	}


	public void select(Point clickPoint) {
		for (int i = shapes.size() - 1; i >= 0; i--) {
			if (shapes.get(i).contains(clickPoint.getX(), clickPoint.getY())) {
				shapes.get(i).setSelected(true);
				repaint();
				return;
			}
		}
	}

	public void deselect() {
		shapes.forEach(shape -> shape.setSelected(false));
		repaint();
	}

	public void paint(Graphics g) {
		super.paint(g);
		Iterator<Shape> it = shapes.iterator();
		while (it.hasNext())
			it.next().draw(g);
	}
	// prolazi kroz oblike,
	// odlazi u shape i ostale klase i trazi u svakoj klasi metodu paint
	

	public void add(Shape shape) {
		shapes.add(shape);
		repaint();
	}

	public boolean isEmpty() {
		return shapes.isEmpty();
	}

	public Shape getShape(int index) {
		return shapes.get(index);
	}

	public void setShape(int index, Shape shape) {
		shapes.set(index, shape);
	}

	public Shape getSelected() {

		return selected;
	}

	public void setSelected(Shape selected) {
		this.selected = selected;
	}
	
	public void removeSelected() {
		shapes.removeIf(shape -> shape.isSelected());
		repaint();
	}
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

}
