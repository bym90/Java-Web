package SemiTest;

import GUI.*;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

public class Project {
	JPanel mainP;
	CJFrame frame;
	FirstPage one;
	MainForm mf;
	CardLayout card;
	JoinForm jf;

	JMenuBar bar;
	JMenuItem logout;
	JMenuItem exit;
	public Project() {
		frame = new CJFrame("연결고리");
		// 뻘짓 JFrame은 3겹으로 되있어서 CardLayout()이 뒤에 표시되므로 JPanel을 CJFrame에 입혀서
		// JPanel에 CardLayout()을 뿌려주면 된다.
		mainP = new JPanel();
		frame.add(mainP);
		card = new CardLayout();
		mainP.setLayout(card);

		one = new FirstPage(this);
		mf = new MainForm(this);
		jf = new JoinForm(this);

		mainP.add(one, "Page1");
		mainP.add(mf, "Page2");

		frame.setSize(300, 200);
		frame.setVisible(true);

		frame.setResizable(false);
		
		bar = new JMenuBar();
		JMenu inform = new JMenu("정보");
		logout = new JMenuItem("로그아웃");
		exit = new JMenuItem("종료");
		
		bar.add(inform);
		inform.add(logout);
		inform.addSeparator();
		inform.add(exit);
	}

	public static void main(String[] args) {
		new Project();

	}

}

class FirstPage extends JPanel {
	JTextField login;
	JPasswordField password;
	Project main;
	JButton jb1, jb2;

	FirstPage() {
	}

	FirstPage(Project p) {
		main = p;
		jb1 = new JButton("회원가입");
		jb2 = new JButton("로그인");
		login = new JTextField("아이디");
		password = new JPasswordField("****");

		this.setLayout(null);
		login.setBounds(40, 50, 120, 30);
		password.setBounds(40, 100, 120, 30);
		jb1.setBounds(170, 50, 90, 30);
		jb2.setBounds(170, 100, 90, 30);

		ButtonEvent evt = new ButtonEvent();
		jb1.addActionListener(evt);
		jb2.addActionListener(evt);

		this.add(login);
		this.add(password);
		this.add(jb1);
		this.add(jb2);
	}

	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton target = (JButton) e.getSource();
			if (target == jb1) {
				JoinForm jform = new JoinForm(main);
				jform.setSize(400, 450);
				jform.setVisible(true);
			} else if (target == jb2) {
				main.card.show(main.mainP, "Page2");
				main.frame.setSize(480, 480);
				main.frame.setResizable(true);
				main.frame.setJMenuBar(main.bar);
			}
		}
	}
}

class MainForm extends JPanel {
	Project main;

	MainForm() {
	}

	MainForm(Project p) {

		
		main = p;
		OneTab one = new OneTab();
		TwoTab two = new TwoTab();
		ThreeTab three = new ThreeTab();
		FourTab four = new FourTab();
		
		JTabbedPane tab = new JTabbedPane();
		tab.setTabPlacement(JTabbedPane.TOP);
		tab.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tab.add(one, "채팅");
		tab.add(two, "스케줄러");
		tab.add(three, "맛집정보");
		tab.add(four, "데이트장소");
		
	 	this.setLayout(new BorderLayout());
		this.add(tab);
		
		
	}
}

