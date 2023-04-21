package ch06.bankPractice;

import java.util.Random;
//java.util��Ű�� ���� '����' Ŭ����

//��ƿ��Ƽ Ŭ����
// ���¹�ȣ ������ ��ȯ.
public class AccountIDGen {
	// �Ź� ��ü�� ���� ���̵� �����ؾ� �ϴ� static���� ����Ѵ�.
	public static String genAccID(String bankNo,String areaNo) {
		String accID = bankNo+ "-" + areaNo + "-"; 
		Random r = new Random(); //��ƿ�� �ִ� Ŭ����.
		int no = r.nextInt(10000); //9999������ ���� ����.
		if(no<10) accID = accID +"000"+no;
		else if(no<100) accID = accID +"00" + no;
		else if(no<1000) accID = accID +"0" + no;
		else accID = accID + no;
		
		return accID;
	}
}


