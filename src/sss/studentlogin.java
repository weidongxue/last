package sss;
/**
*�������û��� java  ����testʱ�򣬵�����֤�ɹ�
*/
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import sss.Register;

public class studentlogin extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public studentlogin(){
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("ѡ��ϵͳ");
		setBounds(300, 200, 300, 150);
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		JLabel jl=new JLabel("�û�����");
		jl.setBounds(10, 10, 200, 18);
		final JTextField name=new JTextField(10);
		name.setBounds(80, 10, 150, 18);
		JLabel jl2=new JLabel("���룺");
		jl2.setBounds(15, 50, 200, 18);
		final JPasswordField password=new JPasswordField(10);
		password.setBounds(80, 50, 150, 18);
		cp.add(jl);
		cp.add(name);
		cp.add(jl2);
		cp.add(password);
		JButton jb=new JButton("ȷ��");
		JButton jb2=new JButton("ע��");
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(name.getText().trim().length()==0||new String(password.getPassword()).trim().length()==0){
					JOptionPane.showMessageDialog(null, "�û������벻����Ϊ��");
					return;
				}
				//��¼��Ϣ
				if(name.getText().trim().equals("wdx")&&new String(password.getPassword()).trim().equals("123")){
					JOptionPane.showMessageDialog(null, "��¼�ɹ�");

					//��ת��ѡ�ν���
					if((arg0.getSource())!=null){
						CourseSelection window=new CourseSelection();
						window.setVisible(true);
					}
					
					
					
				}
				else{
					JOptionPane.showMessageDialog(null, "�û������������");
				}
			}
		});
		jb.setBounds(80, 80, 200, 18);
		cp.add(jb);
		//ע��
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				// TODO Auto-generated method stub
				if(a.getSource()==jb2){
					new Register();
				}
				
				
			}

			
		});
		cp.add(jb2);

	}
	
	public static void main(String[] args) {
		studentlogin l = new studentlogin();
		l.setSize(150, 200);
		l.setVisible(true);

	}

}
