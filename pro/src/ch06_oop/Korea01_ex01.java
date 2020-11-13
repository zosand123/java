package ch06_oop;

//Korea01 클래스의 객체를 생성하여 실행하는 클래스

public class Korea01_ex01 {

	public static void main(String[] args) {
		//korean01 클래스로부터 객체생성
		Korea01 k1 = new Korea01();
		
		//필드값출력
		//System.out.println(k1.nation);
		//System.out.println(k1.age);
		//System.out.println(k1.ssn);
		
		//매개변수의 타입, 갯수, 순서에 맞는 생성자가 자동으로 호출된다
		Korea01 k2 = new Korea01("가넷");
		
		Korea01 k3 = new Korea01(33);
		
		Korea01 k4 = new Korea01("미국","9777112-1234554");
		
		Korea01 k5 = new Korea01("프랑스","6377112-1234554",67);
		
		//k2객체의 이름개명하기
		k2.setName("로사");
		
		String n = k2.getName();
		System.out.println(n);
	}

}
