package ch10_DateAndCalendar;

import java.util.Calendar;

//java.util.Calendar클래스-528p 
//Calendar클래스는 달력을 표현한 클래스이다.
//추상(abstract)클래스이므로 new 연산자를 사용해서 인스턴스를 생성할 수 없다.
//그 이유는 날짜와 시간을 계산하는 방법이 나라,지역에 따라 다르기 때문이다.
//꼭필요한 메소드들만 선언되어 있고, 계산로직은 하위클래스에서 구현하도록 돼있다.
//getInstance()를 이용해서 현재 운영체제에 설정되어있는 시간대(TimeZone)를 기준으로 객체를 얻을 수 있다.
public class Calendar01 {

	public static void main(String[] args) {
		//Calendar now = new Calendar(); 안됨
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1; //1월은 0으로 리턴되므로 +1
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.printf("%d/%d/%d",year,month,day);
		
		System.out.println();
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY : strWeek = "월요일"; break;//2
		case Calendar.TUESDAY : strWeek = "화요일"; break;//3
		case Calendar.WEDNESDAY : strWeek = "수요일"; break;//4
		case Calendar.THURSDAY : strWeek = "목요일"; break;//5
		case Calendar.FRIDAY : strWeek = "금요일"; break;//6
		case Calendar.SATURDAY : strWeek = "토요일"; break;//7
		default : strWeek = "일요일"; break; 
		}
		System.out.printf("%s",strWeek);
		
		int amPm = now.get(Calendar.AM_PM); //0은 오전, 1은 오후
		String strAmPm = null;
		if(amPm==Calendar.AM) { //if(amPm==0){
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println();
		System.out.printf("%s %d:%d:%d",strAmPm,hour,minute,second);
		
	}
}
