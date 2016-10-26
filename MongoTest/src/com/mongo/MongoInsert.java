package com.mongo;

import java.util.Date;
import java.util.LinkedList;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/*
 * ����DB �ȿ� ������ ������ �Է��ϴ� ���α׷�
 */
public class MongoInsert {
	static String array_names[] = {"John","Tim","Brit","Robin","Smith","Lora","Jennifer","Lyla","Victor","Adam"};
	static String array_address[][] ={ {"US", "FL", " Miami"},
											 {"US", "FL", " Orlando"},
											 {"US", "CA", "San Diego"},
											 {"US", "FL", " Orlando"},
											 {"US", "FL", " Orlando"},
											 {"US", "NY", "New York"},
											 {"US", "NY", "Buffalo"},
											 {"US", "TX", " Houston"},
											 {"US", "CA", "San Diego"},
											 {"US", "TX", " Houston"}};
	
	public static void main(String[] args) {
		try {
			// 1. ���� DB������ ������ �õ��Ѵ�.
			// ������ Ŭ���̾�Ʈ�� �����ϴ� Ŭ����(Connection�� �ش�)
			// MongoClient
			// ��� ������ �Լ��� �̿��ؼ� ������ �õ��Ѵ�.
			MongoClient mongo = new MongoClient("localhost", 27017);
			// 2. ����ؾ��ϴ� �����ͺ��̽��� �޾ƿ´�.
			// ���� ������ �ϸ� �ڵ������� test DB�� �����ϹǷ�
			// �ڹٿ���  ������ �ϸ� ���� �����ͺ��̽��� ������� ���� ���Ѵ�.
			// �����ͺ��̽��� �����ϴ� Ŭ���� DB
			// �����ͺ��̽��� �˾Ƴ��� �Լ� getDB()
			DB db = mongo.getDB("test");
			// 3. ����� ���̺�(�÷���)�� �����Ѵ�
			// �÷����� �����ϴ� Ŭ���� DBCollection
			// ���̺��� �����ϴ� �Լ� getCollection()
			DBCollection collection = db.getCollection("person");
			// == ��� �۾��� �⺻�۾��� �ȴ�. ==
			// Insert�� ��Ű�� ��쿡��
			// Insert ��ų ������ ������־�� �Ѵ�.
			// Insert ��ų ������ ������ �츮�� Document��� ǥ���Ѵ�.
			// ������ ������ ����� ���ؼ� �����ϴ� Ŭ�����̸�
			// BasicDBObject ��� Ŭ����
			BasicDBObject document;
			String[] address; // �ּҸ� �Է��Ҷ� ����� ����
			for (int i = 0; i < array_names.length; i++) {
				// Document�� ������ �����͸� ������ �غ�
				document = new BasicDBObject();
				// �̰��� �ʿ��� ������ �Է��Ѵ�.
				// �Է��ϴ� �Լ� append()
				// �翬�� MongoDB Ư���� �����ʹ� �ʵ��̸�, �����Ͱ� �ѽ��� �Ǿ�� �Ѵ�.
				document.append("name", array_names[i]);
				document.append("age", (int) (Math.random() * 60));
				document.append("join", new Date());
				// ģ�� ����� �ְ� �ʹ�
				String[] friends = pickFriends();
				// ģ�� ����� {friend:["ȫ�浿", "�ھ���", "�嵶��"]}
				// ��ó�� �迭 ���·� �����͸� �Է��ϰ��� �ϸ�
				// �ڹٿ����� �Է��� �����͸� �迭�� ���� �����ϸ� �ȴ�.
				document.append("friends", friends);
				// �ּҸ� �Է��ϰ��� �Ѵ�.
				// {adress : {country: "�ѱ�", state: "��⵵", city: "�����"}}
				// ��ó�� Map�ȿ� �ٽ� Map���·� �ְ��� �Ѵ�.
				// Map�ȿ� �� �ٸ�Map�� �ٽ� �ϳ��� ������ ������ �Ѵ�.
				address = pickAddress();
				// �� �ȿ��� 3���� �迭�� �Ǿ� �ִ�.
				// �̰��� Map���·� ������ �Ѵ�.
				BasicDBObject temp = new BasicDBObject();
				
				temp.append("country", address[0]);
				temp.append("state", address[1]);
				temp.append("city", address[2]);
				document.append("address", temp);
				// ���ָ��� ���� �غ� �������� ������� �Է��ϸ�ȴ�.
				// �Է��Լ� insert()
				collection.insert(document);
			} 
//			10���� �ԷµǸ� �Է��� Ȯ���ϴ�.
			System.out .println("ģ�� �� = " + collection.count());
		} catch (Exception e) {
			
		}
	}
	

	// �����ͺ��̽��� ģ�� ����� ����� �����̴�.
	private static String[] pickFriends(){
		// �����ϰ� ģ�� ���ڸ� �����Ѵ�.
		int numberOfFriends = (int) (Math.random()* 10);
		LinkedList<String> friends = new LinkedList<String>();
		int random = 0;
		// �� ���ڸ�ŭ �ݺ��ϸ鼭 ģ�� �̸��� �����ϰ� �˾Ƴ���.
		while(friends.size() < numberOfFriends){
			random = (int) (Math.random()*10);
			if(!friends.contains(array_names[random]))
				friends.add(array_names[random]);
		}
		// �迭�� ��ȯ�ؼ� ��ȯ�Ѵ�.
		String a[] = {};
		return  friends.toArray(a);
	}
	// �����ϰ� �ּҸ� ���c�ִ� �Լ�
	private static String[] pickAddress(){
		int random = (int) (Math.random()*10);
		return array_address[random];
	}
}