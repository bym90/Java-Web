package LSJ.semePJ;
import javax.swing.*;
import java.awt.*;
public class BDMForm extends JFrame 
{
     JFrame frame;
     JButton mealB,exerB,registB,calB, listB, writeB,celB;
     Panel pTop;
     Panel pCenter;
	Panel pBottom;
	
     
     
	public BDMForm(String title)
	
	{    
		super(title);
	//mageIcon 변경할아이콘 = new ImageIcon("이미지.png");
//Image 변경할이미지 = 변경할아이콘.getImage();  //ImageIcon을 Image로 변환.
//Image 변경된이미지 = 변경할이미지.getScaledInstance(가로, 세로, java.awt.Image.SCALE_SMOOTH);
//ImageIcon 변경된아이콘 = new ImageIcon(변경된이미지); //Image로 ImageIcon 생성
		//버튼 생성
		//이미지 불러오기
		//이미지  버튼에 담기
		//setPreferredSize(new Dimension(100,100));:버튼 사이즈 줄이기
		
		mealB = new JButton();
		ImageIcon meal = new ImageIcon("src/LSJ/img/m.jpg");
		mealB = new JButton(meal);
		 mealB.setPreferredSize(new Dimension(100,100) );	
		ImageIcon m = new ImageIcon("m.gif");
		exerB = new JButton();
		ImageIcon  exer = new ImageIcon("src/LSJ/img/ex.jpg");
		exerB = new JButton(exer);
		exerB.setPreferredSize(new Dimension(100,100));
		registB =new JButton("로그인");	
		ImageIcon rg= new ImageIcon("src/LSJ/img/login.jpg");
		registB = new JButton(rg);
		registB.setPreferredSize(new Dimension(100,100) );	
		calB = new JButton();
		ImageIcon cal =new ImageIcon("src/LSJ/img/k.jpg");
		calB = new JButton(cal);
		calB.setPreferredSize(new Dimension(100,100));
		listB = new JButton("내역");
		ImageIcon list = new ImageIcon("src/LSJ/img/L.png");
		listB = new JButton(list);
		listB.setPreferredSize(new Dimension(100,100));
		writeB = new JButton();
		ImageIcon write = new ImageIcon("src/LSJ/img/w.jpg");
		writeB = new JButton(write);
		writeB.setPreferredSize(new Dimension(100,100));
		ImageIcon cel = new ImageIcon("src/LSJ/img/cel.png");
		celB = new JButton(cel);
		celB.setPreferredSize(new Dimension(200,200));
		
	
		
	
		
		
		
	
		  pTop = new Panel();

	    pTop.add(mealB);
	    pTop.add(exerB);
	    pTop.add(registB);
	    pTop.add(calB);
	    pTop.add(celB);
	    
	    
	    pBottom =new Panel();
	    
	    pBottom.add(listB);
	    pBottom.add(writeB);
	   
       
		
	    pCenter = new Panel();
	    
	    pCenter.add(celB);

	    
	    add("North",pTop);
		add("South",pBottom);
		add("Center",pCenter);
		
	   setSize(400,400);
	   setBounds(400,100,400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    

	


	}
		
		

		public static void main(String[] args)  
		{
			new BDMForm("다이어트 프로그램");
		}
}