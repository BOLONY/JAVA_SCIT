package oop;

public class A {
	//��� ����
	int num;
	
	//public�� �ܺο��� �����ϰ� �϶�� �޼���
	public A() {
		System.out.println("A�� A()");
	}
	//��ȣ�ȿ� �ƹ��͵� ������ �⺻ ������.
	
	public A(int n) {
		num = n;
		//this.num = n;
		System.out.printf("A�� A(int) %d\n", n);
	}
	
	//�޼ҵ�
	//public ����������. �ܺο��� �ǵ���� �ȴ�.
	//�޼���. �ҷ����� �����Ű��
	public void test() {
		System.out.println("AŬ������ test() �޼ҵ�");
	}
}
