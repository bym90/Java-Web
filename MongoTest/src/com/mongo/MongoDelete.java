package com.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/*
 * 문제
 *  이름이 Tim인 사람 중에서 가장 첫번째 사람을 삭제하라
 */
public class MongoDelete {

	public static void main(String[] args) {
		try {
			// MongoDB 서버에 접속한다.
			MongoClient mongo = new MongoClient("localhost", 27017);
			// 사용할 데이터베이스를 선택하낟.
			DB db = mongo.getDB("test");
			// 처리할 테이블(컬렉션)을 선택한다.
			DBCollection col = db.getCollection("person");
			DBCursor cursor =  col.find();
			
			// 1. 삭제할 항목을 알아낸다.
			// {name : "Tim"}
			BasicDBObject condition = new BasicDBObject(); 
			condition.append("name", "Tim");
			
			DBObject doc = col.findOne(condition);
			// 2. 그 항목을 삭제한다.
			col.remove(doc);
			
			cursor = col.find();
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
