package ch11_collectionsFramework;

import java.util.HashSet;
import java.util.Set;

//MemberDTO_02객체를 중복없이 Set에 저장하는 실행클래스
public class HashSet02_mySelf {

	public static void main(String[] args) {
		
//		MemberDTO_02 m1 = new MemberDTO_02("케이트블란쳇","771010-1120222");
//		MemberDTO_02 m2 = new MemberDTO_02("케이트블란쳇","771010-1120222");
//		//Person01 p1 = new Person01("771010-1120222","케이트블란쳇"); 안됨
//		System.out.println("m1.equals(m2)="+m1.equals(m2));
//		
		
		//조상클래스명 참조변수명 = new 자손클래스()
		Set<MemberDTO_02> set = new HashSet<MemberDTO_02>();
			
		set.add(new MemberDTO_02("케이트블란쳇","771010-1120222"));
		set.add(new MemberDTO_02("홍길동","771010-2121122"));
		set.add(new MemberDTO_02("홍길동","771010-2121122"));
		//인스턴스는 다르지만 내부데이터가 동일하면 동일객체로 판단해서
		//총객체 수는 2
		
		System.out.println("총객체 수="+set.size()); //2
	}

}
