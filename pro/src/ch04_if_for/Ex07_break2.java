package ch04_if_for;

public class Ex07_break2 {

	public static void main(String[] args) {
				int sum = 0;
				int i =0;
				
		while(sum<110) {	
				while(true) {
					if( sum>100) {
						break; //주의! 자신이 포함된 하나의 반복문만 종료
						}
						i++;
						sum += i; //sum=sum+i
						System.out.println("i가 "+i+"일때의 sum="+sum);
				}
				System.out.println("내부 while밖");
				System.out.println("i="+i);
				System.out.println("누적총합 sum="+sum);
				sum++;
		}
				System.out.println("외부  while밖");
				System.out.println("누적총합 sum2="+sum);
		
				
			}
	

}
