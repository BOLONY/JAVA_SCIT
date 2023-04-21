package ch03.test;

public class Account {
	String accNo; //���¹�ȣ
	String owner; //������
	long balance; //�ܰ�
	
	//������ Constructor
	//��ü ������ ������ ��� ������ �ʱ�ȭ �̸��� Ŭ������ ���´�.
	public Account(String accNo, String owner, long balance) {
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	//�Ա�
	public void deposit(long amount) {
		balance += amount;
	}
	
	//�ܰ���ȸ. ���� ��ȸ�� �о���ڴ�. getBalance
	public long getBalnce() {
		//Ŭ������ ������ �ִ� �뷱���� ��ȯ
		return balance;
	}
	
	//���
	public void withdraw(long amount) {
		balance -= amount;
	}
	
	//�������� ���
	public void printAccountInfo() {
		System.out.println("���¹�ȣ: " + accNo);
		System.out.println("������: "+owner);
		System.out.println("�ܰ�: "+balance);
	}
}




