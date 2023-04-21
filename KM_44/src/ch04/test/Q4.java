package ch04.test;

public class Q4 {

	public static void main(String[] args) {
		//패턴의 규칙을 찾자.
		int n=3;
		for(int i = 1; i<=7;i+=2) {
			//공백을 출력하는 반복문
			for(int k=n--; k>0; k--) {
				System.out.print(" ");
			}
	
			//"*"를 출력하는 반복문
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int z=1;
		for(int i = 1; i<=6;i+=2) {
			//공백을 출력하는 반복문
			System.out.print(" ");
			for(int k=0; k<i/2; k++) {
				System.out.print(" ");
			}
	
			//"*"를 출력하는 반복문
			for(int j=6; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}//main
}//class
