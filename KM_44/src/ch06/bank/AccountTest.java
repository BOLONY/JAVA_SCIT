package ch06.bank;

	public class AccountTest {
	
	//����� ���ٲٴ� �ٲ��� ���ϴ� ��ɾ� final�� ����.
	public static final String BANK_NO = "123";
	public static final String AREA_NO = "0235";
	
	public static void main(String[] args) {
		//�⺻������ this �Ⱥپ� �־ ��. 
		Account a1 = new Account(AccountIDGen.genAccID(BANK_NO, AREA_NO), "ȫ�浿", 500);
		Account a2 = new Account(AccountIDGen.genAccID(BANK_NO, AREA_NO), "��ö��", 1500);
		transfer(a1, a2, 300); //AccountTest Ŭ���� ���� transfer
		//deposit(a1, 1250);
	}
	
	public static void deposit(Account a, long amount) {
		a.deposit(amount);
		System.out.println("=============[�Ա�]==============");
		System.out.printf("%s ���¿� %d���� �Ա� �Ǿ����ϴ�.\n", a.getAccNo(), amount);
		System.out.printf("���� �ܰ�: %d�� �Դϴ�.\n", a.getBalance());
		System.out.println("=================================");
	}
	
	//�����κ��� �������� �󸶸�ŭ
	public static void transfer(Account from, Account to, long amount) {
		if(from.transfer(amount, to)) {
			System.out.println("=============[��ü]===============");
			System.out.printf("%s���·κ��� %s ���¿� %d���� ��ü �Ǿ����ϴ�.\n", from.getAccNo(), to.getAccNo(), amount);
			System.out.printf("���� �ܰ�: %d�� �Դϴ�.\n", from.getBalance());
			System.out.println("=================================");
		}else {
			System.out.println("�ܰ� �����ؼ� ��ü�� �����߽��ϴ�.");
		}
	}//transfer
}
