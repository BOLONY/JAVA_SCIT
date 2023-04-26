package api;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		//String을 저장할 ArrayList 생성
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
//		ArrayList 생략가능하긴 해.
		list.add(1, "ddd");
		System.out.println(list);
		list.set(1,"xxx");
		System.out.println(list);
		
		System.out.println();
		System.out.println(list.get(0)+" 여기"); //해당 위치 리스트 불러오기
		System.out.println(list);
		System.out.println(list.remove(0) + " 저기");
		System.out.println(list);
		System.out.println();
		
		System.out.println(list.contains("ccc"));
		System.out.println(list.indexOf("ccc"));
		System.out.println(list.indexOf("ccc")==-1);		
		System.out.println(list);
		//하나씩 get, 반복 for
		System.out.println();
		
		System.out.println(list.size());
		for(int i = 0; i<list.size(); i++) {
			
			System.out.println(i+1 + " - "+ list.get(i));
		}
		
//		String s = list.get(i); 48줄 코드는 이거 줄인거 ㅇㅇ
		for(String s: list) {
			System.out.println(s);
		}
		
	}//main
}
