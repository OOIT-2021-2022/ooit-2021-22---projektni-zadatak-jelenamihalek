package drawing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import stack.DlgAddDelete;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgRectangle extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textUPX;
	private JTextField textUPY;
	private JTextField textW;
	private JTextField textH;
	private DlgAddDelete dialog;
	private Rectangle rectangle;
	private Color eColor, iColor;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgRectangle dialog = new DlgRectangle();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgRectangle() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(new BorderLayout(0, 0));
		JPanel panelNorth = new JPanel();
		contentPanel.add(panelNorth);
		
		JPanel panelWest = new JPanel();
		contentPanel.add(panelWest);
		
		JPanel panelCenter = new JPanel();
		contentPanel.add(panelCenter);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCenter.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCenter.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		JLabel lblTitle = new JLabel("DRAW RECTANGLE");
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.gridx = 2;
		gbc_lblTitle.gridy = 1;
		panelCenter.add(lblTitle, gbc_lblTitle);
		
		JLabel lblUPX = new JLabel(" Upper left point X:");
		GridBagConstraints gbc_lblUPX = new GridBagConstraints();
		gbc_lblUPX.anchor = GridBagConstraints.EAST;
		gbc_lblUPX.insets = new Insets(0, 0, 5, 5);
		gbc_lblUPX.gridx = 0;
		gbc_lblUPX.gridy = 3;
		panelCenter.add(lblUPX, gbc_lblUPX);
		
		textUPX = new JTextField();
		GridBagConstraints gbc_textUPX = new GridBagConstraints();
		gbc_textUPX.gridwidth = 2;
		gbc_textUPX.insets = new Insets(0, 0, 5, 5);
		gbc_textUPX.fill = GridBagConstraints.HORIZONTAL;
		gbc_textUPX.gridx = 1;
		gbc_textUPX.gridy = 3;
		panelCenter.add(textUPX, gbc_textUPX);
		textUPX.setColumns(10);
		
		JLabel lblUPY = new JLabel("Upper left point Y:");
		GridBagConstraints gbc_lblUPY = new GridBagConstraints();
		gbc_lblUPY.anchor = GridBagConstraints.EAST;
		gbc_lblUPY.insets = new Insets(0, 0, 5, 5);
		gbc_lblUPY.gridx = 0;
		gbc_lblUPY.gridy = 4;
		panelCenter.add(lblUPY, gbc_lblUPY);
		
		textUPY = new JTextField();
		GridBagConstraints gbc_texTUPY = new GridBagConstraints();
		gbc_texTUPY.gridwidth = 2;
		gbc_texTUPY.insets = new Insets(0, 0, 5, 5);
		gbc_texTUPY.fill = GridBagConstraints.HORIZONTAL;
		gbc_texTUPY.gridx = 1;
		gbc_texTUPY.gridy = 4;
		panelCenter.add(textUPY, gbc_texTUPY);
		textUPY.setColumns(10);
		
		JLabel lblW = new JLabel("Width:");
		GridBagConstraints gbc_lblW = new GridBagConstraints();
		gbc_lblW.anchor = GridBagConstraints.EAST;
		gbc_lblW.insets = new Insets(0, 0, 5, 5);
		gbc_lblW.gridx = 0;
		gbc_lblW.gridy = 5;
		panelCenter.add(lblW, gbc_lblW);
		
		textW = new JTextField();
		GridBagConstraints gbc_textW = new GridBagConstraints();
		gbc_textW.gridwidth = 2;
		gbc_textW.insets = new Insets(0, 0, 5, 5);
		gbc_textW.fill = GridBagConstraints.HORIZONTAL;
		gbc_textW.gridx = 1;
		gbc_textW.gridy = 5;
		panelCenter.add(textW, gbc_textW);
		textW.setColumns(10);
		
		JLabel lblH = new JLabel("Height:");
		GridBagConstraints gbc_lblh = new GridBagConstraints();
		gbc_lblh.anchor = GridBagConstraints.EAST;
		gbc_lblh.insets = new Insets(0, 0, 0, 5);
		gbc_lblh.gridx = 0;
		gbc_lblh.gridy = 6;
		panelCenter.add(lblH, gbc_lblh);
		
		textH = new JTextField();
		GridBagConstraints gbc_textH = new GridBagConstraints();
		gbc_textH.gridwidth = 2;
		gbc_textH.insets = new Insets(0, 0, 0, 5);
		gbc_textH.fill = GridBagConstraints.HORIZONTAL;
		gbc_textH.gridx = 1;
		gbc_textH.gridy = 6;
		panelCenter.add(textH, gbc_textH);
		textH.setColumns(10);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try
						{
							int x = Integer.parseInt(textUPX.getText());
							int y = Integer.parseInt(textUPY.getText());
							int width = Integer.parseInt(textW.getText());
							int height = Integer.parseInt(textH.getText());
						
						if(x<0 || y<0 || width<=0 || height<=0) 
						{	JOptionPane.showMessageDialog(null,  "Width and height must be greater than 0 ! Try again.","Error!", JOptionPane.ERROR_MESSAGE);
					
						return;
						}

						eColor = JColorChooser.showDialog(null, "EDGE COLOR", eColor);
						iColor = JColorChooser.showDialog(null, "INNER COLOR", iColor);
						rectangle=new Rectangle(new Point (x,y),width, height,eColor, iColor); 
						rectangle.seteColor(eColor);
						rectangle.setiColor(iColor);
						dispose();
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null, "Please enter a number!", "Error!",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public JTextField getTextUPX() {
		return textUPX;
	}

	public void setTextUPX(JTextField textUPX) {
		this.textUPX = textUPX;
	}

	public JTextField getTextUPY() {
		return textUPY;
	}

	public void setTextUPY(JTextField textUPY) {
		this.textUPY = textUPY;
	}

	public JTextField getTextW() {
		return textW;
	}

	public void setTextW(JTextField textW) {
		this.textW = textW;
	}

	public JTextField getTextH() {
		return textH;
	}

	public void setTextH(JTextField textH) {
		this.textH = textH;
	}

	public DlgAddDelete getDialog() {
		return dialog;
	}

	public void setDialog(DlgAddDelete dialog) {
		this.dialog = dialog;
	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	public void setRectangle() {
		this.rectangle = rectangle;
	}

	public void setPoint(Point startPoint) {
		textUPX.setText("" + rectangle.getUpperLeftPoint().getX());
		textUPY.setText("" + rectangle.getUpperLeftPoint().getY());
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public void setRectangle(Rectangle rectangle) {
		textUPX.setText("" + rectangle.getUpperLeftPoint().getX());
		textUPY.setText("" + rectangle.getUpperLeftPoint().getY());
		textW.setText("" + rectangle.getWidth());
		eColor = rectangle.geteColor();
		iColor = rectangle.getiColor();
	}


	
}
