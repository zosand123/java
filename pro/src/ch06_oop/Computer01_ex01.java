package ch06_oop;

public class Computer01_ex01 {

	public static void main(String[] args) {
		Computer01 c1 = new Computer01();
		
		//배열변수 미리준비해서 사용하기
		int[] values = {1,4,5,5}; //배열변수 선언
		int result = c1.sum(values); //메소드호출방법1
	    System.out.println(result);
	    
		System.out.println();
		//배열을 미리 생성하지않고, 메소드 호출시 넘겨준다
		//메소드 호출시 넘겨준 값의 수에 따라서 자동으로 배열이 생성되고 매개값으로 사용된다
		int result1 = c1.sum(new int[] {1,4,5,6});//메호방2
		System.out.println(result1);
		
		System.out.println();
		
		int result2 = c1.sum1(1,4,5,7);//메호방3
		System.out.println(result2);
	}

}
