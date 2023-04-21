package ch04.test;

public class Exam13 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i =1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i =1;i<10;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i =0;i<11;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int number2 = 10;
		for(int i=1;i<=10;i++) {
			System.out.print(number2 + " ");
			number2 = number2 + 10;
		}
		System.out.println();
		
		for(int i = 5; i>0;i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=10000; i>=1; i/=10) {
			System.out.print(i+" ");
		}
		System.out.println();
		
//		int number3 = 10000;
//		for(int i =0 ; i<5; i++) {
//			System.out.print(number3 + " ");
//			number3 = number3/10;
//		}
	}//main
}
