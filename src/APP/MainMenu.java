package APP;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	
	    public MainMenu() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/Images/logo1.jpeg")));
		setTitle("Main Menu ");
		setBounds(100, 100, 612, 431);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Main Menu");
		lblNewLabel.setBackground(new Color(0, 0, 128));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Harlow Solid Italic", Font.BOLD, 50));
		lblNewLabel.setBounds(162, 10, 273, 80);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1. Add Items");
		lblNewLabel_1.setBackground(new Color(245, 245, 220));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddItems Frame1 = new AddItems() ;
				Frame1.setVisible(true);	
			}
		});
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
		lblNewLabel_1.setBounds(377, 168, 159, 43);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("2. Payments");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Payments mp = new  Payments();
				
		       mp.setVisible(true);
					
			}
		});
		lblNewLabel_3.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
		lblNewLabel_3.setBounds(377, 230, 159, 49);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(0, 0, 605, 400);
		lblNewLabel_5.setIcon(new ImageIcon(getClass().getResource("/Images/menu.jpg"))) ;
		contentPane.add(lblNewLabel_5);
		
		
	}
}
