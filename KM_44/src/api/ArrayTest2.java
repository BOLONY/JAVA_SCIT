package api;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		/*num.add(new Integer(1));
		num.add(2); //wrapper class�� ��ü�� ������ �ȴ�. (����Ȱ�)*/
		
		
		while (true) { 
			System.out.println("�����Է�:");
			int n = sc.nextInt();
			if(n==-1) break;
			num.add(n);
		}
		System.out.println(num);
		
	}
}

