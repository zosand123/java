package ch11_collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayList와 LinkedList의 실행성능 비교 
public class LinkedList01 {

	public static void main(String[] args) {
		//실행시간 = 종료시간-시작시간
		long startTime;//시작시간
		long endTime;//종료시간
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();//다형성, 제너릭
		
		startTime = System.nanoTime(); //시작시간 담기
		
		//작업
		for(int i=0; i<10000 ; i++) {
			//String class의 valueOf(object value):object값을 string으로 변환하는 함수
			list1.add(0,String.valueOf(i));
		}
		
		endTime = System.nanoTime();//종료시간 담기
		System.out.println("Array List 실행시간 ="+(endTime-startTime));
		
		System.out.println("----------------------");
		
		startTime = System.nanoTime(); //시작시간 담기
		
		//작업
		for(int i=0; i<10000; i++) {
			//String class의 valueOf(object value):object값을 string으로 변환하는 함수
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();//종료시간 담기
		System.out.println("Linked List 실행시간 ="+(endTime-startTime));
	}

}
