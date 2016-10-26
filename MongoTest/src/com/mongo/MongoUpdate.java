package com.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/*
 * ����
 *  ���̰� 30�� �̻��� ����� ���̸� 1�� ������Ű��
 *  ���α׷��� �ۼ��ϼ���
 */
public class MongoUpdate {

	public static void main(String[] args) {
		try {
			// MongoDB ������ �����Ѵ�.
			MongoClient mongo = new MongoClient("localhost", 27017);
			// ����� �����ͺ��̽��� �����ϳ�.
			DB db = mongo.getDB("test");
			// ó���� ���̺�(�÷���)�� �����Ѵ�.
			DBCollection col = db.getCollection("person");
			
			DBCursor cursor =  col.find();
			while(cursor.hasNext()){
				System.out.println(cursor.next());
			}
			
			// ������ ���ؼ�
			// 1. ���� Document�� ������ �Ѵ�.
			BasicDBObject condition = new BasicDBObject();
			BasicDBObject temp1 = new BasicDBObject();
			// {age : {$gt : 30}}
			temp1.append("$gt", 30);
			condition.append("age", temp1);
			// 2. ������Ʈ ���� Document�� ������ �Ѵ�.
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