package ACH.java.semi;

import java.awt.Color;

import javax.swing.border.*;

public class BorderSet {

	LineBorder lineb = new LineBorder(Color.BLACK,3);
	EtchedBorder etchb = new EtchedBorder(EtchedBorder.RAISED);
	EmptyBorder empb = new EmptyBorder(1,1,1,1);
	
	TitledBorder border1 = new TitledBorder(etchb, "<��� ��Ȳ>", TitledBorder.DEFAULT_JUSTIFICATION, 
			TitledBorder.DEFAULT_POSITION);
	TitledBorder border2 = new TitledBorder(etchb, "<���� ����>", TitledBorder.DEFAULT_JUSTIFICATION, 
			TitledBorder.DEFAULT_POSITION);
	TitledBorder border3 = new TitledBorder(etchb, "2016-6-14(ȭ)", TitledBorder.DEFAULT_JUSTIFICATION, 
			TitledBorder.DEFAULT_POSITION);
	TitledBorder border4 = new TitledBorder(etchb, "<CCTV>", TitledBorder.DEFAULT_JUSTIFICATION, 
			TitledBorder.DEFAULT_POSITION);
	TitledBorder border5 = new TitledBorder(etchb, "<���� ���� ��Ȳ>", TitledBorder.DEFAULT_JUSTIFICATION, 
			TitledBorder.DEFAULT_POSITION);
	TitledBorder border6 = new TitledBorder(empb, "<���� ���>", TitledBorder.DEFAULT_JUSTIFICATION, 
			TitledBorder.DEFAULT_POSITION);
	
	public BorderSet() {}
}