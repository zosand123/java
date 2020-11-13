package other;

//동일패키지안의 부모클래스인 MyClass01에서 선언된 필드에 접근허용
public class MySubClass01 extends MyClass01{
	void qqq() {
		
		pub = 11;
		pro = 22;
		dft = 33;
		//m.pri = 44; //not visible //은닉화했음-동일클래스에서만 접근가능
		System.out.println(pro);
		
		 pubMethod(); 
		 proMethod();
		 packMethod(); 
		 //priMethod();
	}
}
