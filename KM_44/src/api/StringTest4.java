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
			System.out.print("�ֹε�� ��ȣ (000000-0000000 ����) : " );
			String sNum = sc.nextLine();
			//System.out.println(sNum);
			
			if (sNum.length() != 14) {
				System.out.println("���ڼ��� Ȯ���ϼ���.");
			}
			
			for(int i=0; i<sNum.length(); i++) {
	            if(i==6)continue;
	            if(sNum.charAt(i) <'0' || sNum.charAt(i)>'9') {
	               System.out.println("* ���ڷ� �Է��ϼ���.");
	               continue end;
	            }            
	         }
			
			
			String dash2 = sNum.substring(6,7);
//			System.out.println(dash2);
			if (!dash2.equals ("-")) {
				System.out.println("'-'���� ���еǾ�� �մϴ�.");
				continue;
			}
			
			//�� ����
			int month = Integer.parseInt(sNum.substring(2,4));
//			System.out.println(month);
			//System.out.println(month);
			if (0 > month||month>12) {
				System.out.println("���� �߸� �Է��߽��ϴ�.");
				continue;
			}

			
			//�� ����
			int date = Integer.parseInt(sNum.substring(4,6));
			//System.out.println(date);970305
			if (0>date||date>31) {
				System.out.println("���� 1~31�� �Է��ϼ���:");
				continue;
			}
			//���� 1~28�� �Է��ϼ���
			if (month == 2 && date >28 ) {
				System.out.println("���� 2~28�� �Է��ϼ���");
				continue;
			}
			
			//�ֹε�Ϲ�ȣ:
			int id = Integer.parseInt(sNum.substring(7,8));
//			System.out.println(id);
			
			if (id > 4 || id < 1) {
				System.out.println("������ Ȯ���ϼ���.");
				continue;
			}
			String s = id == 1 || id ==3 ? "����" : "����";
			
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
			System.out.printf("%s�� %d�� %d�ϻ� �� %s�� %s�Դϴ�.",seokju,month,date,r_sAge,s);
			break;
			
		}//while(true)
		
		
		
		
		
//		if(Integer.parseInt(sNum.substring(0,6))){
//			System.out.println("���ڷ� �Է��ϼ���");
//		}
		
//		if (sNum.substring(1,7)) {
//			
//		}
		//���� ����
		// 970305-1850419
		// 0123456789,10,11,12,13,14
		
		//�ݺ��� {
			//�Է�
			//����
			//�Է� �����϶��� �ٽ� �Է�
		//}
		
		//��� ���
		// ���ڼ�, -, ����, ���� 1~12, 1~28, ����, �ֹ�
	}

}
