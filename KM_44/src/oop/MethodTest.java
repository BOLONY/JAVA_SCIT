package oop;

public class MethodTest {
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data(10,20);
		System.out.println(d1);
		System.out.println(d2);
		
		d2.print();
		System.out.println(d2.sum()); //30
		System.out.println(d1.sum()); //0
		System.out.println(d2.sum(5, 10)); //14
		//static�� d2�� ȣ���� �ʿ䰡 ����.
		System.out.println(Data.sum(5, 10) + "����"); //14
		System.out.println(Data.sum(1, 10, 2));//1���� 10���� 2�� �����ϸ鼭 �հ�
		System.out.println(Data.power(2, 10)); //2�� 3�� �� ���
		
	}
	
}
