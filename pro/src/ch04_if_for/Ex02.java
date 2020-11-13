package ch04_if_for;

//조건문
/*90점이상이면 A등급
 * 80점 " -B
 * "
 * "
 * 60점미만-F 출력
 */
/*
 * random
public static double random()

Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0. 
Returned values are chosen pseudorandomly with (approximately) uniform distribution from that range. 
When this method is first called, it creates a single new pseudorandom-number generator, 
exactly as if by the expression 
 */
public class Ex02 {

	public static void main(String[] args) {
			double num = Math.random();
			System.out.println("Math.random()="+num);
			System.out.println("(int)Math.random()="+(int)num);
			//Math.random()*(큰수-작은수+1)+작은수
			//(int)(Math.random()*(큰수-작은수+1)+작은수)
			System.out.println( (int)(Math.random()*(100-0+1)+0) );
			System.out.println( (int)(Math.random()*(5-0+1)+0) );
			System.out.println( (int)(Math.random()*(5-0+1)+0) );
			
			int score =  (int)(Math.random()*(100-0+1)+0);		//임의점수값을 변수에 저장
			String grade="";	//등급을 저장하기위한 변수
			
			if (score>=90) {
				grade="A";
			} else if(score>=80) {
				grade="B";
			} else if(score>=70) {
				grade="C";
			} else if(score>=60) {
				grade="D";
			} else {
				grade="F";
			}		
			System.out.println(score+"점 : "+"Grade "+grade);
	}

}
