package ch11_collectionsFramework;

import java.util.ArrayList;

import ch07_oop2.Car01;

//모든 객체를 추가할 수 있다
public class ArrayList00 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//다양한 종류의 객체를 추가 
		list.add("문자열"); 
		list.add(100);
		list.add(true);
		list.add(Math.PI);
		list.add('A');
		list.add(new Car01());
		
		for(Object temp : list) {
			System.out.println(temp);
		}
	}

}
