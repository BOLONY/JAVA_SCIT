package ch04;

public class WhileExample1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		//���� ����.
		//����� ���ÿ� �ʱ�ȭ �ϴ°� �߿��ϴ�.
		
		while(num <= 10) {
			sum += num ;
			num ++;
		}
		System.out.println("1���� 10������ ���� "+sum+"�Դϴ�.");
	}

}
