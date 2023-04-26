package api;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "aaaa");
		map.put(3, "bbb");
		map.put(5, "cccc");
		map.put(2, "dddddd");
		
		System.out.println(map);
		System.out.println(map.get(2));
		System.out.println(map.get(5));
		System.out.println(map.get(10));
		
		map.put(1, "1234");
		System.out.println(map);
	}

}
