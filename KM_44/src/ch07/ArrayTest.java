package ch07;

public class ArrayTest {

	public static void main(String[] args) {
		
		int num[]  = new int[] {1,2,3,4,5,6,7,8,9,10};
		//int num[]  = {1,2,3,4,5,6,7,8,9,10}; 이것도 됨.
		//자료형 배열이름[] = new 자료형 [개수];	
		for (int i=0; i<num.length ; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		//for ( 배열과 동일한 타입의 변수 : '배열'과 같은 집합형 객체)
		for (int i: num) {
			System.out.print(i+" ");
		}
		
		
	}
}
