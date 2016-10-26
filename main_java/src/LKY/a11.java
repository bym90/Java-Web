package LKY;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import SQL.*;

public class a11 extends JFrame{
	
	JTable emp;
	DefaultTableModel model;
	JPanel mainP2;
	JButton Main1,Main2,Main3,Main4,Main5;
	
	a11(){
	
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
			
				
		JPanel menuP = new JPanel();
		menuP.setPreferredSize(new Dimension(500,80));
		
		menuP.setLayout(null);
		
		JButton Menu1 = new JButton("전자결제");
		Menu1.setBounds(20, 20, 100, 40);
		JButton Menu2 = new JButton("회의장소");
		Menu2.setBounds(130, 20, 100, 40);
		JButton Menu3 = new JButton("공지사항");
		Menu3.setBounds(240, 20, 100, 40);
		JButton Menu4 = new JButton("1");
		Menu4.setBounds(350, 20, 100, 40);
		
		menuP.add(Menu1);
		menuP.add(Menu2);
		menuP.add(Menu3);
		menuP.add(Menu4);
		
		JPanel mainP = new JPanel();
		mainP.setPreferredSize(new Dimension(500,500));
	
		mainP2 = new JPanel();
		mainP2.setLayout(null);
		LineBorder lb = new LineBorder(Color.blue,2);
		SoftBevelBorder sbb = new SoftBevelBorder(SoftBevelBorder.RAISED);
		CompoundBorder bb = new CompoundBorder(lb,sbb);
		
		mainP2.setBorder(bb);
						
		Main1 = new JButton("출근 도장");
		Main1.setBounds(560,200,100,50);
		Main2 = new JButton("외근");
		Main2.setBounds(560,270,100,50);
		Main3 = new JButton("조퇴");
		Main3.setBounds(560,340,100,50);
		Main4 = new JButton("야근");
		Main4.setBounds(560,410,100,50);
		Main5 = new JButton("퇴근 도장");
		Main5.setBounds(560,480,100,50);
		
		//왼쪽칸 공백용
		JPanel mainP4 = new JPanel();
		mainP4.setPreferredSize(new Dimension(8,400));
		JPanel mainP5 = new JPanel();
		mainP5.setPreferredSize(new Dimension(400,8));
		
		
		mainP2.add(Main1);
		mainP2.add(Main2);
		mainP2.add(Main3);
		mainP2.add(Main4);
		mainP2.add(Main5);
			  		
		mainP.setLayout(new BorderLayout());
		mainP.add("Center",mainP2);
		mainP.add("North",menuP);
		mainP.add("West", mainP4);
		mainP.add("South", mainP5);

		JPanel chatP = new JPanel();
		chatP.setPreferredSize(new Dimension(230, 700));

		DefaultMutableTreeNode root = new DefaultMutableTreeNode("직원");
		DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("영업부");
		DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("창업부");
		DefaultMutableTreeNode child1_child1 = new DefaultMutableTreeNode("1번");
		DefaultMutableTreeNode child1_child2 = new DefaultMutableTreeNode("2번");
		DefaultMutableTreeNode child2_child1 = new DefaultMutableTreeNode("1번");
		DefaultMutableTreeNode child2_child2 = new DefaultMutableTreeNode("2번");

		root.add(child1);
		root.add(child2);
		child1.add(child1_child1);
		child1.add(child1_child2);
		child2.add(child2_child1);
		child2.add(child2_child2);

		JTree myTree = new JTree(root);

		JScrollPane sp = new JScrollPane(myTree);
		
		sp.setPreferredSize(new Dimension(200,150));
						
		JLabel info = new JLabel("사원정보");
		info.setPreferredSize(new Dimension(200,120));
		TextField t1 = new TextField();
		t1.setPreferredSize(new Dimension(200,350));
		TextField t2 = new TextField();
		t2.setPreferredSize(new Dimension(200,30));
		
		JPanel ButtonGroup = new JPanel(new FlowLayout());
		JButton en = new JButton("엔터");
		JButton tran = new JButton("전송");
		JButton empinfo = new JButton("사원정보");
		
		ButtonGroup.add(en);
		ButtonGroup.add(tran);
		ButtonGroup.add(empinfo);
		
		chatP.add(info);
		chatP.add(sp);
		chatP.add(t1);
		chatP.add(t2);
		chatP.add(ButtonGroup);
		
		
		setTable();
 
        this.add("East",chatP);
        this.add("Center",mainP);
        
        this.setSize(930,750);
        this.setVisible(true);
        
	}
	
	
	public void setTable(){
		
		
		String[] info = {"이름","출근시간 ","퇴근시간","조퇴시간","외근","아근"};
		model = new DefaultTableModel(info,0);
		emp = new JTable(model);
		JScrollPane sp = new JScrollPane(emp);
		sp.setBounds(15,15,530,600);
		mainP2.add(sp);
		
				
	}
	

	public static void main(String[] args) {
			new a11();
	}

	class BTEvent implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			JButton target = (JButton)e.getSource();
			
			if(target == Main1){
				
			}
			
		}
	}
	
}





