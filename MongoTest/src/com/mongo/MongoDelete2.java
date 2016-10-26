package com.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/*
 * ���̰� 0�� ����� ��� �����϶�.
 */
public class MongoDelete2 {

	public static void main(String[] args) {
		try {
			// MongoDB ������ �����Ѵ�.
			MongoClient mongo = new MongoClient("localhost", 27017);
			// ����� �����ͺ��̽��� �����ϳ�.
			DB db = mongo.getDB("test");
			// ó���� ���̺�(�÷���)�� �����Ѵ�.
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