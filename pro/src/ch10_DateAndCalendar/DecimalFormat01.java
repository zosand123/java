package ch10_DateAndCalendar;

import java.text.DecimalFormat;

//DecimalFormat - p540
//숫자의 형식화 
public class DecimalFormat01 {

	public static void main(String[] args) {
		DecimalFormat df = null;
		double num = 1234567.89;
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("###,###.######");
		System.out.println(df.format(num));
		System.out.println();
		//-------------------------------------
		df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("000,000.00000000");
		System.out.println(df.format(num));
	}

}
