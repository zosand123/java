package ch05_array;

public class Ex05_changeableArray {

	public static void main(String[] args) {
		//5개반 학생들의 몸무게를 저장하세요
		double weight[][] = {
			{40.4,50,36,40,39,10,40,40,57,22,56},
			{40.4,50,32,40,30,45.6,40,40,40},	
			{40.2,50,34,40,35.6,10,40,70.4,50,40},
			{40,50.5,35,40,30,10,40,40},
			{40,50,30,40,30.5,40,40,50,20,40}		
		};
		System.out.println(weight[1].length);
		System.out.println(weight[2].length);
		System.out.println(weight[3].length);
		System.out.println(weight[4].length);
		System.out.println(weight[5].length);
		
		for(int i=0; i<weight.length ; i++) {
			for(int j=0; j<weight[i].length; j++) {
				System.out.print( weight[i][j]+" " );
			}
			System.out.println();
		
		
	}
	}
}
