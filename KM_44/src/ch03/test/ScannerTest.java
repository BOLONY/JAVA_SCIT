package ch03.test;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//키보드 입력 처리. 표준입력 정보
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		System.out.println("입력한 나이는 " + age + "살 입니다.");
		
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.println("이름은 "+name+"입니다.");
		
		System.out.print("주소 입력: ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("주소는 "+address+"입니다.");
		
		//nextInt 읽어서 int로 반환 B-Type. 매개변수 없으니까 근데 결과는 처리해주니까
		//한 챕터 풀떄마다 문제 푼다.
		//키보드 입력 처리
		//next float, next double, next
		//next라는 메서드는 공백을 기준으로 끝는다.
		
	}

}
