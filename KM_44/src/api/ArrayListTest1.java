package api;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		//String�� ������ ArrayList ����
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
//		ArrayList ���������ϱ� ��.
		list.add(1, "ddd");
		System.out.println(list);
		list.set(1,"xxx");
		System.out.println(list);
		
		System.out.println();
		System.out.println(list.get(0)+" ����"); //�ش� ��ġ ����Ʈ �ҷ�����
		System.out.println(list);
		System.out.println(list.remove(0) + " ����");
		System.out.println(list);
		System.out.println();
		
		System.out.println(list.contains("ccc"));
		System.out.println(list.indexOf("ccc"));
		System.out.println(list.indexOf("ccc")==-1);		
		System.out.println(list);
		//�ϳ��� get, �ݺ� for
		System.out.println();
		
		System.out.println(list.size());
		for(int i = 0; i<list.size(); i++) {
			
			System.out.println(i+1 + " - "+ list.get(i));
		}
		
//		String s = list.get(i); 48�� �ڵ�� �̰� ���ΰ� ����
		for(String s: list) {
			System.out.println(s);
		}
		
	}//main
}
