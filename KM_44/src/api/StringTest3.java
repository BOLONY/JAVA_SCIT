package api;

import java.util.Scanner;

/*
 * �ֹε�Ϲ�ȣ �Է¹޾� �����ϰ� ��� ���
 * "990101-1234567" ���·� �Է�
 * [���]
 * - �Է¿���
 * �Ǵ�
 * - 99�� 01�� 01�� �����Դϴ�.
 */
public class StringTest3 {

	public static void main(String[] args) {
		System.out.println("�ֹε�� ��ȣ �Է�:");
		Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();
		
		if(14<code.length()) {
			System.out.println("�ֹε�� ��ȣ���� �ʹ� �����ϴ�.");
			return ;
		}
		System.out.println(code.length());
		if(14>code.length()) {
			System.out.println("���ڰ� ���ġ �ʽ��ϴ�.");
		}
		if(code.charAt(6) != '-') {
			System.out.println("6��° ���ڿ� '-'�� ���ƽ��ϴ�.");
		}
		if(code.length()==14) 
		{
			if(code.charAt(7) == '1'){
				System.out.print(code.substring(0,2));
				System.out.print("��"+ code.substring(2,4)+"��");
				System.out.print(code.substring(4,6)+"�� �����Դϴ�.");
				}
			else if(code.charAt(7) == '2') {
				System.out.print(code.substring(0,2));
				System.out.print("��"+ code.substring(2,4)+"��");
				System.out.print(code.substring(4,6)+"�� �����Դϴ�.");
				}
		}
		
	}

}
