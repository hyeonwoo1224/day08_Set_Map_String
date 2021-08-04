package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//입력받을 input 생성
		HashMap map = new HashMap();
		//key와 value를 입력받을 HashMap 생성
		String name = null;
		//key로 입력받을 String name을 null로 초기화
		String price = null;
		//value로 입력받을 String name을 null로 초기화
		int num=0;
		//숫자 선택을 입력받을 int num을 0으로 초기화
		while(true) {
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종 료");
			System.out.print(">>> ");
			num = input.nextInt();
			if(num == 1) {
				System.out.print("메뉴 입력 : ");
				name = input.next();
				//메뉴를 name에 담는다
				if(map.containsKey(name)==false) {
				//map에 containsKey로 name의 내용을 찾을때
				//거짓이면 다음문장으로 true가 나오면 중복으로
				//else로 존재하는 메뉴라고 출력
				System.out.print("가격 입력 : ");
				price = input.next();
				//다음 문장인 price에 value를 입력
				map.put(name, price);
				//.put으로 key와 value인 name과 price를 입력
				System.out.println("등록 되었습니다.");
				}else {
					System.out.println("존재하는 메뉴 입니다");
				}
			}
			else if(num == 2) {
				Iterator it = map.keySet().iterator();
				//map의 정보를 불러오는 lterator it를 생성
				while(it.hasNext()) {
				//.hasNext로 읽어올 요소가 남아있으면 true를
				//반환하여 while이 작동되게 한다 없으면
				//false로 멈춘다.
					name = (String)it.next();
					//name을 String으로 형변환하여
					//.next로 불러온다.
					System.out.println(name+" : "+map.get(name));
					//.get으로 key의 값을 받아 value를 출력
				}
			}
			else break;
		}
	}
}
