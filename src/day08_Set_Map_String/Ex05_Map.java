package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05_Map {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//�Է¹��� Scanner ����
		HashMap map = new HashMap();
		//Key�� Value�� �Է¹��� ���� ����
		String key = null, value=null;
		//���ڿ� Key,Value ���� ������ Null�� ���� ����
		System.out.println("������ Ű �Է�");
		key = input.next();
		//Key�� �Է¹ޱ�
		System.out.println("������ �� �Է�");
		value = input.next();
		//Value�� �Է¹ޱ�
		
		map.put(key, value);
		//HashMap�� key,value����ֱ�
		
		System.out.println(map);
		//map���
	}
}
