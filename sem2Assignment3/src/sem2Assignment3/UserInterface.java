package sem2Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class UserInterface extends JFrame  {

	private JPanel contentPane;
	private JTextField name;
	private JTextField age;
	private JTextField quantity;
	private JTable table;
	private JFrame frame;
	private JTable table_1;
	private JTextField donateName;
	private JTextField donateAmount;
	private JTextArea textReceipt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInterface frame = new UserInterface();
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
	public UserInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 847, 536);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Home", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(255, 228, 225));
		panel_1.setBounds(0, 0, 842, 508);
		panel.add(panel_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_7.setBackground(new Color(255, 228, 225));
		panel_7.setBounds(504, 122, 317, 135);
		panel_1.add(panel_7);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 43, 297, 81);
		panel_7.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "World Book and Copyright Day", "18/6/2021"},
				{new Integer(2), "International Day of Families", "15/7/2021"},
				{new Integer(3), "International Day of Happiness", "9/9/2021"},
			},
			new String[] {
				"NO.", "Event Name", "Date"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(36);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(138);
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_2 = new JLabel("Event");
		lblNewLabel_2.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblNewLabel_2.setBounds(26, 11, 84, 26);
		panel_7.add(lblNewLabel_2);
		
		JButton Eventbtn = new JButton("More Info");
		Eventbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Event event = new Event ();
				event.setModalExclusionType(null);
				event.setVisible(true);
			}
		});
		Eventbtn.setBounds(218, 13, 89, 23);
		panel_7.add(Eventbtn);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_8.setBackground(new Color(255, 228, 225));
		panel_8.setBounds(504, 284, 317, 166);
		panel_1.add(panel_8);
		
		JLabel lblAdvetisement = new JLabel("Advertisement");
		lblAdvetisement.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblAdvetisement.setBounds(10, 11, 139, 26);
		panel_8.add(lblAdvetisement);
		
		JTextArea txtrAbove = new JTextArea();
		txtrAbove.setText("-------------------------------------------------\r\n*  Above 2 tickets price will be\r\n    RM 2 per Unit\t   \r\n*  Above 5 tickets will be RM 1.50 \t\t\t   \r\n   +10% discount                                                    \r\n-------------------------------------------------");
		txtrAbove.setBounds(10, 48, 297, 107);
		panel_8.add(txtrAbove);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_9.setBackground(new Color(255, 228, 225));
		panel_9.setBounds(0, 461, 842, 47);
		panel_1.add(panel_9);
		
		JLabel lblWhoAreWe = new JLabel("Who Are We ?");
		lblWhoAreWe.setFont(new Font("Tekton Pro", Font.BOLD, 25));
		lblWhoAreWe.setBounds(29, 95, 153, 47);
		panel_1.add(lblWhoAreWe);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_10.setBackground(new Color(255, 228, 225));
		panel_10.setBounds(0, 0, 842, 84);
		panel_1.add(panel_10);
		
		JLabel label = new JLabel("WELCOME TO SOL 24/7");
		label.setBounds(137, 26, 522, 47);
		panel_10.add(label);
		label.setFont(new Font("Tekton Pro", Font.BOLD, 50));
		
		JTextArea txtrSolsIs = new JTextArea();
		txtrSolsIs.setText("SOLS 24/7 is a leading in-person and online education\r\nprovider for the poor. Starting out as experts in \r\nteaching English to those with zero or very basic \r\nEnglish proficiency, we have since branched out \r\nto encompass Employable English skills for school,\r\nuniversity, business purposes as well as becoming a \r\njob preparation and digital education provider.");
		txtrSolsIs.setBounds(29, 133, 435, 135);
		panel_1.add(txtrSolsIs);
		
		JLabel lblNewLabel = new JLabel("Vision");
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblNewLabel.setBounds(29, 296, 66, 25);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mission");
		lblNewLabel_1.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblNewLabel_1.setBounds(251, 298, 78, 20);
		panel_1.add(lblNewLabel_1);
		
		JTextArea txtrSolsEnvisions = new JTextArea();
		txtrSolsEnvisions.setFont(new Font("Monospaced", Font.PLAIN, 10));
		txtrSolsEnvisions.setText("SOLS 24/7 envisions that\r\n people from all communities \r\n\u2013 regardless of race, religion \r\nor gender \u2013 will have access to \r\neducation and social \r\nempowerment services, resulting \r\nin developed societies \r\nwith equal opportunities for all.");
		txtrSolsEnvisions.setBounds(29, 320, 202, 130);
		panel_1.add(txtrSolsEnvisions);
		
		JTextArea txtrOurMissionIs = new JTextArea();
		txtrOurMissionIs.setFont(new Font("Monospaced", Font.PLAIN, 10));
		txtrOurMissionIs.setText("Our mission is to serve, \r\neducate & empower the \r\nbottom 40% of the population \r\nwith FREE education, personal \r\ndevelopment & employment support.");
		txtrOurMissionIs.setBounds(251, 320, 217, 84);
		panel_1.add(txtrOurMissionIs);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_2.setBackground(Color.PINK);
		tabbedPane.addTab("Event Registeration", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_3.setBackground(new Color(255, 228, 225));
		panel_3.setBounds(21, 27, 791, 73);
		panel_2.add(panel_3);
		
		JLabel lblEventRegistrationSystem = new JLabel("Event Registration System");
		lblEventRegistrationSystem.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblEventRegistrationSystem.setBounds(90, 11, 616, 51);
		panel_3.add(lblEventRegistrationSystem);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_4.setBackground(new Color(255, 228, 225));
		panel_4.setBounds(21, 111, 252, 276);
		panel_2.add(panel_4);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(20, 30, 62, 14);
		panel_4.add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAge.setBounds(20, 63, 62, 14);
		panel_4.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGender.setBounds(20, 100, 62, 14);
		panel_4.add(lblGender);
		
		JLabel lblEvent = new JLabel("Event");
		lblEvent.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEvent.setBounds(20, 136, 62, 14);
		panel_4.add(lblEvent);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrice.setBounds(20, 177, 62, 14);
		panel_4.add(lblPrice);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.BOLD, 11));
		name.setColumns(10);
		name.setBounds(100, 27, 127, 20);
		panel_4.add(name);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.BOLD, 11));
		age.setColumns(10);
		age.setBounds(100, 60, 127, 20);
		panel_4.add(age);
		
		JComboBox gender = new JComboBox();
		gender.setModel(new DefaultComboBoxModel(new String[] {"Make a selection","Male", "Female"}));
		gender.setFont(new Font("Tahoma", Font.BOLD, 11));
		gender.setBounds(98, 97, 129, 20);
		panel_4.add(gender);
		
		JComboBox event = new JComboBox();
		event.setModel(new DefaultComboBoxModel(new String[] {"Make a selection","World Book and Copyright Day", "International Day of Families", "International Day of Happiness"}));
		event.setFont(new Font("Tahoma", Font.BOLD, 11));
		event.setBounds(98, 133, 129, 20);
		panel_4.add(event);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQuantity.setBounds(20, 215, 62, 14);
		panel_4.add(lblQuantity);
		
		JComboBox price = new JComboBox();
		price.setModel(new DefaultComboBoxModel(new String[] {"Make a selection", "3", "4", "5"}));
		price.setFont(new Font("Tahoma", Font.BOLD, 11));
		price.setBounds(98, 174, 129, 20);
		panel_4.add(price);
		
		quantity = new JTextField();
		quantity.setFont(new Font("Tahoma", Font.BOLD, 11));
		quantity.setColumns(10);
		quantity.setBounds(100, 212, 127, 20);
		panel_4.add(quantity);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_5.setBackground(new Color(255, 228, 225));
		panel_5.setBounds(21, 398, 791, 87);
		panel_2.add(panel_5);
		
		JButton button = new JButton("ADD RECORD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				Calculation cal = new Calculation();
				double totalPrice=cal.totalPrice(Integer.parseInt( (String) price.getSelectedItem()), Integer.parseInt( quantity.getText()));
				
				
				model.addRow(new Object[]{
						name.getText(),
						age.getText(),
						gender.getSelectedItem(),
						event.getSelectedItem(),
						price.getSelectedItem(),
						quantity.getText(),	
						totalPrice,
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Event Update confirmed", "Event Management System",
								JOptionPane.OK_OPTION);
					}
				}
				}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(10, 23, 143, 38);
		panel_5.add(button);
		
		JButton button_1 = new JButton("RESET");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				age.setText("");
				gender.setSelectedItem("Make a selection");
				event.setSelectedItem("Make a selection");
				price.setSelectedItem("Make a selection");
				quantity.setText("");		
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_1.setBounds(163, 23, 115, 38);
		panel_5.add(button_1);
		
		JButton button_2 = new JButton("DELETE");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Event Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Event Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBounds(436, 23, 105, 38);
		panel_5.add(button_2);
		
		JButton button_3 = new JButton("EXIT");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Membership Registration System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_3.setBounds(676, 23, 105, 38);
		panel_5.add(button_3);
		
		JButton button_4 = new JButton("PRINT");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //change e with other variable
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_4.setBounds(299, 23, 115, 38);
		panel_5.add(button_4);
		
		JButton button_5 = new JButton("UPLOAD");
		button_5.setBounds(551, 23, 115, 38);
		panel_5.add(button_5);
		button_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("D:\\SEM 2\\PROGRAMMING 2\\testing\\test.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_6.setBackground(new Color(176, 224, 230));
		panel_6.setBounds(283, 111, 529, 276);
		panel_2.add(panel_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 509, 254);
		panel_6.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Age", "Gender", "Event", "Price", "Quantity", "Total Price"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_11 = new JPanel();
		tabbedPane.addTab("Donation", null, panel_11, null);
		panel_11.setLayout(null);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_12.setBackground(new Color(255, 228, 225));
		panel_12.setBounds(0, 0, 842, 508);
		panel_11.add(panel_12);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setBounds(53, 244, 46, 14);
		panel_12.add(lblName_1);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setBounds(53, 297, 46, 14);
		panel_12.add(lblAmount);
		
		donateName = new JTextField();
		donateName.setBounds(133, 241, 86, 20);
		panel_12.add(donateName);
		donateName.setColumns(10);
		
		donateAmount = new JTextField();
		donateAmount.setBounds(133, 294, 86, 20);
		panel_12.add(donateAmount);
		donateAmount.setColumns(10);
		
		JButton btnNewButton = new JButton("Donate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Thank You For Your Donation");
				
			}
		});
		btnNewButton.setBounds(147, 364, 89, 23);
		panel_12.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				donateName.setText("");
				donateAmount.setText("");
			}
		});
		btnNewButton_1.setBounds(48, 364, 89, 23);
		panel_12.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print Receipt");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textReceipt.append("==================\n");
				textReceipt.append("      RECEIPT     \n");
				textReceipt.append("==================\n");
				textReceipt.append("Name: "+donateName.getText()+"\n");
				textReceipt.append("Amount: "+donateAmount.getText()+"\n");
			}
		});
		btnNewButton_2.setBounds(260, 364, 111, 23);
		panel_12.add(btnNewButton_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(258, 244, 139, 103);
		panel_12.add(scrollPane_2);
		
		textReceipt = new JTextArea();
		scrollPane_2.setViewportView(textReceipt);
	}
}
