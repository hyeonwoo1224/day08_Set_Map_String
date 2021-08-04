package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Scanner;

public class Ex05_Map {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//입력받을 Scanner 생성
		HashMap map = new HashMap();
		//Key와 Value를 입력받을 공간 생성
		String key = null, value=null;
		//문자열 Key,Value 변수 생성후 Null로 공간 비우기
		System.out.println("저장할 키 입력");
		key = input.next();
		//Key에 입력받기
		System.out.println("저장할 값 입력");
		value = input.next();
		//Value에 입력받기
		
		map.put(key, value);
		//HashMap에 key,value집어넣기
		
		System.out.println(map);
		//map출력
	}
}
