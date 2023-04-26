package api;

import java.util.Scanner;

public class IntegerTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 진법 (2/8/10/16) : ");
		int truth = sc.nextInt();
		
		String num = null ;
		int num2 = 0;
		
		switch(truth) {
		case 2: System.out.print("정수입력 (2진수) : "); 
		num = sc.next(); 
		num2 = Integer.valueOf(num, 2); break;
		
		case 8: System.out.print("정수입력 (8진수) : ");
		num = sc.next(); 
		num2 = Integer.valueOf(num, 8); break;
		
		case 10: System.out.print("정수입력 (10진수) : "); 
		num = sc.next(); 
		num2 = Integer.valueOf(num, 10); break;
		
		case 16: System.out.print("정수입력 (16진수) : ");
		num = sc.next(); 
		num2 = Integer.valueOf(num, 16); break;
		
		default: System.out.print("입력하신 진법은 없습니다."); return;
		}
//		System.out.println(num2);
		
		System.out.print("변환할 진법 (2/8/10/16) : ");
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
		default: System.out.print("입력하신 진법은 없습니다."); return;
		}
		System.out.println();
	}

}

/* 실행 예 1)
입력할 진법 (2/8/10/16) : 2 
정수 입력 (2진수) : 11111111
변환할 진법 (2/8/10/16) : 16
1111111(2) -> FF(16)

실행 예 2)
입력할 진법 (2/8/10/16) : 10
정수 입력 (2진수) : 255 
변환할 진법 (2/8/10/16) : 2
255(10) -> 1111111(2)

integer클래스의 성질을 알라
*/