package oop;

public class Data {
	int x;
	int y;
	
	public Data() {}
	
	
	public Data(int x, int y) {
		//매개변수 x와 매개변수 y 생성.
		this.x = x;
		this.y = y;
	}
	public void print() {
		System.out.println("x:"+x+",y:"+y);
	}
	
	public int sum() {
		
		int s = this.x +this.y;
		return s;
	}
	//Overloading
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		/*int res = 0;
		res = a+ b;
		return res;*/ 
		int result = 0;
		for (int i =a ; i<=b; i+=c) {
			result += i;
		}
		return result;
	}
	public static int power(int c, int d) {
		int result = 1;
		for(int i =0; i<d;i++) {
			result = result*c;
		}
		return result;
	}
	@Override
	public String toString() {
		return "Data [x=" + x + ",y=" + y + "]";
	}
}
