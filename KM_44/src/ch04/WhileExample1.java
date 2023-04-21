package ch04;

public class WhileExample1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		//로컬 변수.
		//선언과 동시에 초기화 하는게 중요하다.
		
		while(num <= 10) {
			sum += num ;
			num ++;
		}
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
	}

}
