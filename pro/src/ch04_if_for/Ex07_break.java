package ch04_if_for;

//p171참고
//break
//자신이 포함된 하나의 반복문 또는 switch문을 빠져나온다.
//주로 if과 함께 사용해서 특정 조건을 만족하면 반복문을 벗어나게된다.
public class Ex07_break {

	public static void main(String[] args) {
			int count=0; //횟수를 저장하기위한 변수선언
			while(true) {
				int num=(int)(Math.random()*6)+1;
				System.out.println("num="+num);
				count++; //한번 반복할 때마다 획수가 1씩 증가
				if(num==5) {
					break;
				}
		}
		System.out.println(count+"번째에 while밖");  		//여기서는 프로그램종료 
	}
// 몇번째에 넘이 5가 나왔는지 프린트하는거 
}
