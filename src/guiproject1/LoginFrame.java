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
		setTitle("�α���");
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

		btnjoin = new JButton("ȸ������");
		btnjoin.setBounds(288, 209, 104, 29);
		panel.add(btnjoin);

		btnlogin = new JButton("�α���");
		btnlogin.setBounds(167, 209, 106, 29);
		panel.add(btnlogin);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("����", Font.BOLD, 20));
		lblPassword.setBounds(79, 158, 90, 35);
		panel.add(lblPassword);

		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("����", Font.BOLD, 20));
		lblId.setBounds(100, 107, 69, 35);
		panel.add(lblId);

		txtId = new JTextField();
		txtId.setBounds(216, 107, 176, 35);
		panel.add(txtId);
		txtId.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(216, 158, 176, 34);
		panel.add(txtPassword);

		//�α��� �׼�

		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileReader fr = null;
				try {
					fr = new FileReader("C:/fileEx/jointable1111.txt");
				} catch (FileNotFoundException e1) { //��ϵ� ȸ�������� �� ���� ��� null�� �� ����ó��
					JOptionPane.showMessageDialog(null, "��ϵ� ȸ�������� �����ϴ�. ȸ���������ּ���.");
					txtId.setText("");
					txtPassword.setText("");
					
					
				}
				
				BufferedReader br = new BufferedReader(fr);
				
				String s = null;
				try {
					while((s=br.readLine()) != null){
						String [] bae = s.split("/"); //JoinFrameŬ�������� filewriter�� ������ ���� "/"�� �������� split�� �� �迭�� ���� 

					if (txtId.getText().equals(bae[0]) && txtPassword.getText().equals(bae[1])) { // JoinFrame����    ���̵�   /   ��й�ȣ  /  �̸�  /  ��ȭ��ȣ/�̸����ּ� �� �����߱� ������ 
																								  //    		     �� bae[0]   �� bae[1]
																								 // �α��� â���� �Է��� ���̵�� ��й�ȣ�� JoinFrame â���� �Է��� ���� ������ �� ��. 
						JOptionPane.showMessageDialog(null,bae[0]+"�� ȯ���մϴ�.");
						dispose();
						setVisible(false);
						new Menu3().setVisible(true);
						
				
					}else if(txtId.getText().equals("") || txtPassword.getText().equals("")){ //���̵�, ��� textfield�� ��ĭ�� ���
						
						JOptionPane.showMessageDialog(null, "�α��� ��Ŀ� �°� �Է����ּ���.");
					
					}else {																	//ȸ�����Ե��� ���� ���̵�, ����� textfield��  �Է��� ���
						JOptionPane.showMessageDialog(null, "��ϵ� ȸ�������� �����ϴ�."+"\n"+"ȸ�������� �������ּ���.");
					}
				
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "�α��ο� �����߽��ϴ�.");
				}
			}
		});
		//ȸ������ �׼�

		btnjoin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JoinFrame frame = new JoinFrame();
			}
		});

		setVisible(true);

	}
}