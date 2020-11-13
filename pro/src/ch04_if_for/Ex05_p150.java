package ch04_if_for;

import java.util.Scanner; //java.util 패키지안에 스캐너 클래스를 임포트 , 40p, 510p

/*가위바위보게임 자바의정석 150p
 * 가위(1), 바위(2), 보(3)
 * 컴퓨터 - Math.random()
 * 유저 - Scanner 클래스이용
*/
public class Ex05_p150 {

	public static void main(String[] args) {
		System.out.println("가위(1), 바위(2), 보(3) 중에 하나를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt(); //콘솔을 통해 입력받은 데이터를 숫자형태로 받겠다.
		
		int computer = (int)(Math.random()*(3-1+1)+1); //컴퓨터값 임의설정
		
		switch(user) {
		case 1: System.out.println("당신은 가위를 냈습니다.");
		break;
		case 2: System.out.println("당신은 바위를 냈습니다.");
		break;
		case 3: System.out.println("당신은 보를 냈습니다.");
		break;
		}

		switch(computer) {
		case 1: System.out.println("컴퓨터는 가위를 냈습니다.");
		break;
		case 2: System.out.println("컴퓨터는 바위를 냈습니다.");
		break;
		case 3: System.out.println("컴퓨터는 보를 냈습니다.");
		break;
		}
		
		//가위(1), 바위(2), 보(3) 
		switch(user-computer) { 
		case 2:   case -1: 
			System.out.println("당신이 졌습니다.");
		break;
		case 1:   case -2: 
			System.out.println("당신이 이겼습니다.");
		break;
		case 0: System.out.println("비겼습니다.");
		break;
		}
	}

}
