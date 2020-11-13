package ch03_operator;

import ch02_variable.Ex06;

//문자열비교 ★★★★★★★★★
//== 는 (객체의)주소를 비교한다
public class Ex06_star {

	public static void main(String[] args) {
		
			Ex06 obj1 = new Ex06();
			Ex06 obj2 = new Ex06();
			System.out.println("obj1="+obj1);
			System.out.println("obj2="+obj2);
			
			String str1 = "김뽀미";
			String str2 = "김뽀미";	 		//간결한방법
			String str3 = new String("김뽀미"); 	//객체	//정석방법
			String str4 = new String("김뽀미");
			
			System.out.println("str1="+str1);
			System.out.println("str2="+str2);
		
			if(str1==str2) {
				System.out.println("str1과 str2는 일치한다");
			}else { System.out.println("str1과 str2는 일치하지않는다");
				
			}
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("str3="+str3);
			System.out.println("str4="+str4);
			
			if(str3==str4) { //== 는 (객체의)주소를 비교한다
				System.out.println("str3과 str4는 주소가 일치한다");
			}else { System.out.println("str3과 str4는 주소가 일치하지않는다");
				
			}
			
			if(str3.equals(str4)) { //equals는 값을 비교한다.
				System.out.println("str3과 str4는 값이 일치한다");
			}else { System.out.println("str3과 str4는 값이 일치하지않는다");
				
			}
		
	}

}
