package ch05_array;

public class Ex04_array_in_array {

	public static void main(String[] args) {
		System.out.println("dad");
		//int[][] score = new int[5][3];
		int[][] score = {
				{100,90,33,50,80},
				{10,90,33,51,80},
				{30,40,33,50,80},
				{100,90,33,54,80},
				{100,50,37,50,80}
		};
		
		for(int i=0; i<score.length ; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print( score[i][j]+" " );
			}
			System.out.println();
			
		}
				

	}

}
