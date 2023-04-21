package ch06.bankPractice;

public class AccountTest {
	
	public static final String BANK_NO = "123";
	public static final String AREA_NO = "0236";
		
		public static void main(String[] args) {
		//int ����1 = AccountIDGen.genAccID(BANK_NO, AREA_NO);
		//Account a1 = new Account(����1, "ȫ�浿", 500);
		//�ٵ� �̷��� �������� ���� ���� ���� ����������.
		Account a1 = new Account(AccountIDGen.genAccID(BANK_NO, AREA_NO), "ȫ�浿", 500);
		Account a2 = new Account(AccountIDGen.genAccID(BANK_NO, AREA_NO), "��ö��", 1500);
		
		/*a.deposit(amount); //�ʿ� ���ؼ� �и��� ��Ų�� ���̴�. ��������
		System.out.println("=========[�Ա�]===========");
		System.out.printf("%s ���¿� %d���� �ԱݵǾ����ϴ�.\n", a.getAccNo(), amount);
		System.out.printf("���� �ܰ� : %d�� �Դϴ�.\n", a.getBalance());
		System.out.println("===================");*/
		}
		
		//main �̶� �޼��尡 ����ƽ�̴� ����.
		public static void deposit(Account a, long amount) {
			a.deposit(amount);
			System.out.println("=========[�Ա�]===========");
			System.out.printf("%s ���¿� %d���� �ԱݵǾ����ϴ�.\n", a.getAccNo(), amount);
			System.out.printf("���� �ܰ� : %d�� �Դϴ�.\n", a.getBalance());
			System.out.println("===================");
		}
		public static void transfer(Account from, Account to, long amount) {
			if (from.transfer(amount, to)) {
				System.out.println("=========[��ü]=========");
				System.out.println("%s���·κ��� %���¿� %d���� ��ü �Ǿ����ϴ�.");
				System.out.printf("���� �ܰ�: %d�� �Դϴ�. \n", from.getBalance());
				System.out.println("===========================");
			} else {
				System.out.println("�ܰ� �����ؼ� ��ü�� �����߽��ϴ�.");
			}//else
		}//void transfer
}//class AccountTest