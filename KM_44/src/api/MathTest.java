package api;

public class MathTest {

	public static void main(String[] args) {
		//Math m = new Math(); math Ŭ������ ��ü�� �ʿ���� ������ Ŭ������.
		
		int i = Math.abs(-3); // ���밪
		System.out.println(i);
		
		System.out.println(Math.round(1.7)); //�ݿø�
		System.out.println(Math.ceil(-1.7)); //���� ����� ū ����
		System.out.println(Math.floor(1.7)); //�ٴ� ����
		
		System.out.println(Math.pow(2, 10)); //2�� 10��
		System.out.println(Math.sqrt(2)); //root 2 
		
		//System.out.println(Math.random()); //0�̻� 1�̸��� ������ ��
		
		for(int j = 0; j < 100; j++) {
			System.out.print((int)(Math.random() * 101));//���� ����ȯ
			System.out.print(", ");
		}
		System.out.println();
		
		for(int j = 0; j < 100; j++) {
		System.out.print((int)(Math.random() * 6+1));
		System.out.print(", ");
		}
		System.out.println();
		System.out.println();
	}

}
