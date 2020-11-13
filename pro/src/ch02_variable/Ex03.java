package ch02_variable;

        //정수 byte(1), short, int(기본, 4byte), long (8)
		//실수 float(4)< double(기본, 8byte)
		//문자 char
		//논리 true, false

//정수와 실수를 비교하면 소숫점을 포함하기때문에 실수가 더크다.

public class Ex03 {

	public static void main(String[] args) {
			//byte -2의 7승 ~ 양수2의7승 -1 = -128(최소값) ~ 양수127(최대값)
			byte v1 = -128;
			byte v2 = -1;
			byte v3 = 0;
			byte v4 = 1;
			byte v5 = 127;
			// byte v6 =128; //컴파일에러발생 Type mismatch: cannot convert from int to byte
		    //저장할 수 있는 값의 범위를 넘었기 때문에 에러발생 
			
			
			//저장할 수 있는 값의 범위를 초과해서 값이 저장될 경우에는 엉터리값이 저장되는데 쓰레기값이라고 한다.
			byte v7 = 125;
			for(int  i=0;  i<5 ;  i++) {  //5번반복실행하는 코드 //++는 무조건 1씩 증가 
					v7++;
					System.out.println(i+"번째일때 v6값은 "+v7); 
					//126 127 128 129 130이 아닌 126 127 -128 -127 -126 쓰레기값이 저장되어 출력되었다.
					//최대값인 127을 넘으면 다시 -128부터 시각된다.
			}
	}

}
