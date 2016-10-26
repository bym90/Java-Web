package com.iedu.sql;

public class FileBoardSQL {
	public static final int GET_MAXNO = 1101;
	public static final int INSERT_BOARD = 2101;
	public static final int INSERT_FILEINFO = 2102;
	public static final int GET_BOARDLIST = 1201;
	public static final int GET_BOARDVIEW = 1301;
	public static final int GET_FILELIST = 1302;
	public static final int GET_FILEINFO = 1401;

	public static String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch (code) {
		case GET_MAXNO:
			buff.append("SELECT ");
			buff.append("	NVL(MAX(fb_NO), 0 ) + 1 AS MAXNO ");
			buff.append("FROM ");
			buff.append("	 FileBoard ");
			break;
		case INSERT_BOARD:
			buff.append("INSERT ");
			buff.append("INTO ");
			buff.append("	FileBoard ");
			buff.append("VALUES (?,?,?,?,SYSDATE) ");
			break;
		case INSERT_FILEINFO:
			buff.append("INSERT ");
			buff.append("INTO ");
			buff.append("	BoardFile ");
			buff.append("VALUES ");
			buff.append("	((SELECT NVL(MAX(bf_NO), 0) + 1 FROM BoardFile),?,?,?,?,?) ");
			break;
		case GET_BOARDLIST:
			buff.append("SELECT ");
			buff.append("	fb_NO AS NO, ");
			buff.append("	fb_Writer AS WRITER, ");
			buff.append("	fb_Title AS TITLE, ");
			buff.append("	fb_Date AS WDAY ");
			buff.append("FROM ");
			buff.append("	FileBoard ");
			break;
		case GET_BOARDVIEW:
			buff.append("SELECT ");
			buff.append("	fb_NO AS NO, ");
			buff.append("	fb_Writer AS WRITER, ");
			buff.append("	fb_Title AS TITLE, ");
			buff.append("	fb_Date AS WDAY, ");
			buff.append("	fb_Body AS BODY ");
			buff.append("FROM ");
			buff.append("	FileBoard ");
			buff.append("WHERE ");
			buff.append("	fb_NO = ? ");
			break;
		case GET_FILELIST:
			buff.append("SELECT ");
			buff.append("	bf_NO AS NO, ");
			buff.append("	bf_SaveName AS SNAME, ");
			buff.append("	bf_OriName AS ONAME, ");
			buff.append("	bf_Path AS PATH, ");
			buff.append("	bf_Length AS LEN ");
			buff.append("FROM ");
			buff.append("	BoardFile ");
			buff.append("WHERE ");
			buff.append("	fb_NO = ? ");
			break;
		case GET_FILEINFO:
			buff.append("SELECT ");
			buff.append("	bf_NO AS NO, ");
			buff.append("	bf_SaveName AS SNAME, ");
			buff.append("	bf_OriName AS ONAME, ");
			buff.append("	bf_Path AS PATH, ");
			buff.append("	bf_Length AS LEN ");
			buff.append("FROM ");
			buff.append("	BoardFile ");
			buff.append("WHERE ");
			buff.append("	bf_NO = ? ");
			break;
		}
		return buff.toString();
	}
}
