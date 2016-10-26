package com.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/*
 * 나이가 0인 사람을 모두 삭제하라.
 */
public class MongoDelete2 {

	public static void main(String[] args) {
		try {
			// MongoDB 서버에 접속한다.
			MongoClient mongo = new MongoClient("localhost", 27017);
			// 사용할 데이터베이스를 선택하낟.
			DB db = mongo.getDB("test");
			// 처리할 테이블(컬렉션)을 선택한다.
			DBCollection col = db.getCollection("person");
			DBCursor cursor =  col.find();
			
			BasicDBObject condition = new BasicDBObject(); 
			condition.append("age", 0);
			
			col.remove(condition);
			
			cursor = col.find();
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
