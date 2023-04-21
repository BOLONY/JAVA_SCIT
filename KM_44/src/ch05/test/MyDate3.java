package ch05.test;

public class MyDate3 {
	private int day;
	private int month;
	private int year;
	
	public MyDate3(int year, int day, int month){
		this.year = year;
		this.day = day;
		this.month = month;
	}
	
	public int maxDays(int year, int month) {
		int maxDays = 0;
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			maxDays = 31;
			break;
		case 4: case 6: case 9: case 11:
			maxDays = 30;
			break;
		case 2:
			if((year%4 == 0 && year%100 != 0) || (year % 400 == 0))
			{
				maxDays = 29;
			}
			else {
				maxDays = 28;
			}
		}//out of switch.
		return maxDays;
	}
	
	public boolean isValid(){
		if((this.year<1) || (this.month <1)||(this.month > 12) || (this.day<1 || this.day> maxDays(this.year,this.month))) {
			return false;
		}
		else {
			return true;
		}
	}//isValid()
	
	
}//class
