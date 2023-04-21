package ch07;
import ch06.bank.Account;
public class AccoutArray {

	public static void main(String[] args) {
		Account a[] = new Account[3];
		a[0] = new Account("11-11", "홍길동", 500);// 해시코드 어카운트 객체가 만들어진 곳의 하나의 참조값.
		a[0].printAccInfo();
		
		System.out.println(a[0]); //참조형이라 null값. 값을 않넣었으니 기본 데이터타입이 채워진다.
		
	}
	
	
}
 