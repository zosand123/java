package ch03_operator;

//삼항연산자 조건? 참값 : 거짓값 => if(조건){참값}else{거짓값}
//A학점 : 100~91
//B학점 : 90~81
public class Ex08 {

	public static void main(String[] args) {
			int score = 79;
			
			String result = (score<=100 && score>90)? "A학점":(score<=90&&score>=81)? "B학점":"C학점"; 
			System.out.println(score+"점수는 "+result);
				
			if(score<=100 && score>90) {
					System.out.println("A학점입니다");
			}else if(score<=90&& score>=81) {
					System.out.println("B학점입니다");
			}else if(score<=80&&score>=71){
					System.out.println("C학점입니다");
			}else { 
				System.out.println("기타");
			}
		
		
	}

}
