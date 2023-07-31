package APP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;

public class Payments extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payments frame = new Payments();
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
	public Payments() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Payments.class.getResource("/Images/logo1.jpeg")));
		setTitle("Payments");
		setBounds(100, 100, 661, 494);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 227, 440);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(0, -6, 227, 446);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/Images/payment.png"))) ;
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(236, 20, 401, 416);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPayments = new JLabel("Payments");
		lblPayments.setForeground(new Color(165, 42, 42));
		lblPayments.setFont(new Font("Lucida Calligraphy", Font.BOLD, 25));
		lblPayments.setBounds(39, 10, 150, 54);
		panel_1.add(lblPayments);
		
		JLabel lblNewLabel = new JLabel("Card Number");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblNewLabel.setBounds(39, 74, 137, 30);
		panel_1.add(lblNewLabel);
		
		JLabel lblCvccw = new JLabel("CVC/CW");
		lblCvccw.setFont(new Font("Mongolian Baiti", Font.PLAIN, 20));
		lblCvccw.setBounds(39, 152, 137, 30);
		panel_1.add(lblCvccw);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Historic", Font.BOLD, 18));
		textField.setBounds(39, 100, 311, 30);
		panel_1.add(textField);
		textField.setColumns(10);
		
		
		
		JLabel lblE = new JLabel("Expiration");
		lblE.setFont(new Font("Mongolian Baiti", Font.PLAIN, 18));
		lblE.setBounds(39, 215, 137, 30);
		panel_1.add(lblE);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinner.setBounds(39, 244, 44, 30);
		panel_1.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(21, 21, 30, 1));
		spinner_1.setBounds(93, 244, 44, 30);
		panel_1.add(spinner_1);
		
		JLabel lblNewLabel_1 = new JLabel("MM");
		lblNewLabel_1.setBounds(49, 284, 23, 13);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("YY");
		lblNewLabel_1_1.setBounds(103, 284, 23, 13);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Pay Now");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String x = textField.getText();
				String y = passwordField.getText();
				
				if (x.length() < 12 || x.length() > 12) {
					JOptionPane.showMessageDialog(null, "Incorrect Card Details");
				} else if (y.length() < 3 || y.length() > 3) {
					JOptionPane.showMessageDialog(null, "Incorrect CVC/CW");
				} else {
					JOptionPane.showMessageDialog(null, "Payment Successful");
					
					MainMenu op =new MainMenu();
					op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					op.setVisible(true);
				}
				
				
				
				
			}
		});
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		btnNewButton.setBounds(84, 339, 231, 35);
		panel_1.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Segoe UI Historic", Font.BOLD, 18));
		passwordField.setBounds(39, 175, 98, 30);
		panel_1.add(passwordField);
		
		
		
		
		
		
	}
}
