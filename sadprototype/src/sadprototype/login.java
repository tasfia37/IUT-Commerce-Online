package sadprototype;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JButton;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField userinput;
	private JTextField userpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 635);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 50, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(303, 71, 429, 479);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/lock.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img3));
		lblNewLabel.setBounds(128, 243, 31, 59);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(155, 262, 164, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		lblUserId.setBounds(168, 161, 95, 27);
		panel.add(lblUserId);
		
		JLabel label_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/avatar.png")).getImage();
		label_1.setIcon(new ImageIcon(img));
		label_1.setBounds(145, 143, 31, 59);
		panel.add(label_1);
		
		userinput = new JTextField();
		userinput.setBounds(131, 199, 172, 34);
		panel.add(userinput);
		userinput.setColumns(10);
		
		userpassword = new JTextField();
		userpassword.setColumns(10);
		userpassword.setBounds(128, 313, 172, 34);
		panel.add(userpassword);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setForeground(new Color(153, 0, 204));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Segoe Script", Font.BOLD, 25));
		lblNewLabel_2.setBounds(168, 98, 95, 34);
		panel.add(lblNewLabel_2);
		
		JLabel lblNotAUser = new JLabel("Not a User?");
		lblNotAUser.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblNotAUser.setBounds(128, 383, 110, 27);
		panel.add(lblNotAUser);
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.setFont(new Font("Segoe Print", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(230, 387, 89, 23);
		panel.add(btnNewButton);
		
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
	}
}
