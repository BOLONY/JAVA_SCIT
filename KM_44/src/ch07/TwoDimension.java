package ch07;

public class TwoDimension {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5}};
		
		for(int i=0; i<arr.length; i++) {//ÇàÀÇ °ª arr.length = 2
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}

}
