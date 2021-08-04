package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Set {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("¿œ");
		arr.add("¿Ã");
		arr.add("ªÔ");
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		//ArrayList πÊπ˝
		Iterator it = arr.iterator();
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		
		while(it.hasNext() == true) {
			System.out.println(it.next());
		}
	}
}
