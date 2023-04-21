package ch06;

//Singleton pattern이 적용된 클래스
public class Company {
	//2. 자기자신의 객체를 멤버로 static하게 한다.
	private static Company c = new Company();
	private int total;
	
	//1. 외부에서 객체를 생성하지 못하도록 접근지정자를 private으로 한다.
	private Company() {
		System.out.println("Company 객체 생성");
	} //private이니 범위가 클래스 안이다.
	
	//3. 외부에서 해당 클래스의 객체를 가져다 쓸 수 있는 getter 생성.
	public static Company getCompany() { //메서드도 하나의 데이터 타입이다.
		return c;
	}
	
	public void addTotal(int total) {
		this.total += total;
	}
	
	public int getTotal() {
		return total; 
	}
}
