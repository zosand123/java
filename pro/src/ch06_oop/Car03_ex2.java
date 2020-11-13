package ch06_oop;

public class Car03_ex2 {

	public static void main(String[] args) {

		Car03_transform c1 = new Car03_transform();
		System.out.println(c1.company);
		System.out.println();
		
		Car03_transform c2 = new Car03_transform("suv");
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println();
		
		Car03_transform c3 = new Car03_transform("suv1","red");
		System.out.println(c3.model+c3.color+c3.maxSpeed);
		System.out.println();
		
		Car03_transform c4 = new Car03_transform("suv2","black",300);
		System.out.println(c4.model+c4.color+c4.maxSpeed);
		
	}

}
