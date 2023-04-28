package oop;

public class MethodTest {
	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data(10,20);
		System.out.println(d1);
		System.out.println(d2);
		
		d2.print();
		System.out.println(d2.sum()); //30
		System.out.println(d1.sum()); //0
		System.out.println(d2.sum(5, 10)); //14
		//static은 d2를 호출할 필요가 없다.
		System.out.println(Data.sum(5, 10) + "여기"); //14
		System.out.println(Data.sum(1, 10, 2));//1에서 10까지 2씩 증가하면서 합계
		System.out.println(Data.power(2, 10)); //2의 3을 을 계산
		
	}
	
}
