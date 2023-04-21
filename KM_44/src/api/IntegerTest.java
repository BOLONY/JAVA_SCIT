package api;

public class IntegerTest {

	public static void main(String[] args) {
		//Wrapper Class
		int i = 100;
		String s = "123";
		
		//int -> Integer
		Integer in = new Integer(i); //100
		//String => Integer
		Integer is = new Integer(s); //123
		
		//Integer => int
		int i2 = in.intValue();
		//Integer => string
		String s2 = in.toString();
		
		//int => String
		String s3 = Integer.toString(i);
		//String  => int
		int i3 = Integer.parseInt(s); //이것만큼은 외워라
		
		//(변할수, 진법) 문자열 화 해준다.
		String s4 = Integer.toString(i, 16);
		System.out.println(s4);
		
		//문자열 숫자를 원하는 진법으로 바꿔라
		int i4 = Integer.parseInt("100000", 2);
		System.out.println(i4);
		
	}

}
