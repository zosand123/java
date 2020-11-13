package ch07_oop2;

import other.MyClass01;

public class MyClass03 {
	void dldl() {
		MyClass01 m = new MyClass01();
		m.pub = 11;
		//m.pro = 22; //서로다른패키지이지만 상속관계의 자식클래스에서는 접근가능
		//m.dft = 33;
		//m.pri = 44; //not visible //은닉화했음-동일클래스에서만 접근가능
		
		 m.pubMethod(); 
		// m.proMethod();
		 //m.packMethod(); 
		 //m.priMethod();
	}

}
