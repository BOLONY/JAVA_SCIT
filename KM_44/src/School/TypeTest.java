package School;

import java.util.Scanner;

public class TypeTest {

	public static void main(String[] args) {
		Integer a = new Integer(1);
		Double b = new Double(1.1);
		//Integer(2)�� NumberŸ���̳�
		//Number�� Integer�� �θ� Ŭ����.
	//2�� �� �ִ� Integer ��ü�� �ּ� C���� �ش�.
		Number c = new Integer(2);
		Number d = new Double(2.2);
		Object e = new Integer(3);
		String f = new String("aaa");
		Object g = new String("ccc");
		
		System.out.println(a instanceof Integer); //��Ȯ�� Ÿ�� ��ġ
		System.out.println(a instanceof Number);  //����� ���迡���� ����Ÿ��
		//���.
		//a�� ������Ʈ�� ��ü��
		//�������� instanceof �ڿ� �� Ŭ����
		System.out.println(a instanceof Object);
//		System.out.println(a instanceof Double); //��Ӱ��谡 �ƴ� ��
		System.out.println(c instanceof Double); //��Ӱ����̸鼭 Ÿ���� ��ġ���� ����
		//���: true, false, compile error
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Math.PI);
	}

}
