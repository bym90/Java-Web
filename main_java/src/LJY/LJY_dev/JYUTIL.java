//package LJY.LJY_dev;
//
//public class JYUTIL {
//	public static String priceToComma(long var){
//		return priceToComma(toString(var));
//	}
//	public static String priceToComma(double var){
//		return priceToComma(toString(var));
//	}
//	public static String priceToComma(int var){
//		return priceToComma(toString(var));
//	}
//	public static String priceToSign(String var){
//		return (JavaUtil.toInt(var)>=0?"+":"")+JavaUtil.priceToComma(var);
//	}
//	public static String priceToComma(String price){
//		String str=price.trim();
//		boolean containsMinus=false;
//		if(empty(str)) return "0";
//		if(str.indexOf(".")!=-1){
//			str=str.substring(0,str.indexOf("."));
//		}
//		if(empty(str)) return "0";
//		if(str.indexOf("-")==0){
//			containsMinus=true;
//			str=str.substring(1);
//		}
//		int len=str.length();
//		StringBuffer sbuf=new StringBuffer();
//		for(int i=0;i<len;i++){
//			if(i!=0&&i%3==0) sbuf.append(",");
//			sbuf.append(str.charAt((len-1)-i));
//		}
//		if(containsMinus) sbuf.append("-");
//		return sbuf.reverse().toString();
//
//
///**
// * pricce To Comma method!
// *
// * kkkkkkkkkkkkkkkkkkkkk
// *
// * @param s
// * @return
// */
//
//		public static int toInt(String s){
//			try{
//				if(s==null) 	s= "0";
//				return Integer.parseInt(s);
//			}catch(Exception e){
//				return -1;
//			}
//		}
//		public static int toInt(Long s){
//			return Integer.parseInt(JavaUtil.toString(Math.round(s)));
//		}
//		public static int toInt(Double s){
//			return Integer.parseInt(JavaUtil.toString(Math.round(s)));
//		}
//		public static int toInt(Object s){
//			if(s==null) 	s= "0";
//			return toInt(s.toString());
//		}
//		public static int toInt(Object s,int def){
//			if(s==null) 	s= def;
//			return toInt(s.toString());
//		}
///**
// * toInt
// */
//}
