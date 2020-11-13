package ch03_operator;

//논리연산자
//연산자 우선순위 : 산술 > 비교 > 논리 > 대입
// &이나 | 하나만 쓰면 비트연산자, &&가 더 효율적이다.
public class Ex07 {

	public static void main(String[] args) {
			int charCode = '1';
			
			if(charCode >=65 & charCode <=90) {  //&&=and, ||=or
					System.out.println("대문자입니다");
	}
			if(charCode >=97 & charCode <=122) {
				System.out.println("소문자입니다");
}
			if(charCode >=48 & charCode <=57) {
				System.out.println("숫자입니다");
}

			int num = 5;
			
			if(num%2==0||num%3==0) {
				System.out.println(num+"는 2 또는 3의 배수이군요");
			} if(num%2==0|num%3==0) {
				System.out.println(num+"는 2 또는 3의 배수이군요");
			}	
			else {
				System.out.println("2나 3의 배수가 아닙니다.");
			}
			
			
} 
}
