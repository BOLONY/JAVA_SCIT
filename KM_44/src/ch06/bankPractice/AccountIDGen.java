package ch06.bankPractice;

import java.util.Random;
//java.util패키지 내의 '랜덤' 클래스

//유틸리티 클래스
// 계좌번호 생성과 반환.
public class AccountIDGen {
	// 매번 객체를 만들어서 아이디 생성해야 하니 static으로 사용한다.
	public static String genAccID(String bankNo,String areaNo) {
		String accID = bankNo+ "-" + areaNo + "-"; 
		Random r = new Random(); //유틸에 있는 클래스.
		int no = r.nextInt(10000); //9999까지의 난수 생성.
		if(no<10) accID = accID +"000"+no;
		else if(no<100) accID = accID +"00" + no;
		else if(no<1000) accID = accID +"0" + no;
		else accID = accID + no;
		
		return accID;
	}
}


