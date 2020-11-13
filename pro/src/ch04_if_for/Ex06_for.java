package ch04_if_for;

//for문
public class Ex06_for {

	public static void main(String[] args) {
		//
		int j=0;
		for(; ;) {
			if (j<5) {
			System.out.println(j);//반복실행코드
			j++;	}
		else {
			System.out.println("조건x");
			break; //반복문종료
		}
	}
		System.out.println("-------------------");
		
	int sum = 0;	//누적된 합을 저장하기위해 선언한 변수
	for(int i=0; i<11; i++) {
			sum += i; //== sum = sum+i; //대입연산자 
			System.out.println("sum+i="+sum);
		}
		
		System.out.println("총합="+sum); //한번만 하면되면 반복문 밖에서 처리
		
		System.out.println("-------------------");
		
		int dan = 0;
		for(int i=1; i<11; i++) {
			dan =2;
			int result = 2*i;
			System.out.println(dan+"*"+i+"="+result);
		}
		
	System.out.println("----------------------");
		
		for(int i=5; i>=1; i--) {
			System.out.println("i="+i);
		}
		
	System.out.println("----------------------");
		//1 2 3...부터 8 9 10까지 출력		
		for (int i=1; i<11; i++) {
			System.out.println("i="+i);
		
		}
	}

}
