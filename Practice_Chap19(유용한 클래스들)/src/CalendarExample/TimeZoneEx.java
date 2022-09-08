package CalendarExample;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneEx {

	public static void main(String[] args) {
		//time zone을 스트링 배열타입으로 리턴
		String[] timezone = TimeZone.getAvailableIDs();
		for(String zoneId : timezone) {
			System.out.println("존영역 : " + zoneId);
		}
		TimeZone tz = TimeZone.getTimeZone("America/NewYork");
		Calendar today = Calendar.getInstance(tz);
		System.out.println(toString(today));

	}
	public static String toString(Calendar date) {
		int i = date.get(Calendar.AM_PM);
		String str ="";
		if(i==0) {
			str = "AM";
		}
		else {
			str ="PM";
		}
		return date.get(Calendar.YEAR)+" "+date.get(Calendar.MONTH)+" "+date.get(Calendar.DATE)+" "+date.get(Calendar.HOUR_OF_DAY)
				+" "+str + date.get(Calendar.MINUTE)+" "+date.get(Calendar.SECOND);
		
		
		
	}
}


