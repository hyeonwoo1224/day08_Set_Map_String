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
		 - HashTable...등등
		 HashMap
		 - 키와 값의 쌍이다
		 - 순서는 유지되지 않는다
		 - 키에 대한 중복은 허용하지 않는다
		 */
		//HashMap map = new HashMap();
		LinkedHashMap map = new LinkedHashMap();
		//LinkedHashMap 순서대로 출력하게 해준다
		map.put("선풍기", "1000만원");
		map.put("자동차", "10만원");
		map.put("에어컨", "30만원");
		
		System.out.println(map);
		
		System.out.println(map.get("선풍기"));
		System.out.println(map.get("자동차"));
		System.out.println(map.get("에어컨"));
		System.out.println(map.get("없는키"));
		//해당 Key의 Value를 보기 없으면 Null
		System.out.println(map.containsKey("에어컨"));
		System.out.println(map.containsKey("에어컨111"));
		//해당하는 Key 존재 여부
		System.out.println(map.containsValue("30만원"));
		System.out.println(map.containsValue("31만원"));
		//해당하는 Value의 존재 여부
		
		System.out.println(map.remove("에어컨"));
		//remove로 해당 key삭제
		System.out.println(map.containsKey("에어컨"));
		//확인
		System.out.println(map);
		//전체 내용에서 확인
		
		System.out.println(map.keySet());
		System.out.println(map.keySet());
		System.out.println(map.keySet());
		System.out.println(map.keySet());
		System.out.println(map.keySet());
		
		//Set s = map.keySet();
		//Set으로 변환
		//Iterator it = s.iterator();
		//Iterator 사용하여 순서대로
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key + " : " + map.get(key));
		}
	}
}
