package ch03.test;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("11-11", "ȫ�浿", 500);
		a1.printAccountInfo();
		
		a1.deposit(300);
		System.out.println("a1 ���¿� 300 �Ա�");
		a1.printAccountInfo();
		
	}

}
