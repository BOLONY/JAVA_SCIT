package api;

public class RandomTest {
	
//	int lottoGenerator(int x) {
//		
//	}

	public static void main(String[] args) {
		int num[] = new int[6];
		//1~45������ ������ ������ �迭�� ���� (�ߺ� �Ұ�)
		//���� 6�� ����
		for(int i = 0; i < 6; i++) {
			num[i] = ((int)(Math.random() *45+1));		
			//�ߺ���ȣ����
			for(int j = 0 ; j<i; j++) {
				if(num[i] == num[j] ) {
					i--;
					break;
				}
			}
		}
		System.out.println("�ζǹ�ȣ");
		System.out.print("[ ");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + (i < num.length - 1 ? ", ": ""));
			/*if (i < num.length - 1) {
				System.out.print(", ");
			}*/
		}
		System.out.println(" ]");
		
		
		// ��ȯ ����
		int a = 0, b = 0;
		
		int store = 0;
			for(int i = 0 ; i< num.length -1 ; i++) { //-1 ���ص� j  = 6 6<6 �Ǽ� -1�� �ȴ�.
				for(int j = i+1 ; j < num.length ; j++ ) {
					a++;
					if(num[i] > num[j] ) {
						b++;
						//��ȯ
						store = num[i];
						num[i] = num[j];
						num [j] = store;
					}
				}
			}
			
		//���
		System.out.print("[ ");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + (i < num.length - 1 ? ", ": ""));
			/*if (i < num.length - 1) {
				System.out.print(", ");
			}*/
		}
		
		// ���
		System.out.print(" ]");
		System.out.println();
		System.out.println("��:"+ a + ", ��ȯ:" + b);
		}
	
}
