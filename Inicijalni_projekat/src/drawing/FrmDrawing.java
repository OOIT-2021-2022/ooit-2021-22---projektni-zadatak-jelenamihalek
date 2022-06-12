package drawing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometry.Circle;
import geometry.Donut;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import geometry.Shape;
import stack.DlgAddDelete;
import javax.swing.JToggleButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class FrmDrawing extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static PnlDrawing panel = new PnlDrawing();
	private Color eColor, iColor;
	private Point startPoint;
	private ArrayList<Shape> shapes = new ArrayList<Shape>();

	private final ButtonGroup buttonGroupShapes = new ButtonGroup();
	private final ButtonGroup workButtons = new ButtonGroup();
	JToggleButton tglbtnPoint;
	JToggleButton tglbtnDonut;
	JToggleButton tglbtnCircle;
	JToggleButton tglbtnLine;
	JToggleButton tglbtnRectangle;
	JToggleButton tglbtnDel;
	JToggleButton tglbtnSel;
	JToggleButton tglbtnDraw;
	JToggleButton tglbtnMod;

	private final int drawing = 1;
	private final int delete = 0;
	private int operation = drawing;
	boolean doubleClick = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDrawing frame = new FrmDrawing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		JFrame frame = new JFrame("DRAWINGS");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		try {
			frame.setVisible(true);
			frame.getContentPane().add(panel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Create the frame.
	 */
	public FrmDrawing() {
		setTitle("Jelena Mihalek, IT3/2021");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 847, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		getContentPane().add(panel);
		panel.addMouseListener(panelClickListener());

		buttonGroupShapes.add(tglbtnPoint);
		buttonGroupShapes.add(tglbtnLine);
		buttonGroupShapes.add(tglbtnCircle);
		buttonGroupShapes.add(tglbtnDonut);
		buttonGroupShapes.add(tglbtnRectangle);

		workButtons.add(tglbtnDraw);
		workButtons.add(tglbtnSel);
		workButtons.add(tglbtnDel);
		workButtons.add(tglbtnMod);
	
	

		JPanel panelWest = new JPanel();
		contentPane.add(panelWest, BorderLayout.WEST);

		JPanel panelEast = new JPanel();
		contentPane.add(panelEast, BorderLayout.EAST);
		GridBagLayout gbl_panelEast = new GridBagLayout();
		gbl_panelEast.columnWidths = new int[] { 0 };
		gbl_panelEast.rowHeights = new int[] { 0 };
		gbl_panelEast.columnWeights = new double[] { Double.MIN_VALUE };
		gbl_panelEast.rowWeights = new double[] { Double.MIN_VALUE };
		panelEast.setLayout(gbl_panelEast);

		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[] { 30, 365, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelCenter.rowHeights = new int[] { 31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelCenter.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_panelCenter.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panelCenter.setLayout(gbl_panelCenter);

		tglbtnPoint = new JToggleButton("POINT");
		tglbtnPoint.setSelected(true);
		GridBagConstraints gbc_tglbtnPoint = new GridBagConstraints();
		gbc_tglbtnPoint.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnPoint.gridx = 0;
		gbc_tglbtnPoint.gridy = 0;
		panelCenter.add(tglbtnPoint, gbc_tglbtnPoint);

		JPanel panelNorth = new JPanel();
		GridBagConstraints gbc_panelNorth = new GridBagConstraints();
		gbc_panelNorth.insets = new Insets(0, 0, 5, 5);
		gbc_panelNorth.anchor = GridBagConstraints.NORTHWEST;
		gbc_panelNorth.gridx = 1;
		gbc_panelNorth.gridy = 0;
		panelCenter.add(panelNorth, gbc_panelNorth);
		panelNorth.setBounds(100, 100, 500, 200);

		tglbtnLine = new JToggleButton("LINE");
		GridBagConstraints gbc_tglbtnLine = new GridBagConstraints();
		gbc_tglbtnLine.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnLine.gridx = 0;
		gbc_tglbtnLine.gridy = 1;
		panelCenter.add(tglbtnLine, gbc_tglbtnLine);
		tglbtnRectangle = new JToggleButton("RECTANGLE");
		GridBagConstraints gbc_tglbtnRectangle = new GridBagConstraints();
		gbc_tglbtnRectangle.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnRectangle.gridx = 0;
		gbc_tglbtnRectangle.gridy = 2;
		panelCenter.add(tglbtnRectangle, gbc_tglbtnRectangle);

		tglbtnCircle = new JToggleButton("CIRCLE");
		GridBagConstraints gbc_tglbtnCircle = new GridBagConstraints();
		gbc_tglbtnCircle.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnCircle.gridx = 0;
		gbc_tglbtnCircle.gridy = 3;
		panelCenter.add(tglbtnCircle, gbc_tglbtnCircle);

		tglbtnDonut = new JToggleButton("DONUT");
        GridBagConstraints gbc_tglbtnDonut = new GridBagConstraints();
		gbc_tglbtnDonut.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnDonut.gridx = 0;
		gbc_tglbtnDonut.gridy = 4;
		panelCenter.add(tglbtnDonut, gbc_tglbtnDonut);



		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		GridBagLayout gbl_panelSouth = new GridBagLayout();
		gbl_panelSouth.columnWidths = new int[] { 210, 0, 0, 55, 0, 0, 0, 0, 0, 0 };
		gbl_panelSouth.rowHeights = new int[] { 0, 21, 0 };
		gbl_panelSouth.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panelSouth.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panelSouth.setLayout(gbl_panelSouth);

		tglbtnSel = new JToggleButton("SELECTION");
		
		GridBagConstraints gbc_tglbtnSel = new GridBagConstraints();
		gbc_tglbtnSel.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnSel.gridx = 1;
		gbc_tglbtnSel.gridy = 0;
		panelSouth.add(tglbtnSel, gbc_tglbtnSel);


            tglbtnDraw = new JToggleButton("DRAW");
            tglbtnDraw.setSelected(true);
            tglbtnDraw.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		operation = drawing;
            		
            		
            		
            		
            	}
            });
		
		GridBagConstraints gbc_tglbtnDraw = new GridBagConstraints();
		gbc_tglbtnDraw.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnDraw.gridx = 2;
		gbc_tglbtnDraw.gridy = 0;
		panelSouth.add(tglbtnDraw, gbc_tglbtnDraw);

		tglbtnDel = new JToggleButton("DELETE");
		
			
		
		GridBagConstraints gbc_tglbtnDel = new GridBagConstraints();
		gbc_tglbtnDel.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnDel.gridx = 3;
		gbc_tglbtnDel.gridy = 0;
		panelSouth.add(tglbtnDel, gbc_tglbtnDel);

		tglbtnMod = new JToggleButton("MODIFICATION");
		tglbtnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Shape selected=panel.getSelected();
				if (selected!=null) {
					if(selected instanceof Point) {
						Point point=(Point)selected;
						DlgPoint dlg=new DlgPoint();
						dlg.setPoint(point);
						dlg.setModal(true);
						dlg.setVisible(true);
					} else if(selected instanceof Line) {
						Line line=(Line)selected;
						DlgLine dlg=new DlgLine();
						dlg.setLine(line);
						dlg.setModal(true);
						dlg.setVisible(true);
					} else if(selected instanceof Rectangle) {
						Rectangle rectangle=(Rectangle)selected;
						DlgRectangle dlg=new DlgRectangle();
						dlg.setVisible(true);
						dlg.setRectangle(rectangle);
						dlg.setModal(true);
					} else if(selected instanceof Circle) {
						Circle circle=(Circle)selected;
						DlgAddDelete dlg=new DlgAddDelete();
						dlg.setCircle(circle);;
						dlg.setModal(true);
						dlg.setVisible(true);
					} else if (selected instanceof Donut) {
						Donut donut=(Donut)selected;
						DlgDonut dlg=new DlgDonut();
						dlg.setDonut(donut);
						dlg.setModal(true);
						dlg.setVisible(true);
					}
					else JOptionPane.showInputDialog(null, "There are no shapes on this panel", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				panel.repaint();
			}
			
		});
		
		GridBagConstraints gbc_tglbtnMod = new GridBagConstraints();
		gbc_tglbtnMod.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnMod.gridx = 4;
		gbc_tglbtnMod.gridy = 0;
		panelSouth.add(tglbtnMod, gbc_tglbtnMod);

		JButton btnE = new JButton("EXIT");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		GridBagConstraints gbc_btnE = new GridBagConstraints();
		gbc_btnE.insets = new Insets(0, 0, 0, 5);
		gbc_btnE.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnE.gridx = 3;
		gbc_btnE.gridy = 1;
		panelSouth.add(btnE, gbc_btnE);
	}
	private MouseAdapter panelClickListener() {
		return new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			Point mouseClick = new Point(e.getX(), e.getY());
			panel.deselect();
			
			if (operation ==1) {
				panel.select(mouseClick);
				return;
			}
			
			if (tglbtnPoint.isSelected()) {
				DlgPoint dlg = new DlgPoint();
	
				dlg.setPoint(mouseClick);
				dlg.setVisible(true);
				if(dlg.getPoint() != null)
					panel.add(dlg.getPoint());
				return;
				
			} else if (tglbtnLine.isSelected()) {
				if(doubleClick) {
					
					DlgLine dlg = new DlgLine();
					Line line = new Line(startPoint,mouseClick);
					dlg.setLine(line);
					dlg.seteColor(eColor);
					dlg.setVisible(true);
					if(dlg.getLine()!= null)
						panel.add(dlg.getLine());
					doubleClick=false;
					return;
				}
				startPoint = mouseClick;
				doubleClick=true;
				return;
				
	
			} else if (tglbtnRectangle.isSelected()) {
				DlgRectangle dlg = new DlgRectangle();
				dlg.setPoint(mouseClick);
				dlg.setVisible(true);
				
				if(dlg.getRectangle() != null) 
					panel.add(dlg.getRectangle());
				return;
			} else if (tglbtnCircle.isSelected()) {
				DlgAddDelete dlg = new DlgAddDelete();
				dlg.setPoint(mouseClick);
				dlg.setVisible(true);
				
				if(dlg.getCircle() != null) 
					panel.add(dlg.getCircle());
				return;
			} else if (tglbtnDonut.isSelected()) {
				DlgDonut dlg = new DlgDonut();
				dlg.setPoint(mouseClick);
				dlg.setVisible(true);
				
				if(dlg.getDonut() != null)
					panel.add(dlg.getDonut());
				return;
			}
		};
		};
	}
		
	



	protected void modification(){
	// proveravamo da li je selektovan objekat
	// zatim proveravamo kojoj klasi pripada
	// otvaramo dijalog korisniku

	
		Shape selected = panel.getSelected();
		if (selected != null) {
			if (selected instanceof Point) {
				Point point = (Point) selected; // downcasting, moramo ga iz Shape pretvoriti u Point
				DlgPoint dlg = new DlgPoint(); 
				dlg.setPoint(point);
				dlg.setModal(true);
				dlg.setVisible(true);
			} else if (selected instanceof Line) {
				Line line = (Line) selected;
				DlgLine dlg = new DlgLine();
				dlg.setLine(line);
				dlg.setModal(true);
				dlg.setVisible(true);

			}

			else if (selected instanceof Circle) {
				Circle circle = (Circle) selected;
				DlgAddDelete dlg = new DlgAddDelete();
				dlg.setCircle(circle);
				dlg.setModal(true);
				dlg.setVisible(true);
			} else if (selected instanceof Donut) {
				Donut donut = (Donut) selected;
				DlgDonut dlg = new DlgDonut();
				dlg.setDonut(donut);
				dlg.setModal(true);
				dlg.setVisible(true);
			} else if (selected instanceof Rectangle) {
				Rectangle rectangle = (Rectangle) selected;
				DlgRectangle dlg = new DlgRectangle();
				dlg.setRectangle(rectangle);
				dlg.setModal(true);
				dlg.setVisible(true);
			}

		}
	}

	private ActionListener btnEdgeColorListener() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (eColor != null)
					eColor = JColorChooser.showDialog(null, "EDGE COLOR", eColor);
				else
					eColor = Color.BLACK;
			}
		};
	}

	private ActionListener btnInnerColorListener() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (iColor != null)
					iColor = JColorChooser.showDialog(null, "INNER COLOR", iColor);
				else
					iColor = Color.white;
			}
		};
	}

	public JToggleButton getTglbtnPoint() {
		return tglbtnPoint;
	}

	public void setTglbtnPoint(JToggleButton tglbtnPoint) {
		this.tglbtnPoint = tglbtnPoint;
	}

	public JToggleButton getTglbtnDonut() {
		return tglbtnDonut;
	}

	public void setTglbtnDonut(JToggleButton tglbtnDonut) {
		this.tglbtnDonut = tglbtnDonut;
	}

	public JToggleButton getTglbtnCircle() {
		return tglbtnCircle;
	}

	public void setTglbtnCircle(JToggleButton tglbtnCircle) {
		this.tglbtnCircle = tglbtnCircle;
	}

	public JToggleButton getTglbtnLine() {
		return tglbtnLine;
	}

	public void setTglbtnLine(JToggleButton tglbtnLine) {
		this.tglbtnLine = tglbtnLine;
	}

	public JToggleButton getTglbtnRectangle() {
		return tglbtnRectangle;
	}

	public void setTglbtnRectangle(JToggleButton tglbtnRectangle) {
		this.tglbtnRectangle = tglbtnRectangle;
	}

	public JToggleButton getTglbtnDel() {
		return tglbtnDel;
	}

	public void setTglbtnDel(JToggleButton tglbtnDel) {
		this.tglbtnDel = tglbtnDel;
	}

	public JToggleButton getTglbtnSel() {
		return tglbtnSel;
	}

	public void setTglbtnSel(JToggleButton tglbtnSel) {
		this.tglbtnSel = tglbtnSel;
	}

	public JToggleButton getTglbtnDraw() {
		return tglbtnDraw;
	}

	public void setTglbtnDraw(JToggleButton tglbtnDraw) {
		this.tglbtnDraw = tglbtnDraw;
	}

	public JToggleButton getTglbtnMod() {
		return tglbtnMod;
	}

	public void setTglbtnMod(JToggleButton tglbtnMod) {
		this.tglbtnMod = tglbtnMod;
	}

	public ButtonGroup getButtonGroupShapes() {
		return buttonGroupShapes;
	}

	public ButtonGroup getWorkButtons() {
		return workButtons;
	}

	public Color getEColor() {
		// TODO Auto-generated method stub
		return eColor;
	}

	public Color getIColor() {
		// TODO Auto-generated method stub
		return iColor;
	}

}
