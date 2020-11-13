package ch06_oop;

class Data1{int x;}
public class ReferenceParamEx {

	public static void main(String[] args) {
		
		Data1 d = new Data1(); 
		System.out.println(d.x);
		d.x=10;//참조변수안에 저장된 주소를 참조하여 해당클래스의 필드,메소드에 접근가능
		System.out.println("change 호출전 d.x="+d.x); 
		
		change(d);
		System.out.println("change호출후 x="+d.x);
	}

	static void change(Data1 d) {
		d.x=1000;
		System.out.println("changed x="+d.x);
	}

}
