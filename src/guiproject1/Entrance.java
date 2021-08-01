package guiproject1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Entrance extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entrance frame = new Entrance();
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
	public Entrance() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Entrance.class.getResource("/image/iconmonstr-eat-9-thin-120.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JLabel lblImage1 = new JLabel("");
		lblImage1.setIcon(new ImageIcon(Entrance.class.getResource("/image/chef-1417239_1280.png")));
		lblImage1.setBounds(91, 121, 314, 162);
		contentPane.add(lblImage1);
		
		JButton btnStart = new JButton("\u261E \uB4E4\uC5B4\uAC00\uAE30\u261C ");
		btnStart.setFont(new Font("±¼¸²", Font.BOLD, 20));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setVisible(false);
				new LoginFrame().setVisible(true);
				
			}
		});
		btnStart.setBounds(136, 271, 215, 44);
		contentPane.add(btnStart);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("HY°ß°íµñ", Font.BOLD, 25));
		lblWelcome.setBounds(181, 12, 156, 51);
		contentPane.add(lblWelcome);
		
		JLabel lblImage2 = new JLabel("");
		lblImage2.setIcon(new ImageIcon(Entrance.class.getResource("/image/house-2492054_1280.png")));
		lblImage2.setBounds(0, 0, 478, 326);
		contentPane.add(lblImage2);
	}

}
