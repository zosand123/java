package ch07_oop2;

public class Person01_ex01 {

	public static void main(String[] args) {
		/*Person01 p1 = new Person01(); 
		Person01클래스에는 스트링타입 2개 파라미터로 가진 생성자가 존재하므로
		기본생성자는 사용할수없게된다. The constructor Person01() is undefined*/
		
		Person01 p1 = new Person01("505050","안은룡");
		System.out.println("p1.nation="+p1.nation);
		System.out.println("p1.ssn="+p1.ssn);
		System.out.println("p1.name="+p1.name);
		
		p1.name = "라리라";
		System.out.println("changed p1.name="+p1.name);
		//p1.ssn = "222555-4444445";객체생성할때 생성자의 argument값으로 초기값 저장됨
		//p1.nation = "dd"; 변수 선언할때 초기값저장됨
	}

}
