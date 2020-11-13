package other;

//Myclass01에서 선언된 필드와 메소드에 접근할 수 있는지 확인
public class MyClass02 {
	void qqq() {
		MyClass01 m = new MyClass01();
		m.pub = 11;
		m.pro = 22;
		m.dft = 33;
		//m.pri = 44; //not visible //은닉화했음-동일클래스에서만 접근가능
		
		 m.pubMethod(); 
		 m.proMethod();
		 m.packMethod(); 
		// m.priMethod(); //error
	}
}
