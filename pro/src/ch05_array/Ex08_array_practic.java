package ch05_array;

import java.util.Arrays;

//배열의 활용
//총점수와 평균점수를 또 다른 배열에 저장한 후 출력
//최고점수와 최저점수 출력
//5명 학생의 총점수와 평균점수를 출력하세요
/*출력결과
 * 총점:~
 * 평균:~
 */
public class Ex08_array_practic {

	public static void main(String[] args) {
		int[] score = {93,45,64,66,78};
		
		double sum = 0;
		double average = 0f;
		
		for(int temp : score) {
			System.out.print(temp+" ");
		}
		System.out.println();
		for(int i=0;i<score.length; i++) {
			sum += score[i];
		}
		
		System.out.println("총점:"+sum);
		average = sum/score.length;
		System.out.println("평균:"+average);
		
		for(int i = 0; i < score.length - 1; i++) {
			//각라운드는 자신보다 하나 큰 데이터부- 터 마지막까지 반복해야 한다.
			for(int j = i + 1; j < score.length; j++) {
				if(score[i] > score[j]) {
					int	temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		
		
	}
		System.out.println("최고점수:" + score[score.length-1]);
		System.out.println("최저점수:" + score[0]);

	}
}
