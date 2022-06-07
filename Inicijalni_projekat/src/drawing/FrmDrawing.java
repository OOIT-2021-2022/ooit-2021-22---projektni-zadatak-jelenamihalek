package drawing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import javax.swing.JButton;

public class FrmDrawing extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PnlDrawing panel=new PnlDrawing();


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
	}

	/**
	 * Create the frame.
	 */
	public FrmDrawing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 847, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
		
		
		JPanel panelWest = new JPanel();
		contentPane.add(panelWest, BorderLayout.WEST);
		
		JPanel panelEast = new JPanel();
		contentPane.add(panelEast, BorderLayout.EAST);
		GridBagLayout gbl_panelEast = new GridBagLayout();
		gbl_panelEast.columnWidths = new int[]{0};
		gbl_panelEast.rowHeights = new int[]{0};
		gbl_panelEast.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panelEast.rowWeights = new double[]{Double.MIN_VALUE};
		panelEast.setLayout(gbl_panelEast);
		
		JPanel panelCenter= new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{30, 365, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCenter.rowHeights = new int[]{31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCenter.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		JToggleButton tglbtnPoint = new JToggleButton("POINT");
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
		panelNorth.setBounds(100,100,500,200);
		
		JToggleButton tglbtnLine= new JToggleButton("LINE");
		GridBagConstraints gbc_tglbtnLine = new GridBagConstraints();
		gbc_tglbtnLine.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnLine.gridx = 0;
		gbc_tglbtnLine.gridy = 1;
		panelCenter.add(tglbtnLine, gbc_tglbtnLine);
		
		JToggleButton tglbtnRectangle= new JToggleButton("RECTANGLE");
		GridBagConstraints gbc_tglbtnRectangle = new GridBagConstraints();
		gbc_tglbtnRectangle.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnRectangle.gridx = 0;
		gbc_tglbtnRectangle.gridy = 2;
		panelCenter.add(tglbtnRectangle, gbc_tglbtnRectangle);
		
		JToggleButton tglbtnCircle = new JToggleButton("CIRCLE");
		GridBagConstraints gbc_tglbtnCircle = new GridBagConstraints();
		gbc_tglbtnCircle.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnCircle.gridx = 0;
		gbc_tglbtnCircle.gridy = 3;
		panelCenter.add(tglbtnCircle, gbc_tglbtnCircle);
		
		JToggleButton tglbtnDonut = new JToggleButton("DONUT");
		GridBagConstraints gbc_tglbtnDonut = new GridBagConstraints();
		gbc_tglbtnDonut.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnDonut.gridx = 0;
		gbc_tglbtnDonut.gridy = 4;
		panelCenter.add(tglbtnDonut, gbc_tglbtnDonut);
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		GridBagLayout gbl_panelSouth = new GridBagLayout();
		gbl_panelSouth.columnWidths = new int[]{210, 0, 0, 55, 0, 0, 0, 0, 0, 0};
		gbl_panelSouth.rowHeights = new int[]{0, 21, 0};
		gbl_panelSouth.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelSouth.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelSouth.setLayout(gbl_panelSouth);
		
		JToggleButton tglbtnSel = new JToggleButton("SELECTION");
		GridBagConstraints gbc_tglbtnSel = new GridBagConstraints();
		gbc_tglbtnSel.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnSel.gridx = 1;
		gbc_tglbtnSel.gridy = 0;
		panelSouth.add(tglbtnSel, gbc_tglbtnSel);
		
		JToggleButton tglbtnDraw = new JToggleButton("DRAW");
		GridBagConstraints gbc_tglbtnDraw = new GridBagConstraints();
		gbc_tglbtnDraw.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnDraw.gridx = 2;
		gbc_tglbtnDraw.gridy = 0;
		panelSouth.add(tglbtnDraw, gbc_tglbtnDraw);
		
		JToggleButton tglbtnDel = new JToggleButton("DELETE");
		GridBagConstraints gbc_tglbtnDel = new GridBagConstraints();
		gbc_tglbtnDel.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnDel.gridx = 3;
		gbc_tglbtnDel.gridy = 0;
		panelSouth.add(tglbtnDel, gbc_tglbtnDel);
		
		JToggleButton tglbtnMod = new JToggleButton("MODIFICATION");
		GridBagConstraints gbc_tglbtnMod = new GridBagConstraints();
		gbc_tglbtnMod.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnMod.gridx = 4;
		gbc_tglbtnMod.gridy = 0;
		panelSouth.add(tglbtnMod, gbc_tglbtnMod);
		
		JButton btnE = new JButton("EXIT");
		GridBagConstraints gbc_btnE = new GridBagConstraints();
		gbc_btnE.insets = new Insets(0, 0, 0, 5);
		gbc_btnE.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnE.gridx = 3;
		gbc_btnE.gridy = 1;
		panelSouth.add(btnE, gbc_btnE);
	}
	protected void delete() {
		Shape selected=panel.getSelected();
		if(selected!=null)
			{panel.getShapes().remove(selected);//ukoliko postoji selektovani objekat
		                                       //brise se
			panel.repaint();
			}
		else JOptionPane.showMessageDialog(null,  "There are no shapes in this panel","Error!", JOptionPane.ERROR_MESSAGE);
		
		
	}
	
	
	protected void modification()
	//proveravamo da li je selktovan objekat
	//zatim proveravamo kojoj klasi pripada
	//otvaramo dijalog korisniku
	
	{
		Shape selected=panel.getSelected();
		if (selected!=null)
		{ if(selected instanceof Point)
		{
			Point point=(Point) selected; //downcasting, moramo ga iz Shape pretvoriti u Point
			DlgPoint dlg=new DlgPoint();//
			dlg.setPoint(point);
			dlg.setModal(true);;
			dlg.setVisible(true);
		}
		else if(selected instanceof Line)
		{ 	
			Line line=(Line) selected;
			DlgLine dlg=new DlgLine();
			dlg.setLine(line);
			dlg.setModal(true);
			dlg.setVisible(true);
			
		}
		
		else if(selected instanceof Circle)
		{
			Circle circle=(Circle) selected;
			DlgAddDelete dlg=new DlgAddDelete();
			dlg.setCircle(circle);
			dlg.setModal(true);
			dlg.setVisible(true);
		}
		else if(selected instanceof Donut)
		{
			Donut donut=(Donut) selected;
			DlgDonut dlg=new DlgDonut();
			dlg.setDonut(donut);
			dlg.setModal(true);
			dlg.setVisible(true);
		}
		else if(selected instanceof Rectangle)
		{
			Rectangle rectangle=(Rectangle) selected;
			DlgRectangle dlg=new DlgRectangle();
			dlg.setRectangle(rectangle);
			dlg.setModal(true);
			dlg.setVisible(true);
		}
			
		}
	}

	
	

}
