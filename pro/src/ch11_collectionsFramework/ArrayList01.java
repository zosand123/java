package ch11_collectionsFramework;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//객체를 추가
		list.add("천우희");
		list.add("김태리");
		list.add("샬럿");
		list.add("고고싱");
		list.add("에머시스트");
		list.add("천우희"); //=중복허용
		
		//저장된 객체의 수 조회 
		int length = list.size();
		System.out.println("저장된객체의 수 = "+length);
		
		//객체 꺼내기(조회)
		Object obj = list.get(0);
		System.out.println("list.get(0)="+obj);
		//문자열은 자동 클래스강제형변환돼서(String)obj 라고 써줄 필요가 없다.
		System.out.println("list.get(0)="+(String)obj);
		//클래스(강제)형변환 : (sub class)
		//참조변수의 형변환 - 357p
		
		//모든데이터꺼내기 =>입력한 순서 유지되어 출력된다
		for(int i=0; i<length; i++) {
			System.out.println("list.get("+i+")="+list.get(i));
		}	
		System.out.println("---------------------");
		
		//특정 인덱스에 있는 객체 삭제 : remove(index)
		//처리속도가 더디므로 삭제가 빈번한경우에는 LinkedList를 사용  
		list.remove(4); //에머시스트 제거
		list.remove(4); //천우희
		
		//특정 인덱스에 있는 객체 삭제 : remove(Object)
		list.remove("샬럿"); //샬럿제거
		
		System.out.println("---------------------");
		
		for( Object temp : list) {
			System.out.println(temp);
		}
		
	}

}
