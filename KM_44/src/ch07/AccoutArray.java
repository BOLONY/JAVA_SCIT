package ch07;
import ch06.bank.Account;
public class AccoutArray {

	public static void main(String[] args) {
		Account a[] = new Account[3];
		a[0] = new Account("11-11", "ȫ�浿", 500);// �ؽ��ڵ� ��ī��Ʈ ��ü�� ������� ���� �ϳ��� ������.
		a[0].printAccInfo();
		
		System.out.println(a[0]); //�������̶� null��. ���� �ʳ־����� �⺻ ������Ÿ���� ä������.
		
	}
	
	
}
 