package ch05_array;

public class Ex10_0 {

	public static void main(String[] args) {
			
		int s0 = 100;
		int s1 = 90;
		System.out.println("s0="+s0); 
		System.out.println("s1="+s1);
		
		//s0와 s1의 값 교환 
		//int temp = 0; //임시변수
		
		int temp = s0; //temps=100;
		s0 = s1; //s0=90;
		s1 = temp; //s1=100
		
		
		System.out.println("변경후--------------------");
		System.out.println("s0="+s0); //90
		System.out.println("s1="+s1); //100
	}

}
