package APP;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class login{

	public JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/Images/logo1.jpeg")));
		frmLogin.setTitle("Login");
		frmLogin.setResizable(false);
		frmLogin.getContentPane().setBackground(new Color(0, 255, 255));
		frmLogin.getContentPane().setForeground(new Color(25, 25, 112));
		frmLogin.setBounds(100, 100, 608, 390);
		frmLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Footlight MT Light", Font.BOLD, 27));
		lblNewLabel.setBounds(86, 79, 220, 83);
		frmLogin.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("GROCERY MART");
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Magneto", Font.BOLD, 50));
		lblNewLabel_1.setBounds(36, 17, 519, 83);
		frmLogin.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(251, 110, 244, 28);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Footlight MT Light", Font.BOLD, 27));
		lblNewLabel_2.setBounds(86, 162, 155, 32);
		frmLogin.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("New User");
		lblNewLabel_3.setForeground(Color.CYAN);
		lblNewLabel_3.setFont(new Font("Californian FB", Font.BOLD, 19));
		lblNewLabel_3.setBounds(199, 297, 97, 28);
		frmLogin.getContentPane().add(lblNewLabel_3);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				Connection connection = null;
				String host = "localhost";
				String port = "5432";
				String db_name = "USERS";
				String username = "postgres";
				String password = "0504";
				try {
					Class.forName("org.postgresql.Driver");
					connection = DriverManager.getConnection(
							"jdbc:postgresql://" + host + ":" + port + "/" + db_name + "", "" + username + "",
							"" + password + "");

					Statement ST = connection.createStatement();

					ResultSet RS = ST.executeQuery("select * from users where users.username = '" + textField.getText()
							+ "'and users.Pass ='" + passwordField.getText() + "' ");

					if (RS.next()) {
						
						JOptionPane.showMessageDialog(null, "Login Successful");
						
						MainMenu mymenu = new MainMenu();
						mymenu.setVisible(true);
						JOptionPane.showMessageDialog(null, "Welcome to 'Greens Grocer'\n"+"Start your shopping by clicking on Add Items");
						

					} else {
						JOptionPane.showMessageDialog(null, "Incorrect ID or Password");
					}
				}

				catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(251, 224, 107, 28);
		frmLogin.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_4 = new JLabel("Sign Up");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{

				Register Reg = new Register();
				Reg.setVisible(true);
			}
		});
		lblNewLabel_4.setForeground(Color.YELLOW);
		lblNewLabel_4.setFont(new Font("Californian FB", Font.BOLD, 19));
		lblNewLabel_4.setBounds(305, 302, 82, 19);
		frmLogin.getContentPane().add(lblNewLabel_4);

		passwordField = new JPasswordField();
		passwordField.setBounds(251, 167, 244, 29);
		frmLogin.getContentPane().add(passwordField);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5.setBounds(-18, 0, 634, 353);
		lblNewLabel_5.setIcon(new ImageIcon(getClass().getResource("/Images/Img.jpg")));
		frmLogin.getContentPane().add(lblNewLabel_5);

	}
}
