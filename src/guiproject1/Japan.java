package guiproject1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Toolkit;

public class Japan extends JFrame {

	private JPanel contentPane;
	JLabel lblj1;
	JLabel lblj2;
	JLabel lblj3;
	JLabel lblj4;
	JLabel lblj5;
	JLabel lblj6;
	
	JTextArea textArea;
	
	String menu ="";
	int price =0;
	int count1 =0;
	int count2 =0;
	int count3 =0;
	int count4 =0;
	int count5 =0;
	int count6 =0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Japan frame = new Japan();
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
	public Japan() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Japan.class.getResource("/image/iconmonstr-eat-9-thin-120.png")));
		setTitle("일식 MENU");
		setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JButton btnj1 = new JButton("");
		btnj1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price += 6000; 
				menu += lblj1.getText() +"\n";
				count1++;
				textArea.setText(lblj1.getText()+ "+" + count1);
			}
		});
		btnj1.setIcon(new ImageIcon(Japan.class.getResource("/image/j1.png")));
		btnj1.setBounds(14, 23, 169, 113);
		contentPane.add(btnj1);
		
		JButton btnj2 = new JButton("");
		btnj2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price += 10000; 
				menu += lblj2.getText() +"\n";
				count2++;
				textArea.setText(lblj2.getText()+ "+" + count2);
			}
		});
		btnj2.setIcon(new ImageIcon(Japan.class.getResource("/image/j2.png")));
		btnj2.setBounds(197, 23, 162, 113);
		contentPane.add(btnj2);
		
		JButton btnj3 = new JButton("");
		btnj3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price += 7500; 
				menu += lblj3.getText() +"\n";
				count3++;
				textArea.setText(lblj3.getText()+ "+" + count3);
			}
		});
		btnj3.setIcon(new ImageIcon(Japan.class.getResource("/image/j3.png")));
		btnj3.setBounds(14, 177, 169, 113);
		contentPane.add(btnj3);
		
		JButton btnj4 = new JButton("");
		btnj4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price += 9500; 
				menu += lblj4.getText() +"\n";
				count4++;
				textArea.setText(lblj4.getText()+ "+" + count4);
			}
		});
		btnj4.setIcon(new ImageIcon(Japan.class.getResource("/image/j4.png")));
		btnj4.setBounds(197, 177, 169, 113);
		contentPane.add(btnj4);
		
		JButton btnj5 = new JButton("");
		btnj5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price += 5000; 
				menu += lblj5.getText() +"\n";
				count5++;
				textArea.setText(lblj5.getText()+ "+" + count5);
			}
		});
		btnj5.setForeground(Color.WHITE);
		btnj5.setBackground(SystemColor.text);
		btnj5.setIcon(new ImageIcon(Japan.class.getResource("/image/j5.png")));
		btnj5.setBounds(27, 322, 152, 113);
		contentPane.add(btnj5);
		
		JButton btnj6 = new JButton("");
		btnj6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price += 12000; 
				menu += lblj6.getText() +"\n";
				count6++;
				textArea.setText(lblj6.getText()+ "+" + count6);
			}
		});
		btnj6.setIcon(new ImageIcon(Japan.class.getResource("/image/j6.png")));
		btnj6.setBounds(204, 322, 162, 113);
		contentPane.add(btnj6);
		
		JButton btnCash = new JButton(" \uACB0\uC81C");
		btnCash.setIcon(new ImageIcon(Japan.class.getResource("/image/iconmonstr-credit-card-6-48.png")));
		btnCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String msg1 = menu + "\n"+ "= 총 결제 금액은 " + String.valueOf(price) + "원입니다.";
				JOptionPane.showMessageDialog(btnj4, msg1);
				textArea.setText("");
				count1=0;
				count2=0;
				count3=0;
				count4=0;
				count5=0;
				count6=0;
				menu ="";
				price=0;
				JOptionPane.showMessageDialog(btnj4, "이용해주셔서 감사합니다."+"\n"+"즐거운 식사되세요:)");
			}
		});
		btnCash.setBounds(227, 483, 125, 54);
		contentPane.add(btnCash);
		
		lblj1 = new JLabel("\uD0C0\uCF54\uC57C\uD0A4(6000\uC6D0)");
		lblj1.setFont(new Font("굴림", Font.BOLD, 15));
		lblj1.setBounds(43, 147, 132, 18);
		contentPane.add(lblj1);
		
		lblj2 = new JLabel("\uB77C\uBA58(10000\uC6D0)");
		lblj2.setFont(new Font("굴림", Font.BOLD, 15));
		lblj2.setBounds(227, 147, 119, 18);
		contentPane.add(lblj2);
		
		lblj3 = new JLabel("\uC18C\uBC14(7500\uC6D0)");
		lblj3.setFont(new Font("굴림", Font.BOLD, 15));
		lblj3.setBounds(43, 292, 125, 18);
		contentPane.add(lblj3);
		
		lblj4 = new JLabel("\uC5F0\uC5B4\uB36E\uBC25(9500\uC6D0)");
		lblj4.setFont(new Font("굴림", Font.BOLD, 15));
		lblj4.setBounds(207, 292, 152, 18);
		contentPane.add(lblj4);
		
		lblj5 = new JLabel("\uC6B0\uB3D9(5000\uC6D0)");
		lblj5.setFont(new Font("굴림", Font.BOLD, 15));
		lblj5.setBounds(51, 441, 117, 18);
		contentPane.add(lblj5);
		
		lblj6 = new JLabel("\uCD08\uBC25(12000\uC6D0)");
		lblj6.setFont(new Font("굴림", Font.BOLD, 15));
		lblj6.setBounds(233, 441, 113, 18);
		contentPane.add(lblj6);
		
		JButton btnMain = new JButton("\uCC98\uC74C\uC73C\uB85C");
		btnMain.setIcon(new ImageIcon(Japan.class.getResource("/image/iconmonstr-undo-1-24.png")));
		btnMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setVisible(false);
				new Menu3().setVisible(true);
			}
		});
		btnMain.setBounds(27, 492, 119, 37);
		contentPane.add(btnMain);
		
		JButton btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setIcon(new ImageIcon(Japan.class.getResource("/image/iconmonstr-x-mark-7-32.png")));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				count1=0;
				count2=0;
				count3=0;
				count4=0;
				count5=0;
				count6=0;
				menu = "";
				price=0;
				JOptionPane.showMessageDialog(btnj4, "결제가 취소되었습니다" + "\n" + "처음부터 다시 진행해주세요.");
			}
		});
		btnCancel.setBounds(371, 483, 117, 54);
		contentPane.add(btnCancel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu += (String)comboBox.getSelectedItem()+"\n";
			}
		});
		comboBox.setFont(new Font("굴림", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"(\uBC18\uCC2C\uC120\uD0DD)", "\uAE40\uCE58", "\uB2E8\uBB34\uC9C0", "\uAD6D"}));
		comboBox.setBounds(398, 48, 90, 31);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Japan.class.getResource("/image/card2.png")));
		lblNewLabel.setBounds(425, 417, 63, 18);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Japan.class.getResource("/image/iconmonstr-arrow-80-16.png")));
		label.setBounds(447, 393, 16, 18);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Japan.class.getResource("/image/iconmonstr-qr-code-3-48.png")));
		lblNewLabel_1.setBounds(426, 322, 62, 59);
		contentPane.add(lblNewLabel_1);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("굴림", Font.PLAIN, 10));
		textArea.setBounds(387, 145, 123, 26);
		contentPane.add(textArea);
	}
}
