package ch04_if_for;

//switch문 : ==(항상일치하는) 비교연산자만 사용. 그외다른비교연산x(예:> < >= !=)

public class Ex03 {

	public static void main(String[] args) {
			int num = (int)((Math.random()*6)+1);
			System.out.println(num);
			
			switch(num) {
			case 1:System.out.println("1번이 나왔어요"); break;
			case 2:System.out.println("2번이 나왔어요"); break;
			case 3:System.out.println("3번이 나왔어요"); break;
			case 4:System.out.println("4번이 나왔어요"); break;
			case 5:System.out.println("5번이 나왔어요"); break;
			case 6:System.out.println("6번이 나왔어요"); break;
			}
	}

}
