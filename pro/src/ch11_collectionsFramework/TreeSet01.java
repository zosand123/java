package ch11_collectionsFramework;

import java.util.TreeSet;

//TreeSet : 트리형태로 정보가 저장돼서 범위검색과 정렬에 유리
public class TreeSet01 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(new Integer(100));
		ts.add(new Integer(30));
		ts.add(new Integer(40));
		ts.add(new Integer(500));
		ts.add(new Integer(600));
		ts.add(new Integer(1700));
		Integer s = null;
		
		
		System.out.println("가장낮은수="+ts.first());
		System.out.println("가장낮은수="+ts.last());
		
		s = ts.lower(new Integer(50));
		System.out.println("50보다 아래인 수="+s);
		s = ts.higher(new Integer(500));
		System.out.println("500보다 큰 수="+s);
		s = ts.floor(new Integer(100));
		System.out.println("100과 동알하거나 바로아래 수="+s);
		s = ts.ceiling(new Integer(101));
		System.out.println("101과 동알하거나 바로 위 수="+s);
		
		while(!ts.isEmpty()) {
			s = ts.pollFirst();
			System.out.println(s+"\t남은객체수:"+ts.size());//가장낮은애 꺼내주고 제거
		}
		
	}

}
