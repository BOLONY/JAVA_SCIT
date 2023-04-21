package ch03.test;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("11-11", "È«±æµ¿", 500);
		a1.printAccountInfo();
		
		a1.deposit(300);
		System.out.println("a1 °èÁÂ¿¡ 300 ÀÔ±Ý");
		a1.printAccountInfo();
		
	}

}
