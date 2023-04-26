package api;

public class MathTest {

	public static void main(String[] args) {
		//Math m = new Math(); math 클래스는 객체를 필요없게 설계한 클래스다.
		
		int i = Math.abs(-3); // 절대값
		System.out.println(i);
		
		System.out.println(Math.round(1.7)); //반올림
		System.out.println(Math.ceil(-1.7)); //가장 가까운 큰 정수
		System.out.println(Math.floor(1.7)); //바닥 정수
		
		System.out.println(Math.pow(2, 10)); //2의 10승
		System.out.println(Math.sqrt(2)); //root 2 
		
		//System.out.println(Math.random()); //0이상 1미만의 임의의 수
		
		for(int j = 0; j < 100; j++) {
			System.out.print((int)(Math.random() * 101));//강제 형변환
			System.out.print(", ");
		}
		System.out.println();
		
		for(int j = 0; j < 100; j++) {
		System.out.print((int)(Math.random() * 6+1));
		System.out.print(", ");
		}
		System.out.println();
		System.out.println();
	}

}
