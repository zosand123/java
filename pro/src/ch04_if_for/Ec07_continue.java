package ch04_if_for;

public class Ec07_continue {

	public static void main(String[] args) {

			for(int i=0; i<11; i++) {
				 
				if (i==5) { 
					System.out.println("i==5일 때-continue");
					continue; //지금 진행하던것은 멈추고 다음 반복문을 계속해라. =>for문에서는 증감식으로 이동
				}
				System.out.println("i="+i);
			}
			System.out.println("for 문 밖");

	
			System.out.println("-----------------------------------------------");
			
			//0 1 2 3 4 5 for문밖
			for(int i=0; i<11; i++) {
				System.out.println("i="+i);
			 if (i==5) { 
				 System.out.println("i==5일 때 break"); 
				 break; //한줄짜리면 중괄호 생략가능
			 }
			}
			System.out.println("for 문 밖");
	}

}
