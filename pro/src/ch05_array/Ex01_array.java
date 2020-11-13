package ch05_array;

//배열(Array)
public class Ex01_array {

	public static void main(String[] args) {
			//데이터타입[] 변수명; = 배열변수선언 방법1
			//데이터타입 변수명[]; = 배열변수선언 방법2
			//변수명 = new 데이터타입[크기]; 	//배열변수타입에 따라 자동 초기화	
		
			int[] score; //선언
			score = new int[3]; //heap 영역에 int타입의 데이터가 들어갈 공간을 확보해줘
												//데이터타입에 따라 자동으로 초기화
												//heap영역의 생긴 주소지를 score변수에 할당
			
			//값출력 : 배열변수명[인덱스번호] =>인덱스번호는 0부터 1씩증가 
			System.out.println("score="+score);
		
					System.out.println("score[0]="+score[0]);
					System.out.println("score[1]="+score[1]);
					
					System.out.println();
					System.out.println("배열의크기="+score.length);
					
					System.out.println(); 
					
					System.out.println("for+배열의 길이를 이용하여 값을 출력---");
					for(int i=0; i<score.length; i++) {
						System.out.println("score["+i+"]="+score[i]);
						
			
			}
					System.out.println();
					System.out.println("향상된 for문을 이용하여 출력-교재p166참고");
					for ( int num : score) { //score배열의 길이만큼 반복하면서 
																//score[0]의 값을 가져와서 num변수에 할당
																//score[1]의 값을 가져와서 num변수에 할당
																//score[2]의 값을 가져와서 num변수에 할당
						System.out.println( num );
					}
	}

}
