package ch06.bank;

	public class AccountTest {
	
	//상수는 못바꾸니 바꾸지 못하는 명령어 final을 쓴다.
	public static final String BANK_NO = "123";
	public static final String AREA_NO = "0235";
	
	public static void main(String[] args) {
		//기본적으로 this 안붙어 있어도 다. 
		Account a1 = new Account(AccountIDGen.genAccID(BANK_NO, AREA_NO), "홍길동", 500);
		Account a2 = new Account(AccountIDGen.genAccID(BANK_NO, AREA_NO), "김철수", 1500);
		transfer(a1, a2, 300); //AccountTest 클래스 안의 transfer
		//deposit(a1, 1250);
	}
	
	public static void deposit(Account a, long amount) {
		a.deposit(amount);
		System.out.println("=============[입금]==============");
		System.out.printf("%s 계좌에 %d원이 입금 되었습니다.\n", a.getAccNo(), amount);
		System.out.printf("현재 잔고: %d원 입니다.\n", a.getBalance());
		System.out.println("=================================");
	}
	
	//누구로부터 누구에게 얼마만큼
	public static void transfer(Account from, Account to, long amount) {
		if(from.transfer(amount, to)) {
			System.out.println("=============[이체]===============");
			System.out.printf("%s계좌로부터 %s 계좌에 %d원이 이체 되었습니다.\n", from.getAccNo(), to.getAccNo(), amount);
			System.out.printf("현재 잔고: %d원 입니다.\n", from.getBalance());
			System.out.println("=================================");
		}else {
			System.out.println("잔고가 부족해서 이체를 실패했습니다.");
		}
	}//transfer
}
