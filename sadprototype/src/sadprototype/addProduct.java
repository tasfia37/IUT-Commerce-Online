package sadprototype;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Color;
import java.awt.Checkbox;
import java.awt.Button;
import java.awt.Canvas;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;

public class addProduct extends JFrame {

	private JPanel contentPane;
	int xx ,xy;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addProduct frame = new addProduct();
					frame.setUndecorated(true);
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
	public addProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 635);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x = arg0.getXOnScreen();
		        int y = arg0.getYOnScreen();
		        addProduct.this.setLocation(x - xx, y - xy);
			}
		});
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
		        xy = e.getY();
			}
		});
		panel.setBackground(new Color(153, 50, 204));
		panel.setBounds(0, 0, 1024, 117);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel close = new JLabel("x");
		close.setBounds(970, 11, 30, 43);
		panel.add(close);
		close.setBackground(new Color(204, 204, 204));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		close.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		close.setForeground(new Color(204, 204, 204));
		
		
		JComboBox comboBoxCATEGORY = new JComboBox();
		comboBoxCATEGORY.addItem("Home and Lifestyle");
		comboBoxCATEGORY.addItem("Electronic Accessories");
		comboBoxCATEGORY.addItem("Clothing");
		comboBoxCATEGORY.addItem("Health and Beauty");
		comboBoxCATEGORY.addItem("Watches and Accessories");
		comboBoxCATEGORY.addItem("Outdoor");
		comboBoxCATEGORY.addItem("Automotive");
		comboBoxCATEGORY.setSelectedItem(null);
		comboBoxCATEGORY.setBackground(Color.WHITE);
		comboBoxCATEGORY.setBounds(382, 139, 254, 25);
		contentPane.add(comboBoxCATEGORY);
		
		JLabel CATEGORYLabel = new JLabel("CATEGORY");
		CATEGORYLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		CATEGORYLabel.setBounds(674, 139, 92, 20);
		contentPane.add(CATEGORYLabel);
		
		JComboBox comboBoxSUBCATEGORY = new JComboBox();
		comboBoxSUBCATEGORY.setBackground(Color.WHITE);
		comboBoxSUBCATEGORY.setBounds(382, 188, 254, 25);
		contentPane.add(comboBoxSUBCATEGORY);
		
		JLabel lblSubCategory = new JLabel("SUB CATEGORY");
		lblSubCategory.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSubCategory.setBounds(674, 188, 126, 20);
		contentPane.add(lblSubCategory);
		
		TextField textLOCATION = new TextField();
		textLOCATION.setBackground(Color.WHITE);
		textLOCATION.setBounds(382, 279, 254, 34);
		contentPane.add(textLOCATION);
		
		JLabel lblLocation = new JLabel("LOCATION");
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLocation.setBounds(674, 291, 82, 20);
		contentPane.add(lblLocation);
		
		TextField textDETAILS = new TextField();
		textDETAILS.setBackground(Color.WHITE);
		textDETAILS.setBounds(382, 394, 254, 98);
		contentPane.add(textDETAILS);
		
		JLabel lblDetails = new JLabel("DETAILS");
		lblDetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDetails.setBounds(674, 394, 70, 20);
		contentPane.add(lblDetails);
		
		TextField textPRICE = new TextField();
		textPRICE.setBackground(Color.WHITE);
		textPRICE.setBounds(382, 343, 254, 25);
		contentPane.add(textPRICE);
		
		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(674, 348, 51, 20);
		contentPane.add(lblPrice);
		
		Checkbox checkboxNEGOTIABLE = new Checkbox("NEGOTIABLE");
		checkboxNEGOTIABLE.setFont(new Font("Dialog", Font.BOLD, 13));
		checkboxNEGOTIABLE.setBounds(786, 346, 106, 22);
		contentPane.add(checkboxNEGOTIABLE);
		
		Button button = new Button("ADD PRODUCT");
		/*	button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			} 
		}); */
		button.setFont(new Font("Dialog", Font.BOLD, 13));
		button.setBounds(443, 519, 126, 34);
		contentPane.add(button);
		
		
		
		JLabel lblStatus = new JLabel("STATUS");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStatus.setBounds(674, 238, 63, 20);
		contentPane.add(lblStatus);
		
		Button button_1 = new Button("UPLOAD PICTURE");
		button_1.setFont(new Font("Dialog", Font.BOLD, 11));
		button_1.setBounds(137, 443, 111, 25);
		contentPane.add(button_1);
		
		JPanel Picturepanel = new JPanel();
		Picturepanel.setBackground(SystemColor.control);
		Picturepanel.setBounds(74, 185, 234, 229);
		contentPane.add(Picturepanel);
		
		JRadioButton newproduct = new JRadioButton("NEW");
		newproduct.setBackground(new Color(192, 192, 192));
		buttonGroup.add(newproduct);
		newproduct.setBounds(382, 239, 63, 23);
		contentPane.add(newproduct);
		
		JRadioButton usedproduct = new JRadioButton("USED");
		usedproduct.setBackground(new Color(192, 192, 192));
		buttonGroup.add(usedproduct);
		usedproduct.setBounds(573, 239, 63, 23);
		contentPane.add(usedproduct);
	}
}
