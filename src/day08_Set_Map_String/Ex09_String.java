package day08_Set_Map_String;

public class Ex09_String {
	public static void main(String[] args) {
		String str = new String("abcdefg");
		System.out.println(str.length());
		//����
		System.out.println(str.charAt(2));
		//���° ����ϱ�
		
		str += "�ȳ��ϼ���";
		//���ڿ��� ���ڿ� ���ϱ�
		System.out.println(str);
		System.out.println(str.equals("abcdefg�ȳ��ϼ���"));
		//.equals�� str�� equals���� ������ ������ �� �������� Ȯ��
		//���ڿ� �񱳴� equals�� �̿��Ͽ� ���� ���������
		System.out.println(str == "abcdefg�ȳ��ϼ���");
		
		System.out.println(str.charAt(0) == 'a');
		//.charAt(0)��°�� a��
		System.out.println(str.charAt(0) == 'd');

		System.out.println(str.charAt(0)-32);
		//.charAt(0)��°���� -32���ϸ� 65��� �ƽ�Ű�ڵ� a = 97
		System.out.println((char)(str.charAt(0)-32));
		//char�� ����ȯ���� a - 32�� A
	}
}
