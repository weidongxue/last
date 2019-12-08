package sss;

import java.awt.Frame;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

	


	/**
	 * ��Ҫʵ�ֹ��ܣ�ʵ��һ��ѧ��ѡ�ε�ͼ�ν���
	 */
	public  class CourseSelection extends JFrame {

	    // �������
	    private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JTextField tfName,tfNum,allInfo;
	    private JRadioButton rb1,rb2;
	    private JCheckBox cb1,cb2,cb3;
	    private JComboBox<String > t1,t2,t3;

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try{
	                    CourseSelection frame=new CourseSelection();     // ����һ������
	                    frame.setVisible(true);                                    // �øô���ʵ���ɼ�
	                }catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
//	      CourseSelectionFrame frame=new CourseSelectionFrame();
//	      frame.setVisible(true);
	    }

	    /**
	     * �������Ե����ã��ڲ�����ĳ�ʼ��
	     */
	    public CourseSelection(){
	        setTitle("ѡ��ing......");                           // ����
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // ���ùر�ʱ�Ƴ�JVM
	        setSize(500,400);                                   // ���ô��ڴ�С
	        setLocationRelativeTo(null);                        // ���ô������
	        contentPane=new JPanel();                           // �������
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        contentPane.setLayout(new BorderLayout(0, 0));      // ���ò���
	        setContentPane(contentPane);
	        JPanel panel=new JPanel(new GridLayout(5, 1,5,10));  // 5��1�еı�񲼾�
	        panel.setBorder(new TitledBorder(null,"",TitledBorder.LEADING ,TitledBorder.TOP,null,null));
	        contentPane.add(panel,BorderLayout.CENTER);          // ��panel��ӱ߿�

	      	    
	        // �ڶ���
	        JPanel panel_2=new JPanel();
	        panel.add(panel_2);
	        
	        t1=new JComboBox<String >();
	        t1.setModel(new DefaultComboBoxModel<String>(new String[]{"�ߵ���ѧ","��ɢ��ѧ","java"}));
	        
	        panel_2.add(t1);
	        t2=new JComboBox<String >();
	        t2.setModel(new DefaultComboBoxModel<String>(new String[]{"������","κ΢","������"}));
	        panel_2.add(t2);
//	        // ������
//	        JPanel panel_3=new JPanel();
//	        panel.add(panel_3);
//	        cb2=new JCheckBox("��ɢ��ѧ");
//	        panel_3.add(cb2);
//	        t2=new JComboBox<String >();
//	        t2.setModel(new DefaultComboBoxModel<String >(new String[]{"κޱ","����ʦ"}));
//	        panel_3.add(t2);
//	        //������
//	        JPanel panel_4=new JPanel();
//	        panel.add(panel_4);
//	        cb3=new JCheckBox("JAVA");
//	        panel_4.add(cb3);
//	        t3=new JComboBox<String >();
//	        t3.setModel(new DefaultComboBoxModel<String>(new String[]{"������","����ʦ"}));
//	        panel_4.add(t3);
	        // ������
	        JPanel panel_5=new JPanel();
	        panel.add(panel_5);
	        JButton jbOk=new JButton("ȷ��");
	        panel_5.add(jbOk);
	        JButton jbRest=new JButton("����");
	        panel_5.add(jbRest);
	        JButton jba=new JButton("�γ��¼�");
	        panel_5.add(jba);
	        // ���ѡ����Ϣ
	        JPanel panelSouth=new JPanel();
	        contentPane.add(panelSouth,BorderLayout.SOUTH);
	        //JLabel labe=new JLabel("ѡ����Ϣ");
	        //labe.setHorizontalAlignment(SwingConstants.LEFT);
	       // panelSouth.add(labe);
	        //allInfo=new JTextField();
	        //allInfo.setColumns(30);
	       // panelSouth.add(allInfo);
	        //��ӱ���
	        JPanel panelNorth=new JPanel();
	        contentPane.add(panelNorth,BorderLayout.NORTH);
	        JLabel labelTitle=new JLabel("ѧ��ѡ��ϵͳ");
	        labelTitle.setForeground(Color.DARK_GRAY);
	        labelTitle.setFont(new Font("����", Font.BOLD, 20));
	        panelNorth.add(labelTitle);

	        // ��ȷ����ť����¼��������
	        jbOk.addActionListener(new ActionListener() {           
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	JOptionPane.showMessageDialog(null, "����ѡ�γɹ�");
	            	new Frame();
	            	
	            }
	            });
            
//	                StringBuilder info=new StringBuilder();
//	                String name=tfName.getText();
//	                String num=tfNum.getText();
//	                String sex;
//	                if(rb1.isSelected()){
//	                    sex="��";
//	                }else {
//	                    sex="Ů";
//	                }
//	                info.append(name+num+sex);
//	                if(t1.isSelected()){
//	                    String c=cb1.getText();
//	                    String t=t1.getSelectedItem().toString();
//	                    info.append(":"+c+t);
//	                }
//	                if(cb2.isSelected()){
//	                    String c=cb2.getText();
//	                    String t=t2.getSelectedItem().toString();
//	                    info.append(","+c+t);
//	                }
//	                if(cb3.isSelected()){
//	                    String c=cb3.getText();
//	                    String t=t3.getSelectedItem().toString();
//	                    info.append(","+c+t);
//	                }
//	                allInfo.setText(info.toString());                     // ��ѧ����Ϣ��ѡ����Ϣ�ŵ��ı�����               
//	            }
//	        });
//
	        // �����ť�����¼��������
	        jbRest.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {

	           
	                t1.setSelectedIndex(0);
	                t2.setSelectedIndex(0);
	                allInfo.setText("");
	            }
	        });
	        
	        jba.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					Frame f2=new Frame("��ѡ");
					setVisible(true);
					
					
				}
			});
	            }
	        
	    
	}


	



