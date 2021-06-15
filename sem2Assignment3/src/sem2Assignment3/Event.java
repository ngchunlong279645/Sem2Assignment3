package sem2Assignment3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Event extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Event frame = new Event();
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
	public Event() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 631, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(255, 69, 0)));
		panel.setBackground(new Color(189, 183, 107));
		panel.setBounds(0, 0, 615, 294);
		contentPane.add(panel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Trajan Pro 3", Font.BOLD, 15));
		textArea.setBounds(380, 69, 206, 181);
		panel.add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem().equals("World Book and Copyright Day")) {
					textArea.setText("~Welcome To ~"
							+ "\nWorld Book and"
							+ "\nCopyright Day\n"
							+ "\nLocation:Setia Alam"
							+ "\nDate  :18/6/2021"
							+ "\nTicket Price :RM 3");
				}
				else if(comboBox.getSelectedItem().equals("International Day of Families")) {
					textArea.setText("~Welcome To~ "
							+ "\nInternational Day "
							+ "\nof Families\n"
							+ "\nLocation:Bukit Aman"
							+ "\nDate :15/7/2021"
							+ "\nTicket Price :RM 4");
				}
				else if(comboBox.getSelectedItem().equals("International Day of Happiness")) {
					textArea.setText("~Welcome To~ "
							+ "\nInternational Day "
							+ "\nof Happiness\n"
							+ "\nLocation:Bkt. Raja"
							+ "\nDate :9/9/2021"
							+ "\nTicket Price :RM 5");
				}
				else {
					textArea.setText(" ");
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Option", "World Book and Copyright Day", "International Day of Families", "International Day of Happiness"}));
		comboBox.setBounds(380, 50, 206, 20);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(8, 8, 362, 277);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Event.class.getResource("/IMAGE/event.PNG")));
		lblNewLabel.setBounds(0, 0, 360, 277);
		panel_1.add(lblNewLabel);
	}
}
