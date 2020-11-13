package ch03_operator;

//연결연산자 '+'
//문자열과 숫자가 혼합된 +연산식은 왼쪽에서 오른쪽으로 연산 진행되고 문자열화됨 
public class Ex04 {

	public static void main(String[] args) {
			
			System.out.println("JDK"+8.0); //"JDK"+"8.0" -> 숫자가 문자열로 하나됨 
			System.out.println(8.0);
			
			String str = "jdk"+3.0+5.0;
			System.out.println(str); //jdk3.05.0
			
			System.out.println("jdk"+(3.0+5.0)); //jdk8.0
	
			System.out.println((3.0+5.0)+"버전");
			
	}

}
