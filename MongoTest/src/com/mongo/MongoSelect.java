package com.mongo;

import java.util.Date;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/*
 * ����DB Select���
 */
public class MongoSelect {
	public static void  main(String[] args) {
		try {
			// �⺻ 3�ܰ� ó��
			MongoClient mongo = new MongoClient("localhost", 27017);
			DB db = mongo.getDB("test");
			DBCollection collection = db.getCollection("person");
			// �⺻���� db.person.find()
			// select ���Ǹ� ���ִ� �Լ� find()
			// select ���Ǵ� ������� ����� �ȴ�.
			// �� ������� �����ϴ� Ŭ���� DBCursor
			DBCursor cursor = collection.find();
			// �� DBCursor Ŭ������ Iterator�� ���
			// �� ������ �����͸� ������� ������ ����ؾ� �Ѵ�.
			while(cursor.hasNext()) {
//				System.out.println(cursor.next());
				// ������ �����ʹ� DBObjcet��� Ŭ������ �����Ѵ�.
				// �ֳ��ϸ� ������ �����͸� �θ��� ���� Docuement �̹Ƿ�....
				BasicDBObject document = (BasicDBObject) cursor.next();
				// ���߿��� �ʿ��� �����͸� ��󳻴� �Լ�
				// get
				String name = (String)document.get("name");
				int	age = (int) document.get("age");
				Date date = (Date) document.get("join");
				System.out.println("����� ��� �̸� = " + name);
				System.out.println("����� ��� ���� = " + age);
				System.out.println("����� ��� ������ = " + date);
				// ���� �Էµ� �����Ͱ� �迭�̸�....
				// �迭 ���·� ������ ����ϸ� �ȴ�.
				BasicDBList friends = (BasicDBList) document.get("friends");
				for(int i = 0; i < friends.size(); i++) {
					System.out.println("\t\tģ�� ��� = " + friends.get(i));
				}
				
				// �Է��� �����Ͱ� Map�̸�(�츮�� �ּҸ� Map ���·� �Է�)
				// BasicDBObject�� ������ �ȴ�.
				BasicDBObject address = (BasicDBObject) document.get("address");
				String	country = (String)address.get("country");
				String	state = (String)address.get("state");
				String	city = (String)address.get("city");
				System.out.println("\t\t\t�ּ� = " + country + " " + state + " " + city);
			}
			cursor.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}