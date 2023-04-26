package api;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num [] = new int [3]; //정수가 저장된 배열
		int i = 0; //배열 index
		int newNum[]; //새로 만들어진 배열
		int n = 0; //입력한 정수
		
		//정수를 반복 입력받아 배열을 초기화;
		while(true) {
			System.out.print("정수입력: ");
			n = sc.nextInt();
			if(n == -1) break; //-1 입력시 반복 종료
			num[i++] = n;
			
			if(num.length == i) { //배열이 다 차면 새로운 배열을 생성해서 데이터 이동. 기존 배열은
				newNum = new int [num.length*2];
				for(int j = 0; j < i; j++) {
					newNum[j] = num[j];
				}
				num = newNum; //주소를 덮는다.
			}
		}
		
		
		for (int k = 0; k < num.length ; k++) {
			System.out.print(num[k] + " ");
		}//배열에 저장된 값들을 출력

	}//main

}
