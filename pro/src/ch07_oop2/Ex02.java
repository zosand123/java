package ch07_oop2;

//final 클래스
public class Ex02 {

	public static void main(String[] args) {
		Madre02 m = new Madre02();
		m.abc();
		Fille02 f = new Fille02();
		f.abc(); //상속받은 madre02클래스의 메소드 abc()를 호출할수있다
		Madre022 m22 = new Madre022();
	//	Fille022 f22 = new Fille022();
		//f22.aaa1(); //부모한테 final붙이니까 안됨 
	}

}
final class Madre022{ 
	void aaa1() {
		System.out.println("Madre0222's aaa");
		}
	}
//class Fille022 extends Madre022{
	//void aaa2() {aaa();}
//}

class Madre02{
	int a = 10;
	void abc(){
		System.out.println("Madre02의 abc()함수야");
	}

}
//fille02클래스는 부모madre02의 필드와 메서드를 상속받았다 
class Fille02 extends Madre02{
	void aaa1() {abc();}
}