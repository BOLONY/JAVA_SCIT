package ch07;

public class ArrayTest {

	public static void main(String[] args) {
		
		int num[]  = new int[] {1,2,3,4,5,6,7,8,9,10};
		//int num[]  = {1,2,3,4,5,6,7,8,9,10}; �̰͵� ��.
		//�ڷ��� �迭�̸�[] = new �ڷ��� [����];	
		for (int i=0; i<num.length ; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		//for ( �迭�� ������ Ÿ���� ���� : '�迭'�� ���� ������ ��ü)
		for (int i: num) {
			System.out.print(i+" ");
		}
		
		
	}
}
