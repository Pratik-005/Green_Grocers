package APP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class AddItems extends JFrame {

	private JPanel contentPane;

	public JCheckBox onion1;
	public JSpinner qu_onions;

	public JCheckBox ch_cabbage;
	public JSpinner qu_cabbage;

	public JCheckBox ch_potatoes;
	public JSpinner qu_potatoes;

	public JCheckBox ch_carrots;
	public JSpinner qu_carrots;

	public JCheckBox ch_milk;
	public JSpinner qu_milk;

	public JCheckBox ch_butter;
	public JSpinner qu_butter;

	public JCheckBox ch_eggs;
	public JSpinner qu_eggs;

	public JCheckBox ch_cheese;
	public JSpinner qu_cheese;
	
	public JCheckBox ch_sugar;
	public  JSpinner qu_sugar;
	public JCheckBox ch_tea;
	public JSpinner qu_tea;
	public JCheckBox ch_soap;
	public JSpinner qu_soap ;
	public JCheckBox ch_dryersheets ;
	public JSpinner qu_dryersheets ;

	public JLabel tot;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddItems frame = new AddItems();
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
	public AddItems() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddItems.class.getResource("/Images/logo1.jpeg")));

		setTitle("Add Items");
		setBackground(new Color(220, 220, 220));
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 667, 538);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 10, 681, 501);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(175, 238, 238));
		tabbedPane.addTab(" Vegetables ", null, panel, null);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Products");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
		lblNewLabel.setBounds(64, 53, 132, 26);
		panel.add(lblNewLabel);

		onion1 = new JCheckBox("Onions");
		onion1.setFont(new Font("Serif", Font.ITALIC, 22));
		onion1.setBounds(64, 108, 146, 37);
		panel.add(onion1);

		ch_cabbage = new JCheckBox("Cabbage");
		ch_cabbage.setFont(new Font("Serif", Font.ITALIC, 22));
		ch_cabbage.setBounds(64, 186, 146, 37);
		panel.add(ch_cabbage);

		ch_potatoes = new JCheckBox("Potatoes");
		ch_potatoes.setFont(new Font("Serif", Font.ITALIC, 22));
		ch_potatoes.setBounds(64, 266, 146, 37);
		panel.add(ch_potatoes);

		ch_carrots = new JCheckBox("Carrots");
		ch_carrots.setFont(new Font("Serif", Font.ITALIC, 22));
		ch_carrots.setBounds(64, 344, 146, 37);
		panel.add(ch_carrots);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
		lblPrice.setBounds(300, 53, 132, 26);
		panel.add(lblPrice);

		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
		lblQuantity.setBounds(503, 53, 132, 26);
		panel.add(lblQuantity);

		JLabel pr_onions;
		pr_onions = new JLabel("Rs.50/kg");
		pr_onions.setFont(new Font("Serif", Font.PLAIN, 22));
		pr_onions.setBounds(300, 108, 117, 37);
		panel.add(pr_onions);

		JLabel pr_cabbage = new JLabel("Rs.40/kg");
		pr_cabbage.setFont(new Font("Serif", Font.PLAIN, 22));
		pr_cabbage.setBounds(300, 186, 117, 37);
		panel.add(pr_cabbage);

		JLabel pr_potatoes = new JLabel("Rs.40/kg");
		pr_potatoes.setFont(new Font("Serif", Font.PLAIN, 22));
		pr_potatoes.setBounds(300, 266, 117, 37);
		panel.add(pr_potatoes);

		JLabel pr_carrots = new JLabel("Rs.50/kg");
		pr_carrots.setFont(new Font("Serif", Font.PLAIN, 22));
		pr_carrots.setBounds(300, 344, 117, 37);
		panel.add(pr_carrots);

		qu_onions = new JSpinner();
		qu_onions.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		qu_onions.setBounds(503, 108, 52, 37);
		panel.add(qu_onions);

		qu_cabbage = new JSpinner();
		qu_cabbage.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		qu_cabbage.setBounds(503, 186, 52, 37);
		panel.add(qu_cabbage);

		qu_potatoes = new JSpinner();
		qu_potatoes.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		qu_potatoes.setBounds(503, 266, 52, 37);
		panel.add(qu_potatoes);

		qu_carrots = new JSpinner();
		qu_carrots.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		qu_carrots.setBounds(503, 344, 52, 37);
		panel.add(qu_carrots);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		tabbedPane.addTab(" Dairy Products ", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Products");
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
		lblNewLabel_1.setBounds(62, 53, 132, 26);
		panel_1.add(lblNewLabel_1);

		ch_milk = new JCheckBox("Milk");
		ch_milk.setFont(new Font("Serif", Font.ITALIC, 22));
		ch_milk.setBounds(62, 115, 146, 37);
		panel_1.add(ch_milk);

		ch_butter = new JCheckBox("Butter");
		ch_butter.setFont(new Font("Serif", Font.ITALIC, 22));
		ch_butter.setBounds(62, 191, 146, 37);
		panel_1.add(ch_butter);

		ch_eggs = new JCheckBox("Eggs");
		ch_eggs.setFont(new Font("Serif", Font.ITALIC, 22));
		ch_eggs.setBounds(62, 265, 146, 37);
		panel_1.add(ch_eggs);

		ch_cheese = new JCheckBox("Cheese");
		ch_cheese.setFont(new Font("Serif", Font.ITALIC, 22));
		ch_cheese.setBounds(62, 341, 146, 37);
		panel_1.add(ch_cheese);

		JLabel lblPrice_1 = new JLabel("Price");
		lblPrice_1.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
		lblPrice_1.setBounds(307, 53, 132, 26);
		panel_1.add(lblPrice_1);

		JLabel lblQuantity_1 = new JLabel("Quantity");
		lblQuantity_1.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
		lblQuantity_1.setBounds(497, 53, 132, 26);
		panel_1.add(lblQuantity_1);

		JLabel pr_milk = new JLabel("Rs.52/litre");
		pr_milk.setFont(new Font("Serif", Font.PLAIN, 22));
		pr_milk.setBounds(307, 115, 117, 37);
		panel_1.add(pr_milk);

		JLabel pr_cheese = new JLabel("Rs.360/kg");
		pr_cheese.setFont(new Font("Serif", Font.PLAIN, 22));
		pr_cheese.setBounds(307, 341, 117, 37);
		panel_1.add(pr_cheese);

		JLabel pr_butter = new JLabel("Rs.450/kg");
		pr_butter.setFont(new Font("Serif", Font.PLAIN, 22));
		pr_butter.setBounds(307, 191, 117, 37);
		panel_1.add(pr_butter);

		JLabel pr_eggs = new JLabel("Rs.60/dozen");
		pr_eggs.setFont(new Font("Serif", Font.PLAIN, 22));
		pr_eggs.setBounds(307, 265, 117, 37);
		panel_1.add(pr_eggs);

		qu_milk = new JSpinner();
		qu_milk.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		qu_milk.setBounds(497, 115, 52, 37);
		panel_1.add(qu_milk);

		qu_butter = new JSpinner();
		qu_butter.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		qu_butter.setBounds(497, 191, 52, 37);
		panel_1.add(qu_butter);

		qu_eggs = new JSpinner();
		qu_eggs.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		qu_eggs.setBounds(497, 265, 52, 37);
		panel_1.add(qu_eggs);

		qu_cheese = new JSpinner();
		qu_cheese.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		qu_cheese.setBounds(497, 341, 52, 37);
		panel_1.add(qu_cheese);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(175, 238, 238));
		tabbedPane.addTab(" Household ", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("Products");
		lblNewLabel_1_1.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(69, 55, 132, 26);
		panel_3.add(lblNewLabel_1_1);

		JLabel lblPrice_1_1 = new JLabel("Price");
		lblPrice_1_1.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
		lblPrice_1_1.setBounds(299, 55, 132, 26);
		panel_3.add(lblPrice_1_1);

		JLabel lblQuantity_1_1 = new JLabel("Quantity");
		lblQuantity_1_1.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
		lblQuantity_1_1.setBounds(486, 55, 132, 26);
		panel_3.add(lblQuantity_1_1);

		 ch_sugar = new JCheckBox("Sugar");               
		ch_sugar.setFont(new Font("Serif", Font.ITALIC, 22));
		ch_sugar.setBounds(69, 117, 146, 37);
		panel_3.add(ch_sugar);

		 ch_tea = new JCheckBox("Tea");
		ch_tea.setFont(new Font("Serif", Font.ITALIC, 22));
		ch_tea.setBounds(69, 192, 146, 37);
		panel_3.add(ch_tea);

		 ch_soap = new JCheckBox("Soap");
		ch_soap.setFont(new Font("Serif", Font.ITALIC, 22));
		ch_soap.setBounds(69, 269, 146, 37);
		panel_3.add(ch_soap);

		 ch_dryersheets = new JCheckBox("Dryer Sheets");
		ch_dryersheets.setFont(new Font("Serif", Font.ITALIC, 22));
		ch_dryersheets.setBounds(69, 346, 146, 37);
		panel_3.add(ch_dryersheets);

		JLabel pr_sugar = new JLabel("Rs.40/kg");
		pr_sugar.setFont(new Font("Serif", Font.PLAIN, 22));
		pr_sugar.setBounds(299, 117, 117, 37);
		panel_3.add(pr_sugar);

		JLabel pr_tea = new JLabel("Rs.130");
		pr_tea.setFont(new Font("Serif", Font.PLAIN, 22));
		pr_tea.setBounds(299, 192, 117, 37);
		panel_3.add(pr_tea);

		JLabel pr_soap = new JLabel("Rs.45");
		pr_soap.setFont(new Font("Serif", Font.PLAIN, 22));
		pr_soap.setBounds(299, 269, 117, 37);
		panel_3.add(pr_soap);

		JLabel pr_dryersheets = new JLabel("Rs.300");
		pr_dryersheets.setFont(new Font("Serif", Font.PLAIN, 22));
		pr_dryersheets.setBounds(299, 346, 117, 37);
		panel_3.add(pr_dryersheets);

		 qu_sugar = new JSpinner();            
		 qu_sugar.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		qu_sugar.setBounds(486, 117, 52, 37);
		panel_3.add(qu_sugar);

		 qu_tea = new JSpinner();
		 qu_tea.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		qu_tea.setBounds(486, 192, 52, 37);
		panel_3.add(qu_tea);

		 qu_soap = new JSpinner();
		 qu_soap.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		qu_soap.setBounds(486, 269, 52, 37);
		panel_3.add(qu_soap);

		 qu_dryersheets = new JSpinner();
		 qu_dryersheets.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		qu_dryersheets.setBounds(486, 346, 52, 37);
		panel_3.add(qu_dryersheets);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Your Products are Successfuly" + "\n Added to the Cart");

				// Payments mp = new Payments();

				// double x = Total(); //sum
				// mp.amount.setText(Double.toString(x));

				// Payments op = new Payments();
				// sum
				// op.amount.setText(String.valueOf(q));
				AddItems ad = new AddItems();

				Total();

				String x = tot.getText();

				JOptionPane.showMessageDialog(null, "Total amount to be paid\n" + "Rs." + x);

				MainMenu mm = new MainMenu();
				mm.setVisible(true);
				JOptionPane.showMessageDialog(null, "Dear customer,now you can\nproceed for your payments");

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(543, 417, 95, 32);
		panel_3.add(btnNewButton);

		tot = new JLabel("");
		tot.setFont(new Font("Tahoma", Font.BOLD, 14));
		tot.setBounds(405, 420, 89, 26);
		panel_3.add(tot);

		JLabel lblNewLabel_2_1 = new JLabel("Total Amount");
		lblNewLabel_2_1.setBackground(new Color(245, 245, 245));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(284, 420, 132, 26);
		panel_3.add(lblNewLabel_2_1);
	}

	public void Total()

	{
		int sum = 0;

		if (onion1.isSelected())

		{
			int A = Integer.parseInt(qu_onions.getValue().toString());

			// int A = (Integer)qu_onions.getValue();

			int z = A * 50;

			sum = sum + z;

		}

		if (ch_cabbage.isSelected())

		{
			int A = Integer.parseInt(qu_cabbage.getValue().toString());

			// int A = (Integer)qu_onions.getValue();

			int z = A * 40;

			sum = sum + z;

		}
		if (ch_potatoes.isSelected())

		{
			int A = Integer.parseInt(qu_potatoes.getValue().toString());

			// int A = (Integer)qu_onions.getValue();

			int z = A * 40;

			sum = sum + z;

		}
		if (ch_carrots.isSelected())

		{
			int A = Integer.parseInt(qu_carrots.getValue().toString());

			// int A = (Integer)qu_onions.getValue();

			int z = A * 50;

			sum = sum + z;

		}

		if (ch_milk.isSelected())

		{
			int A = Integer.parseInt(qu_milk.getValue().toString());

			// int A = (Integer)qu_onions.getValue();

			int z = A * 52;

			sum = sum + z;

		}

		if (ch_butter.isSelected())

		{
			int A = Integer.parseInt(qu_butter.getValue().toString());

			// int A = (Integer)qu_onions.getValue();

			int z = A * 450;

			sum = sum + z;

		}

		if (ch_eggs.isSelected())

		{
			int A = Integer.parseInt(qu_eggs.getValue().toString());

			// int A = (Integer)qu_onions.getValue();

			int z = A * 60;

			sum = sum + z;

		}

		if (ch_cheese.isSelected())

		{
			int A = Integer.parseInt(qu_cheese.getValue().toString());

			// int A = (Integer)qu_onions.getValue();

			int z = A * 360;

			sum = sum + z;

		}
		
		if (ch_sugar.isSelected())

		{
			int A = Integer.parseInt(qu_sugar.getValue().toString());

			// int A = (Integer)qu_onions.getValue();

			int z = A * 40;

			sum = sum + z;

		}
		
		if (ch_tea.isSelected())

		{
			int A = Integer.parseInt(qu_tea.getValue().toString());

			// int A = (Integer)qu_onions.getValue();

			int z = A * 130;

			sum = sum + z;

		}
		
		if (ch_soap.isSelected())

		{
			int A = Integer.parseInt(qu_soap.getValue().toString());

			// int A = (Integer)qu_onions.getValue();

			int z = A *45;

			sum = sum + z;

		}
		
		if (ch_dryersheets.isSelected())

		{
			int A = Integer.parseInt(qu_dryersheets.getValue().toString());

			// int A = (Integer)qu_onions.getValue();

			int z = A *300;

			sum = sum + z;

		}
		
		tot.setText(String.valueOf(sum));

	}

}
