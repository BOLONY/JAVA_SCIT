package api;

import java.util.Scanner;

public class LottoGeneratorMethod {
	
	static void lottoGenerator(int x) {

		int num[] = new int[6];
		for (int k = 0; k < x; k++) {
			for (int i = 0; i < 6; i++) {
				num[i] = ((int) (Math.random() * 45 + 1));
				// 중복번호제거
				for (int j = 0; j < i; j++) {
					if (num[i] == num[j]) {
						i--;
						break;
					}

				}

			}

			System.out.println("로또번호");
			System.out.print("[ ");
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + (i < num.length - 1 ? ", " : ""));
				/*
				 * if (i < num.length - 1) { System.out.print(", "); }
				 */
			}
			System.out.println(" ]");
		}
	}// lottoGenerator()

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1~45까지의 임의의 정수를 배열에 저장 (중복 불가)
		// 숫자 6개 생성
		int input = 0;
		System.out.print("원하는 갯수 입력: ");
		input = sc.nextInt();
		lottoGenerator(input);

	}//main()

}
