package api;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num [] = new int [3]; //������ ����� �迭
		int i = 0; //�迭 index
		int newNum[]; //���� ������� �迭
		int n = 0; //�Է��� ����
		
		//������ �ݺ� �Է¹޾� �迭�� �ʱ�ȭ;
		while(true) {
			System.out.print("�����Է�: ");
			n = sc.nextInt();
			if(n == -1) break; //-1 �Է½� �ݺ� ����
			num[i++] = n;
			
			if(num.length == i) { //�迭�� �� ���� ���ο� �迭�� �����ؼ� ������ �̵�. ���� �迭��
				newNum = new int [num.length*2];
				for(int j = 0; j < i; j++) {
					newNum[j] = num[j];
				}
				num = newNum; //�ּҸ� ���´�.
			}
		}
		
		
		for (int k = 0; k < num.length ; k++) {
			System.out.print(num[k] + " ");
		}//�迭�� ����� ������ ���

	}//main

}
