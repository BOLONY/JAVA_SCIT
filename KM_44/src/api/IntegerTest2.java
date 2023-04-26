package api;

import java.util.Scanner;

public class IntegerTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է��� ���� (2/8/10/16) : ");
		int truth = sc.nextInt();
		
		String num = null ;
		int num2 = 0;
		
		switch(truth) {
		case 2: System.out.print("�����Է� (2����) : "); 
		num = sc.next(); 
		num2 = Integer.valueOf(num, 2); break;
		
		case 8: System.out.print("�����Է� (8����) : ");
		num = sc.next(); 
		num2 = Integer.valueOf(num, 8); break;
		
		case 10: System.out.print("�����Է� (10����) : "); 
		num = sc.next(); 
		num2 = Integer.valueOf(num, 10); break;
		
		case 16: System.out.print("�����Է� (16����) : ");
		num = sc.next(); 
		num2 = Integer.valueOf(num, 16); break;
		
		default: System.out.print("�Է��Ͻ� ������ �����ϴ�."); return;
		}
//		System.out.println(num2);
		
		System.out.print("��ȯ�� ���� (2/8/10/16) : ");
		String sNum2 = null;
		int num3 = 0;
		int trans = sc.nextInt();
		switch(trans) {
		case 2: 
			System.out.print(Integer.toBinaryString(num2)); 
		break;
		case 8: 
			System.out.print(Integer.toOctalString(num2));
		break;
		case 10: System.out.print(num2); 
		break;
		case 16: 
			System.out.print(Integer.toHexString(num2));
		break;
		default: System.out.print("�Է��Ͻ� ������ �����ϴ�."); return;
		}
		System.out.println();
	}

}

/* ���� �� 1)
�Է��� ���� (2/8/10/16) : 2 
���� �Է� (2����) : 11111111
��ȯ�� ���� (2/8/10/16) : 16
1111111(2) -> FF(16)

���� �� 2)
�Է��� ���� (2/8/10/16) : 10
���� �Է� (2����) : 255 
��ȯ�� ���� (2/8/10/16) : 2
255(10) -> 1111111(2)

integerŬ������ ������ �˶�
*/