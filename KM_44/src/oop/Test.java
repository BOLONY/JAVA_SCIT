package oop;

public class Test {

	public static void main(String[] args) {
		int i = 10;
		A a1 = new A();//��ü ����.
		A a2 = new A(100);
		//A Ŭ���� �� ����. a1 ���� ���� 
		//a1 �� ��������. ����Ű�� �ִ�.
		//new. heap������ ������ ����� ��.
		//������ �߿��� �⺻ �����ڴ� �ȸ���� 
		//�ڵ����� ���������.
		//heap
		
		a1.num = 1;//��ü �ȿ� ���� �ֱ�
		a1.test();// a�ȿ��ִ� test�޼��� ȣ��
		
		B b1 = new B();
		B b2 = new B(10, 2.34);
		//���۷��� ���� �����ϰ�
		//��ü ����.
		
		b2.test();
		System.out.println(b2.toString());
		//������Ʈ�� ���� ���� �޴´�.
		//��°���� ���ڿ� ����
		
		C c = new C();
		c.setBounds(100,100,300,300);
		c.setTitle("�������");
		c.setVisible(true);
	}//main
}
