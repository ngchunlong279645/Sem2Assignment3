package sem2Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
	private JTextField totalDonation;
	private JTextField bill;
	private JTextField eventExpenses;
	private JTextField rentalFee;
	private JTextField transportFee;
	private JTextArea report;
	private JComboBox month ;

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
		setTitle("Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 803, 486);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Home", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 182, 193)));
		panel_4.setBackground(new Color(147, 112, 219));
		panel_4.setBounds(0, 0, 798, 458);
		panel.add(panel_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(255, 182, 193)));
		panel_6.setBackground(new Color(148, 0, 211));
		panel_6.setBounds(0, 0, 262, 458);
		panel_4.add(panel_6);
		
		JLabel lblNewLabel = new JLabel("WELCOME \r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD, 55));
		lblNewLabel.setBounds(10, 26, 269, 88);
		panel_6.add(lblNewLabel);
		
		JLabel lblToAdmin = new JLabel("TO ADMIN");
		lblToAdmin.setForeground(new Color(255, 255, 255));
		lblToAdmin.setFont(new Font("Tekton Pro", Font.BOLD, 55));
		lblToAdmin.setBounds(10, 162, 252, 88);
		panel_6.add(lblToAdmin);
		
		JLabel lblPortal = new JLabel("PORTAL");
		lblPortal.setForeground(new Color(255, 255, 255));
		lblPortal.setFont(new Font("Tekton Pro", Font.BOLD, 60));
		lblPortal.setBounds(10, 327, 222, 88);
		panel_6.add(lblPortal);
		
		JLabel lblNewLabel_1 = new JLabel("Notice Board");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblNewLabel_1.setBounds(272, 27, 126, 38);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblMember = new JLabel("Member");
		lblMember.setForeground(new Color(255, 255, 255));
		lblMember.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblMember.setBounds(547, 262, 126, 38);
		panel_4.add(lblMember);
		
		JLabel lblCalendar = new JLabel("Calendar");
		lblCalendar.setForeground(new Color(255, 255, 255));
		lblCalendar.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		lblCalendar.setBounds(285, 262, 85, 38);
		panel_4.add(lblCalendar);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(244, 164, 96)));
		panel_7.setBackground(new Color(240, 230, 140));
		panel_7.setBounds(539, 291, 230, 142);
		panel_4.add(panel_7);
		
		JTextArea txtrNumberOfEnglish = new JTextArea();
		txtrNumberOfEnglish.setFont(new Font("Myriad Pro Light", Font.BOLD, 15));
		txtrNumberOfEnglish.setText("Number of \r\nEnglish Teacher   : 3\r\nScience Teacher   : 2\r\nMath Teacher       : 5\r\nMalay Teacher     : 4\r\nVolunteer               : 235");
		txtrNumberOfEnglish.setBounds(10, 11, 210, 120);
		panel_7.add(txtrNumberOfEnglish);
		
		JButton btnNewButton_2 = new JButton("Log Out");
		btnNewButton_2.setBounds(699, 11, 89, 23);
		panel_4.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login frame = new Login();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(250, 128, 114));
		btnNewButton_2.setFont(new Font("Tekton Pro", Font.BOLD, 15));
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 182, 193)));
		panel_5.setBackground(new Color(255, 182, 193));
		panel_5.setBounds(275, 59, 494, 190);
		panel_4.add(panel_5);
		
		JTextArea txtrRememberAll = new JTextArea();
		txtrRememberAll.setFont(new Font("Adobe Hebrew", Font.BOLD, 15));
		txtrRememberAll.setText("REMEMBER :                                          Donation Receieve Last Month:\r\nAll member are invited to                   RM 35000\r\nparticipant in the General                   Total Expenses Last Month:\r\nMeeting to be held in the                    RM 2500\r\nSeminar Room on Friday,                  Net Profit Last Month:\r\n8 September  at 10 a.m                         RM 32500\r\n\r\nNotice :Switch off your phone before enter the meeting.\r\n");
		txtrRememberAll.setBounds(10, 11, 468, 168);
		panel_5.add(txtrRememberAll);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(276, 291, 230, 142);
		panel_4.add(panel_8);
		panel_8.setLayout(null);
		panel_8.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(244, 164, 96)));
		panel_8.setBackground(new Color(240, 230, 140));
		
		JTextArea txtrPublicHoliday = new JTextArea();
		txtrPublicHoliday.setBounds(10, 11, 210, 120);
		panel_8.add(txtrPublicHoliday);
		txtrPublicHoliday.setFont(new Font("Tekton Pro", Font.BOLD, 15));
		txtrPublicHoliday.setText("Public Holiday     : 5-7-2021 \r\nGeneral Meeting  :  8-9-2021\r\nNew Event            :  18-9-2021\r\nNew Meeting       :  19-9-2021 \r\n");
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Finance", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 105, 180)));
		panel_2.setBackground(new Color(123, 104, 238));
		panel_2.setBounds(0, 0, 797, 458);
		panel_1.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 105, 180)));
		panel_3.setBackground(new Color(123, 104, 238));
		panel_3.setBounds(0, 0, 796, 65);
		panel_2.add(panel_3);
		
		JLabel lblNewLabel_3 = new JLabel("FINANCIAL REPORT");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tekton Pro", Font.BOLD, 50));
		lblNewLabel_3.setBounds(184, 11, 443, 54);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Total Donation");
		lblNewLabel_2.setForeground(new Color(255, 250, 250));
		lblNewLabel_2.setFont(new Font("Tekton Pro", Font.BOLD, 25));
		lblNewLabel_2.setBounds(25, 129, 158, 38);
		panel_2.add(lblNewLabel_2);
		
		totalDonation = new JTextField();
		totalDonation.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		totalDonation.setBounds(237, 129, 122, 30);
		panel_2.add(totalDonation);
		totalDonation.setColumns(10);
		
		JLabel lblBill = new JLabel("Bill");
		lblBill.setForeground(new Color(255, 250, 250));
		lblBill.setFont(new Font("Tekton Pro", Font.BOLD, 25));
		lblBill.setBounds(25, 178, 106, 30);
		panel_2.add(lblBill);
		
		JLabel lblEventExpenses = new JLabel("Event Expenses");
		lblEventExpenses.setForeground(new Color(255, 250, 250));
		lblEventExpenses.setFont(new Font("Tekton Pro", Font.BOLD, 25));
		lblEventExpenses.setBounds(25, 225, 182, 30);
		panel_2.add(lblEventExpenses);
		
		JLabel lblRentalFee = new JLabel("Rental Fee");
		lblRentalFee.setForeground(new Color(255, 250, 250));
		lblRentalFee.setFont(new Font("Tekton Pro", Font.BOLD, 25));
		lblRentalFee.setBounds(25, 276, 127, 38);
		panel_2.add(lblRentalFee);
		
		JLabel lblTransportFee = new JLabel("Transport Fee");
		lblTransportFee.setForeground(new Color(255, 250, 250));
		lblTransportFee.setFont(new Font("Tekton Pro", Font.BOLD, 25));
		lblTransportFee.setBounds(25, 325, 182, 30);
		panel_2.add(lblTransportFee);
		
		bill = new JTextField();
		bill.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		bill.setColumns(10);
		bill.setBounds(237, 174, 122, 30);
		panel_2.add(bill);
		
		eventExpenses = new JTextField();
		eventExpenses.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		eventExpenses.setColumns(10);
		eventExpenses.setBounds(237, 225, 122, 30);
		panel_2.add(eventExpenses);
		
		rentalFee = new JTextField();
		rentalFee.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		rentalFee.setColumns(10);
		rentalFee.setBounds(237, 274, 122, 30);
		panel_2.add(rentalFee);
		
		transportFee = new JTextField();
		transportFee.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		transportFee.setColumns(10);
		transportFee.setBounds(237, 326, 122, 30);
		panel_2.add(transportFee);
		
		JLabel lblMonth = new JLabel("Month ");
		lblMonth.setForeground(new Color(255, 255, 255));
		lblMonth.setFont(new Font("Tekton Pro", Font.BOLD, 25));
		lblMonth.setBounds(25, 84, 99, 26);
		panel_2.add(lblMonth);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.setFont(new Font("Tekton Pro", Font.BOLD, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double expenses = Integer.parseInt(eventExpenses.getText())
								+Integer.parseInt(bill.getText())
								+Integer.parseInt(rentalFee.getText())
								+Integer.parseInt(transportFee.getText());
				
				double netProfit=Integer.parseInt(totalDonation.getText())-expenses;
						
				
				report.setText("=================================\n"
							+ ">>>>>>FINANCIAL REPORT IN "+month.getSelectedItem()+"<<<<<<\n"
							+"=================================\n"
							+"Total Donation \t : "+totalDonation.getText()+"\n"
							+"\nTotal Expenses\t\n"
							+"Bill \t :  "+bill.getText()+"\n"
							+"Event Expenses: "+eventExpenses.getText()+"\n"
							+"Rental Fee \t : "+rentalFee.getText()+"\n"
							+"Transport Fee \t :  "+transportFee.getText()+"\n"
							+"\t\t"+expenses+"\n"
							+"\t\t________"
							+"\nNet Profit\t\t: "+netProfit);
			}
		});
		btnNewButton.setBounds(213, 381, 146, 38);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				month.setSelectedItem("JANUARY");
				totalDonation.setText("");
				eventExpenses.setText("");
				rentalFee.setText("");
				bill.setText("");
				transportFee.setText("");
				report.setText("");
				
			}
		});
		btnNewButton_1.setBackground(new Color(135, 206, 250));
		btnNewButton_1.setFont(new Font("Tekton Pro", Font.BOLD, 25));
		btnNewButton_1.setBounds(54, 382, 106, 38);
		panel_2.add(btnNewButton_1);
		
		report = new JTextArea();
		report.setFont(new Font("Tekton Pro", Font.BOLD, 15));
		report.setBounds(441, 88, 296, 311);
		panel_2.add(report);
		
		month = new JComboBox();
		month.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		month.setModel(new DefaultComboBoxModel(new String[] {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DISEMBER"}));
		month.setBounds(237, 76, 122, 33);
		panel_2.add(month);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("D:\\SEM 2\\PROGRAMMING 2\\testing\\report.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
							bw.write(report.getText());
							
						bw.write("\n________\n");
						
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
		});
		btnUpload.setFont(new Font("Tekton Pro", Font.BOLD, 25));
		btnUpload.setBackground(new Color(152, 251, 152));
		btnUpload.setBounds(466, 410, 112, 38);
		panel_2.add(btnUpload);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					report.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tekton Pro", Font.BOLD, 25));
		btnPrint.setBackground(new Color(152, 251, 152));
		btnPrint.setBounds(610, 410, 112, 38);
		panel_2.add(btnPrint);
	}
}
