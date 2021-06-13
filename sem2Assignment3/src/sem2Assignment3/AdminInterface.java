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

public class AdminInterface extends JFrame {

	private JPanel contentPane;
	protected static String eventA;
	protected static String eventB;
	protected static String eventC;

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
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(244, 164, 96)));
		panel.setBackground(new Color(240, 230, 140));
		panel.setBounds(10, 0, 842, 486);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(6, 6, 830, 69);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(null);
		panel_2.setBackground(SystemColor.textHighlight);
		panel_2.setBounds(6, 192, 244, 288);
		panel.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("WELCOME ");
		lblNewLabel.setFont(new Font("Tekton Pro", Font.BOLD, 40));
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(10, 32, 182, 37);
		panel_2.add(lblNewLabel);
		
		JLabel lblTo = new JLabel("to ADMIN\r\n\r\n");
		lblTo.setForeground(Color.WHITE);
		lblTo.setFont(new Font("Tekton Pro", Font.BOLD, 40));
		lblTo.setBounds(10, 91, 195, 37);
		panel_2.add(lblTo);
		
		JLabel lblAdminPortal = new JLabel("PORTAL\r\n");
		lblAdminPortal.setForeground(Color.WHITE);
		lblAdminPortal.setFont(new Font("Tekton Pro", Font.BOLD, 40));
		lblAdminPortal.setBounds(10, 139, 208, 89);
		panel_2.add(lblAdminPortal);
		
		JButton btnNewButton = new JButton("FINANCE REPORT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(366, 193, 119, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD EVENT");
		btnNewButton_1.setBounds(604, 192, 126, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("VIEW MEMBER");
		btnNewButton_2.setBounds(366, 347, 119, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("ADD MEETING");
		btnNewButton_3.setBounds(604, 347, 126, 23);
		panel.add(btnNewButton_3);
	}
}
