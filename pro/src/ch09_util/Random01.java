package ch09_util;

import java.util.Arrays;
import java.util.Random;

//Random 클래스 - 교재 p500
//난수를 얻어내기 위함 다양한 메서드 제공
//종자값 (long타입 seed)를 설정하여 난수값을 제공받을 수도 있다=>new
//다양한 타입의 난수를 얻을 수 있다=> nextBoolean(), nextDouble(), nextInt(), nextFloat() 등
//참고 Math.random()은 0.0이상 1.0미만의 double난수만 리턴

//로또번호 생성하기
public class Random01 {

	public static void main(String[] args) {
		//번호 선택
		//1~45범위의 숫자 6개
		int[] selectNumber = new int[6];//6개가 저장될 배열 변수 선언
		Random random = new Random(1);
		System.out.print("번호선택 : ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i]+" ");
			}
			System.out.println(1);
		
		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random();
		System.out.print("당첨번호 : ");
		for(int i=0; i<6; i++) {
	//	System.out.println("new Random()="+(random.nextInt(45)+1));
			winningNumber[i] = random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
		}
		System.out.println();
		
		//선택한번호 정렬
		Arrays.sort(selectNumber);
		//당첨번호 정렬
		Arrays.sort(winningNumber);
		
		System.out.println(selectNumber.toString());
		
		//Arrays.equals()는 배열 항목 값 비교 
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("당첨여부====>");
		if(result) {
			System.out.println("1등에 당첨되었습니다.");
		}else {
			System.out.println("다음 기회에..");
		}
	}

}
