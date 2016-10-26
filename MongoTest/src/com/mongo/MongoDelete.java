package com.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/*
 * ����
 *  �̸��� Tim�� ��� �߿��� ���� ù��° ����� �����϶�
 */
public class MongoDelete {

	public static void main(String[] args) {
		try {
			// MongoDB ������ �����Ѵ�.
			MongoClient mongo = new MongoClient("localhost", 27017);
			// ����� �����ͺ��̽��� �����ϳ�.
			DB db = mongo.getDB("test");
			// ó���� ���̺�(�÷���)�� �����Ѵ�.
			DBCollection col = db.getCollection("person");
			DBCursor cursor =  col.find();
			
			// 1. ������ �׸��� �˾Ƴ���.
			// {name : "Tim"}
			BasicDBObject condition = new BasicDBObject(); 
			condition.append("name", "Tim");
			
			DBObject doc = col.findOne(condition);
			// 2. �� �׸��� �����Ѵ�.
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