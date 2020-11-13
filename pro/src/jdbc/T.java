package jdbc;

import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		double pi = Math.PI;
		System.out.println(pi);
		
		System.out.println(Math.round(pi));
		
		//소수점 3번째자리에서 반올림해서 2째자리까지 출력
		System.out.println(Math.round(pi*100));
		System.out.println(Math.round(pi*100)/100); //3
		System.out.println(Math.round(pi*100)/100.0); //실수화
		
		System.out.println(Math.round(pi*1000)/1000.0);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력:");
		String str = sc.nextLine();
		int n = Integer.parseInt(str); //String 타입을 Int로 변환, 자주씀! 
		System.out.println(n+1);
		//System.out.println(str+1); //100 +1은 1001
		System.out.println("------------------");
		System.out.println("입력:");
		int s = sc.nextInt();
		System.out.println(s+1); // 100 +1은 101
	}

}
