package guiproject1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Menu3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtThank;

	static String s1 = "※ 식당에 방문해주셔서 감사합니다:D ※ ★ 주문하실 메뉴를 선택해주세요 ★";
	Timer t1 = new Timer(); //Timer : 시간간격 조절해주는 내장클래스 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu3 frame = new Menu3();
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
	public Menu3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu3.class.getResource("/image/iconmonstr-eat-9-thin-120.png")));
		setTitle("한식/중식/일식");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 540, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		txtThank = new JTextField();
		txtThank.setFont(new Font("HY견고딕", Font.BOLD, 24));
		txtThank.setBounds(67, 44, 403, 63);
		contentPane.add(txtThank);
		txtThank.setColumns(10);
		
		JButton btnKorea = new JButton("");
		btnKorea.setIcon(new ImageIcon(Menu3.class.getResource("/image/k1.png")));
		btnKorea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// 한식 창 띄우기
				dispose();
				setVisible(false);
				new Korea().setVisible(true);
			
			}
		});
		btnKorea.setBounds(40, 169, 142, 119);
		contentPane.add(btnKorea);
		
		JButton btnChina = new JButton("");
		btnChina.setIcon(new ImageIcon(Menu3.class.getResource("/image/c2.png")));
		btnChina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// 중식 창 띄우기
				dispose();
				setVisible(false);
				new China().setVisible(true);
			
			}
		});
		btnChina.setBounds(196, 169, 142, 119);
		contentPane.add(btnChina);
		
		JButton btnJapan = new JButton("");
		btnJapan.setIcon(new ImageIcon(Menu3.class.getResource("/image/j6.png")));
		btnJapan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// 일식 창 띄우기
			
				dispose();
				setVisible(false);
				new Japan().setVisible(true);
			
			}
		});
		btnJapan.setBounds(352, 169, 133, 119);
		contentPane.add(btnJapan);
		
		JLabel lblNewLabel = new JLabel("\uD55C\uC2DD");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		lblNewLabel.setBounds(91, 294, 62, 18);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\uC911\uC2DD");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		label.setBounds(255, 294, 62, 18);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\uC77C\uC2DD");
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		label_1.setBounds(408, 294, 62, 18);
		contentPane.add(label_1);
		
		JLabel lblImage3 = new JLabel("");
		lblImage3.setIcon(new ImageIcon(Menu3.class.getResource("/image/iconmonstr-cook-3-120.png")));
		lblImage3.setBounds(105, 371, 126, 126);
		contentPane.add(lblImage3);
		
		JLabel lblImage4 = new JLabel("");
		lblImage4.setIcon(new ImageIcon(Menu3.class.getResource("/image/iconmonstr-eat-9-thin-120.png")));
		lblImage4.setBounds(276, 371, 133, 126);
		contentPane.add(lblImage4);
		
		t1.scheduleAtFixedRate(new TimerTask() { // t1.scheduleAtFixedRate(new TimerTask() {할 일},지연시간,ms);
			public void run() {
				s1 = s1.substring(1,s1.length())+s1.substring(0,1);//substring을 이용한 글자 움직이기
				txtThank.setText(s1);
			}
		}, 0, 250);
	}
}
