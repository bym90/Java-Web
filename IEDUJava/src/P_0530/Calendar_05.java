package P_0530;

import java.util.*;
public class Calendar_05 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage : java CalendarEx6 2015 9");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year, month - 1, 1);
		eDay.set(year, month, 1);             // 7/1
		eDay.add(Calendar.DATE, -1);          // 6/31
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("         " + args[0] + "³â " + args[1] + "¿ù");
		System.out.println("  SU  MO  TU  WE  TH  FR  SA");
		
		for (int i = 0; i < START_DAY_OF_WEEK; i++) {
			System.out.print("   ");
		}

		for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i<10) ? "   "+i : "  "+i);
			if(n%7==0) System.out.println();
		}
		
	}

}
