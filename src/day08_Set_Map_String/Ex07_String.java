package day08_Set_Map_String;

public class Ex07_String {
	public static void main(String[] args) {
		String str ="Java is Easy. 그리고 programing 할만하다";
		System.out.println("기본 : " + str);
		String changeStr = new String();
		changeStr = str.toLowerCase();
		System.out.println("변환 : " +changeStr);
		changeStr = str.toLowerCase();
		System.out.println("변환 : " +changeStr);
	}
}
