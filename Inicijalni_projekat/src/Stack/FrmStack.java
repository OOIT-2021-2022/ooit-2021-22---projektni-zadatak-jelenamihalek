package Stack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JToggleButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.GridLayout;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import Geometry.Circle;

import javax.swing.SpringLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JScrollPane;

public class FrmStack extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<Circle> dlm= new DefaultListModel<Circle>();
	private Stack<Circle> addCircle=new Stack<Circle>();
	private JList<Circle> list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmStack frame = new FrmStack();
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
	public FrmStack() {
		setTitle("Mihalek Jelena, IT3/2021");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470,370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter);
		panelCenter.setBackground(new Color(230, 230, 250));
				panelCenter.setLayout(new BorderLayout(0, 0));
				
				
				
				JPanel panelSouth = new JPanel();
				panelSouth.setBackground(new Color(230, 230, 250));
				GridBagLayout gbl_panelSouth = new GridBagLayout();
				gbl_panelSouth.columnWidths = new int[]{151, 0, 0, 0, 0, 51, 67, 0};
				gbl_panelSouth.rowHeights = new int[]{21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
				gbl_panelSouth.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				gbl_panelSouth.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
				panelSouth.setLayout(gbl_panelSouth);
					panelCenter.add(panelSouth);
					
					JLabel lblTitle= new JLabel("DO YOU WANT TO SEE HOW STACK WORKS?");
					
					GridBagConstraints gbc_lblTitle = new GridBagConstraints();
					gbc_lblTitle.gridwidth = 7;
					gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
					gbc_lblTitle.gridx = 0;
					gbc_lblTitle.gridy = 0;
					panelSouth.add(lblTitle, gbc_lblTitle);
					lblTitle.setForeground(Color.black);
					lblTitle.setFont(new Font("Ariel", Font.BOLD, 18));
					lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
					
					JLabel lblStack = new JLabel("STACK");
					GridBagConstraints gbc_lblStack = new GridBagConstraints();
					gbc_lblStack.gridwidth = 3;
					gbc_lblStack.insets = new Insets(0, 0, 5, 5);
					gbc_lblStack.gridx = 1;
					gbc_lblStack.gridy = 2;
					panelSouth.add(lblStack, gbc_lblStack);
					lblStack.setForeground(Color.black);
					lblStack.setFont(new Font("Ariel", Font.BOLD, 20));
					lblStack.setHorizontalAlignment(SwingConstants.CENTER);
					
					JScrollPane scrollPane = new JScrollPane();
					GridBagConstraints gbc_scrollPane = new GridBagConstraints();
					gbc_scrollPane.gridheight = 5;
					gbc_scrollPane.gridwidth = 7;
					gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
					gbc_scrollPane.fill = GridBagConstraints.BOTH;
					gbc_scrollPane.gridx = 0;
					gbc_scrollPane.gridy = 3;
					panelSouth.add(scrollPane, gbc_scrollPane);
					
					
			
					
					JButton btnAdd = new JButton("ADD");
					
					GridBagConstraints gbc_btnAdd = new GridBagConstraints();
					gbc_btnAdd.anchor = GridBagConstraints.NORTHWEST;
					gbc_btnAdd.insets = new Insets(0, 0, 0, 5);
					gbc_btnAdd.gridx = 2;
					gbc_btnAdd.gridy = 9;
					panelSouth.add(btnAdd, gbc_btnAdd);
					
					JButton btnDelete = new JButton("DELETE");
					
					GridBagConstraints gbc_btnDelete = new GridBagConstraints();
					gbc_btnDelete.insets = new Insets(0, 0, 0, 5);
					gbc_btnDelete.anchor = GridBagConstraints.NORTHWEST;
					gbc_btnDelete.gridx = 3;
					gbc_btnDelete.gridy = 9;
					panelSouth.add(btnDelete, gbc_btnDelete);
		
		
		
		
		
		
					list = new JList<Circle>();
					scrollPane.setViewportView(list);

	}
}
