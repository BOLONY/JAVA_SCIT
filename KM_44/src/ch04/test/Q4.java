package ch04.test;

public class Q4 {

	public static void main(String[] args) {
		//������ ��Ģ�� ã��.
		int n=3;
		for(int i = 1; i<=7;i+=2) {
			//������ ����ϴ� �ݺ���
			for(int k=n--; k>0; k--) {
				System.out.print(" ");
			}
	
			//"*"�� ����ϴ� �ݺ���
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int z=1;
		for(int i = 1; i<=6;i+=2) {
			//������ ����ϴ� �ݺ���
			System.out.print(" ");
			for(int k=0; k<i/2; k++) {
				System.out.print(" ");
			}
	
			//"*"�� ����ϴ� �ݺ���
			for(int j=6; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}//main
}//class
