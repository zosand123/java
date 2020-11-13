package ch11_collectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap01 {

	public static void main(String[] args) {
		//1.Map생성
		Map<String,Integer> map = new HashMap<String,Integer>();//key,value
		//Map map = new HashMap();
		
		//2.객체저장
		map.put("Hong",10);//나중에 넣는 데이터가 덮어씀
		map.put("Ru",20);
		map.put("Yi",30);
		map.put("Jen",10); //value는 중복허용 객체저장
		map.put("Hong",1234); //key는 중복허용x 저장x
		System.out.println("총 객체 수="+map.size());
		
		//3.특정객체찾기 : Object get(Object key)
		Integer x = map.get("Hong");
		System.out.println("Integer x="+x); //1234
		
		int y = map.get("Hong");				//map.get("Hong")하면 Integer로 리턴받지만
		System.out.println("Int y="+y);//1234 	//int 타입의 변수에 저장할 수 있는 이유는
												//auto unboxing이 되기 때문이다.
		
		//4.Map의 모든 객체를 찾기
		//value를 가져오려면 key값을 알아야한다.
		//keySet():모든 키를 Set컬렉션으로 반을 수 있다
		Set<String> keys = map.keySet(); //keySet()을 이용해서 Set컬렉션으로 받고 
		
		Iterator<String> iter = keys.iterator();//Set컬렉션으로 제공되는 반복자Iterator를 통해 모든 key를 얻은다음
		while(iter.hasNext()) {
			String key = iter.next(); //받은 개별 key를 이용해서 
			Integer value = map.get(key); //get()을 통해 값을 걷기
			System.out.println(key+", "+value);
		}
		
		
		//5.특정객체 제거
		map.remove("Hong");
		System.out.println("특정 객체 제거 후 총 객체 수="+map.size());
		
		
		//6.전체객체 다른방법으로 출력
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> iter1 = set.iterator();
		while(iter1.hasNext()) {
			Entry<String, Integer> entry = iter1.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+", "+value);
			
		}
	}

}
