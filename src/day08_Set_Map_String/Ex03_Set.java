package day08_Set_Map_String;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Set {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("��");
		set.add("��");
		set.add("��");
		System.out.println("set : " + set);
		//HashSet�� ������ �ٸ��� ��µȴ�
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			//Object o = it.next();
			//Object�� ���� ����
			//String s = (String)o;
			//�״��� String���� ����ȯ�� �ؾ��Ѵ�
			String s = (String)it.next();
			System.out.println(s);
		}
		//Iterator�� ����Ͽ� ������� �ٲ���� �Ѵ�
	}
}
