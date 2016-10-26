package P_0601;

import java.util.*;
public class TreeSet_04 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new Test00("��", 1, 3));
		set.add(new Test00("��", 2, 13));
		set.add(new Test00("��", 1, 5));
		set.add(new Test00("��", 2, 13));
		set.add(new Test00("��", 1, 5));
		set.add(new Test00("��", 1, 10));
		set.add(new Test00("��", 3, 5));
		set.add(new Test00("��", 3, 16));
		set.add(new Test00("��", 3, 3));
		set.add(new Test00("��", 1, 5));
	
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			Test00 temp = (Test00) iter.next();
			System.out.println(temp.ban + "�� : " + temp.no + "�� : " + temp.name);
		}

	}

}

class Test00 implements Comparable{
	String name;
	int ban;
	int no;
	Test00(){
		
	}
	Test00(String na, int b, int n){
		name = na;
		ban = b;
		no = n;
	}
	@Override
	public int compareTo(Object o){
		Test00 temp = (Test00) o;
		int diff = this.ban - temp.ban;
		if (diff == 0) {
			diff = this.no - temp.no;
			if(diff == 0){
				diff = this.name.compareTo(temp.name);
				return diff;
			}
			return diff;
		}
		return diff;
		
	}
	

	
}