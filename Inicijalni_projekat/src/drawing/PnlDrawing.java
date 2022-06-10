package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

import geometry.Circle;
import geometry.Donut;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import geometry.Shape;
import stack.DlgAddDelete;

public class PnlDrawing extends JPanel {
private ArrayList<Shape> shapes=new ArrayList<Shape>();
private FrmDrawing frame;
private Point startPoint;
private Shape selected;

	/**
	 * Create the panel.
	 */
	public PnlDrawing() {
		setBackground(new Color(241, 245, 179));
		setBounds(100,100, 470,370);
	}
	
	public PnlDrawing(FrmDrawing frame) {
		 this.frame=frame;
		
	}
		

			
			
			public void paint(Graphics g) {
				super.paint(g);
				Iterator<Shape> it =shapes.iterator();
				while(it.hasNext())
					it.next().draw(g);
			}
			//prolazi kroz oblike,
			//odlazi u shape i ostale klase i trazi u svakoj klasi metodu paint
			
			public void addShape(Shape shape) {
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
				shapes.set( index, shape);
			}
			//zasto sam morala da zamenim?
			
			
			
	
			
		
			public Shape getSelected() {
				
				return selected; 
			}
			
			public void setSelected(Shape selected) {
				this.selected = selected;
			}
		
			
			public ArrayList<Shape> getShapes() {
				return shapes;
			}

			public void setShapes(ArrayList<Shape> shapes) {
				this.shapes = shapes;
			}
			
			public FrmDrawing getFrame() {
				return frame;
			}

			public void setFrame(FrmDrawing frame) {
				this.frame = frame;
			}

			public Point getStartPoint() {
				return startPoint;
			}

			public void setStartPoint(Point startPoint) {
				this.startPoint = startPoint;
			}

		
				

				protected void thisMouseClicked(MouseEvent e) {
					int x = e.getX();
					int y = e.getY();
					
					
					if(frame.getTglbtnSel().isSelected()) {
						selected=null;
						Iterator<Shape> it=shapes.iterator();
						while(it.hasNext()) {
							
							Shape shape=it.next();
							shape.setSelected(false);
							if(shape.contains(e.getX(), e.getY()))
								selected=shape;
						}
						
						if (selected!=null) {
							selected.setSelected(true);
						}
						
					} else if (frame.getTglbtnDraw().isSelected()) {
							Iterator<Shape> it=shapes.iterator();
							while(it.hasNext()) {
								Shape shape=it.next();
								shape.setSelected(false);
							}
						
							 if (frame.getTglbtnPoint().isSelected()) {
							shapes.add(new Point(x, y));
						}else if(frame.getTglbtnLine().isSelected()) {
							if(startPoint==null)
								startPoint=new Point(x, y);
							else {
								shapes.add(new Line(startPoint, new Point(x, y)));
								startPoint=null;
							}
						}
						
					}
					repaint();
					
				}
		

	}


