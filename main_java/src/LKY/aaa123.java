package LKY;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class aaa123 extends JFrame{

           public static void main(String[] args){
            new aaa123("스케쥴러");
      }

           int year ,month,day,todays,memoday=0;

           Calendar today;
           Calendar  cal;

           int y = 0;

           String[] s = {"    일요일","    월요일","    화요일","    수요일","    목요일","    금요일","    토요일"};
           JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17;



           JLabel[] date = new JLabel[7];
           TextField[] day1 = new TextField[7];
           TextField[] day2 = new TextField[7];
           TextField[] day3 = new TextField[7];
           TextField[] day4 = new TextField[7];
           TextField[] day5 = new TextField[7];
           TextField[] day6 = new TextField[7];



           TextField[] field1 = new TextField[7];
           TextField[] field2 = new TextField[7];
           TextField[] field3 = new TextField[7];
           TextField[] field4 = new TextField[7];
           TextField[] field5 = new TextField[7];
           TextField[] field6 = new TextField[7];

           GridLayout g3;


      public aaa123(String str){
            super(str);

            setDefaultCloseOperation(EXIT_ON_CLOSE);

//            this.setResizable(false);



            today = Calendar.getInstance();

            cal = new GregorianCalendar();

            year = today.get(Calendar.YEAR);
            month = today.get(Calendar.MONDAY)+1;
            day = today.get(Calendar.DATE);

            for(int i = 0; i < 7; i ++){
            	day1[i] = new TextField();
            	day2[i] = new TextField();
            	day3[i] = new TextField();
            	day4[i] = new TextField();
            	day5[i] = new TextField();
            	day6[i] = new TextField();

            	field1[i] = new TextField();
            	field2[i] = new TextField();
            	field3[i] = new TextField();
            	field4[i] = new TextField();
            	field5[i] = new TextField();

            }


            GridBagLayout gbl = new GridBagLayout();
            GridBagConstraints gbc = new GridBagConstraints();

            setLayout(gbl);

            JButton b1 = new JButton(new ImageIcon("src/test/b.png"));
            JButton b2 = new JButton(new ImageIcon("src/test/b.png"));
            JButton b3 = new JButton(new ImageIcon("src/test/b.png"));
            JButton b4 = new JButton(new ImageIcon("src/test/b.png"));

            JPanel p1 = new JPanel();
            JPanel p2 = new JPanel();

            JPanel p4 = new JPanel();
            JPanel p5 = new JPanel();
            JPanel p6 = new JPanel();
            p3 = new JPanel();
		p7 = new JPanel();

		p8 = new JPanel();
		p9 = new JPanel();
		p10 = new JPanel();
		p11 = new JPanel();
		p12 = new JPanel();

		p13 = new JPanel();
		p14 = new JPanel();
		p15 = new JPanel();
		p16 = new JPanel();
		p17 = new JPanel();


            p1.setPreferredSize(new Dimension(700,50));

            p4.setPreferredSize(new Dimension(700,50));
            p5.setPreferredSize(new Dimension(700,50));
            p6.setPreferredSize(new Dimension(700,5));


            p7.setPreferredSize(new Dimension(700,15));
            p8.setPreferredSize(new Dimension(700,15));
            p9.setPreferredSize(new Dimension(700,15));
            p10.setPreferredSize(new Dimension(700,15));
            p11.setPreferredSize(new Dimension(700,15));
            p12.setPreferredSize(new Dimension(700,30));

            p13.setPreferredSize(new Dimension(700,80));
            p14.setPreferredSize(new Dimension(700,80));
            p15.setPreferredSize(new Dimension(700,80));
            p16.setPreferredSize(new Dimension(700,80));
            p17.setPreferredSize(new Dimension(700,80));



            GridLayout g = new GridLayout(0,10);
            GridLayout g2 = new GridLayout(6,7,1,1);
            g3 = new GridLayout(0,7,2,2);



            p7.setLayout(g3);
            p8.setLayout(g3);
            p9.setLayout(g3);

            p10.setLayout(g3);
            p11.setLayout(g3);


            p13.setLayout(g3);
            p14.setLayout(g3);
            p15.setLayout(g3);
            p16.setLayout(g3);
            p17.setLayout(g3);



            p2.setLayout(g2);





            p1.setLayout(null);

            b1.setBounds(10,10,80,40);
            p1.add(b1);

            b2.setBounds(100, 10, 80,40);
            p1.add(b2);

            b3.setBounds(190, 10, 80,40);
            p1.add(b3);

            b4.setBounds(280, 10, 80,40);
            p1.add(b4);

            gbc.fill = GridBagConstraints.BOTH;


            Icon c = new ImageIcon("src/test/1.png");
            JLabel j = new JLabel(c);


            Choice ch = new Choice();
            Choice ch1 = new Choice();
            Choice ch2 = new Choice();

            for(int i = 0 ; i < 12; i ++){

            	ch.add(i+1+"월");
            }

            for(int i = 0; i < 32; i++){
            	ch1.add(i+1+"일");
            }

            for(int i = 1950; i < 2030; i++){
            	ch2.add(i+1+"년");
            }


            ch2.select(year+"년");
            ch.select(month+"월");
            ch1.select(day+"일");

            p5.setLayout(null);

            ch.setSize(80,50);

            ch.setLocation(100,20);


            ch1.setSize(80,50);
            ch1.setLocation(190,20);

            ch2.setSize(70,50);
            ch2.setLocation(20,20);

            p5.add(ch);
            p5.add(ch1);
            p5.add(ch2);


            Font f=new Font("Sherif",Font.BOLD,18);

            JTextField jl = new JTextField(month+"월");
            JTextField j2 = new JTextField(year+"년");

            jl.setFont(f);
            j2.setFont(f);



            JButton select1 = new JButton("이전");
            JButton select2 = new JButton("다음");


            j2.setBounds(460, 20, 65, 30);
            jl.setBounds(540,20,40,30);

            select1.setBounds(380,20,60,30);
            select2.setBounds(600, 20, 60, 30);


            p5.add(jl);
            p5.add(j2);
            p5.add(select1);
            p5.add(select2);


            gridinit();


            addGrid(gbl, gbc, p6, 0, 0, 2, 1, 1, 0);
            addGrid(gbl, gbc, p1, 0, 1, 2, 1, 1, 0);
            addGrid(gbl, gbc, p5, 0, 2, 2, 1, 1, 0);

            addGrid(gbl, gbc, p3, 0, 3, 2, 1, 1, 0);
            addGrid(gbl, gbc, p7, 0, 4, 2, 1, 1, 0);
            addGrid(gbl, gbc, p13, 0, 5, 2, 1, 1, 0);

            addGrid(gbl, gbc, p8, 0, 6, 2,  1, 1, 0);
            addGrid(gbl, gbc, p14, 0, 7, 2, 1, 1, 0);

            addGrid(gbl, gbc, p9, 0, 8, 2, 1, 1, 0);
            addGrid(gbl, gbc, p15, 0,9, 2, 1, 1, 0);

            addGrid(gbl, gbc, p10, 0, 10, 2, 1, 1, 0);
            addGrid(gbl, gbc, p16, 0, 11, 2, 1, 1, 0);

            addGrid(gbl, gbc, p11, 0, 12, 2, 1, 1, 0);
            addGrid(gbl, gbc, p17, 0, 13, 2, 1, 1, 0);

            addGrid(gbl, gbc, j, 0, 14, 2, 1, 1, 0);

            pack();

            setSize(1085,850);
            setVisible(true);


            calset();

      }

      public void gridinit(){
    	  for(int i = 0; i < date.length; i ++){
    		  p3.add(date[i] = new JLabel(s[i]));
    		  p7.add(day1[i]);
    		  p13.add(field1[i]);
    		  p8.add(day2[i]);
    		  p14.add(field2[i]);
    		  p9.add(day3[i]);
    		  p15.add(field3[i]);
    		  p10.add(day4[i]);
    		  p16.add(field4[i]);
    		  p11.add(day5[i]);
    		  p17.add(field5[i]);

    	  }


    	  p3.setPreferredSize(new Dimension(700,30));
    	  p3.setLayout(g3);
      }

      public void calset(){
          cal.set(Calendar.YEAR,year);
          cal.set(Calendar.MONTH,(month-1));
          cal.set(Calendar.DATE,1);
          int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

          int j=0;
          int hopping=0;

		for (int i = 0; i < 7; i++) {
			if (i == 0) {
				date[i].setForeground(new Color(255, 0, 0));
				day1[i].setForeground(new Color(255, 0, 0));
				day2[i].setForeground(new Color(255, 0, 0));
				day3[i].setForeground(new Color(255, 0, 0));
				day4[i].setForeground(new Color(255, 0, 0));
				day5[i].setForeground(new Color(255, 0, 0));
			} else if (i == 6) {
				day1[i].setForeground(new Color(0, 0, 255));
				date[i].setForeground(new Color(0, 0, 255));
				day2[i].setForeground(new Color(0, 0, 255));
				day3[i].setForeground(new Color(0, 0, 255));
				day4[i].setForeground(new Color(0, 0, 255));
				day5[i].setForeground(new Color(0, 0, 255));
			}
		}

          /*
           * 일요일부터 그달의 첫시작 요일까지 빈칸으로 셋팅하기 위해
           */
          for(int i=cal.getFirstDayOfWeek();i<dayOfWeek;i++){  j++;  }
          // i = 1 , dayofweek = 4;
          hopping=j;  //hopping = 3;

          for(int kk=0;kk<hopping;kk++){
                 day1[kk].disable();
                 field1[kk].disable();

          }

          for(int i=cal.getMinimum(Calendar.DAY_OF_MONTH);
                         i<=cal.getMaximum(Calendar.DAY_OF_MONTH);i++){//i = 1
              		// i<=cal.getMaximum(Calendar.DAY_OF_MONTH)== 31

                	 cal.set(Calendar.DATE,i);

                	 if(cal.get(Calendar.MONTH) !=month-1){
                         break;
                  }


                  /*
                   * 요일을 찍은 다음부터 계산해야 하니 요일을 찍은 버튼의 갯수를 더하고
                   * 인덱스가 0부터 시작이니 -1을 해준 값으로 연산을 해주고
                   * 버튼의 색깔을 변경해준다.
                   */


			if (i + hopping < 8) {
				day1[i + hopping-1].setText(i+0 + "일");

			}
			else if(8 <= i + hopping & i + hopping < 15){

				day2[y].setText(i+0 + "일");
				y++;
				if(y==7){
					y=0;
				}

			}
			else if(15 <= i + hopping & i + hopping < 22){
				day3[y].setText((i) + "일");
				y++;
				if(y==7){
					y=0;
				}
			}
			else if(22 <= i + hopping & i + hopping < 29){
				day4[y].setText((i) + "일");
				y++;
				if(y==7){
					y=0;
				}
			}
			else if(29 <= i + hopping & i + hopping <= cal.getMaximum(Calendar.DAY_OF_MONTH)){

				day5[y].setText((i) + "일");
				y++;
				if(y==7){
					y=0;
				}
			}

           }//for

          }
    //end Calset()







      private void addGrid(GridBagLayout gbl, GridBagConstraints gbc, Component c,
                  int gridx, int gridy, int gridwidth, int gridheight, int weightx, int weighty) {
            gbc.gridx = gridx;
            gbc.gridy = gridy;
            gbc.gridwidth = gridwidth;
            gbc.gridheight = gridheight;
            gbc.weightx = weightx;
            gbc.weighty = weighty;

            gbl.setConstraints(c, gbc);
            add(c);
      }
}






