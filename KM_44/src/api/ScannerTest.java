package api;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		double d;
		String s1, s2;
		
		System.out.print("���ڿ�: ");
		s1 = scan.nextLine();
		System.out.print("����: ");
		i = scan.nextInt();
		System.out.print("�Ǽ�: ");
		d = scan.nextDouble();
		System.out.println();
		
		//enter �� char��. \n, �����ڵ�� 10�� ���ڰ� ���๮��.
		//nextLine �� �տ� �ִ� enter �� ���������� �����ִ� enter�� ó���Ѵ�.
		System.out.println("���ڿ�: ");
		s2 = scan.nextLine();
		System.out.println("----------------");
		System.out.print(s1 + "," + i + ","+ d + ","+ s2);
		
	}

}
