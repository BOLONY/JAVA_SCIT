package ch04.test;

public class Exam15 {

	public static void main(String[] args) {
		/*int num1 = 1;
		for(int i=1;i<=5;i++) {
			num1 = i;
			for(int j=1;j<=5;j++) {
				System.out.print(num1+ " ");
				num1++;
			}
			System.out.println();
		}
		System.out.println("-----------");*/
		
		for(int i=1;i<=5;i++) {
			for(int j=i; j<i+5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("-----------");
		
		for (int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-----------");
		
		
		
		/*int num3 =1;
		for(int i=1;i<=5;i++) {
			num3 = i;
			for(int j=5; j>=i; j--) {
				System.out.print(num3);
				num3++;
			}
			System.out.println();
		}
		System.out.println("-----------");*/
		
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("-----------");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("0");
			}
			System.out.print(i);
			for(int k=5;k>i;k--) {
				System.out.print("0");
			}
			System.out.println();
		}
		//---------------------------
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) System.out.print(i+" ");
				else System.out.print("0 ");
			}
			System.out.println();
		}
		
		
	}//main
}//class
//string 과 noneString 더하면 string이 된다.
