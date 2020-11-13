package ch10_DateAndCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

//528p
//java.text.SimpleDateFormat - 교재 p544
public class Date01 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("new Date()="+now);//그 줄에 커서두고 Ctrl+Alt+위아래방향키중 하나 = 복사 
		System.out.println("new Date()="+now.toString());
		
		SimpleDateFormat sdt = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow = sdt.format(now);
		System.out.println(strNow);
		
		sdt = new SimpleDateFormat("오늘은 E요일");
		strNow = sdt.format(now);
		System.out.println(strNow);
		
		sdt = new SimpleDateFormat("오늘 올해의 D번째날");
		strNow = sdt.format(now);
		System.out.println(strNow);
		
		sdt = new SimpleDateFormat("오늘은 이달의 d번째 날");
		strNow = sdt.format(now);
		System.out.println(strNow);
		
		
		

	}

}
