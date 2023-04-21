package ch06.bank; //ctrl1 + move
//접근지정자를 private으로 한다. 기본적으로
public class Account {
	private String accNo; //계좌번호
	private String customer; //고객이름
	private long balance; //잔고
	
	public Account(String accNo, String customer, long balance) {
		this.accNo = accNo;
		this.customer = customer;
		this.balance = balance;
	}
	
	//클래스도 데이터 타입.
	public Account(String accNo, String customer){
		this(accNo, customer, 0); //8라인 생성자 불러서 초기화
		
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getAccNo() {
		return accNo;
	}

	public long getBalance() {
		return balance;
	}
	
	//입금
	public void deposit(long amount) {
		balance += amount;
	}
	
	//출금
	public boolean withdraw(long amount) {
		boolean result = false;
		if(balance >= amount) {
			balance -= amount;
			result = true;
		}
		return result;
	}
	
	//이체 , <클래스도 데이터 타입>
	public boolean transfer(long amount, Account target) {
		boolean result = false;
		if (balance >= amount) {
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
