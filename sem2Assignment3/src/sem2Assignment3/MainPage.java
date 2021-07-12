package sem2Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Desktop;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setTitle("SOL24/7 ORGANISATION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(255, 140, 0)));
		panel.setBackground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 874, 419);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("JOIN US ! !");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserInterface User = new UserInterface(); //calling another frame/window
				User.setModalExclusionType(null);
				User.setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Desktop	browser = Desktop.getDesktop();
			try {
				browser.browse(new URI("https://www.facebook.com/SOLS247/"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			}
		});
		
		JButton button = new JButton("");
		button.setBackground(new Color(255, 255, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop	browser = Desktop.getDesktop();
				try {
					browser.browse(new URI("https://www.sols247.org/"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop	browser = Desktop.getDesktop();
				try {
					browser.browse(new URI("https://twitter.com/SOLS247"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop	browser = Desktop.getDesktop();
				try {
					browser.browse(new URI("https://www.youtube.com/user/sols247"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_2.setIcon(new ImageIcon(MainPage.class.getResource("/IMAGE/youtube-icon.png")));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(816, 239, 33, 37);
		panel.add(button_2);
		button_1.setIcon(new ImageIcon(MainPage.class.getResource("/IMAGE/twitter-icon.png")));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(816, 200, 33, 28);
		panel.add(button_1);
		button.setIcon(new ImageIcon(MainPage.class.getResource("/IMAGE/social-media-icon.png")));
		button.setBounds(816, 161, 33, 28);
		panel.add(button);
		btnNewButton_2.setIcon(new ImageIcon(MainPage.class.getResource("/IMAGE/facebook-icon.png")));
		btnNewButton_2.setBounds(816, 122, 33, 28);
		panel.add(btnNewButton_2);
		btnNewButton.setForeground(new Color(160, 82, 45));
		btnNewButton.setFont(new Font("Tekton Pro Ext", Font.BOLD, 30));
		btnNewButton.setBounds(95, 329, 211, 37);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainPage.class.getResource("/IMAGE/10003490_684354198272969_1131493672_n.png")));
		lblNewLabel.setBounds(10, 83, 851, 325);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO SOL 24/7 ORGANISATION");
		lblNewLabel_1.setFont(new Font("Tekton Pro Cond", Font.BOLD, 60));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(33, 11, 811, 68);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Login in");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login(); //calling another frame/window
				login.setModalExclusionType(null);
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1.setFont(new Font("Tekton Pro", Font.BOLD, 18));
		btnNewButton_1.setBounds(775, 63, 89, 23);
		panel.add(btnNewButton_1);
	}
}
