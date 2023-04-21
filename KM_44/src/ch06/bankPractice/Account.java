package ch06.bankPractice;

public class Account {
	private String accNo;//���¹�ȣ
	private String customer;//���̸�
	private long balance;//�ܰ�
	
	public Account(String accNo, String customer, long balance ) {
		//�����ڴ� ��ü�� ��������� �Ҹ��Ѵ�.
		//this �� '��'�ڽ�. Account Ŭ������ ����Ų��.
		this.accNo = accNo;
		this.customer = customer;
		this.balance = balance;
	}
	
	//this�� Ŭ���� ��ü�� ����Ų��.
	public Account(String accNo, String customer) {
		this(accNo, customer, 0);
		//this this(o,o,o)���� 8��° ������ ����Ų��.
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
	
	//�Ա� �޼���
	public void deposit(long amount) {
		balance += amount;
	}
	//��� �޼���
	public boolean withdraw(long amount) {
		boolean result = false;
		if(balance >= amount) {
			balance -= amount;
			result = true;
		}
		return result;
	}
	
	//��ü, <Ŭ������ ������ Ÿ��>
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
		System.out.printf("���¹�ȣ: %s, ������: %s, �ܰ�:%d\n", accNo, customer, balance);
	}
	
}
//�ش� Ŭ���� ������ ����Ȥ�� �޼��带 ����Ҷ� �⺻������ �ش� ������ �޼����
//this. �� �����Ǿ� �ִ�.