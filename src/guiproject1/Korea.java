package guiproject1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
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
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import java.awt.Toolkit;

public class Korea extends JFrame{

	private JPanel contentPane;
	JLabel lblk1;
	JLabel lblk2;
	JLabel lblk3;
	JLabel lblk4;
	JLabel lblk5;
	JLabel lblk6;
	
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
					Korea frame = new Korea();
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
	public Korea() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Korea.class.getResource("/image/iconmonstr-eat-9-thin-120.png")));
		
		setTitle("한식 MENU");
		setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JButton btnk1 = new JButton("");
		btnk1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu += lblk1.getText() +"\n";
					price += 5000;
					count1++;
					textArea.setText(lblk1.getText()+ "+" + count1);
				
			}
		});
		btnk1.setIcon(new ImageIcon(Korea.class.getResource("/image/k1.png")));
		btnk1.setBounds(14, 23, 169, 113);
		contentPane.add(btnk1);
		
		JButton btnk2 = new JButton("");
		btnk2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu += lblk2.getText() +"\n";
				price += 4000;
				count2++;
				textArea.setText(lblk2.getText()+ "+" + count2);
				
			}
		});
		btnk2.setIcon(new ImageIcon(Korea.class.getResource("/image/k2.png")));
		btnk2.setBounds(197, 23, 169, 113);
		contentPane.add(btnk2);
		
		JButton btnk3 = new JButton("");
		btnk3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu += lblk3.getText() +"\n";
				price += 5500; 
				count3++;
				textArea.setText(lblk3.getText()+ "+" + count3);
			}
		});
		btnk3.setIcon(new ImageIcon(Korea.class.getResource("/image/k3.png")));
		btnk3.setBounds(14, 177, 169, 113);
		contentPane.add(btnk3);
		
		JButton btnk4 = new JButton("");
		btnk4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu += lblk4.getText() +"\n";
				price += 3000; 
				count4++;
				textArea.setText(lblk4.getText()+ "+" + count4);
			}
		});
		btnk4.setIcon(new ImageIcon(Korea.class.getResource("/image/k4.png")));
		btnk4.setBounds(197, 177, 169, 113);
		contentPane.add(btnk4);
		
		JButton btnk5 = new JButton("");
		btnk5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu += lblk5.getText() +"\n";
				price += 12000; 
				count5++;
				textArea.setText(lblk5.getText()+ "+" + count5);
			}
		});
		btnk5.setForeground(Color.WHITE);
		btnk5.setBackground(SystemColor.text);
		btnk5.setIcon(new ImageIcon(Korea.class.getResource("/image/k5.png")));
		btnk5.setBounds(27, 322, 152, 113);
		contentPane.add(btnk5);
		
		JButton btnk6 = new JButton("");
		btnk6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu += lblk6.getText() +"\n";
				price += 9000; 
				count6++;
				textArea.setText(lblk6.getText()+ "+" + count6);
			}
		});
		btnk6.setIcon(new ImageIcon(Korea.class.getResource("/image/k6.png")));
		btnk6.setBounds(204, 322, 162, 113);
		contentPane.add(btnk6);
		
		JButton btnCash = new JButton(" \uACB0\uC81C");
		btnCash.setIcon(new ImageIcon(Korea.class.getResource("/image/iconmonstr-credit-card-6-48.png")));
		btnCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg1 =  menu + "\n" + "= 총 결제금액은 " + String.valueOf(price) + "원입니다.";
				JOptionPane.showMessageDialog(btnk4, msg1);
				textArea.setText("");
				count1=0;
				count2=0;
				count3=0;
				count4=0;
				count5=0;
				count6=0;
				menu="";
				price=0;
				
				JOptionPane.showMessageDialog(btnk4, "이용해주셔서 감사합니다."+"\n"+"즐거운 식사되세요:)");
				
			}
		});
		btnCash.setBounds(254, 483, 119, 54);
		contentPane.add(btnCash);
		
		lblk1 = new JLabel("\uBE44\uBE54\uBC25(5000\uC6D0)");
		lblk1.setFont(new Font("굴림", Font.BOLD, 15));
		lblk1.setBounds(51, 148, 117, 18);
		contentPane.add(lblk1);
		
		lblk2 = new JLabel("\uB5A1\uBCF6\uC774(4000\uC6D0)");
		lblk2.setFont(new Font("굴림", Font.BOLD, 15));
		lblk2.setBounds(227, 147, 119, 18);
		contentPane.add(lblk2);
		
		lblk3 = new JLabel("\uB41C\uC7A5\uCC0C\uAC1C(5500\uC6D0)");
		lblk3.setFont(new Font("굴림", Font.BOLD, 15));
		lblk3.setBounds(43, 292, 125, 18);
		contentPane.add(lblk3);
		
		lblk4 = new JLabel("\uAE40\uBC25(3000\uC6D0)");
		lblk4.setFont(new Font("굴림", Font.BOLD, 15));
		lblk4.setBounds(227, 292, 107, 18);
		contentPane.add(lblk4);
		
		lblk5 = new JLabel("\uB3FC\uC9C0\uACE0\uAE30\uAE40\uCE58\uCC1C(12000\uC6D0)");
		lblk5.setFont(new Font("굴림", Font.BOLD, 15));
		lblk5.setBounds(14, 441, 186, 18);
		contentPane.add(lblk5);
		
		lblk6 = new JLabel("\uC0BC\uACB9\uC0B4\uAD6C\uC774 \uC815\uC2DD(9000\uC6D0)");
		lblk6.setFont(new Font("굴림", Font.BOLD, 15));
		lblk6.setBounds(214, 441, 186, 18);
		contentPane.add(lblk6);
		
		JButton btnMain = new JButton("\uCC98\uC74C\uC73C\uB85C");
		btnMain.setIcon(new ImageIcon(Korea.class.getResource("/image/iconmonstr-undo-1-24.png")));
		btnMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setVisible(false);
				new Menu3().setVisible(true);
			
			}
		});
		btnMain.setBounds(27, 491, 119, 39);
		contentPane.add(btnMain);
		
		JButton btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setIcon(new ImageIcon(Korea.class.getResource("/image/iconmonstr-x-mark-7-32.png")));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				count1=0;
				count2=0;
				count3=0;
				count4=0;
				count5=0;
				count6=0;
				menu="";
				price=0;
				
			JOptionPane.showMessageDialog(btnk4, "결제가 취소되었습니다" + "\n" + "처음부터 다시 진행해주세요.");
			}
		});
		btnCancel.setBounds(386, 483, 105, 54);
		contentPane.add(btnCancel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			menu += (String)comboBox.getSelectedItem()+"\n";
			}
		});
		comboBox.setFont(new Font("굴림", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"(\uBC18\uCC2C\uC120\uD0DD)", "\uAE40\uCE58", "\uB2E8\uBB34\uC9C0", "\uAD6D"}));
		comboBox.setBounds(401, 46, 90, 33);
		contentPane.add(comboBox);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Korea.class.getResource("/image/iconmonstr-qr-code-3-48.png")));
		label.setBounds(428, 322, 62, 59);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Korea.class.getResource("/image/iconmonstr-arrow-80-16.png")));
		label_1.setBounds(448, 393, 16, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Korea.class.getResource("/image/card2.png")));
		label_2.setBounds(428, 423, 63, 18);
		contentPane.add(label_2);
		
		
		textArea = new JTextArea();
		textArea.setFont(new Font("굴림", Font.PLAIN, 10));
		textArea.setBounds(371, 140, 139, 26);
		contentPane.add(textArea);
	}
	
	
}
