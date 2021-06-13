package sem2Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class AdminInterface extends JFrame {

	private JPanel contentPane;
	protected static String eventA;
	protected static String eventB;
	protected static String eventC;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField totalDonation;
	private JTextField bill;
	private JTextField eventExpenses;
	private JTextField rentalFee;
	private JTextField transportFee;
	private JTextField month;
	private JTextArea report;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminInterface frame = new AdminInterface();
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
	public AdminInterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 852, 486);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Home", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(244, 164, 96)));
		panel_4.setBackground(new Color(255, 255, 102));
		panel_4.setBounds(0, 0, 847, 458);
		panel.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(244, 164, 96)));
		panel_5.setBackground(new Color(240, 230, 140));
		panel_5.setBounds(0, 0, 847, 75);
		panel_4.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(244, 164, 96)));
		panel_6.setBackground(new Color(240, 230, 140));
		panel_6.setBounds(0, 134, 262, 324);
		panel_4.add(panel_6);
		
		JLabel lblNewLabel = new JLabel("WELCOME \r\n");
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD, 40));
		lblNewLabel.setBounds(10, 11, 222, 88);
		panel_6.add(lblNewLabel);
		
		JLabel lblToAdmin = new JLabel("TO ADMIN");
		lblToAdmin.setFont(new Font("Tekton Pro", Font.BOLD, 40));
		lblToAdmin.setBounds(73, 110, 179, 88);
		panel_6.add(lblToAdmin);
		
		JLabel lblPortal = new JLabel("PORTAL");
		lblPortal.setFont(new Font("Tekton Pro", Font.BOLD, 40));
		lblPortal.setBounds(10, 205, 222, 88);
		panel_6.add(lblPortal);
		
		JLabel lblNewLabel_1 = new JLabel("Notice Board");
		lblNewLabel_1.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblNewLabel_1.setBounds(272, 134, 126, 38);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblMember = new JLabel("Member");
		lblMember.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblMember.setBounds(655, 285, 126, 38);
		panel_4.add(lblMember);
		
		JLabel lblCalendar = new JLabel("Calendar");
		lblCalendar.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblCalendar.setBounds(655, 134, 85, 38);
		panel_4.add(lblCalendar);
		
		textField = new JTextField();
		textField.setBounds(272, 183, 299, 242);
		panel_4.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(655, 168, 170, 120);
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(655, 321, 170, 105);
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Finance", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(244, 164, 96)));
		panel_2.setBackground(new Color(255, 255, 102));
		panel_2.setBounds(0, 0, 847, 458);
		panel_1.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(244, 164, 96)));
		panel_3.setBackground(new Color(240, 230, 140));
		panel_3.setBounds(0, 0, 847, 54);
		panel_2.add(panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Total Donation");
		lblNewLabel_2.setBounds(28, 93, 76, 14);
		panel_2.add(lblNewLabel_2);
		
		totalDonation = new JTextField();
		totalDonation.setBounds(125, 90, 86, 20);
		panel_2.add(totalDonation);
		totalDonation.setColumns(10);
		
		JLabel lblBill = new JLabel("Bill");
		lblBill.setBounds(28, 142, 76, 14);
		panel_2.add(lblBill);
		
		JLabel lblEventExpenses = new JLabel("Event Expenses");
		lblEventExpenses.setBounds(28, 189, 76, 14);
		panel_2.add(lblEventExpenses);
		
		JLabel lblRentalFee = new JLabel("Rental Fee");
		lblRentalFee.setBounds(28, 234, 76, 14);
		panel_2.add(lblRentalFee);
		
		JLabel lblTransportFee = new JLabel("Transport Fee");
		lblTransportFee.setBounds(28, 287, 76, 14);
		panel_2.add(lblTransportFee);
		
		bill = new JTextField();
		bill.setColumns(10);
		bill.setBounds(125, 139, 86, 20);
		panel_2.add(bill);
		
		eventExpenses = new JTextField();
		eventExpenses.setColumns(10);
		eventExpenses.setBounds(125, 186, 86, 20);
		panel_2.add(eventExpenses);
		
		rentalFee = new JTextField();
		rentalFee.setColumns(10);
		rentalFee.setBounds(125, 231, 86, 20);
		panel_2.add(rentalFee);
		
		transportFee = new JTextField();
		transportFee.setColumns(10);
		transportFee.setBounds(125, 284, 86, 20);
		panel_2.add(transportFee);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(28, 350, 76, 14);
		panel_2.add(lblMonth);
		
		month = new JTextField();
		month.setBounds(125, 347, 86, 20);
		panel_2.add(month);
		month.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double expenses = Integer.parseInt(eventExpenses.getText())
								+Integer.parseInt(rentalFee.getText())
								+Integer.parseInt(rentalFee.getText())
								+Integer.parseInt(transportFee.getText());
				
				double netProfit=Integer.parseInt(totalDonation.getText())-expenses;
						
				
				report.setText("==========================\n"
							+ "FINANCIAL REPORT IN "+month.getText()+"\n"
							+"==========================\n"
							+"Total Donation\t\t: "+totalDonation.getText()+"\n"
							+"Total Expenses\t\n"
							+"Bill\t: "+bill.getText()+"\n"
							+"Event Expenses\t: "+eventExpenses.getText()+"\n"
							+"Rental Fee\t: "+rentalFee.getText()+"\n"
							+"Transport Fee\t: "+transportFee.getText()+"\n"
							+"\nNet Profit\t\t: "+netProfit);
			}
		});
		btnNewButton.setBounds(125, 406, 89, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setBounds(15, 406, 89, 23);
		panel_2.add(btnNewButton_1);
		
		report = new JTextArea();
		report.setBounds(291, 88, 296, 311);
		panel_2.add(report);
	}
}
