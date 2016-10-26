package com.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/*
 * 조건이 있는 select 질의 방식
 * 
 */
public class MongoCondition {

	public static void main(String[] args) {
		try {
			MongoClient	mongo = new MongoClient("localhost", 27017);
			DB db = mongo.getDB("test");
			DBCollection collection = db.getCollection("person");
			//	조건이 있는 질의 명령
			//	조건은 {} 의 방식으로 입력해야 하므로.....
			//	이것 역시 하나의 Document이다.
			//	결론
			// 조건은 BasicDBObject 클래스로 만들어서 제공하면 된다.
			// 우리는 나이가 30이상인 사람만 출력하도록 해보자.
		
			// 전체 조건
			BasicDBObject condition = new BasicDBObject();
			//크다 작다 조건을 위한 Document도 다시 필요하다.
			BasicDBObject	temp = new BasicDBObject();
			temp.append("$gt", 30);
			condition.append("age", temp);

			//	소트하기(특정 순서대로 출력하기)
			BasicDBObject	sort = new BasicDBObject();
			sort.append("age", 1);
			
			//	특정 필드만 나오게 하기
			//	나오기 원하는 필드를 지정할 Document를 만든다.
			BasicDBObject	field = new BasicDBObject();
			field.append("name", 1);
			
			DBCursor	coursor = collection.find(condition, field).sort(sort).skip(1).limit(2);
//			DBCursor coursor = collection.find(condition);
			while(coursor.hasNext()) {
				BasicDBObject next = (BasicDBObject)coursor.next();
//				String name = (String) next.get("name");
//				int	age = (int) next.get("age");
//				System.out.println(name + "   " + age);
				System.out.println(next);
			}
			coursor.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
