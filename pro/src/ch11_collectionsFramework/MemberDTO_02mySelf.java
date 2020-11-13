package ch11_collectionsFramework;

//MemberDTO_02 : 회원에 대한 정보를 다루는 순수클래스
public class MemberDTO_02mySelf {
	//field
	private String name;	//이름
	private String ssn;		//주민번호
	
	//constructor
	MemberDTO_02mySelf(){}
	public MemberDTO_02mySelf(String name, String ssn) {
		this.name=name; this.ssn=ssn;
	}
	//method
	//getter&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//여기에서는 회원명과 주민번호가 동일하면 동일객체라고
	//그렇지않으면 동일객체x
	@Override
	public boolean equals(Object obj) {
		//매개변수obj의 타입은 Object이므로 Object를 상속받은 클래스는 다 들어올수있다
		///따라서 매개변수 obj에 들어온 값이 MemberDTO_02클래스의 객체인지부터 확인하자
		if(obj instanceof MemberDTO_02mySelf) {
			
			MemberDTO_02mySelf member = (MemberDTO_02mySelf)obj;//2.비교객체가 동일한 타입이라면 기준객체타입으로 강제타입변환해서
			return (name.equals(name==member.name)) &&(ssn.equals(ssn==member.ssn));								
			//2-2특정필드값이 동일한지 비교 
			//회원명과 주민번호가 동일하면 동일객체이므로 true
		}else {
			return false;//그렇지않으면 동일객체x이므로 false
		}
	}
	@Override
	public int hashCode() {
		//name과 ssn 값이 같으면 동알힌 hash가 리턴
		return name.hashCode()+ssn.hashCode();
		//여기에서는 name이 String 이므로 name.hashCode()는 String클래스의 hashCode()를 이용
	}
	
	/*equals(Object obj) 메소드 재 정의시
	 * 1.Object타입의 매개변수 obj에는 모든 객체가 매개값으로 제공될 수 있으므로
	 *   instanceof 연산자를 이용해 기준객체와 매개변수로들어온 객체가 동일타입인지 먼저 확인해야한다.
	 * 2.비교객체가 동일한 타입이라면 기준객체타입으로 강제타입변환해서
	 * 	 특정필드값이 동일한지 비교 
	 */
	
}