class JoinForm extends Dialog {
	JoinForm(Project p) {
		super(p.frame, true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
			}
		});

		// 이름 아이디 비밀번호 생년월일 메일주소

		this.setLayout(null);

		JLabel jl1 = new JLabel("이름", JLabel.LEFT);
		JTextField t1 = new JTextField(10);
		jl1.setBounds(70, 50, 50, 30);
		t1.setBounds(180, 50, 163, 30);

		JLabel jl2 = new JLabel("아이디", JLabel.LEFT);
		JTextField t2 = new JTextField(15);
		jl2.setBounds(70, 100, 50, 30);
		t2.setBounds(180, 100, 163, 30);

		JLabel jl3 = new JLabel("비밀번호", JLabel.LEFT);
		JTextField t31 = new JTextField(20);
		jl3.setBounds(70, 150, 60, 30);
		t31.setBounds(180, 150, 163, 30);
		JLabel jl4 = new JLabel("비밀번호확인", JLabel.LEFT);
		JTextField t32 = new JTextField(20);
		jl4.setBounds(70, 200, 80, 30);
		t32.setBounds(180, 200, 163, 30);

		JLabel jl5 = new JLabel("생년월일", JLabel.LEFT);
		String[] year = { "1990", "1991", "1992" };
		JComboBox yearbox = new JComboBox(year);
		String[] month = { "1", "2", "3" };
		JComboBox monthbox = new JComboBox(month);
		String[] day = { "1", "2", "3" };
		JComboBox daybox = new JComboBox(day);
		jl5.setBounds(70, 250, 80, 30);
		yearbox.setBounds(180, 250, 70, 30);
		monthbox.setBounds(250, 250, 40, 30);
		daybox.setBounds(290, 250, 50, 30);

		JLabel jl6 = new JLabel("메일주소", JLabel.LEFT);
		JTextField t6 = new JTextField(20);
		jl6.setBounds(70, 300, 60, 30);
		t6.setBounds(180, 300, 163, 30);

		JButton yes = new JButton("가입");
		yes.setBounds(100, 350, 100, 30);
		JButton no = new JButton("취소");
		no.setBounds(220, 350, 100, 30);

		this.add(jl1);
		this.add(t1);
		this.add(jl2);
		this.add(t2);
		this.add(jl3);
		this.add(t31);
		this.add(jl4);
		this.add(t32);
		this.add(jl5);
		this.add(yearbox);
		this.add(monthbox);
		this.add(daybox);
		this.add(jl6);
		this.add(t6);
		this.add(yes);
		this.add(no);
	}
}

class OneTab extends JPanel{
	OneTab(){
		
		this.setLayout(new BorderLayout());
		JTextArea receiveText = new JTextArea(20, 38);
		JScrollPane sp1 = new JScrollPane(receiveText);
		
		JTextArea sendText = new JTextArea(5, 32);
		JScrollPane sp = new JScrollPane(sendText);
		JButton send = new JButton("Enter");
		JButton attach = new JButton("첨부");
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(2, 1, 10, 10));
		p1.add(send);
		p1.add(attach);
		
		JPanel p2 = new JPanel();
		p2.add(sp);
		
		JPanel p3 = new JPanel();
		p3.add(p2);
		p3.add(p1);
		
		JPanel p4 = new JPanel();
		p4.add(sp1);
		this.add("South", p3);
		this.add("North", p4);
		
	}
}
class TwoTab extends JPanel{
	TwoTab(){
		String[] title = {"일", "월", "화", "수", "목", "금", "토"};
		String[][] data = {{"1", "2", "3", "4", "5", "6", "7"}, 
						{"8", "9", "10", "11", "12", "13", "14"},
						{"15", "16", "17", "18", "19", "20", "21"},
						{"21", "22", "23", "24", "25", "26", "27"},
						{"28", "29", "30", "31", "", "", ""}};
		JTable table = new JTable(data, title);
		JScrollPane sp = new JScrollPane(table);
		this.add(sp);
	}
}
class ThreeTab extends JPanel{
	ThreeTab(){
		JLabel l1 = new JLabel("지역");
		JComboBox box1= new JComboBox();
		box1.addItem("구로");
		box1.addItem("안양");
		box1.addItem("강남");
		box1.addItem("홍대");
		box1.addItem("신도림");
		
		JLabel l2 = new JLabel("메뉴");
		JComboBox box2= new JComboBox();
		box2.addItem("한식");
		box2.addItem("중식");
		box2.addItem("양식");
		box2.addItem("일식");
		
		JButton btn = new JButton("찾기");
		btn.addActionListener(new ButtonEvent());
		
		this.add(btn);
		this.add(box1);
		this.add(box2);
	
	}
	
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			new tasteSpot();
		}
	}	
}
class FourTab extends JPanel{
	FourTab(){
		JButton b = new JButton("1번 탭");
		this.add(b);
	}
}