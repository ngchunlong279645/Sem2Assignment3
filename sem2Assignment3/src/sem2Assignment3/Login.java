package sem2Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField UserNameTextField;
	private JTextField PasswordTextField;
	private JComboBox user;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("VolunteerTeacherOrganisation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 915, 514); //set for 0,0,1400,800
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 165, 0));
		panel.setBorder(null);
		panel.setBounds(0, 0, 899, 475);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 140, 0)));
		panel_1_2.setBackground(new Color(240, 230, 140));
		panel_1_2.setBounds(401, 139, 214, 53);
		panel.add(panel_1_2);
		
		JLabel UserNameLabel = new JLabel("User Name");
		UserNameLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		UserNameLabel.setBounds(51, 11, 125, 31);
		panel_1_2.add(UserNameLabel);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 140, 0)));
		panel_1_3.setBackground(new Color(240, 230, 140));
		panel_1_3.setBounds(401, 240, 214, 53);
		panel.add(panel_1_3);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		PasswordLabel.setBounds(57, 11, 115, 31);
		panel_1_3.add(PasswordLabel);
		
		UserNameTextField = new JTextField();
		UserNameTextField.setFont(new Font("Tahoma", Font.BOLD, 20));
		UserNameTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = "Azman";
				UserNameTextField.setText(userName);
			}
		});
		UserNameTextField.setBounds(642, 139, 243, 53);
		panel.add(UserNameTextField);
		UserNameTextField.setColumns(10);
		
		PasswordTextField = new JTextField();
		PasswordTextField.setFont(new Font("Tahoma", Font.BOLD, 20));
		PasswordTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userPswd = "aby123";
				PasswordTextField.setText(userPswd);
			}
		});
		PasswordTextField.setColumns(10);
		PasswordTextField.setBounds(642, 240, 243, 53);
		panel.add(PasswordTextField);
		
		JButton LoginButton = new JButton("LOGIN");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(UserNameTextField.getText().equals("A") && PasswordTextField.getText().equals("a")&& user.getSelectedItem().equals("User")) {
						JOptionPane.showMessageDialog(null, "Login Succesful");
						
						UserInterface User = new UserInterface(); //calling another frame/window
							User.setModalExclusionType(null);
							User.setVisible(true);
					}
					else if(UserNameTextField.getText().equals("B") && PasswordTextField.getText().equals("b")&& user.getSelectedItem().equals("Admin")) {
						JOptionPane.showMessageDialog(null, "Login Succesful");
						
						AdminInterface Admin = new AdminInterface(); //calling another frame/window
							Admin.setModalExclusionType(null);
							Admin.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter the right user name and pswd");
					}
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right user name and pswd");
				}
			}
		});
		LoginButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		LoginButton.setBounds(668, 401, 187, 53);
		panel.add(LoginButton);
		
		JButton ResetButton = new JButton("RESET");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserNameTextField.setText("");
				PasswordTextField.setText("");
			}
		});
		ResetButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		ResetButton.setBounds(439, 401, 187, 53);
		panel.add(ResetButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 140, 0)));
		panel_2.setBackground(new Color(240, 230, 140));
		panel_2.setBounds(401, 318, 214, 53);
		panel.add(panel_2);
		
		JLabel lblSelectUserType = new JLabel("Select User Type");
		lblSelectUserType.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelectUserType.setBounds(10, 11, 194, 31);
		panel_2.add(lblSelectUserType);
		
		user = new JComboBox();
		user.setFont(new Font("Tekton Pro", Font.BOLD, 20));
		user.setModel(new DefaultComboBoxModel(new String[] {"Admin", "User"}));
		user.setToolTipText("");
		user.setBounds(642, 318, 243, 53);
		panel.add(user);
		
		JLabel TitleLabel = new JLabel("SOL 24/7\r\n ORGANISATION");
		TitleLabel.setBounds(417, 40, 468, 59);
		panel.add(TitleLabel);
		TitleLabel.setForeground(new Color(255, 255, 255));
		TitleLabel.setFont(new Font("Tekton Pro", Font.BOLD, 40));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 69, 0));
		panel_1.setBounds(0, 0, 391, 475);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/IMAGE/SOL24.PNG")));
		lblNewLabel.setBounds(78, 24, 159, 178);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/IMAGE/Capture.PNG")));
		lblNewLabel_1.setBounds(0, 223, 391, 252);
		panel_1.add(lblNewLabel_1);
	}
}
