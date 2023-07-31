package APP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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

	public Register() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Register.class.getResource("/Images/logo1.jpeg")));
		setTitle("Registration");
		setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 554, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(new Color(127, 255, 212));
		panel.setForeground(new Color(0, 0, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Registration Form");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Pristina", Font.BOLD, 35));
		lblNewLabel.setBounds(148, 48, 233, 45);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Poor Richard", Font.BOLD, 25));
		lblNewLabel_1.setBounds(87, 142, 111, 29);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Poor Richard", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(87, 203, 111, 29);
		panel.add(lblNewLabel_1_1);

		textField = new JTextField();
		textField.setBounds(212, 142, 202, 29);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(212, 203, 202, 29);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if (textField.getText().length() > 12) {
					JOptionPane.showMessageDialog(null, "Enter a valid Username");
				} else if (textField_1.getText().length() < 6) {
					JOptionPane.showMessageDialog(null, "Password Must contain at least six characters");
				}

				else {

					Connection connection = null;
					String host = "localhost";
					String port = "5432";
					String db_name = "USERS";
					String username = "postgres";
					String password = "0504";

					String x = textField.getText();
					String y = textField_1.getText();

					try {
						Class.forName("org.postgresql.Driver");
						connection = DriverManager.getConnection(
								"jdbc:postgresql://" + host + ":" + port + "/" + db_name + "", "" + username + "",
								"" + password + "");

						Statement ER = connection.createStatement();

						ResultSet RS = ER
								.executeQuery("insert into users(username,Pass) values('" + x + "','" + y + "')");
						
					
				
						}
						
					 catch (Exception e2) {
						e2.printStackTrace();
					}

				}

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBackground(new Color(240, 248, 255));
		btnNewButton.setBounds(212, 268, 96, 29);
		panel.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				login mylogin = new login();
				mylogin.frmLogin.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBack.setBackground(new Color(240, 248, 255));
		btnBack.setBounds(318, 268, 96, 29);
		panel.add(btnBack);
		
		
	}
}
