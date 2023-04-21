package ch04.test;

public class Exam16 {

	public static void main(String[] args) {
		int count = 1;
		for(int i=1; i<=100;i++) {
				if(100%i == 0) {
					System.out.print(i+" ");
					if(count%3==0) {
						System.out.println();
					}
				}
				else {
					continue;
				}
			count++;
		}
		
		int count1 = 0;
		for(int i=1; i<=100;i++) {
				if(100%i == 0) {
					System.out.print(i+" ");
					count1++;
					if(count1%3==0) System.out.println();
				}//if
		}
		
	}//main
}//class
