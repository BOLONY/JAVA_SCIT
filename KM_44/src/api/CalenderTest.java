package api;

import java.util.Calendar;

//Calendar Ŭ����
public class CalenderTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		int ampm = c.get(Calendar.AM_PM);
		int dayOf = c.get(Calendar.DAY_OF_WEEK);
		String yoil = null;
		
		switch(dayOf) {
		case 0:
			yoil = "��";
			break;
		case 1:
			yoil = "��";
			break;
		case 2:
			yoil = "��";
			break;
		case 3:
			yoil = "ȭ";
			break;
		case 4:
			yoil = "��";
			break;
		case 5:
			yoil = "��";
			break;
		case 6:
			yoil = "��";
			break;
		}
		/*������ ���ϱ� ���� 3���� ���
		 * 1.
		String names[] = {"��", "��", "ȭ"};
		String day = names[c.get(Calendar.DAY_OF_WEEK)-1];
		 * 2.
		switch (c.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY: day ="��"; break;	
		}
		 * 3.
		if (c.get(Calendar.DAY_OF_WEEK)== 1) {
			day = "��";
		}*/
		
		System.out.print(year + " ");
		System.out.print(month + " ");
		System.out.println(day);
		System.out.println(hour);
		System.out.println(min);
		
		String sAmpm = null;
		if(ampm == Calendar.AM) {
			sAmpm = "����";
		}
		else {
			sAmpm = "����";
		}
		
		//string�� int�� 
		//2023�� 4�� 20�� ����� ���� 5�� 42�� 45���Դϴ�.
		
		System.out.printf("%d�� %d�� %d�� %s���� %s %d�� %d�� %d���Դϴ�.",year, month+1, day,yoil,sAmpm, hour, min, sec );
		
	}

}
