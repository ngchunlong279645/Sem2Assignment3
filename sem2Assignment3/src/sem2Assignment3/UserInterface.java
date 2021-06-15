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
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.UIManager;

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
		setTitle("User ");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 100, 0)));
		panel_1.setBackground(new Color(144, 238, 144));
		panel_1.setBounds(0, 0, 842, 508);
		panel.add(panel_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_7.setBackground(new Color(220, 220, 220));
		panel_7.setBounds(504, 122, 317, 135);
		panel_1.add(panel_7);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(8, 46, 301, 81);
		panel_7.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Tekton Pro", Font.PLAIN, 12));
		table_1.setBackground(new Color(255, 240, 245));
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
		Eventbtn.setFont(new Font("Tekton Pro", Font.BOLD, 15));
		Eventbtn.setForeground(new Color(255, 255, 255));
		Eventbtn.setBackground(new Color(0, 139, 139));
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
		panel_8.setBackground(new Color(240, 230, 140));
		panel_8.setBounds(504, 284, 317, 166);
		panel_1.add(panel_8);
		
		JLabel lblAdvetisement = new JLabel("Advertisement");
		lblAdvetisement.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblAdvetisement.setBounds(10, 11, 139, 26);
		panel_8.add(lblAdvetisement);
		
		JTextArea txtrAbove = new JTextArea();
		txtrAbove.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 15));
		txtrAbove.setBackground(new Color(240, 230, 140));
		txtrAbove.setText("-------------------------------------------------\r\n*  Above 2 tickets price will be\r\n    RM 2 per Unit\t   \r\n*  Above 5 tickets will be RM 1.50 \t\t\t   \r\n   +10% discount                                                    \r\n-------------------------------------------------");
		txtrAbove.setBounds(10, 35, 297, 120);
		panel_8.add(txtrAbove);
		
		JLabel lblWhoAreWe = new JLabel("Who Are We ?");
		lblWhoAreWe.setForeground(new Color(128, 0, 128));
		lblWhoAreWe.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 35));
		lblWhoAreWe.setBounds(30, 86, 204, 47);
		panel_1.add(lblWhoAreWe);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 100, 0)));
		panel_10.setBackground(new Color(60, 179, 113));
		panel_10.setBounds(0, 0, 842, 84);
		panel_1.add(panel_10);
		
		JLabel label = new JLabel("WELCOME TO SOL 24/7");
		label.setForeground(new Color(255, 255, 255));
		label.setBounds(137, 26, 522, 47);
		panel_10.add(label);
		label.setFont(new Font("Tekton Pro", Font.BOLD, 50));
		
		JButton btnNewButton_3 = new JButton("Log Out");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login frame = new Login();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(250, 128, 114));
		btnNewButton_3.setFont(new Font("Tekton Pro", Font.BOLD, 15));
		btnNewButton_3.setBounds(743, 50, 89, 23);
		panel_10.add(btnNewButton_3);
		
		JTextArea txtrSolsIs = new JTextArea();
		txtrSolsIs.setFont(new Font("Tekton Pro Ext", Font.BOLD, 15));
		txtrSolsIs.setForeground(new Color(255, 255, 255));
		txtrSolsIs.setBackground(new Color(106, 90, 205));
		txtrSolsIs.setText("SOLS 24/7 is a leading in-person and online education\r\nprovider for the poor. Starting out as experts in \r\nteaching English to those with zero or very basic \r\nEnglish proficiency, we have since branched out \r\nto encompass Employable English skills for school,\r\nuniversity, business purposes as well as becoming a \r\njob preparation and digital education provider.");
		txtrSolsIs.setBounds(29, 122, 445, 146);
		panel_1.add(txtrSolsIs);
		
		JLabel lblNewLabel = new JLabel("Vision");
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(29, 296, 146, 25);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mission");
		lblNewLabel_1.setForeground(new Color(47, 79, 79));
		lblNewLabel_1.setFont(new Font("Tekton Pro", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBounds(287, 291, 130, 34);
		panel_1.add(lblNewLabel_1);
		
		JTextArea txtrSolsEnvisions = new JTextArea();
		txtrSolsEnvisions.setForeground(new Color(255, 255, 255));
		txtrSolsEnvisions.setBackground(new Color(102, 205, 170));
		txtrSolsEnvisions.setFont(new Font("Tekton Pro", Font.BOLD, 16));
		txtrSolsEnvisions.setText("SOLS 24/7 envisions that people\r\nfrom all communities \u2013 regardless\r\nof race, religion or gender \u2013 will \r\nhave access to education and \r\nsocial empowerment services, \r\nresulting in developed societies \r\nwith equal opportunities for all.");
		txtrSolsEnvisions.setBounds(29, 320, 217, 165);
		panel_1.add(txtrSolsEnvisions);
		
		JTextArea txtrOurMissionIs = new JTextArea();
		txtrOurMissionIs.setForeground(new Color(255, 255, 255));
		txtrOurMissionIs.setBackground(new Color(221, 160, 221));
		txtrOurMissionIs.setFont(new Font("Tekton Pro", Font.BOLD, 15));
		txtrOurMissionIs.setText("Our mission is to \r\nserve, educate &\r\nempower the \r\nbottom 40% of the\r\npopulation with \r\nFREE education, \r\npersonal development \r\n& employment support.");
		txtrOurMissionIs.setBounds(287, 319, 187, 166);
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
				double discount=Integer.parseInt( (String) price.getSelectedItem())*Integer.parseInt( quantity.getText())-totalPrice;
				
				model.addRow(new Object[]{
						name.getText(),
						age.getText(),
						gender.getSelectedItem(),
						event.getSelectedItem(),
						price.getSelectedItem(),
						quantity.getText(),	
						discount,
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
		button.setBounds(10, 23, 135, 38);
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
		button_1.setBounds(155, 23, 94, 38);
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
		button_2.setBounds(468, 23, 94, 38);
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
		button_3.setBounds(687, 23, 94, 38);
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
		button_4.setBounds(364, 23, 94, 38);
		panel_5.add(button_4);
		
		JButton button_5 = new JButton("UPLOAD");
		button_5.setBounds(572, 23, 105, 38);
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
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				Calculation cal = new Calculation();
				double totalPrice=cal.totalPrice(Integer.parseInt( (String) price.getSelectedItem()), Integer.parseInt( quantity.getText()));
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(name.getText(),i,0);
			    	model.setValueAt(age.getText(),i,1);
			    	model.setValueAt(gender.getSelectedItem(),i,2);
			    	model.setValueAt(event.getSelectedItem(),i,3);
			    	model.setValueAt(price.getSelectedItem(),i,4);
			    	model.setValueAt(quantity.getText(),i,5);
			    	model.setValueAt(totalPrice, i, 6);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdate.setBounds(260, 23, 94, 38);
		panel_5.add(btnUpdate);
		
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
				"Name", "Age", "Gender", "Event", "Price", "Quantity", "Discount", "Total Price"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_11 = new JPanel();
		tabbedPane.addTab("Donation", null, panel_11, null);
		panel_11.setLayout(null);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new MatteBorder(15, 15, 15, 15, (Color) new Color(255, 153, 0)));
		panel_12.setBackground(new Color(255, 215, 0));
		panel_12.setBounds(0, 0, 842, 508);
		panel_11.add(panel_12);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setFont(new Font("Tekton Pro Ext", Font.BOLD, 15));
		lblName_1.setBounds(53, 251, 70, 14);
		panel_12.add(lblName_1);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tekton Pro Ext", Font.BOLD, 15));
		lblAmount.setBounds(53, 276, 70, 17);
		panel_12.add(lblAmount);
		
		donateName = new JTextField();
		donateName.setFont(new Font("Tekton Pro", Font.BOLD, 14));
		donateName.setBounds(133, 248, 86, 20);
		panel_12.add(donateName);
		donateName.setColumns(10);
		
		donateAmount = new JTextField();
		donateAmount.setFont(new Font("Tekton Pro", Font.BOLD, 14));
		donateAmount.setBounds(133, 274, 86, 20);
		panel_12.add(donateAmount);
		donateAmount.setColumns(10);
		
		JButton btnNewButton = new JButton("Donate");
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tekton Pro Ext", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Thank You For Your Donation");
				
			}
		});
		btnNewButton.setBounds(143, 305, 76, 23);
		panel_12.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(128, 128, 128));
		btnNewButton_1.setFont(new Font("Tekton Pro", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				donateName.setText("");
				donateAmount.setText("");
			}
		});
		btnNewButton_1.setBounds(53, 304, 70, 23);
		panel_12.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Print Receipt");
		btnNewButton_2.setBackground(new Color(135, 206, 250));
		btnNewButton_2.setFont(new Font("Tekton Pro", Font.BOLD, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textReceipt.append("===============\n");
				textReceipt.append("____RECEIPT____\n");
				textReceipt.append("===============\n");
				textReceipt.append("Name  :   "+donateName.getText()+"\n");
				textReceipt.append("Amount:   RM"+donateAmount.getText()+"\n");
			}
		});
		btnNewButton_2.setBounds(268, 364, 111, 23);
		panel_12.add(btnNewButton_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(258, 244, 139, 103);
		panel_12.add(scrollPane_2);
		
		textReceipt = new JTextArea();
		textReceipt.setFont(new Font("Tekton Pro", Font.PLAIN, 13));
		textReceipt.setBackground(SystemColor.scrollbar);
		scrollPane_2.setViewportView(textReceipt);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(UserInterface.class.getResource("/IMAGE/header_NGOhub-Campaign-Header.jpg")));
		lblNewLabel_3.setBounds(21, 20, 822, 467);
		panel_12.add(lblNewLabel_3);
	}
}
