package ch04_if_for;

import java.util.Scanner;
public class rockpaperscissors {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("랜덤 가위 바위 보 게임 :");
		int a = scan.nextInt();

		if (a==0) {
			System.out.println("Player : 가위");
			}
		if (a==1) {
			System.out.println("Player : 바위");
			}
		if (a==2) {
			System.out.println("Player : 보");
			}
		
		//컴퓨터
		int com=(int)(Math.random()*3);
		//           =================
		//           0.0~0.99*3==> 0.0~2.9... ==> 0~2
		if(com==0)
		{
			System.out.println("컴퓨터는 가위를 냈습니다.");
		}
		if(com==1)
		{
			System.out.println("컴퓨터는 바위를 냈습니다.");
		}
		if(com==2)
		{
			System.out.println("컴퓨터는 보를 냈습니다.");
		}
		
		//결과를 비교
		/*
		 * 컴퓨터 : com
		 *    가위 => 0
		 *           사용자 : user
		 *           가위 => 0 => 0
		 *           바위 => 1 => -1
		 *           보    => 3 => -2
		 *           
		 *    바위 => 1
		 *           사용자 :user
		 *           가위 => 0  =>1
		 *           바위 => 1  =>0
		 *           보    => 2  =>(-1)
		 *    
		 *    보   => 2
		 *           사용자 : user  -2,1
		 *           가위 => 0  =>(2)  -1,2
		 *           바위 => 1  => 1
		 *           보    => 2  => 0
		 */
		

		if(com-a==-2 || com-a==1)
		{
			System.out.println("컴퓨터가 이김 ㅜㅜㅋ");
		}
		if(com-a==-1 || com-a==2)
		{
			System.out.println("Player 이김 ㅊㅊ");
		}
		if(com-a==0)
		{
			System.out.println("비겼습니다.");
		}
	}
		
	}

