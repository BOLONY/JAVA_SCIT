package ch06;

class Count{
	public int serialNumber;
	public static int counter = 0; //��ü�� ���ؼ� �����Ǿ�����.
	public int nonStaticNumber;
	
	public Count() {
		//Ŭ���� ������ ��� ��ü�� ���ؼ� �����ȴ�.
		counter ++;
		serialNumber = counter;
		//��� ������ ��ü ������ ���� �ʱ�ȭ �ȴ�.
		nonStaticNumber++;
		//Ư¡���� �� �����ؼ� ��������
	}
}

public class CountTest {
	public static void main(String[] args) {
		Count c1 = new Count(); //c1 �̶� �̸��� ��ü ����
		Count c2 = new Count();
		Count.counter++; //Ŭ���� �̸����� ��ٷ� ��ü����(ȣ��)
		Count c3 = new Count();
		System.out.println("c1 serialNuber = "+c1.serialNumber);
		System.out.println("c2 serialNuber = "+c2.serialNumber);
		System.out.println("c3 serialNuber = "+c3.serialNumber);
		System.out.println("c3 nonStaticNumber="+c3.nonStaticNumber);
	}//main
}//class
