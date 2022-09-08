package CalendarExample;

import java.util.Calendar;

public class CalendarEx02 {

	public static void main(String[] args) {
		//기본적으로 현재 날짜와 시간으로 설정된다
		Calendar today = Calendar.getInstance();
		//System.out.println(today);
		
		//System.out.println("요일(1~7)" + today.get(Calendar.DAY_OF_WEEK));
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int day = today.get(Calendar.DAY_OF_MONTH);
		int week = today.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		switch (week) {
		case 0:
			strWeek = "일요일";
			break;
		case 1:
			strWeek = "월요일";
			break;
		case 2:
			strWeek = "화요일";
			break;	
		case 3:
			strWeek = "수요일";
			break;
		case 4:
			strWeek = "목요일";
			break;
		case 5:
			strWeek = "금요일";
			break;
		case 6:
			strWeek = "토요일";
		}
		System.out.println(year+" "+month+" "+day+" "+strWeek+" ");

	}

}
