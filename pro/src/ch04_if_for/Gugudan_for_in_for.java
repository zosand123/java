package ch04_if_for;

//for의 중첩획수에 거의 제한없음
public class Gugudan_for_in_for {

	public static void main(String[] args) {
				//내가 그냥만든 구구단
				for(int i=1; i<10; i++) {
					for(int j=2; j<10; j++) {
					System.out.println(i+"*"+j+"="+(i*j));
						}
					 System.out.println();
					}
		
				 System.out.println("---------------------");
				 
				 for(int j=2; j<10; j++) {
					 System.out.println("j="+j+"단");
					 
							 for(int q=1; q<10; q++) {
								 System.out.println("\t"+j+"*"+q+"="+j*q);
							 }//내부for
							 
							 System.out.println();
				 }//외부 for
				 
		//드래그하고 컨트롤+방향키^ = 줄바꿈, 드래그하고 탭 = 들여쓰기, 쉬프트+탭 = 내어쓰기
				
	}
										
}
