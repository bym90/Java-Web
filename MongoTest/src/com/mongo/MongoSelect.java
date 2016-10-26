package com.mongo;

import java.util.Date;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/*
 * 몽고DB Select기능
 */
public class MongoSelect {
	public static void  main(String[] args) {
		try {
			// 기본 3단계 처리
			MongoClient mongo = new MongoClient("localhost", 27017);
			DB db = mongo.getDB("test");
			DBCollection collection = db.getCollection("person");
			// 기본질의 db.person.find()
			// select 질의를 해주는 함수 find()
			// select 질의는 결과물이 생기게 된다.
			// 이 결과물을 관리하는 클래스 DBCursor
			DBCursor cursor = collection.find();
			// 이 DBCursor 클래스는 Iterator와 비슷
			// 즉 한줄의 데이터를 순서대로 꺼내서 사용해야 한다.
			while(cursor.hasNext()) {
//				System.out.println(cursor.next());
				// 한줄의 데이터는 DBObjcet라는 클래스로 관리한다.
				// 왜냐하면 한줄의 데이터를 부르는 말이 Docuement 이므러....
				BasicDBObject document = (BasicDBObject) cursor.next();
				// 이중에서 필요한 데이터만 골라내는 함수
				// get
				String name = (String)document.get("name");
				int	age = (int) document.get("age");
				Date date = (Date) document.get("join");
				System.out.println("등록한 목록 이름 = " + name);
				System.out.println("등록한 목록 나이 = " + age);
				System.out.println("등록한 목록 만난날 = " + date);
				// 만약 입력된 데이터가 배열이면....
				// 배열 형태로 꺼내서 사용하면 된다.
				BasicDBList friends = (BasicDBList) document.get("friends");
				for(int i = 0; i < friends.size(); i++) {
					System.out.println("\t\t친구 목록 = " + friends.get(i));
				}
				
				// 입력한 데이터가 Map이면(우리는 주소를 Map 형태로 입력)
				// BasicDBObject로 꺼내면 된다.
				BasicDBObject address = (BasicDBObject) document.get("address");
				String	country = (String)address.get("country");
				String	state = (String)address.get("state");
				String	city = (String)address.get("city");
				System.out.println("\t\t\t주소 = " + country + " " + state + " " + city);
			}
			cursor.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
