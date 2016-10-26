package com.mongo;

import java.util.Date;
import java.util.LinkedList;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/*
 * 몽고DB 안에 적당한 내용을 입력하는 프로그램
 */
public class MongoInsert {
	static String array_names[] = {"John","Tim","Brit","Robin","Smith","Lora","Jennifer","Lyla","Victor","Adam"};
	static String array_address[][] ={ {"US", "FL", " Miami"},
											 {"US", "FL", " Orlando"},
											 {"US", "CA", "San Diego"},
											 {"US", "FL", " Orlando"},
											 {"US", "FL", " Orlando"},
											 {"US", "NY", "New York"},
											 {"US", "NY", "Buffalo"},
											 {"US", "TX", " Houston"},
											 {"US", "CA", "San Diego"},
											 {"US", "TX", " Houston"}};
	
	public static void main(String[] args) {
		try {
			// 1. 몽고 DB서버에 접속을 시도한다.
			// 접속한 클라이언트를 관리하는 클래스(Connection에 해당)
			// MongoClient
			// 방법 생성자 함수를 이용해서 접속을 시도한다.
			MongoClient mongo = new MongoClient("localhost", 27017);
			// 2. 사용해야하는 데이터베이스를 받아온다.
			// 쉘로 접속을 하면 자동적으로 test DB를 제공하므로
			// 자바에서  접속을 하면 무슨 데이터베이스르 사용할지 알지 못한다.
			// 데이터베이스를 관리하는 클래스 DB
			// 데이터베이스를 알아내는 함수 getDB()
			DB db = mongo.getDB("test");
			// 3. 사용할 테이블(컬렉션)을 지정한다
			// 컬렉션을 관리하는 클래스 DBCollection
			// 테이블을 지정하는 함수 getCollection()
			DBCollection collection = db.getCollection("person");
			// == 모든 작업의 기본작업이 된다. ==
			// Insert를 시키는 경우에는
			// Insert 시킬 내용을 만들어주어야 한다.
			// Insert 시킬 한줄의 내용을 우리는 Document라고 표현한다.
			// 한줄의 내용을 만들기 위해서 제공하는 클래스이름
			// BasicDBObject 라는 클래스
			BasicDBObject document;
			String[] address; // 주소를 입력할때 사용할 변수
			for (int i = 0; i < array_names.length; i++) {
				// Document를 한줄의 데이터를 생성할 준비
				document = new BasicDBObject();
				// 이곳에 필요한 정보를 입력한다.
				// 입력하는 함수 append()
				// 당연히 MongoDB 특성상 데이터는 필드이름, 데이터가 한쌍이 되어야 한다.
				document.append("name", array_names[i]);
				document.append("age", (int) (Math.random() * 60));
				document.append("join", new Date());
				// 친구 목록을 넣고 싶다
				String[] friends = pickFriends();
				// 친구 목록을 {friend:["홍길동", "박아지", "장독대"]}
				// 이처럼 배열 형태로 데이터를 입력하고자 하면
				// 자바에서는 입력할 데이터를 배열로 만들어서 제공하면 된다.
				document.append("friends", friends);
				// 주소를 입력하고자 한다.
				// {adress : {country: "한국", state: "경기도", city: "고양시"}}
				// 이처럼 Map안에 다시 Map형태로 넣고자 한다.
				// Map안에 들어갈 다른Map을 다시 하나의 문서로 만들어야 한다.
				address = pickAddress();
				// 이 안에는 3개의 배열이 되어 있다.
				// 이것을 Map형태로 만들어야 한다.
				BasicDBObject temp = new BasicDBObject();
				
				temp.append("country", address[0]);
				temp.append("state", address[1]);
				temp.append("city", address[2]);
				document.append("address", temp);
				// 한주르이 문서 준비가 끝났으면 몽고디비에 입력하면된다.
				// 입력함수 insert()
				collection.insert(document);
			} 
//			10개가 입력되면 입력을 확인하다.
			System.out .println("친구 수 = " + collection.count());
		} catch (Exception e) {
			
		}
	}
	

	// 데이터베이스에 친구 목록을 등록할 예정이다.
	private static String[] pickFriends(){
		// 랜덤하게 친구 숫자를 선택한다.
		int numberOfFriends = (int) (Math.random()* 10);
		LinkedList<String> friends = new LinkedList<String>();
		int random = 0;
		// 그 숫자만큼 반복하면서 친구 이름을 랜덤하게 알아낸다.
		while(friends.size() < numberOfFriends){
			random = (int) (Math.random()*10);
			if(!friends.contains(array_names[random]))
				friends.add(array_names[random]);
		}
		// 배열로 변환해서 반환한다.
		String a[] = {};
		return  friends.toArray(a);
	}
	// 랜덤하게 주소를 선태갷주는 함수
	private static String[] pickAddress(){
		int random = (int) (Math.random()*10);
		return array_address[random];
	}
}
