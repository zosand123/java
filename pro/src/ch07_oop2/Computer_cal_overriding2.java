package ch07_oop2;

public class Computer_cal_overriding2 extends Calculator_overriding2 {
	
	// @ 공지의미 + 조건충족하는지 검사하는기능
	@Override
	double areaCircle(double r) {
		System.out.println("Computer_cal_overriding2-areaCircle(double r)실행");
		return Math.PI * r * r;
	}
	
}
