package LSJ.exception_study;
//AWT�⺻ �޼��� �ڽ� ����
//
//itemListener:����
import java.awt.*;
//ItemListner:üũ�ڽ� ����.���� ���� ����,�޺����� ����.��� ���� �̱� Ŭ��:
import java.awt.event.*;
public class AwtRadioEx12  extends Frame  implements ActionListener,ItemListener
{   
	//�⺻ �޼��� �ڽ� �� ���� �����
    TextField tfMessage;
    TextArea area;
   Checkbox [] cbColor = new Checkbox[4];
    String [] str  = {"blue", "red","cyan","green"};
    		
    
	public AwtRadioEx12(String title) 
	{  
	   
		super(title);
		//�ؿ� ���θ޼ҵ忡�� title���� title�� �ް� super ���� Ŭ������ �� ����Ѵٴ� ���̹Ƿ� title�� �������Ѵ�
		//������ �����Ѵ�
		this.setBackground(new Color(253,228,153));
		//setBounds:Frame�� ������ġ�� ũ�� ����
		this.setBounds(300, 100, 300, 300); //������ġ & ũ�� ����
		//frame ������ �̺�Ʈ �߰�
		//----------------------
		//window(Frame owner):���ʷμ� ������Frame�� �����, �ʱ� ���·�  ���ο� �����츦 �����մϴ�.
	   //windowListener: 
		//frame ���κ��� �������̺�Ʈ�� �ޱ����ؼ� ������ ������û���ڸ� �߰� �ϱ� ���� ���
		//windowAdapter
		   //���� �߻� Ŭ���� WindowAdapter��ü �� Ȯ��
		   //�� WindowListener , �� WindowStateListener , �� WindowFocusListener �� ����
		//������ �̺�Ʈ�� �ޱ����� �߻� ����� Ŭ����
		
		
		this.addWindowListener(new WindowAdapter()
		{ 
			/*
			 * 
			 *  WindowEvent û���ڸ� �ۼ��ϰ� �����ִ� �̺�Ʈ�� ���� �޼ҵ带 �������̵� (override) 
			 * �� Ŭ������ Ȯ���մϴ�.
			 *  ( ����� �� WindowListener �������̽��� �����ϴ� ��� , 
			 *  ����� �װ� �� �޼ҵ� �� ��� ���� �� �ʿ䰡 �ֽ��ϴ�. 
			 *  �� �߻� Ŭ���� �� ��� null�� �޼ҵ带 ���� , 
			 *  �׷��� ��� �� ����� ���� �̺�Ʈ�� ���� ��� �� ���� �� �� �ֽ��ϴ�. )
			 */
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		this.setDesign(); //�޼��� �ڽ��� ������ ����
		this.setVisible(true);
		//--------------------------------
	}
	
	
	
   public void setDesign()
   { 
	   
	   Panel pTop = new Panel();
	   this.add("North",pTop);
	   
	   Panel pBottom = new Panel();
	   this.add("South",pBottom);
	   
	 //  ��� �гο� ���ڿ� �Է��ϱ� ���� textField�߰�
	   tfMessage = new TextField(10);
	     pTop.add(new Label("Message :"));
	     pTop.add(tfMessage);
	   
	 // �ؽ�Ʈ�ʵ忡 �̺�Ʈ �߰�
	 tfMessage.addActionListener(this); //���� Ŭ������ ���� ������ this ����
	   
	  // �������� �߰��� textarea�߰�
	    area = new TextArea();
	     area.append("�޽����� �Է��ϸ� �߰��˴ϴ�\n");
	   this.add("Center",area);
	   
	   //�ϴܿ� checkbox�߰� �׷�(radio��ư)
	   
	   CheckboxGroup group = new CheckboxGroup();
	  for(int i = 0; i < cbColor.length; i++)
	   {
		   cbColor[i] = new Checkbox(str[i], group, i == 3?true:false);
		   pBottom.add(cbColor[i] );
		 //  checkbox�� �̺�Ʈ �߻�
		   cbColor[i].addItemListener(this);
		   
	   }
	   
	   
  }
   
   
   //--------------------
   //implement�� ���� �������̵� ����
  //üũ�ڽ� �̺�Ʈ
	
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
    	
    //�ؽ�Ʈ �̺�Ʈ
    @Override
    
   public  void actionPerformed(ActionEvent e)
    
  {
    	Object ob = e.getSource();
    //�̺�Ʈ�� �߻��� ������Ʈ
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
		new AwtRadioEx12("Frame�⺻â");

	}

}