package com.iedu.data;

import java.text.SimpleDateFormat;

import com.iedu.util.StringUtil;

import java.sql.Date;

public class ReBoardData {
	// 변수는 public으로 만들어도 무방
	// 하지만 자바는 물문율
	// 변수는 숨기고 그 변수를 사용할 수 있는 함수를 제공해서 처리
	// => 은닉화
	private String writer;
	private String title;
	private String body;
	private int no;
	private Date date;
	private int hit;
	private int good;

	public int getGood() {
		return good;
	}

	public void setGood(int good) {
		this.good = good;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
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

	public void setBody(String body) {
		this.body = body;
	}

	public String getYydate() {
		String result = StringUtil.dateForm(date);
		return result;
	}

	// 만약 제목이 길어서 테이블이 망가질 위험이 있으면...
	// 제목이 특정 글자수를 넘어가면 ...을 붙여서 출력하고 싶다.
	public String getSplittitle() {
		String result = StringUtil.splitString(title, 10);
		return result;
	}
	
	public String getBrbody(){
		String result = StringUtil.changeBR(body);
		return result;
	}
	
	/*
	 * JSTL은 데이터 빈 클래스를 출력할 수 있다.
	 * 방법 ${변수이름.get함수이름}
	 * 
	 * 그러므로 get함수를 만들어서 필요한 조작을 해놓으면
	 * 조작된 결과를 그대로 출력할 수 있다.
	 */

	// 이 변수에 데이터를 입력할 수 있는 함수와 데이터를 가지고 set함수
	// 갈 수 있는 함수를 따로 만들어서 처리하자. get함수

}
