package ch11_collectionsFramework;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet 이용 - 이진검색트리를 이용해서 정렬과 검색에 특화된 컬렉션

//PersonDTO에서 재정의된 compareTo()메서드를 이용하여
//나이순으로 정렬하는 클래스이다
//사용자정의객체를 나이순으로 정렬
public class PersonDTO_ex {

	public static void main(String[] args) {
		//TreeSet준비
		TreeSet<PersonDTO> ts = new TreeSet<PersonDTO>();
		
		//PersonDTO객체추가
		//객체를 저장될때 나이순으로 정렬됨
		ts.add(new PersonDTO("강유미",40));
		ts.add(new PersonDTO("안영미",60));
		ts.add(new PersonDTO("신봉선",45));
		ts.add(new PersonDTO("송은이",20));
		ts.add(new PersonDTO("김숙",10));
		
		//(트리셋이니까)왼쪽 마지막노드에서 오른쪽마지막노드까지 반복해서 가져온다>오름차순
		//참고-이진 검색 트리는 부모보다 작은 값을 왼쪽에, 큰 값은 오른쪽에 저장 
		Iterator<PersonDTO> iter= ts.iterator();
		while(iter.hasNext()) {
			PersonDTO person= iter.next();
			//System.out.println(person.getName()+person.getAge());
			System.out.println(person.toString());
			//System.out.println(person);라고 쓰면 오버라이딩 된 
		}
	}
}
