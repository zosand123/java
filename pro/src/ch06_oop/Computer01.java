package ch06_oop;

//매개변수의 개수를 모를 때의 메소드 선언과 사용법
public class Computer01 {

	//method - 접근제한자 속성 리턴유형 메소드명(타입[] 매개변수명){}
	int sum(int[] values) { //1,2,3
		int result = 0;//결과를 저장하는 변수선언
		
		//매개변수에 입력된 데이터를 이용해서 더하기계산
		for(int i=0; i<values.length; i++) {
		result += values[i]; 
		}
		
		return result;
	}
	
	int sum1(int...values){
		int result = 0;
		
		for(int i=0; i<values.length; i++) {
		result += values[i]; 
		}
		
		return result;
		
		
	}
}
