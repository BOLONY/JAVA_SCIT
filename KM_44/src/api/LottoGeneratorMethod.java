package api;

import java.util.Scanner;

public class LottoGeneratorMethod {
	
	static void lottoGenerator(int x) {

		int num[] = new int[6];
		for (int k = 0; k < x; k++) {
			for (int i = 0; i < 6; i++) {
				num[i] = ((int) (Math.random() * 45 + 1));
				// �ߺ���ȣ����
				for (int j = 0; j < i; j++) {
					if (num[i] == num[j]) {
						i--;
						break;
					}

				}

			}

			System.out.println("�ζǹ�ȣ");
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
		// 1~45������ ������ ������ �迭�� ���� (�ߺ� �Ұ�)
		// ���� 6�� ����
		int input = 0;
		System.out.print("���ϴ� ���� �Է�: ");
		input = sc.nextInt();
		lottoGenerator(input);

	}//main()

}
