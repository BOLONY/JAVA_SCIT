package api;

public class BubbleSort {

	public static void main(String[] args) {
//		int num[] = {5, 2, 8, 3, 1};
		int num[] = {1,2,3,4,5};
		int i, j, tmp;
		boolean flag;
		
		// ���� �� ���
		System.out.println(num.length);
		for(i = 0 ; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		// ����
		int store = 0;
		int a = 0, b = 0;
		for(i = num.length-1; i > 0 ; i--) {
			flag = true;
			for(j =0 ; j < i ; j++) {
				a++;
				if(num[j]>num[j+1]) {
					b++;
					flag = false;
					store = num[j];
					num[j] = num[j+1];
					num[j+1] = store;
				}
			}
//			if (flag) break;
			if (flag == true) break;
		}
		
		// ���� �� ���
		for(i =0; i < num.length; i++) {
			System.out.print(num[i]+ " ");
		}
		System.out.println();
		System.out.println(a);
		System.out.println(b);		
	}

}


