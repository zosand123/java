package ch03_operator;


//부호연산자
public class Ex01 {

	public static void main(String[] args) {
		
		int x = -100;
		int result = -x;
		System.out.println(result);			//100
		int result1 = +x;
		System.out.println(result1);           //-100
		
		
		short s = 100;
		//short result2 = -s; //단항연산자 쓰면 short가 int로 바뀜 *부호연산자의 산출타입은 int가 된다. 
		int result2 = -s;
		System.out.println(result2);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		//논리부정연산자(!)
		//ture를 false로, false를 true로
		boolean play = true;
		System.out.println("play="+play);
		
		if(play) {
				System.out.println("if 문 안의 play="+play);

		}
		
		
		play = !play;
		System.out.println(play);
		
		if(!play) {  //false의 반대인 ture가 되면서 if 조건이 충족되면 play변수값을 출력해라
			System.out.println("if 문 안의 play="+play);
		}
		
		
		
	}

}
