package ch06;

class Count{
	public int serialNumber;
	public static int counter = 0; //객체에 의해서 공유되어진다.
	public int nonStaticNumber;
	
	public Count() {
		//클래스 변수는 모든 객체에 의해서 공유된다.
		counter ++;
		serialNumber = counter;
		//멤버 변수는 객체 생성시 마다 초기화 된다.
		nonStaticNumber++;
		//특징들을 잘 구분해서 이해하자
	}
}

public class CountTest {
	public static void main(String[] args) {
		Count c1 = new Count(); //c1 이란 이름의 객체 생성
		Count c2 = new Count();
		Count.counter++; //클래스 이름으로 곧바로 객체생성(호출)
		Count c3 = new Count();
		System.out.println("c1 serialNuber = "+c1.serialNumber);
		System.out.println("c2 serialNuber = "+c2.serialNumber);
		System.out.println("c3 serialNuber = "+c3.serialNumber);
		System.out.println("c3 nonStaticNumber="+c3.nonStaticNumber);
	}//main
}//class
