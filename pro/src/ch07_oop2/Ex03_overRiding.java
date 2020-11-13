package ch07_oop2;
//상속
//super(): 부모클래스의 생성자를 호출. 주의:반드시 생성자안에서 첫번째문장으로 작성
//this():자신의 또다른 생성자를 호출
public class Ex03_overRiding {

	public static void main(String[] args) {
		Hija hj = new Hija(123);
		
	}

}

class abuela{
	abuela(){System.out.println("abuela의 기본생성자");}
	abuela(int b){System.out.println("abuela의 int1개 기본생성자");}
}

class Madre extends abuela{
	Madre(){System.out.println("Madre의 기본생성자");}
	Madre(int a){
		super(a);
		System.out.println("Madre의 int1개 생성자");}
	Madre(double a){
		System.out.println("Madre의 double1개 생성자");}//메소드오버로딩
}

class Hija extends Madre{
	Hija(){
		super(100);
		System.out.println("Hija의 기본생성자");
		}
	Hija(int x){
		super(x);
		System.out.println("Hija의 int1개 생성자");
		}
}