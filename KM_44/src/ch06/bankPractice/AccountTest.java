package ch06.bankPractice;

public class AccountTest {
	
	public static final String BANK_NO = "123";
	public static final String AREA_NO = "0236";
		
		public static void main(String[] args) {
		//int 변수1 = AccountIDGen.genAccID(BANK_NO, AREA_NO);
		//Account a1 = new Account(변수1, "홍길동", 500);
		//근데 이렇게 변수생성 없이 쓰면 줄이 간결해진다.
		Account a1 = new Account(AccountIDGen.genAccID(BANK_NO, AREA_NO), "홍길동", 500);
		Account a2 = new Account(AccountIDGen.genAccID(BANK_NO, AREA_NO), "김철수", 1500);
		
		/*a.deposit(amount); //필에 의해서 분리를 시킨것 뿐이다. 보기좋게
		System.out.println("=========[입금]===========");
		System.out.printf("%s 계좌에 %d원이 입금되었습니다.\n", a.getAccNo(), amount);
		System.out.printf("현재 잔고 : %d원 입니다.\n", a.getBalance());
		System.out.println("===================");*/
		}
		
		//main 이란 메서드가 스태틱이다 보니.
		public static void deposit(Account a, long amount) {
			a.deposit(amount);
			System.out.println("=========[입금]===========");
			System.out.printf("%s 계좌에 %d원이 입금되었습니다.\n", a.getAccNo(), amount);
			System.out.printf("현재 잔고 : %d원 입니다.\n", a.getBalance());
			System.out.println("===================");
		}
		public static void transfer(Account from, Account to, long amount) {
			if (from.transfer(amount, to)) {
				System.out.println("=========[이체]=========");
				System.out.println("%s계좌로부터 %계좌에 %d원이 이체 되었습니다.");
				System.out.printf("현재 잔고: %d원 입니다. \n", from.getBalance());
				System.out.println("===========================");
			} else {
				System.out.println("잔고가 부족해서 이체를 실패했습니다.");
			}//else
		}//void transfer
}//class AccountTest