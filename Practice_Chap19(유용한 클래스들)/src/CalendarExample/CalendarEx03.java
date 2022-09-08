package CalendarExample;

import java.util.Calendar;

public class CalendarEx03 {

	public static void main(String[] args) {
		//기본적으로 현재 날짜와 시간으로 설정된다
		Calendar today1 = Calendar.getInstance();
		Calendar today2 = Calendar.getInstance();
		//System.out.println(today);
		//날짜를 설정
		today1.set(2015, 7, 15);
		
		
		long diff = (today2.getTimeInMillis() - today1.getTimeInMillis()) / 1000;
		//1일 = 24*60*60*1000
		System.out.println("20150715~20220814 지난초: " + diff);	
		long diffDay =diff/(24*60*60);
		System.out.println("20150715~20220814 지난초: " + diffDay);	
		
	
		

	}

}
