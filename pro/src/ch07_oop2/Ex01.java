package ch07_oop2; //package와 import

//import java.util.Date;
//import java.util.Random; //util패키지안의 random클래스만을 import한다
import java.util.*; //util패키지안의 모든 클래스를 임포트! but util패키지안의 하위패키지의 클래스는 제외한다 
//import 단축기 ctrl+shift + o

//상위클래스=부모클래스=조살클래스=super클래스
//하위''=자식''=자손'' = sub class
//public class Ex01 extends Object{ //Object클래스 묵시적으로 상속받고있다 
public class Ex01 {
	public static void main(String[] args) {
		//java.util.Date today = new java.util.Date(); 클래스의 풀네임을 써서 이렇게할수도있지만 보통 안함 
		Date today = new Date(); //import안하면 컴파일에러
		System.out.println(today);
		
	    System.out.println(new Random().nextInt());
	    
	    Ex01 e1 = new Ex01();
	    Ex01 e2 = new Ex01();
	    //모든클래스의 최고조상클래스는 object클래스이다, 따라서 모든 클래스는 object클래스가 가진 method를 사용가능
	    //Ex01클래스를 각각 new해서 참조변수 e1과 e2에 주소를 할당
	    //객체는 new할때마다 서로 다른 주소지가 생기므로 e1과 e2에 저장된 주소가 다르므로 2개의 참조변수의 주소가 같은지 비교하고 같지않아서 false나옴.
	    //이 때 주소지를 비교하는 equals는 object
	    System.out.println(e1.equals(e2));
	    System.out.println(e1==e2);
	}

}
