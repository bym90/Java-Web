package LJY.form;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class MainUI extends JFrame{
	JPanel contentPane;
	JLabel la;
	JButton m_Button1,m_Button2;
	static JButton m_Button3;
	JButton m_Button4;
	JButton m_Button5;
	public MainUI() {
		this.setLayout(null);
//		this.setBounds(0,0,1000,1000);//������ ũ��
		this.setBounds(0,0,1000,600);//������ ũ��
		this.setTitle("��¯��");

		//==========���� �̹��� ����=============
//		ImageIcon mainImg = new ImageIcon("scr/images/fight_main.png");
		JLabel jl = new JLabel("123",new ImageIcon("src/images/fight_main.png"),JLabel.CENTER);
//		jpMain.setLayout(null);
//		jpMain.setLocation(140, 0);
//		jpMain.add("",mainImg);
		jl.setLayout(null);
		jl.setBounds(130, 1,300,206);

		this.add(jl);
		//==========���� �̹��� ����=============



		//==========��� ��ư ����=============

		//��� �޴��� ����
		m_Button1 = new JButton("�����ڹ���");
		m_Button2 = new JButton("�α���");
		m_Button3 = new JButton("ȸ������");
		m_Button4 = new JButton("��������");
		m_Button5 = new JButton("����ã��");


		m_Button3.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
				new SignUp();
			}
		});
		m_Button1.setLayout(null);
		m_Button2.setLayout(null);
		m_Button3.setLayout(null);
		m_Button4.setLayout(null);
		m_Button5.setLayout(null);


//		Rectangle r = new Rectangle(100,100);
//		m_Button5.setBounds(r);
		Font font = new Font("SANS_SERIF", Font.BOLD, 12);

		m_Button1.setLocation(425, 20);
		m_Button1.setSize(118, 35);
		m_Button1.setFont(font);
//		m_Button1.setBackground(Color.BLACK);

		m_Button2.setLocation(555, 20);
		m_Button2.setSize(88, 35);
		m_Button2.setFont(font);
//		m_Button2.setBackground(Color.BLACK);

		m_Button3.setLocation(655, 20);
		m_Button3.setSize(88, 35);
		m_Button3.setFont(font);
//		m_Button3.setBackground(Color.BLACK);

		m_Button4.setLocation(755, 20);
		m_Button4.setSize(88, 35);
		m_Button4.setFont(font);
//		m_Button4.setBackground(Color.BLACK);

		m_Button5.setLocation(855, 20);
		m_Button5.setSize(88, 35);
		m_Button5.setFont(font);
//		m_Button5.setBackground(Color.BLACK);

		this.add(m_Button1);
		this.add(m_Button2);
		this.add(m_Button3);
		this.add(m_Button4);
		this.add(m_Button5);
	//==========��� ��ư ����=============

	//==========�޺� �ڽ� ���� ����=============
		Vector<String> v1 = new Vector<String>();
		v1.add("#���� ����");
		v1.add("SSD");
		v1.add("VGA");
		v1.add("HDD");
		v1.add("CPU");

		Vector<String> v2 = new Vector<String>();
		v2.add("��ǰ�� �������ּ���.");
		v2.add("�Ｚ���� 830 Series 120GB");
		v2.add("�Ｚ���� 840 EVO 120GB");
		v2.add("�Ｚ���� 950 PRO NVMe 256GB");
		v2.add("Intel 530 Series 120GB");
		v2.add("Intel 730 Series 240GB");
		v2.add("Plextor M5S Series 128GB");
		v2.add("�������ũ 850X1 128GB");
		v2.add("Micron Crucial MX100 512GB");
		v2.add("Kingston HyperX 3K Series 120GB");
		v2.add("SanDisk Extreme Pro Series 480GB");
		v2.add("ZOTAC Premium Edition SSD 480GB");
		v2.add("Lite-On ZETA Series 128GB");

		JComboBox<String> combo = new JComboBox<String>(v1);
		JComboBox<String> combo2 = new JComboBox<String>(v2);
		JComboBox<String> combo3 = new JComboBox<String>(v2);

		combo.setLayout(null);
		combo.setBounds(60, 220, 150, 60);
//		combo.setBorder();
		combo.addItem("aaaaa");
//		combo.setEditable(true);
		combo.setMaximumRowCount(5);

		combo2.setLayout(null);
		combo2.setBounds(300, 220, 220, 60);
//		combo2.setBorder();
		combo2.addItem("aaaaa");

		combo3.setLayout(null);
		combo3.setBounds(606, 220, 220, 60);
		combo3.setSelectedItem("��ǰ�� �������ּ���.");
//		combo3.setBorder();
		combo3.addItem("aaaaa");

		Font fightFont = new Font("SANS_SERIF", Font.BOLD, 20);
		JButton fightB = new JButton("��¯�߱�");
		fightB.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainUI.this, "��¯�ߴ���", "��¯��", 0,
						new ImageIcon("src/images/icecream_icon.png"));
			}
		});
		fightB.setLayout(null);
		fightB.setBounds(850, 150, 130, 130);
		fightB.setFont(fightFont);

		this.add(combo);
		this.add(combo2);
		this.add(combo3);
		this.add(fightB);
		//==========�޺� �ڽ� ���� ����=============




		Object[][] o1 = {
							{"1000 MHz","�ھ�Ŭ��","1152 MHz"},
							{"1216 MHz","�ν���Ŭ��","c"},
							{"�������μ��� 2816 ��","���̴�����","�������μ��� 2816 ��"},
							{"GDDR5","�޸�Ÿ��","GDDR5"},
							{"6GB","�޸𸮿뷮","6GB"},
							{"1750.0MHz","�޸�Ŭ��","1752.5MHz"},
							{"384Bit","�޸𸮹���","384Bit"},
							{"-","�뿪��","-"},
							{"250W","�Ҹ�����","250W"},
							{"600W","�ּ� �ý����Ŀ� ���","600W"},
						};
		Object[] o2 = {"ù��° ��","�ھ� ����","�ι�° ��"};

		JTable table = new JTable(o1,o2);
		table.setLayout(null);
		table.setBounds(70,310,900,719);
//		JScrollPane sp = new JScrollPane();
//		sp.add(table);
//		this.add(new JScrollPane(table));

		this.add(table);

		DefaultTableCellRenderer dc = new DefaultTableCellRenderer();


		dc.setHorizontalAlignment(SwingConstants.CENTER); //SwingConstants�� �������̽�

		TableColumnModel tcm = table.getColumnModel();
		for(int i = 0; i < tcm.getColumnCount(); i++){
			tcm.getColumn(i).setCellRenderer(dc);
		}





		this.getContentPane().setBackground(Color.WHITE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MainUI();
	}
}