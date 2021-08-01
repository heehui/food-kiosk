package guiproject1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;

public class JoinFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblJoin;
	private JButton btnComplete;
	private JTextField txtID;
	private JTextField txtPassword;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinFrame frame = new JoinFrame();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JoinFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JoinFrame.class.getResource("/image/iconmonstr-eat-9-thin-120.png")));
		setTitle("회원가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(430, 490);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblJoin = new JLabel("회원가입");
		Font f1 = new Font("돋움", Font.BOLD, 20); //궁서 바탕 돋움
		lblJoin.setFont(new Font("돋움", Font.BOLD, 25)); 
		lblJoin.setBounds(159, 32, 114, 35);
		contentPane.add(lblJoin);
		
		JLabel lblPassword = new JLabel("\uBE44\uBC00\uBC88\uD638:");
		lblPassword.setFont(new Font("굴림", Font.BOLD, 15));
		lblPassword.setBounds(69, 163, 69, 20);
		contentPane.add(lblPassword);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setFont(new Font("굴림", Font.BOLD, 15));
		lblId.setBounds(69, 113, 69, 20);
		contentPane.add(lblId);
		
		JLabel lblName = new JLabel("\uC774\uB984:");
		lblName.setFont(new Font("굴림", Font.BOLD, 15));
		lblName.setBounds(69, 210, 69, 20);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("\uC774\uBA54\uC77C:");
		lblEmail.setFont(new Font("굴림", Font.BOLD, 15));
		lblEmail.setBounds(69, 257, 69, 20);
		contentPane.add(lblEmail);
		
		JLabel lblPhone = new JLabel("\uC804\uD654\uBC88\uD638:");
		lblPhone.setFont(new Font("굴림", Font.BOLD, 15));
		lblPhone.setBounds(69, 304, 69, 20);
		contentPane.add(lblPhone);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(159, 106, 186, 35);
		contentPane.add(txtID);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(159, 156, 186, 35);
		contentPane.add(txtPassword);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(159, 203, 186, 35);
		contentPane.add(txtName);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(159, 250, 186, 35);
		contentPane.add(txtEmail);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(159, 297, 186, 35);
		contentPane.add(txtPhone);
		
		btnComplete = new JButton("회원가입완료");
		btnComplete.setFont(new Font("굴림", Font.BOLD, 16));
		btnComplete.setBounds(206, 363, 139, 29);
		contentPane.add(btnComplete);
		
		setVisible(true);
		//회원가입완료 액션
		btnComplete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(txtID.getText().equals("")||txtName.getText().equals("") || txtPassword.getText().equals("")||txtPhone.getText().equals("")||txtEmail.getText().equals("")) {
					// ㄴ ID,Password,Phone,Email,Name에 대한 textField이 공백일 경우
					JOptionPane.showMessageDialog(null, "회원가입 실패입니다."+"\n"+"양식에 맞게 다시 작성해주세요.");
						
				
							}else {
								PrintWriter pw=null;
							try {
								pw = new PrintWriter(new BufferedWriter(new FileWriter("C:/fileEx/jointable1111.txt",false)));//"C:/fileEx/jointable102.txt"경로에 
																															//ID,Password,Phone,Email,Name textField에 입력한 값 저장.
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}											//저장될 때, ex)아이디/비밀번호/이름/전화번호/이메일주소  형식으로 되도록 해줌.
							pw.write(txtID.getText()+"/");
							pw.write(txtPassword.getText()+"/");
							pw.write(txtName.getText()+"/");
							pw.write(txtPhone.getText()+"/");
							pw.write(txtEmail.getText()+"/");
							pw.close();
							JOptionPane.showMessageDialog(null, "회원가입 되셨습니다:)");
							dispose(); //회원가입 창 닫힘
							
							}
						}
					
				});		
				
		

	}
}