package ch05.test;

public class MyDate2 {
	private int day;
	private int month;
	private int year;
	
	public MyDate2 (int year, int month, int day) {
		this.year =  year;
		this.month = month;
		this.day = day;
	}
	
	public int getMaxDays(int year, int month) {
		int maxDays = 0;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			maxDays = 31;
			break;
		case 4: case 6: case 9: case 11:
			maxDays = 30;
			break;
		case 2:
			if((year%4 ==0 && year%100 !=0 ) || (year %400 ==0)) {
				maxDays = 29;
			}
			else {
				maxDays = 28;
			}
		}//switch;
		return maxDays;
	}//getMaxDays
	
	public boolean isValid() {
		if((year<1) || (month<1) || (month > 12) || (day<1 || day>getMaxDays(year,month))) {
			return false;
		}
		else { 
			return true;
		}
	}
}//class


