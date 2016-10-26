package com.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/*
 * 문제
 *  나이가 30세 이상인 사람의 나이를 1씩 증가시키는
 *  프로그램을 작성하세요
 */
public class MongoUpdate {

	public static void main(String[] args) {
		try {
			// MongoDB 서버에 접속한다.
			MongoClient mongo = new MongoClient("localhost", 27017);
			// 사용할 데이터베이스를 선택하낟.
			DB db = mongo.getDB("test");
			// 처리할 테이블(컬렉션)을 선택한다.
			DBCollection col = db.getCollection("person");
			
			DBCursor cursor =  col.find();
			while(cursor.hasNext()){
				System.out.println(cursor.next());
			}
			
			// 문제에 의해서
			// 1. 조건 Document를 만들어야 한다.
			BasicDBObject condition = new BasicDBObject();
			BasicDBObject temp1 = new BasicDBObject();
			// {age : {$gt : 30}}
			temp1.append("$gt", 30);
			condition.append("age", temp1);
			// 2. 업데이트 내용 Document를 만들어야 한다.
			BasicDBObject update = new BasicDBObject();
			BasicDBObject temp2 = new BasicDBObject();
			temp2.append("age", 1);
			update.append("$inc", temp2);
			
			col.update(condition, update, true, true);
			
			cursor = col.find();
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
