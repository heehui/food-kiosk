package guiproject1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JButton btnlogin, btnjoin;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();

				} catch (Exception e) {
					//e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginFrame.class.getResource("/image/iconmonstr-eat-9-thin-120.png")));
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(511, 388);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 255, 250));
		panel.setBounds(0, 0, 495, 349);
		contentPane.add(panel);
		panel.setLayout(null);

		btnjoin = new JButton("회원가입");
		btnjoin.setBounds(288, 209, 104, 29);
		panel.add(btnjoin);

		btnlogin = new JButton("로그인");
		btnlogin.setBounds(167, 209, 106, 29);
		panel.add(btnlogin);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("굴림", Font.BOLD, 20));
		lblPassword.setBounds(79, 158, 90, 35);
		panel.add(lblPassword);

		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("굴림", Font.BOLD, 20));
		lblId.setBounds(100, 107, 69, 35);
		panel.add(lblId);

		txtId = new JTextField();
		txtId.setBounds(216, 107, 176, 35);
		panel.add(txtId);
		txtId.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(216, 158, 176, 34);
		panel.add(txtPassword);

		//로그인 액션

		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileReader fr = null;
				try {
					fr = new FileReader("C:/fileEx/jointable1111.txt");
				} catch (FileNotFoundException e1) { //등록된 회원정보가 한 개도 없어서 null일 때 에러처리
					JOptionPane.showMessageDialog(null, "등록된 회원정보가 없습니다. 회원가입해주세요.");
					txtId.setText("");
					txtPassword.setText("");
					
					
				}
				
				BufferedReader br = new BufferedReader(fr);
				
				String s = null;
				try {
					while((s=br.readLine()) != null){
						String [] bae = s.split("/"); //JoinFrame클래서에서 filewriter로 저장한 값을 "/"를 기준으로 split한 후 배열에 저장 

					if (txtId.getText().equals(bae[0]) && txtPassword.getText().equals(bae[1])) { // JoinFrame에서    아이디   /   비밀번호  /  이름  /  전화번호/이메일주소 로 저장했기 때문에 
																								  //    		     ㄴ bae[0]   ㄴ bae[1]
																								 // 로그인 창에서 입력한 아이디와 비밀번호가 JoinFrame 창에서 입력한 값과 동일한 지 비교. 
						JOptionPane.showMessageDialog(null,bae[0]+"님 환영합니다.");
						dispose();
						setVisible(false);
						new Menu3().setVisible(true);
						
				
					}else if(txtId.getText().equals("") || txtPassword.getText().equals("")){ //아이디, 비번 textfield가 빈칸일 경우
						
						JOptionPane.showMessageDialog(null, "로그인 양식에 맞게 입력해주세요.");
					
					}else {																	//회원가입되지 않은 아이디, 비번을 textfield에  입력할 경우
						JOptionPane.showMessageDialog(null, "등록된 회원정보가 없습니다."+"\n"+"회원가입을 진행해주세요.");
					}
				
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "로그인에 실패했습니다.");
				}
			}
		});
		//회원가입 액션

		btnjoin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JoinFrame frame = new JoinFrame();
			}
		});

		setVisible(true);

	}
}