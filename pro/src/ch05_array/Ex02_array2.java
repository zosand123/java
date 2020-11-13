package ch05_array;

//배열 선언과 생성=> 데이터타입에 따른 자동초기화 
public class Ex02_array2 {

	public static void main(String[] args) {
				
				String names[] = new String[3];
				for(String name : names) {
					System.out.println(name);//String과 같은 class의 초기값은 null이다 
					}
				
				System.out.println();
		
				double[] height = new double[5];
					for(int i=0; i<height.length; i++) {
						System.out.println(height[i]);
					}
					
					System.out.println();
					
				int jumsu[] = new int[5];
				
					for(int i=0; i<jumsu.length; i++) {
							System.out.println(jumsu[i]);  //자동초기화=>여기에서는 int타입은 
			
			}
		
	}

}
