package sadprototype;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 635);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 50, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Search searchpage = new Search();
				searchpage.setUndecorated(true);
				searchpage.setVisible(true);
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/icon2.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(157, 168, 155, 155);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		Image img2 = new ImageIcon(this.getClass().getResource("/percentageb.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1.setBounds(417, 168, 155, 155);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addProduct addpage = new addProduct();
				addpage.setUndecorated(true);
				addpage.setVisible(true);
			}
		});
		Image img3 = new ImageIcon(this.getClass().getResource("/plus-button.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img3));
		lblNewLabel_2.setBounds(698, 168, 155, 155);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/technician-with-glasses.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img4));
		lblNewLabel_3.setBounds(272, 378, 155, 155);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/customer-service.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img5));
		lblNewLabel_4.setBounds(575, 378, 155, 155);
		contentPane.add(lblNewLabel_4);
		
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
		
		JLabel lblSearch = new JLabel("SEARCH");
		lblSearch.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		lblSearch.setForeground(new Color(255, 255, 255));
		lblSearch.setBounds(206, 324, 79, 24);
		contentPane.add(lblSearch);
		
		JLabel lblOffers = new JLabel("OFFERS");
		lblOffers.setForeground(new Color(255, 255, 255));
		lblOffers.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		lblOffers.setBounds(459, 318, 74, 36);
		contentPane.add(lblOffers);
		
		JLabel lblAddProduct = new JLabel("ADD PRODUCT");
		lblAddProduct.setForeground(new Color(255, 255, 255));
		lblAddProduct.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		lblAddProduct.setBounds(722, 325, 118, 23);
		contentPane.add(lblAddProduct);
		
		JLabel lblServices = new JLabel("SERVICES");
		lblServices.setForeground(Color.WHITE);
		lblServices.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		lblServices.setBounds(292, 531, 118, 23);
		contentPane.add(lblServices);
		
		JLabel lblCustomerService = new JLabel("HELPLINE");
		lblCustomerService.setForeground(Color.WHITE);
		lblCustomerService.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		lblCustomerService.setBounds(606, 531, 74, 23);
		contentPane.add(lblCustomerService);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login loginpage = new login();
				loginpage.setUndecorated(true);
				loginpage.setVisible(true);
			}
		});
		Image img6 = new ImageIcon(this.getClass().getResource("/user.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img6));
		lblNewLabel_5.setBounds(911, 55, 46, 43);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblLoginsignup = new JLabel("LOGIN/SIGNUP");
		lblLoginsignup.setBounds(898, 96, 85, 14);
		contentPane.add(lblLoginsignup);
	}
}
