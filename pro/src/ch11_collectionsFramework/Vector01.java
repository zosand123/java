package ch11_collectionsFramework;

//vector의 특징 : 용량채워지면 2배씩증가,기본사이즈10,파라미터없음
import java.util.Vector;

public class Vector01 {

	public static void main(String[] args) {
		//Vector vt1 = new Vector(20);//initialCapacity 미리 설정
		Vector vt1 = new Vector(20,2);//(int initialCapacity, int capacityIncrement)
		
		System.out.println("Vector's capacity()="+vt1.capacity());//20
		System.out.println("Vector's size()="+vt1.size());//0
		System.out.println();
		
		//객체를 삽입
		for(int i=1; i<32; i++) {
			vt1.add("내용"+i);	
		}
		//(capacity)용량이 채워지면 2배씩 자동으로 늘어나는 것을 확인
		System.out.println("Vector's capacity()="+vt1.capacity());//20
		System.out.println("Vector's size()="+vt1.size());//10
		System.out.println();
		
		for(int i=1; i<32; i++) {
			Object obj = vt1.get(i);
			System.out.println(obj);
		}
		
		System.out.println("---------------------------------");
		Vector vt = new Vector();
		
		System.out.println("Vector's capacity()="+vt.capacity());
		System.out.println("Vector's size()="+vt.size());
		System.out.println();
		
		//객체를 삽입
		for(int i=1; i<26; i++) {
			vt.add("제목"+i);//25개의 객체가 삽입되면서 
			//초기capacity가 10이 20이 되고 그래도 모자라서 40됨
		}
		
		//(capacity)용량이 2배씩 자동으로 늘어나는 것을 확인
		System.out.println("Vector's capacity()="+vt.capacity());
		System.out.println("Vector's size()="+vt.size());
		System.out.println();
		
	}

}
