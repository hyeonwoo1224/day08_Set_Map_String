package day08_Set_Map_String;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Set {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("일");
		set.add("이");
		set.add("삼");
		System.out.println("set : " + set);
		//HashSet은 순서가 다르게 출력된다
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			//Object o = it.next();
			//Object로 받은 다음
			//String s = (String)o;
			//그다음 String으로 형변환을 해야한다
			String s = (String)it.next();
			System.out.println(s);
		}
		//Iterator를 사용하여 순서대로 바꿔줘야 한다
	}
}
