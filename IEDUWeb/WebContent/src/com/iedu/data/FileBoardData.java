package com.iedu.data;

import java.sql.Date;

import com.iedu.util.StringUtil;

public class FileBoardData {
	private int no;
	private String id;
	private String title;
	private String body;
	private Date date;
	private String saveName;
	private String oriName;
	private String path;
	private long length;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getSaveName() {
		return saveName;
	}

	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}

	public String getOriName() {
		return oriName;
	}

	public void setOriName(String oriName) {
		this.oriName = oriName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}
	
	public String getBrbody(){
		String result = StringUtil.changeBR(body);
		return result;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
