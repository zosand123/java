package ch06_oop;

public class Car03_ex01 {

	public static void main(String[] args) {

		Car03 c1 = new Car03();
		System.out.println(c1.company);
		System.out.println();
		
		Car03 c2 = new Car03("chairman");
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println();
		
		Car03 c3 = new Car03("chairman1","Sky Blue");
		System.out.println(c3.model+c3.color+c3.maxSpeed);
		System.out.println();
		
		Car03 c4 = new Car03("chairman2","black",300);
		System.out.println(c4.model+c4.color+c4.maxSpeed);
		
	}

}
