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

public class China extends JFrame {

	private JPanel contentPane;
	JLabel lblc1;
	JLabel lblc2;
	JLabel lblc3;
	JLabel lblc4;
	
	JTextArea textArea;
	
	String menu="";
	int price=0;
	int count1 =0;
	int count2 =0;
	int count3 =0;
	int count4 =0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					China frame = new China();
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
	public China() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(China.class.getResource("/image/iconmonstr-eat-9-thin-120.png")));
		setTitle("중식 MENU");
		setBackground(Color.WHITE);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		JButton btnc1 = new JButton("");
		btnc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price += 7000; 
				menu += lblc1.getText() +"\n";
				count1++;
				textArea.setText(lblc1.getText()+ "+" + count1);
				
			}
		});
		btnc1.setIcon(new ImageIcon(China.class.getResource("/image/c1.png")));
		btnc1.setBounds(14, 29, 169, 97);
		contentPane.add(btnc1);
		
		JButton btnc2 = new JButton("");
		btnc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price += 15000; 
				menu += lblc2.getText() +"\n";
				count2++;
				textArea.setText(lblc2.getText()+ "+" + count2);
			}
		});
		btnc2.setIcon(new ImageIcon(China.class.getResource("/image/c2.png")));
		btnc2.setBounds(197, 23, 169, 113);
		contentPane.add(btnc2);
		
		JButton btnc3 = new JButton("");
		btnc3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price += 6500; 
				menu += lblc3.getText() +"\n";
				count3++;
				textArea.setText(lblc3.getText()+ "+" + count3);
			}
		});
		btnc3.setIcon(new ImageIcon(China.class.getResource("/image/c3.png")));
		btnc3.setBounds(14, 177, 169, 113);
		contentPane.add(btnc3);
		
		JButton btnc4 = new JButton("");
		btnc4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				price += 6000; 
				menu += lblc4.getText() +"\n";
				count4++;
				textArea.setText(lblc4.getText()+ "+" + count4);
			}
		});
		btnc4.setIcon(new ImageIcon(China.class.getResource("/image/c4.png")));
		btnc4.setBounds(197, 177, 169, 113);
		contentPane.add(btnc4);
		
		JButton btnCash = new JButton(" \uACB0\uC81C");
		btnCash.setIcon(new ImageIcon(China.class.getResource("/image/iconmonstr-credit-card-6-48.png")));
		btnCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String msg1 = menu + "\n" + "= 총 결제 금액은 " + String.valueOf(price) + "원입니다.";
				JOptionPane.showMessageDialog(btnc4, msg1);
				
				textArea.setText("");
				count1=0;
				count2=0;
				count3=0;
				count4=0;
				menu ="";
				price=0;
				JOptionPane.showMessageDialog(btnc4, "이용해주셔서 감사합니다."+"\n"+"즐거운 식사되세요:)");
			}
		});
		btnCash.setBounds(253, 483, 119, 54);
		contentPane.add(btnCash);
		
		lblc1 = new JLabel("\uC9DC\uC7A5\uBCF6\uC74C\uBC25(7000\uC6D0)");
		lblc1.setFont(new Font("굴림", Font.BOLD, 15));
		lblc1.setBounds(43, 138, 140, 18);
		contentPane.add(lblc1);
		
		lblc2 = new JLabel("\uD0D5\uC218\uC721(15000\uC6D0)");
		lblc2.setFont(new Font("굴림", Font.BOLD, 15));
		lblc2.setBounds(227, 147, 119, 18);
		contentPane.add(lblc2);
		
		lblc3 = new JLabel("\uC9DC\uC7A5\uBA74(6500\uC6D0)");
		lblc3.setFont(new Font("굴림", Font.BOLD, 15));
		lblc3.setBounds(43, 292, 125, 18);
		contentPane.add(lblc3);
		
		lblc4 = new JLabel("\uC9EC\uBF55(6000\uC6D0)");
		lblc4.setFont(new Font("굴림", Font.BOLD, 15));
		lblc4.setBounds(227, 292, 107, 18);
		contentPane.add(lblc4);
		
		JButton btnMain = new JButton("\uCC98\uC74C\uC73C\uB85C");
		btnMain.setIcon(new ImageIcon(China.class.getResource("/image/iconmonstr-undo-1-24.png")));
		btnMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setVisible(false);
				new Menu3().setVisible(true);
			
			}
		});
		btnMain.setBounds(28, 491, 119, 39);
		contentPane.add(btnMain);
		
		JButton btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setIcon(new ImageIcon(China.class.getResource("/image/iconmonstr-x-mark-7-32.png")));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				count1=0;
				count2=0;
				count3=0;
				count4=0;
				menu = "";
				price=0;
				JOptionPane.showMessageDialog(btnc4, "결제가 취소되었습니다" + "\n" + "처음부터 다시 진행해주세요.");
			}
		});
		btnCancel.setBounds(384, 483, 105, 54);
		contentPane.add(btnCancel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu += (String)comboBox.getSelectedItem()+"\n";
			}
		});
		comboBox.setFont(new Font("굴림", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"(\uBC18\uCC2C\uC120\uD0DD)", "\uAE40\uCE58", "\uB2E8\uBB34\uC9C0", "\uAD6D"}));
		comboBox.setBounds(399, 45, 90, 30);
		contentPane.add(comboBox);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(China.class.getResource("/image/iconmonstr-qr-code-3-48.png")));
		label.setBounds(436, 322, 62, 59);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(China.class.getResource("/image/iconmonstr-arrow-80-16.png")));
		label_1.setBounds(451, 393, 16, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(China.class.getResource("/image/card2.png")));
		label_2.setBounds(426, 423, 63, 18);
		contentPane.add(label_2);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("굴림", Font.PLAIN, 10));
		textArea.setBounds(375, 145, 123, 26);
		contentPane.add(textArea);
	}
}
