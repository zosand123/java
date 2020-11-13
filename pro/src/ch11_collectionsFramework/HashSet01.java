package ch11_collectionsFramework;

//Hashset교재 p631 - 순서유지x 중복허용x
import java.util.HashSet;
import java.util.Iterator;

public class HashSet01 {
	public static void main(String[] args) {
		//HashSet set = new HashSet();
		HashSet<String> set = new HashSet<String>();
		
		set.add("천우희");
	    set.add("김태리");
		set.add("샬럿");
		set.add("고고싱");
		set.add("에머시스트");
		set.add("천우희"); //중복허용x
		
		System.out.println("저장된 객체의 수 = "+set.size());
		
		//객체 꺼내기(조회) - List 에서는 Object get(int index)
		//                set 에서는 Iterator iterator() : 꺼내기전문가
		//모든데이터꺼내기 > 추가한 데이터순서 유지안됨
		Iterator irt = set.iterator(); //반복자 얻기=>객체수만큼 반복
		
		while(irt.hasNext()) { //다음요소(객체)가 존재하는동안
			Object element = irt.next(); // Object next() : 다음요소(객체)를 가져와
			System.out.println(element); //System.out.println((String)element);
		}
		System.out.println();
		
		//객체삭제
		set.remove("고고싱");
		set.remove("샬럿");
		
		for(Object temp : set) {
			System.out.println(temp);
		 }
		
		//모든객체를 제거하고 비운다
		set.clear();
		System.out.println("저장된 객체의 총 수="+set.size());
		
		if(set.isEmpty()) 
		System.out.println("비어있음");
		//실행코드 딱한줄이면 {} 안써도됨
		
	}

}
