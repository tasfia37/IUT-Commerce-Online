package sadprototype;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LS extends JFrame {

	private JPanel contentPane;
	int xx ,xy;
	private JTextField adminusername;
	private JPasswordField adminpass;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LS frame = new LS();
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
	public LS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 992, 660);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
		        int y = e.getYOnScreen();
		        LS.this.setLocation(x - xx, y - xy);
			}
		});
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
		        xy = e.getY();
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("X");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 28));
		label.setBounds(941, 11, 25, 27);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Homepage ad=new Homepage();
				ad.setUndecorated(true);
				ad.setVisible(true);
			}
		});
		label_1.setIcon(new ImageIcon(LS.class.getResource("/image/back.png")));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(10, 14, 64, 64);
		contentPane.add(label_1);
		
		JLabel lblNotAnAdmin = new JLabel("NOT A USER? ");
		lblNotAnAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotAnAdmin.setForeground(new Color(25, 25, 112));
		lblNotAnAdmin.setFont(new Font("Calibri", Font.ITALIC, 19));
		lblNotAnAdmin.setBounds(674, 93, 152, 21);
		contentPane.add(lblNotAnAdmin);
		
		JLabel label_5 = new JLabel("SIGNUP");
		label_5.setBackground(new Color(51, 153, 204));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(new Color(0, 153, 204));
		label_5.setFont(new Font("Calibri", Font.BOLD, 31));
		label_5.setBounds(687, 116, 129, 36);
		contentPane.add(label_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 153, 204));
		panel_1.setBounds(0, 0, 496, 674);
		contentPane.add(panel_1);
		
		JLabel label_6 = new JLabel("");
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(10, 11, 64, 64);
		panel_1.add(label_6);
		
		JLabel lblNewLabel_3 = new JLabel("LOGIN ");
		lblNewLabel_3.setBounds(47, 80, 399, 51);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 34));
		
		JLabel lblUserid = new JLabel("USER_ID");
		lblUserid.setBounds(202, 245, 135, 27);
		panel_1.add(lblUserid);
		lblUserid.setForeground(new Color(255, 255, 255));
		lblUserid.setFont(new Font("Calibri", Font.BOLD, 25));
		
		adminusername = new JTextField();
		adminusername.setBounds(109, 283, 295, 40);
		panel_1.add(adminusername);
		adminusername.setText("");
		adminusername.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(148, 225, 44, 49);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(LS.class.getResource("/image/admin.png")));
		
		JLabel label_3 = new JLabel("PASSWORD");
		label_3.setBounds(202, 382, 125, 27);
		panel_1.add(label_3);
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setFont(new Font("Calibri", Font.BOLD, 25));
		
		adminpass = new JPasswordField();
		adminpass.setBounds(109, 420, 295, 40);
		panel_1.add(adminpass);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(158, 370, 52, 40);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(LS.class.getResource("/image/password1.png")));
		
		JButton button = new JButton("LOGIN\r\n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String uname=adminusername.getText();
				String pass=adminpass.getText();
				if(uname.equals("admin") && pass.equals("adminiut"))
				{
					dispose();
					LS sh=new LS();
					sh.setUndecorated(true);
					sh.setVisible(true);
				}
			}
		});
		button.setBounds(200, 499, 117, 40);
		panel_1.add(button);
		button.setForeground(new Color(51, 51, 204));
		button.setFont(new Font("Calibri", Font.BOLD, 22));
		button.setBackground(new Color(255, 255, 255));
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.setText("");
		textField_1.setColumns(10);
		textField_1.setBounds(590, 168, 244, 27);
		contentPane.add(textField_1);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Calibri", Font.BOLD, 14));
		lblName.setBounds(526, 168, 43, 27);
		contentPane.add(lblName);
		
		JButton btnRequest = new JButton("SEND REQUEST");
		btnRequest.setBounds(674, 559, 152, 27);
		contentPane.add(btnRequest);
		btnRequest.setForeground(Color.WHITE);
		btnRequest.setFont(new Font("Calibri", Font.BOLD, 22));
		btnRequest.setBackground(new Color(51, 51, 204));
		
		JLabel label_2 = new JLabel("NAME :");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Calibri", Font.BOLD, 14));
		label_2.setBounds(526, 216, 43, 27);
		contentPane.add(label_2);
		
		JLabel label_4 = new JLabel("NAME :");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Calibri", Font.BOLD, 14));
		label_4.setBounds(526, 269, 43, 27);
		contentPane.add(label_4);
		
		textField = new JTextField();
		textField.setText("");
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(590, 219, 244, 27);
		contentPane.add(textField);
		
		textField_3 = new JTextField();
		textField_3.setText("");
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(590, 272, 244, 27);
		contentPane.add(textField_3);
		
		JLabel label_7 = new JLabel("NAME :");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("Calibri", Font.BOLD, 14));
		label_7.setBounds(526, 316, 43, 27);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("NAME :");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Calibri", Font.BOLD, 14));
		label_8.setBounds(526, 364, 43, 27);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("NAME :");
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("Calibri", Font.BOLD, 14));
		label_9.setBounds(526, 413, 43, 27);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("NAME :");
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("Calibri", Font.BOLD, 14));
		label_10.setBounds(526, 468, 43, 27);
		contentPane.add(label_10);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(590, 319, 244, 27);
		contentPane.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setText("");
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(590, 367, 244, 27);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("");
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(590, 416, 244, 27);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("");
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(590, 468, 244, 27);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("");
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(590, 521, 244, 27);
		contentPane.add(textField_7);
		
		JLabel label_11 = new JLabel("NAME :");
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("Calibri", Font.BOLD, 14));
		label_11.setBounds(526, 523, 43, 27);
		contentPane.add(label_11);
	}
}
