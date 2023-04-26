package api;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		int n = 0;
		while(true) {
			if(n==-1) break;
			System.out.print("정수 입력: ");
			n = sc.nextInt();
			num.add(n);
		}
		System.out.println(num);
	
	}

}
