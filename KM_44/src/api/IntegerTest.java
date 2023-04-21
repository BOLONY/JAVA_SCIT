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
		int i3 = Integer.parseInt(s); //�̰͸�ŭ�� �ܿ���
		
		//(���Ҽ�, ����) ���ڿ� ȭ ���ش�.
		String s4 = Integer.toString(i, 16);
		System.out.println(s4);
		
		//���ڿ� ���ڸ� ���ϴ� �������� �ٲ��
		int i4 = Integer.parseInt("100000", 2);
		System.out.println(i4);
		
	}

}
