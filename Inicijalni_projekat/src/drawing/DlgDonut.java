package drawing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import geometry.Donut;
import stack.DlgAddDelete;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgDonut extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textCX;
	private JTextField textCY;
	private JTextField textR;
	private JTextField textIR;
	private DlgAddDelete dialog;
	private Donut donut;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgDonut dialog = new DlgDonut();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgDonut() {
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
		
		JLabel lblTitle = new JLabel("ADD OR DELETE CIRCLE WITH HOLE");
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.gridx = 2;
		gbc_lblTitle.gridy = 1;
		panelCenter.add(lblTitle, gbc_lblTitle);
		
		JLabel lblCX = new JLabel(" Center X:");
		GridBagConstraints gbc_lblCX = new GridBagConstraints();
		gbc_lblCX.anchor = GridBagConstraints.EAST;
		gbc_lblCX.insets = new Insets(0, 0, 5, 5);
		gbc_lblCX.gridx = 0;
		gbc_lblCX.gridy = 3;
		panelCenter.add(lblCX, gbc_lblCX);
		
		textCX = new JTextField();
		GridBagConstraints gbc_textCX = new GridBagConstraints();
		gbc_textCX.gridwidth = 2;
		gbc_textCX.insets = new Insets(0, 0, 5, 5);
		gbc_textCX.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCX.gridx = 1;
		gbc_textCX.gridy = 3;
		panelCenter.add(textCX, gbc_textCX);
		textCX.setColumns(10);
		
		JLabel lblCY = new JLabel("Center Y:");
		GridBagConstraints gbc_lblCY = new GridBagConstraints();
		gbc_lblCY.anchor = GridBagConstraints.EAST;
		gbc_lblCY.insets = new Insets(0, 0, 5, 5);
		gbc_lblCY.gridx = 0;
		gbc_lblCY.gridy = 4;
		panelCenter.add(lblCY, gbc_lblCY);
		
		textCY = new JTextField();
		GridBagConstraints gbc_texTCY = new GridBagConstraints();
		gbc_texTCY.gridwidth = 2;
		gbc_texTCY.insets = new Insets(0, 0, 5, 5);
		gbc_texTCY.fill = GridBagConstraints.HORIZONTAL;
		gbc_texTCY.gridx = 1;
		gbc_texTCY.gridy = 4;
		panelCenter.add(textCY, gbc_texTCY);
		textCY.setColumns(10);
		
		JLabel lblR = new JLabel("Radius:");
		GridBagConstraints gbc_lblR = new GridBagConstraints();
		gbc_lblR.anchor = GridBagConstraints.EAST;
		gbc_lblR.insets = new Insets(0, 0, 5, 5);
		gbc_lblR.gridx = 0;
		gbc_lblR.gridy = 5;
		panelCenter.add(lblR, gbc_lblR);
		
		textR = new JTextField();
		GridBagConstraints gbc_textR = new GridBagConstraints();
		gbc_textR.gridwidth = 2;
		gbc_textR.insets = new Insets(0, 0, 5, 5);
		gbc_textR.fill = GridBagConstraints.HORIZONTAL;
		gbc_textR.gridx = 1;
		gbc_textR.gridy = 5;
		panelCenter.add(textR, gbc_textR);
		textR.setColumns(10);
		
		JLabel lblIR = new JLabel("Inner radius:");
		GridBagConstraints gbc_lblIR = new GridBagConstraints();
		gbc_lblIR.anchor = GridBagConstraints.EAST;
		gbc_lblIR.insets = new Insets(0, 0, 0, 5);
		gbc_lblIR.gridx = 0;
		gbc_lblIR.gridy = 6;
		panelCenter.add(lblIR, gbc_lblIR);
		
		textIR = new JTextField();
		GridBagConstraints gbc_textIR = new GridBagConstraints();
		gbc_textIR.gridwidth = 2;
		gbc_textIR.insets = new Insets(0, 0, 0, 5);
		gbc_textIR.fill = GridBagConstraints.HORIZONTAL;
		gbc_textIR.gridx = 1;
		gbc_textIR.gridy = 6;
		panelCenter.add(textIR, gbc_textIR);
		textIR.setColumns(10);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(Integer.parseInt(textR.getText())<0 || Integer.parseInt(textIR.getText())<0) 
							JOptionPane.showMessageDialog(null,  "Radius and inner radius must be greater than 0 ! Try again.","Error!", JOptionPane.ERROR_MESSAGE);
							
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

	public JTextField getTextCX() {
		return textCX;
	}

	public void setTextCX(JTextField textCX) {
		this.textCX = textCX;
	}

	public JTextField getTextCY() {
		return textCY;
	}

	public void setTextCY(JTextField textCY) {
		this.textCY = textCY;
	}

	public JTextField getTextR() {
		return textR;
	}

	public void setTextR(JTextField textR) {
		this.textR = textR;
	}

	public JTextField getTextIR() {
		return textIR;
	}

	public void setTextIR(JTextField textIR) {
		this.textIR = textIR;
	}

	public DlgAddDelete getDialog() {
		return dialog;
	}

	public void setDialog(DlgAddDelete dialog) {
		this.dialog = dialog;
	}

	public Donut getDonut() {
		return donut;
	}

	public void setDonut(Donut donut) {
		this.donut = donut;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

}
