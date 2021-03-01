package sadprototype;

/*import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Search extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.

	public Search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
*/

import java.awt.BorderLayout;
import java.awt.Image;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JSlider;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class Search extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JTextField textField;
	JButton btnSearch;
	private JTextField textField_1;
	private JTextField textField_2;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/attendence system", "root","");
				
					}catch(Exception e){
						System.out.println("Error" + e);
				}
				try {
					Search frame = new Search();
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
	public void fillcombobox()
	{
		try {
			//Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ico", "root","");
			//String query="Select * from products";
			//PreparedStatement pst= con.prepareStatement(query);
		//	pst.setString(1, (String) comboBox.getSelectedItem());
			//ResultSet rs =pst.executeQuery();
			//while(rs.next())
			//{
			//comboBox.addItem(rs.getString("Category"));
			
			//}
			//pst.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 635);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 comboBox = new JComboBox();
		//comboBox.addItem("name");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					
					
				
			}
		});
		
		comboBox.setBounds(283, 204, 132, 20);
		contentPane.add(comboBox);
		//Image img =new ImageIcon(this.getClass().getResource("search-icon.png")).getImage();
		
		
		
		final JComboBox comboBox1 = new JComboBox();
		comboBox1.addItem("Category A-Z");
		comboBox1.addItem("Category Z-A");
		comboBox1.addItem("Category A-Z");
		comboBox1.addItem("Decreasing Price");
		comboBox1.addItem("Increasing Price");
		comboBox1.addItem("Rating");
		comboBox1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		comboBox1.setBounds(547, 204, 121, 20);
		contentPane.add(comboBox1);
		
		
		JLabel close = new JLabel("x");
		close.setBackground(new Color(204, 204, 204));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		close.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
		close.setForeground(new Color(204, 204, 204));
		close.setBounds(970, 11, 30, 43);
		contentPane.add(close);
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCategory.setBounds(288, 162, 85, 31);
		contentPane.add(lblCategory);
		
		JLabel lblFilter = new JLabel("Filter");
		lblFilter.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblFilter.setBounds(23, 22, 86, 37);
		contentPane.add(lblFilter);
		
		JLabel lblNewLabel = new JLabel("Price Range");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(23, 79, 115, 20);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(23, 110, 69, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRating = new JLabel("Rating");
		lblRating.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRating.setBounds(34, 227, 85, 20);
		contentPane.add(lblRating);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1 Star");
		rdbtnNewRadioButton.setBounds(34, 254, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnStar = new JRadioButton("2 Star");
		rdbtnStar.setBounds(34, 280, 109, 23);
		contentPane.add(rdbtnStar);
		
		JRadioButton rdbtnStar_1 = new JRadioButton("3 Star");
		rdbtnStar_1.setBounds(34, 306, 109, 23);
		contentPane.add(rdbtnStar_1);
		
		JRadioButton rdbtnStar_2 = new JRadioButton("4 Star");
		rdbtnStar_2.setBounds(34, 332, 109, 23);
		contentPane.add(rdbtnStar_2);
		
		JRadioButton rdbtnStar_3 = new JRadioButton("5 Star");
		rdbtnStar_3.setBounds(34, 358, 109, 23);
		contentPane.add(rdbtnStar_3);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblStatus.setBounds(28, 154, 115, 20);
		contentPane.add(lblStatus);
		
		JRadioButton rdbtnUsed = new JRadioButton("Used");
		rdbtnUsed.setBounds(34, 181, 63, 23);
		contentPane.add(rdbtnUsed);
		
		JRadioButton rdbtnNew = new JRadioButton("New");
		rdbtnNew.setBounds(99, 181, 56, 23);
		contentPane.add(rdbtnNew);
		
		JLabel lblSort = new JLabel("Sort");
		lblSort.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSort.setBounds(547, 162, 85, 31);
		contentPane.add(lblSort);
		Image ico = new ImageIcon(this.getClass().getResource("/search-icon.png")).getImage();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 50, 204));
		panel_1.setBounds(259, 0, 1026, 151);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnSearch_1 = new JButton("");
		btnSearch_1.setBounds(610, 75, 70, 40);
		btnSearch_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSearch_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(btnSearch_1);
		btnSearch_1.setBackground(new Color(255, 255, 255));
		btnSearch_1.setIcon(new ImageIcon(ico));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(58, 71, 525, 44);
		panel_1.add(textField);
		textField.setColumns(10);
		//Image img1 =new ImageIcon(this.getClass().getResource("ICO.png")).getImage();
		
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(102, 110, 67, 20);
		contentPane.add(textField_2);
		
		JButton btnGo = new JButton("GO");
		btnGo.setBounds(179, 110, 56, 20);
		contentPane.add(btnGo);
		panel.setBounds(0, 51, 262, 749);
		contentPane.add(panel);
		fillcombobox();


	}
}

