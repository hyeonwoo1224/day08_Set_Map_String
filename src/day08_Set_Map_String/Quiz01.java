package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//�Է¹��� input ����
		HashMap map = new HashMap();
		//key�� value�� �Է¹��� HashMap ����
		String name = null;
		//key�� �Է¹��� String name�� null�� �ʱ�ȭ
		String price = null;
		//value�� �Է¹��� String name�� null�� �ʱ�ȭ
		int num=0;
		//���� ������ �Է¹��� int num�� 0���� �ʱ�ȭ
		while(true) {
			System.out.println("1.�޴� ���");
			System.out.println("2.�޴��� ���� ����");
			System.out.println("3.�� ��");
			System.out.print(">>> ");
			num = input.nextInt();
			if(num == 1) {
				System.out.print("�޴� �Է� : ");
				name = input.next();
				//�޴��� name�� ��´�
				if(map.containsKey(name)==false) {
				//map�� containsKey�� name�� ������ ã����
				//�����̸� ������������ true�� ������ �ߺ�����
				//else�� �����ϴ� �޴���� ���
				System.out.print("���� �Է� : ");
				price = input.next();
				//���� ������ price�� value�� �Է�
				map.put(name, price);
				//.put���� key�� value�� name�� price�� �Է�
				System.out.println("��� �Ǿ����ϴ�.");
				}else {
					System.out.println("�����ϴ� �޴� �Դϴ�");
				}
			}
			else if(num == 2) {
				Iterator it = map.keySet().iterator();
				//map�� ������ �ҷ����� lterator it�� ����
				while(it.hasNext()) {
				//.hasNext�� �о�� ��Ұ� ���������� true��
				//��ȯ�Ͽ� while�� �۵��ǰ� �Ѵ� ������
				//false�� �����.
					name = (String)it.next();
					//name�� String���� ����ȯ�Ͽ�
					//.next�� �ҷ��´�.
					System.out.println(name+" : "+map.get(name));
					//.get���� key�� ���� �޾� value�� ���
				}
			}
			else break;
		}
	}
}
