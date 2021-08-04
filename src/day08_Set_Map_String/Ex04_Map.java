package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex04_Map {
	public static void main(String[] args) {
		/*
		 Map
		 - HashMap
		 - TreeMap
		 - HashTable...���
		 HashMap
		 - Ű�� ���� ���̴�
		 - ������ �������� �ʴ´�
		 - Ű�� ���� �ߺ��� ������� �ʴ´�
		 */
		//HashMap map = new HashMap();
		LinkedHashMap map = new LinkedHashMap();
		//LinkedHashMap ������� ����ϰ� ���ش�
		map.put("��ǳ��", "1000����");
		map.put("�ڵ���", "10����");
		map.put("������", "30����");
		
		System.out.println(map);
		
		System.out.println(map.get("��ǳ��"));
		System.out.println(map.get("�ڵ���"));
		System.out.println(map.get("������"));
		System.out.println(map.get("����Ű"));
		//�ش� Key�� Value�� ���� ������ Null
		System.out.println(map.containsKey("������"));
		System.out.println(map.containsKey("������111"));
		//�ش��ϴ� Key ���� ����
		System.out.println(map.containsValue("30����"));
		System.out.println(map.containsValue("31����"));
		//�ش��ϴ� Value�� ���� ����
		
		System.out.println(map.remove("������"));
		//remove�� �ش� key����
		System.out.println(map.containsKey("������"));
		//Ȯ��
		System.out.println(map);
		//��ü ���뿡�� Ȯ��
		
		System.out.println(map.keySet());
		System.out.println(map.keySet());
		System.out.println(map.keySet());
		System.out.println(map.keySet());
		System.out.println(map.keySet());
		
		//Set s = map.keySet();
		//Set���� ��ȯ
		//Iterator it = s.iterator();
		//Iterator ����Ͽ� �������
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key + " : " + map.get(key));
		}
	}
}
