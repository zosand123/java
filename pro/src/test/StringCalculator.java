package test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringCalculator {
	Scanner sc = new Scanner(System.in);
	String input;
	double defaultVal = 0.0;//초기값과 계산 결과를 저장할 변수
	
	public StringCalculator(){}
	
	public StringCalculator(double defaultVal){//초기값을 갖는 생성자
		this.defaultVal = defaultVal;
	}
	
	public static void main(String[] args){//메인메소드 - 실행기능
		StringCalculator stcct = new StringCalculator();
		stcct.run();
	}

	public void run() { //계산기 실행 메소드
		StringCalculator stcct = new StringCalculator();
		while(true) {
			System.out.println("계산식을 입력해주세요. 초기화:C, 종료:Q");
			System.out.println("현재 값 : "+defaultVal);
		
			input = sc.next();	
			if(input.equals("C")) {
				stcct.clear();
					continue;
			}else if(input.equals("Q")) {
				stcct.quit();
				
			}
			defaultVal = stcct.calculate(input);//입력값에 따라 기능, 연산을 수행한다
			System.out.println(input+"="+defaultVal);
		}
	}
		
	public double calculate(String input) { //계산을 실행하는 메소드
		StringTokenizer stk = new StringTokenizer(input,"+|-|*|/",true);
		double x = Double.parseDouble(stk.nextToken().trim());
		String oper = stk.nextToken().trim();
		double y = Double.parseDouble(stk.nextToken().trim());
		double result = 0;
		switch(oper){
			case "+": result = plus(x,y); break;
			case "-": result = minus(x,y); break;
			case "*": result = multiply(x,y); break;
			case "/": result = divide(x,y); break;
		}
		return result;
		
	}
	
	public double plus(double x, double y) {
		return x+y;
	}
	public double minus(double x, double y) {
		return x-y;
	}
	public double multiply(double x, double y) {
		return x*y;
	}
	public double divide(double x, double y) {
		return x/y;
	}
	
	public void clear() {
		defaultVal = 0.0;
		System.out.println("계산기가 초기화되었습니다.");
		return;
	}
	public void quit() {
		System.out.println("계산기를 종료합니다.");
		System.exit(0);
	}
	
}









