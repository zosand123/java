package ch04_if_for;

public class While_namgungsung {

	public static void main(String[] args) {
				
			int num =12345; int sum =0;
			
			while( num>0 ) {
			System.out.println(num%10);
			sum += num%10;
			num=num/10;
			}
			
			System.out.println("각자리수의 합"+sum);
	}

}
