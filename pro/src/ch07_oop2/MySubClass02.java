package ch07_oop2;

import other.MyClass01;


	class MySubClass01 extends MyClass01{
		void qqq() {
			pub = 11;
			pro = 22; //서로다른패키지이지만 상속관계의 자식클래스에서는 접근가능
			//dft = 33; error
			//pri = 44; //not visible //은닉화했음-동일클래스에서만 접근가능
			
		}
	}


