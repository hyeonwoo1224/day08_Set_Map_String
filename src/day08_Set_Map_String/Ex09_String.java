package day08_Set_Map_String;

public class Ex09_String {
	public static void main(String[] args) {
		String str = new String("abcdefg");
		System.out.println(str.length());
		//길이
		System.out.println(str.charAt(2));
		//몇번째 출력하기
		
		str += "안녕하세요";
		//문자열에 문자열 더하기
		System.out.println(str);
		System.out.println(str.equals("abcdefg안녕하세요"));
		//.equals로 str과 equals안의 내용이 같은이 참 거짓으로 확인
		//문자열 비교는 equals를 이용하여 전부 비교해줘야함
		System.out.println(str == "abcdefg안녕하세요");
		
		System.out.println(str.charAt(0) == 'a');
		//.charAt(0)번째는 a다
		System.out.println(str.charAt(0) == 'd');

		System.out.println(str.charAt(0)-32);
		//.charAt(0)번째에서 -32를하면 65출력 아스키코드 a = 97
		System.out.println((char)(str.charAt(0)-32));
		//char로 형변환을한 a - 32는 A
	}
}
