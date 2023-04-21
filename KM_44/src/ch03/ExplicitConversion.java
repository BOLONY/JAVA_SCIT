package ch03;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double dNum1 = 1.2;
//		float fNum2 = 0.9F;
//		
//		int iNum3 = (int)dNum1 + (int)fNum2;
//		int iNum4 = (int)(dNum1 + fNum2);
//		System.out.println(iNum3);
//		System.out.println(iNum4);
		
		int i = 10, j = 5, k;
		k = ++i + j--;
		System.out.println("i="+i+"j="+j+",k="+k);
//		i=11j=4,k=16
//		i=10j=3,k=14
		
		k = i-- + --j;
		System.out.println("i="+i+"j="+j+",k="+k);
	}

}
