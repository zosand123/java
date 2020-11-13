package test.dap;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Calculator {

	public Scanner sc = new Scanner(System.in);
	public StringTokenizer st;
	public long num = 0;
	public long prevNum = 0;	
	public String reg = "^\\d+\\s*(\\+|\\-|\\*|\\/)\\s*\\d+$";
	public String str;
	public String currOper;
	public boolean stat = false;

	public Calculator() {}

	public Calculator(Long num) {
		this.num = num;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		cal.on();
		cal.run();
	}

	// 켜기
	public void on() {
		stat = true;
		System.out.println("계산기 켬");
		System.out.println("- 정수(양수) 계산만 가능한 계산기 입니다 -");
		System.out.println("-1 을 입력하시면 리셋, 0을 입력하시면 종료됩니다");
		System.out.println("ex) 1+2 or 1 + 2 형식으로 입력 두개의 연산만가능");
	}

	// 끄기
	public void off() {		
		stat = false;
		sc.close();
		System.out.println("계산기 끔");
	}

	// 실행
	public void run() {
		if (!stat) {
			System.out.println("계산기를 켜고 사용하세요");
			return;
		}

		while(stat) {
			System.out.printf("%d >", num);
			str = sc.nextLine().trim();
			check();
		}
	}

	// 입력받은 문자 체크
	public void check() {
		if (str.equals("-1")) {
			reset();
			return;
		} else if (str.equals("0")) {
			off();
			return;
		}

		if (str.matches(reg))
			operation();
	}
	// 연산
	public void operation() {
		st = new StringTokenizer(str, "+|-|*|/", true);

		long v1 = Integer.parseInt(st.nextToken().trim());
		currOper = st.nextToken();
		long v2 = Integer.parseInt(st.nextToken().trim());
		prevNum = num;

		switch(currOper) {
			case "+":
				num = num + (v1 + v2);
				break;
			case "-":
				num = num + (v1 - v2);
				break;
			case "*":
				num = num + (v1 * v2);
				break;
			case "/":
				if (v2 == 0) {
					System.out.println("0으로 나눌 수 없습니다");
					break;
				}
				num = num + (v1 / v2);
				break;
		}

		System.out.printf("결과 : %s + (%s %s %s) = %d\n", prevNum,  v1, currOper, v2, num);
		run();
	}

	// 리셋
	public void reset() {
		currOper = "";
		num = 0;
		prevNum = 0;
		System.out.println("리셋~");

		run();
	}

}