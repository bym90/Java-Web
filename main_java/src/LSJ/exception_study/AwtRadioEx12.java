package LSJ.exception_study;
//AWT기본 메세지 박스 예제
//
//itemListener:라디오
import java.awt.*;
//ItemListner:체크박스 선택.라디오 단추 선택,콤보상자 선택.목록 상자 싱글 클릭:
import java.awt.event.*;
public class AwtRadioEx12  extends Frame  implements ActionListener,ItemListener
{   
	//기본 메세지 박스 폼 변수 만들기
    TextField tfMessage;
    TextArea area;
   Checkbox [] cbColor = new Checkbox[4];
    String [] str  = {"blue", "red","cyan","green"};
    		
    
	public AwtRadioEx12(String title) 
	{  
	   
		super(title);
		//밑에 메인메소드에서 title에서 title을 받고 super 상위 클래스를 재 사용한다는 뜻이므로 title를 재정의한다
		//배경색을 설정한다
		this.setBackground(new Color(253,228,153));
		//setBounds:Frame의 시작위치와 크기 설정
		this.setBounds(300, 100, 300, 300); //시작위치 & 크기 설정
		//frame 윈도우 이벤트 추가
		//----------------------
		//window(Frame owner):오너로서 지정된Frame를 사용해, 초기 상태로  새로운 윈도우를 구축합니다.
	   //windowListener: 
		//frame 으로부터 윈도우이벤트를 받기위해서 지정된 윈도우청취자를 추가 하기 위해 사용
		//windowAdapter
		   //공개 추상 클래스 WindowAdapter개체 를 확장
		   //의 WindowListener , 의 WindowStateListener , 의 WindowFocusListener 를 구현
		//윈도우 이벤트를 받기위한 추상 어댑터 클래스
		
		
		this.addWindowListener(new WindowAdapter()
		{ 
			/*
			 * 
			 *  WindowEvent 청취자를 작성하고 관심있는 이벤트에 대한 메소드를 오버라이드 (override) 
			 * 이 클래스를 확장합니다.
			 *  ( 당신이 의 WindowListener 인터페이스를 구현하는 경우 , 
			 *  당신은 그것 의 메소드 를 모두 정의 할 필요가 있습니다. 
			 *  이 추상 클래스 는 모두 null을 메소드를 정의 , 
			 *  그래서 당신 은 당신이 관심 이벤트에 대한 방법 을 정의 할 수 있습니다. )
			 */
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		this.setDesign(); //메세지 박스의 디자인 설정
		this.setVisible(true);
		//--------------------------------
	}
	
	
	
   public void setDesign()
   { 
	   
	   Panel pTop = new Panel();
	   this.add("North",pTop);
	   
	   Panel pBottom = new Panel();
	   this.add("South",pBottom);
	   
	 //  상단 패널에 문자열 입력하기 위한 textField추가
	   tfMessage = new TextField(10);
	     pTop.add(new Label("Message :"));
	     pTop.add(tfMessage);
	   
	 // 텍스트필드에 이벤트 추가
	 tfMessage.addActionListener(this); //현재 클래스에 놓기 때문에 this 설정
	   
	  // 프레임의 중간에 textarea추가
	    area = new TextArea();
	     area.append("메시지를 입력하면 추가됩니다\n");
	   this.add("Center",area);
	   
	   //하단에 checkbox추가 그룹(radio버튼)
	   
	   CheckboxGroup group = new CheckboxGroup();
	  for(int i = 0; i < cbColor.length; i++)
	   {
		   cbColor[i] = new Checkbox(str[i], group, i == 3?true:false);
		   pBottom.add(cbColor[i] );
		 //  checkbox에 이벤트 발생
		   cbColor[i].addItemListener(this);
		   
	   }
	   
	   
  }
   
   
   //--------------------
   //implement에 의한 오버라이드 생성
  //체크박스 이벤트
	
    @Override
    
  public void itemStateChanged(ItemEvent e)
   {
    	Object ob = e.getSource();
    	
    	for(int i =0; i <cbColor.length; i++)
    	{
    		if(ob == cbColor[i])
    		{
    			switch(i)
    			{
    				case 0:
    					area.setForeground(Color.blue);
    					break;
    				case 1:
    				
    					area.setForeground(Color.red);
    					break;
    				case 2:
    					area.setForeground(Color.cyan);
    					break;
    				case 3:
    					area.setForeground(Color.green);
    			}
    		}
    	}
    	}
    	
    //텍스트 이벤트
    @Override
    
   public  void actionPerformed(ActionEvent e)
    
  {
    	Object ob = e.getSource();
    //이벤트가 발생한 오브젝트
    	 if(ob == tfMessage)
    	 {
    		 area.append(tfMessage.getText()+ "\n");
    	    tfMessage.setText("");
    	  tfMessage.requestFocus();
    	 }
   }
    
	//------------------
	 
  public static void main(String[] args) 
	{
		new AwtRadioEx12("Frame기본창");

	}

}
