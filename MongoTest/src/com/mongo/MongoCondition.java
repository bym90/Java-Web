package com.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/*
 * ������ �ִ� select ���� ���
 * 
 */
public class MongoCondition {

	public static void main(String[] args) {
		try {
			MongoClient	mongo = new MongoClient("localhost", 27017);
			DB db = mongo.getDB("test");
			DBCollection collection = db.getCollection("person");
			//	������ �ִ� ���� ����
			//	������ {} �� ������� �Է��ؾ� �ϹǷ�.....
			//	�̰� ���� �ϳ��� Document�̴�.
			//	���
			// ������ BasicDBObject Ŭ������ ���� �����ϸ� �ȴ�.
			// �츮�� ���̰� 30�̻��� ����� ����ϵ��� �غ���.
		
			// ��ü ����
			BasicDBObject condition = new BasicDBObject();
			//ũ�� �۴� ������ ���� Document�� �ٽ� �ʿ��ϴ�.
			BasicDBObject	temp = new BasicDBObject();
			temp.append("$gt", 30);
			condition.append("age", temp);

			//	��Ʈ�ϱ�(Ư�� ������� ����ϱ�)
			BasicDBObject	sort = new BasicDBObject();
			sort.append("age", 1);
			
			//	Ư�� �ʵ常 ������ �ϱ�
			//	������ ���ϴ� �ʵ带 ������ Document�� �����.
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