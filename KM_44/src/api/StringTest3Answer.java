package api;

import java.util.Scanner;

public class StringTest3Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = null;
		
		System.out.println("�ֹε�Ϲ�ȣ(000000-0000000)");
		num = sc.nextLine();
		
		if(num.length() != 14) {
			System.out.println("�Է� ����"); //���� �޽��� ����ϰ� ����
			return;
		}
		
		if(num.indexOf('-') != 6) {
			//if (num.charAt(6) != '-')
			// if (!num.subString(6,7).equals("-"))
			System.out.println("�Է� ����");
			return;
		}
		
		char ch = num.charAt(7);
		/*if(ch != '1' && ch != '2' && ch != '3' && ch!= '4' ) {*/
		if(ch < '1' || ch >'4') {
			System.out.println("�Է� ����");
			return;
		}
		//������
		String y = num.substring(0,2);
		
		//����
		String s = ch == '1' || ch =='3' ? "����" : "����";
	}

}
