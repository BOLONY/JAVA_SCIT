package api;
import java.util.Scanner;
import java.util.Calendar;



public class StringTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		int cYear = c.get(Calendar.YEAR);
		int cMonth = c.get(Calendar.MONTH) + 1;
		int cDay = c.get(Calendar.DATE);
		
        
		
		
		end:
		while(true) {
			System.out.print("주민등록 번호 (000000-0000000 형식) : " );
			String sNum = sc.nextLine();
			//System.out.println(sNum);
			
			if (sNum.length() != 14) {
				System.out.println("글자수를 확인하세요.");
			}
			
			for(int i=0; i<sNum.length(); i++) {
	            if(i==6)continue;
	            if(sNum.charAt(i) <'0' || sNum.charAt(i)>'9') {
	               System.out.println("* 숫자로 입력하세요.");
	               continue end;
	            }            
	         }
			
			
			String dash2 = sNum.substring(6,7);
//			System.out.println(dash2);
			if (!dash2.equals ("-")) {
				System.out.println("'-'으로 구분되어야 합니다.");
				continue;
			}
			
			//월 구분
			int month = Integer.parseInt(sNum.substring(2,4));
//			System.out.println(month);
			//System.out.println(month);
			if (0 > month||month>12) {
				System.out.println("월을 잘못 입력했습니다.");
				continue;
			}

			
			//날 구분
			int date = Integer.parseInt(sNum.substring(4,6));
			//System.out.println(date);970305
			if (0>date||date>31) {
				System.out.println("월은 1~31로 입력하세요:");
				continue;
			}
			//일은 1~28로 입력하세요
			if (month == 2 && date >28 ) {
				System.out.println("일은 2~28로 입력하세요");
				continue;
			}
			
			//주민등록번호:
			int id = Integer.parseInt(sNum.substring(7,8));
//			System.out.println(id);
			
			if (id > 4 || id < 1) {
				System.out.println("성별을 확인하세요.");
				continue;
			}
			String s = id == 1 || id ==3 ? "남자" : "여자";
			
			String globalYear = Integer.toString(cYear);
			
			String globalMonth = Integer.toString(cMonth);
			if(cMonth<10) {
				globalMonth = "0" + globalMonth;
			}
			String globalDate = Integer.toString(cDay);
			if(cDay<10){
				globalDate = "0" + globalDate;
			}
			
			String globalTime = globalYear + globalMonth + globalDate;
			int globalIntTime = Integer.parseInt(globalTime); 
			
			//System.out.println(globalTime);
			
			int year = Integer.parseInt(sNum.substring(0,6));
			//System.out.println(year);
			int age = globalIntTime-year;
			//System.out.println(age);
			String sAge = Integer.toString(age);
			String r_sAge = sAge.substring(2,4);
			
			String seokju = sNum.substring(0,2);
			
		//	System.out.println(r_sAge);
			System.out.printf("%s년 %d월 %d일생 만 %s세 %s입니다.",seokju,month,date,r_sAge,s);
			break;
			
		}//while(true)
		
		
		
		
		
//		if(Integer.parseInt(sNum.substring(0,6))){
//			System.out.println("숫자로 입력하세요");
//		}
		
//		if (sNum.substring(1,7)) {
//			
//		}
		//변수 선언
		// 970305-1850419
		// 0123456789,10,11,12,13,14
		
		//반복문 {
			//입력
			//검증
			//입력 오류일때는 다시 입력
		//}
		
		//결과 출력
		// 글자수, -, 숫자, 월은 1~12, 1~28, 성별, 주민
	}

}
