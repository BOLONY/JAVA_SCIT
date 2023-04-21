package ch06.bankPractice;

public class Account {
	private String accNo;//계좌번호
	private String customer;//고객이름
	private long balance;//잔고
	
	public Account(String accNo, String customer, long balance ) {
		//생성자는 객체가 만들어지면 소멸한다.
		//this 는 '나'자신. Account 클래스를 가리킨다.
		this.accNo = accNo;
		this.customer = customer;
		this.balance = balance;
	}
	
	//this는 클래스 자체를 가리킨다.
	public Account(String accNo, String customer) {
		this(accNo, customer, 0);
		//this this(o,o,o)위의 8번째 구문을 가리킨다.
	}

	public String getAccNo() {
		return accNo;
	}

	public String getCustomer() {
		return customer;
	}

	public long getBalance() {
		return balance;
	}
	
	//입금 메서드
	public void deposit(long amount) {
		balance += amount;
	}
	//출금 메서드
	public boolean withdraw(long amount) {
		boolean result = false;
		if(balance >= amount) {
			balance -= amount;
			result = true;
		}
		return result;
	}
	
	//이체, <클래스도 데이터 타입>
	public boolean transfer(long amount, Account target) {
		boolean result = false;
		if(balance >= amount) {
			balance -= amount;
			target.deposit(amount);
			result = true;
		}
		return result;
	}
	
	public void printAccInfo() {
		System.out.printf("계좌번호: %s, 계좌주: %s, 잔고:%d\n", accNo, customer, balance);
	}
	
}
//해당 클래스 내에서 변수혹은 메서드를 사용할때 기본적으로 해당 변수와 메서드는
//this. 이 생략되어 있다.