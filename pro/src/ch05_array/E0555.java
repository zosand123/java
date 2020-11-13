package ch05_array;

//다차원 배열
//5명 학생의 5과목 시험점수를 저장한 후 츨력
public class E0555 {
		       
		public static void main(String args) {
				//int[][] score = new int[5][3];
				int[][] score = {
						{100,90,33,50,80},
						{10,90,33,51,80},
						{30,40,33,50,80},
						{100,90,33,54,80},
						{100,50,37,50,80}
				};
				
				for(int i=0; i<5 ; i++) {
					for(int j=0; j<3; j++) {
						System.out.print( score[i][j]+" " );
					}
					System.out.println();
					
				}
																			
		
		}

}
