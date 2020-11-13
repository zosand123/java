package ch06_oop;

public class Calcul_01 {

	public static void main(String[] args) {
		
		Calculator01 c1 = new Calculator01();
		
		c1.a();
		
		c1.powerOn();
		
		double rslt = c1.plus(2,45);
		System.out.println(rslt);
		
		double rslt2 = c1.divide(11,2);
		System.out.println(rslt2);
		
		c1.powerOff();
	}
}
