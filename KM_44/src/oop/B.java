package oop;

public class B extends A {
	double dnum;
	
	public B() {
		super(); //����: ����Ŭ������ �⺻������ ȣ��
		//�����ϸ� �⺻������. �׿ܴ� ����� ȣ��
		//����Ŭ������ �������� ù�ٿ����� ȣ�Ⱑ��
		/*super(); //���� Ŭ����(A)�� �⺻ ������ ȣ��*/
		System.out.println("B�� B()");
	}
	
	public B(int n, double d) {
		//1. �θ� Ŭ������ �⺻ �����ڸ� ȣ��
		//this�� ���� �θ�� super ���� super.������;
		/*super(n); //����� �����Ѱ� �������. ����*/
		//num = n;
		super(n);
		dnum =d;
		System.out.println("B�� B(int, double)");
	}
}
