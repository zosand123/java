package ch04_if_for;

//do while문 
//{}블럭이 최소한 한번이상 수행될것을 보장
public class Ex06_do_while {

	public static void main(String[] args) {
			//1 2 3 4 5 출력
		int i = 0;
		do { 
			i++;
			System.out.println("i="+i); //조건충족하지않아도 1번은 실행된다.	
		}while(i<5);
	}

}
