package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	int xx,xy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frameLogin = new Login();
					frameLogin.setUndecorated(true);
					frameLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 459);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
				xy = e.getY();
			}
		});
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				int x = arg0.getXOnScreen();
				int y = arg0.getYOnScreen();
				Login.this.setLocation(x - xx, y - xy);
			}
		});
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 333, 420);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 250, 333, 170);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/images/gBG.jpg")));
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(0, 0, 333, 170);
		label.setIcon(new ImageIcon(Login.class.getResource("/images/gBG.jpg")));
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("VisitNorth System");
		lblNewLabel_1.setFont(new Font("Candara", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(22, 205, 301, 19);
		panel.add(lblNewLabel_1);
		
		Button btnLogin = new Button("Login");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(new Color(0, 0, 128));
		btnLogin.setFont(new Font("Candara", Font.BOLD, 14));
		btnLogin.setBounds(343, 271, 311, 37);
		contentPane.add(btnLogin);
		
		textField = new JTextField();
		textField.setBounds(343, 117, 311, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Candara Light", Font.BOLD, 14));
		lblUsername.setBounds(343, 86, 92, 28);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Candara Light", Font.BOLD, 14));
		lblPassword.setBounds(343, 175, 92, 28);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(343, 203, 311, 37);
		contentPane.add(passwordField);
		
		JLabel lblClose = new JLabel("X");
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblClose.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClose.setForeground(new Color(0, 0, 128));
		lblClose.setHorizontalAlignment(SwingConstants.CENTER);
		lblClose.setBounds(632, 0, 22, 22);
		contentPane.add(lblClose);
	}
}
