package sadprototype;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.TextField;
import java.awt.Checkbox;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;

public class Ico_homepage extends JFrame {

	private JPanel contentPane;
	int xx ,xy;
	private int cid;
	JComboBox<String> cat;
	Connection conn = null;
	private JTextField bname;
	private JTable table;
	private JTable table_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ico_homepage frame = new Ico_homepage();
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
	
	//@SuppressWarnings("unchecked")
	
	public Ico_homepage() {
		
		conn= Jconnection.ConnecrDb();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 992, 660);
		contentPane = new JPanel();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x = arg0.getXOnScreen();
		        int y = arg0.getYOnScreen();
		        Ico_homepage.this.setLocation(x - xx, y - xy);
			}
		});
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
		        xy = e.getY();
			}
		});
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel label_2 = new JLabel("X");
		label_2.setBackground(new Color(255, 255, 255));
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		label_2.setForeground(new Color(25, 25, 112));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 28));
		label_2.setBounds(941, 11, 25, 27);
		contentPane.add(label_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(25, 25, 112));
		panel.setForeground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 295, 663);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel search = new JLabel("SEARCH");
		search.setForeground(Color.WHITE);
		search.setFont(new Font("Calibri", Font.BOLD, 15));
		search.setHorizontalAlignment(SwingConstants.CENTER);
		search.setBounds(115, 222, 76, 19);
		panel.add(search);
		
		JLabel lblViewPreviousRecords = new JLabel("ADD PRODUCT");
		lblViewPreviousRecords.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewPreviousRecords.setForeground(Color.WHITE);
		lblViewPreviousRecords.setFont(new Font("Calibri", Font.BOLD, 15));
		lblViewPreviousRecords.setBounds(62, 387, 173, 19);
		panel.add(lblViewPreviousRecords);
		
		JLabel lblEditProfile = new JLabel("VIEW CART");
		lblEditProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditProfile.setForeground(Color.WHITE);
		lblEditProfile.setFont(new Font("Calibri", Font.BOLD, 15));
		lblEditProfile.setBounds(85, 548, 114, 19);
		panel.add(lblEditProfile);
		
		JLabel label = new JLabel("DASHBOARD");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Cambria", Font.BOLD, 20));
		label.setBounds(68, 77, 154, 39);
		panel.add(label);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Ico_homepage.class.getResource("/images/user32_2.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		//lblNewLabel_3.setIcon(new ImageIcon(Ico_homepage.class.getResource("/image/user32_2.png")));
		lblNewLabel_3.setBounds(131, 11, 32, 32);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("LOGIN/SIGNUP");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel_4.setBounds(96, 42, 114, 27);
		panel.add(lblNewLabel_4);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(294, 55, 700, 608);
		contentPane.add(tabbedPane);
		
		JPanel searchpanel = new JPanel();
		searchpanel.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("SEARCH", null, searchpanel, null);
		searchpanel.setLayout(null);
		
		bname = new JTextField();
		bname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bname.setBounds(30, 37, 514, 32);
		searchpanel.add(bname);
		bname.setColumns(10);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//showTableBook();
				//showTableSearch();
			}
		});
		btnNewButton.setFont(new Font("Segoe Print", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setBounds(558, 33, 109, 39);
		searchpanel.add(btnNewButton);
		
		table = new JTable();
		table.setBorder(new LineBorder(Color.DARK_GRAY));
		table.setBackground(new Color(240, 248, 255));
		table.setBounds(10, 254, 657, 302);
		searchpanel.add(table);
		
		JLabel label_7 = new JLabel("Category");
		label_7.setFont(new Font("Calibri", Font.BOLD, 21));
		label_7.setBounds(30, 101, 93, 31);
		searchpanel.add(label_7);
		
		JComboBox comboBox_category = new JComboBox();
		comboBox_category.setBounds(30, 143, 132, 20);
		searchpanel.add(comboBox_category);
		
		JLabel label_8 = new JLabel("Sort");
		label_8.setFont(new Font("Calibri", Font.BOLD, 20));
		label_8.setBounds(221, 102, 66, 31);
		searchpanel.add(label_8);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(221, 143, 132, 20);
		searchpanel.add(comboBox);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Calibri", Font.BOLD, 20));
		lblStatus.setBounds(449, 102, 66, 31);
		searchpanel.add(lblStatus);
		
		JRadioButton radioButton = new JRadioButton("Used");
		buttonGroup.add(radioButton);
		radioButton.setBounds(423, 142, 63, 23);
		searchpanel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("New");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(488, 142, 56, 23);
		searchpanel.add(radioButton_1);
		
		JLabel lblProductnameWarrantyperiodPrice = new JLabel("  PRODUCT_NAME            DESCRIPTION         WARRANTY_PERIOD           PRICE");
		lblProductnameWarrantyperiodPrice.setFont(new Font("Segoe UI Emoji", Font.BOLD, 15));
		lblProductnameWarrantyperiodPrice.setBounds(10, 210, 657, 41);
		searchpanel.add(lblProductnameWarrantyperiodPrice);
		
		JPanel viewpanel = new JPanel();
		viewpanel.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("VIEW RECORDS", null, viewpanel, null);
		viewpanel.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBorder(new LineBorder(Color.DARK_GRAY));
		table_1.setBackground(new Color(240, 248, 255));
		table_1.setBounds(10, 71, 675, 324);
		viewpanel.add(table_1);
		
		JButton btnProceedToCheckout = new JButton("PROCEED TO CHECKOUT");
		btnProceedToCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnProceedToCheckout.setForeground(Color.WHITE);
		btnProceedToCheckout.setFont(new Font("Segoe Print", Font.BOLD, 11));
		btnProceedToCheckout.setBackground(new Color(0, 0, 128));
		btnProceedToCheckout.setBounds(160, 440, 183, 42);
		viewpanel.add(btnProceedToCheckout);
		
		JButton btnDeleteProduct = new JButton("REMOVE FROM\r\n CART");
		btnDeleteProduct.setForeground(Color.WHITE);
		btnDeleteProduct.setFont(new Font("Segoe Print", Font.BOLD, 13));
		btnDeleteProduct.setBackground(new Color(0, 0, 128));
		btnDeleteProduct.setBounds(405, 440, 183, 42);
		viewpanel.add(btnDeleteProduct);
		
		JLabel lblNewLabel = new JLabel("PRODUCT_ID                         PRODUCT_NAME                            PRICE");
		lblNewLabel.setFont(new Font("Segoe UI Emoji", Font.BOLD, 15));
		lblNewLabel.setBounds(69, 38, 568, 41);
		viewpanel.add(lblNewLabel);
		
		JPanel editpanel = new JPanel();
		editpanel.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("EDIT PROFILE", null, editpanel, null);
		editpanel.setLayout(null);
		
		JComboBox cat = new JComboBox();
		cat.setBackground(Color.WHITE);
		cat.setBounds(37, 60, 254, 25);
		editpanel.add(cat);
		
		JComboBox subcat = new JComboBox();
		subcat.setBackground(Color.WHITE);
		subcat.setBounds(371, 60, 254, 25);
		editpanel.add(subcat);
		
		JLabel label_1 = new JLabel("CATEGORY");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(37, 30, 92, 20);
		editpanel.add(label_1);
		
		JLabel label_3 = new JLabel("SUB CATEGORY");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_3.setBounds(371, 30, 126, 20);
		editpanel.add(label_3);
		
		TextField location = new TextField();
		location.setBackground(Color.WHITE);
		location.setBounds(37, 223, 254, 33);
		editpanel.add(location);
		
		JLabel label_5 = new JLabel("LOCATION");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_5.setBounds(37, 197, 82, 20);
		editpanel.add(label_5);
		
		TextField price = new TextField();
		price.setBackground(Color.WHITE);
		price.setBounds(37, 305, 254, 25);
		editpanel.add(price);
		
		JLabel label_6 = new JLabel("PRICE");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setBounds(37, 274, 51, 20);
		editpanel.add(label_6);
		
		TextField details = new TextField();
		details.setBackground(Color.WHITE);
		details.setBounds(37, 436, 254, 79);
		editpanel.add(details);
		
		JLabel label_9 = new JLabel("DETAILS");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_9.setBounds(37, 410, 70, 20);
		editpanel.add(label_9);
		
		TextField name = new TextField();
		name.setBackground(Color.WHITE);
		name.setBounds(37, 158, 254, 25);
		editpanel.add(name);
		
		TextField warranty = new TextField();
		warranty.setBackground(Color.WHITE);
		warranty.setBounds(371, 158, 254, 25);
		editpanel.add(warranty);
		
		TextField availability = new TextField();
		availability.setBackground(Color.WHITE);
		availability.setBounds(37, 379, 254, 25);
		editpanel.add(availability);
		
		JLabel lblAvailability = new JLabel("AVAILABILITY");
		lblAvailability.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAvailability.setBounds(37, 353, 118, 20);
		editpanel.add(lblAvailability);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(37, 132, 82, 20);
		editpanel.add(lblName);
		
		JLabel lblWarranty = new JLabel("WARRANTY");
		lblWarranty.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWarranty.setBounds(371, 132, 126, 20);
		editpanel.add(lblWarranty);
		
		JPanel checkout = new JPanel();
		tabbedPane.addTab("CHECKOUT", null, checkout, null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setBounds(10, 114, 275, 2);
		panel.add(separator);
		
		JButton btnUpload = new JButton("ADD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					//Class.forName("com.mysql.jdbc.Driver");
					//Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ico", "root","");
					String query ="insert into product(p_name,category,owner_id,selling_price,description,warranty_period,availability) values(?,?,?,?,?,?,?)";
					PreparedStatement pst =conn.prepareStatement(query);
					
					
					if(name.getText().length()!=0){
						int x=0;
						pst.setString(1, name.getText());
						//pst.setString(2,cat.getSelectedItem().toString());
						//String x =cat.getSelectedItem().toString();
						//String sql ="select c_id from product_cat where c_name='"+cat.getSelectedItem()+"'";
						//PreparedStatement pst1 =con.prepareStatement(sql);
						pst.setString(2,cat.getSelectedItem().toString());
						
						pst.setLong(3,x);
						pst.setString(4,price.getText());
						pst.setString(5,details.getText());
						pst.setString(6,warranty.getText());
						pst.setString(7,availability.getText());
						
						pst.executeUpdate();
						//conn.close();
							JOptionPane.showMessageDialog(null, "Registered Successfully");}
					else
						JOptionPane.showMessageDialog(null, "Registered Unsuccessful");
						
							
					}
				 catch (Exception e1) {
					 
						e1.printStackTrace();
					}
			}
		});
		btnUpload.setForeground(Color.WHITE);
		btnUpload.setFont(new Font("Segoe Print", Font.BOLD, 13));
		btnUpload.setBackground(new Color(0, 0, 128));
		btnUpload.setBounds(523, 436, 113, 42);
		editpanel.add(btnUpload);
		
		
		JLabel search_icon = new JLabel("");
		search_icon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		search_icon.setIcon(new ImageIcon(Ico_homepage.class.getResource("/images/search64.png")));
		search_icon.setBounds(115, 138, 76, 73);
		panel.add(search_icon);
		
		JLabel view_cart = new JLabel("");
		view_cart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
				showTableBook1();
			}
		});
		view_cart.setIcon(new ImageIcon(Ico_homepage.class.getResource("/images/download.png")));
		view_cart.setBounds(85, 442, 114, 95);
		panel.add(view_cart);
		
		JLabel addproduct = new JLabel("");
		addproduct.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(2);
				fillcombobox();
			}
		});
		addproduct.setIcon(new ImageIcon(Ico_homepage.class.getResource("/images/iconfinder_ic_add_shopping_cart_48px_352007.png")));
		addproduct.setBounds(109, 289, 101, 87);
		panel.add(addproduct);
		
		//fillcombobox();
		
	}
	
	public void showTableBook1() {
		try{
		String sql= "select * from cart";
		
		PreparedStatement pst= conn.prepareStatement(sql);
		//pst.setNString(1,book.getText());
		//pst.setNString(2,name.getText());
		ResultSet rs = pst.executeQuery();
		table_1.setModel(DbUtils.resultSetToTableModel(rs));
		}
		catch(Exception e){
		JOptionPane.showMessageDialog(null, "Error");
		
		}
		
	}
	public void fillcombobox()
	{
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			//Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ico", "root","");
			String query="Select * from product_cat";
			PreparedStatement pst= conn.prepareStatement(query);
			//pst.setString(1, (String) comboBox.getSelectedItem());
			ResultSet rs =pst.executeQuery();
			while(rs.next())
			{
			cat.addItem(rs.getString("c_name"));
			
			}
			//pst.close();
			
			
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Error");
		}
	}
	
	/*public void showTableSearch() {
		String cc= comboBox_category.getSelectedItem();
		try{
		String sql= "select p_name,description,warranty_period,selling_price from product where p_name like CONCAT ('%',?,'%') and availability>=1";
		
		PreparedStatement pst= conn.prepareStatement(sql);
		//pst.setNString(1,book.getText());
		pst.setNString(1,bname.getText());
		ResultSet rs = pst.executeQuery();
		table.setModel(DbUtils.resultSetToTableModel(rs));
		}
		catch(Exception e){
		JOptionPane.showMessageDialog(null, "Error");
		
		}
		
	}*/
}
