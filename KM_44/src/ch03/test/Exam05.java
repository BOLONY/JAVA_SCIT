package ch03.test;
import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("x �Է�: ");
//		int x = sc.nextInt();
//		System.out.print("y �Է�: ");
//		int y = sc.nextInt();
		
//		int z = 0;
		int x = 100;
		int y = 200;
		int z = 0;
		
//		System.out.println("��ȯ �� : x = "+x+", y ="+y);
		System.out.printf("��ȯ �� : x = %d, y = %d\n", x, y);
		z=x;
		x=y;
		y=z;
//		System.out.println("��ȯ �� : x = "+x+", y ="+y);
		System.out.printf("��ȯ �� : x = %d, y = %d", x, y);
	}
}
