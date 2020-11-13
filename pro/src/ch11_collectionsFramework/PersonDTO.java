package ch11_collectionsFramework;


//interface를 구현하는 클래스 선언
//[접근제어자][속성] class 클래스명 [extends 조상클래스명] implements 인터페이스명1,...,인터페이스명n
/*인터페이스는 상수와 추상메서드만으로 구성된 (추상)클래스의 일종이므로
 * 인터페이스를 상속받은 구현클래스에서는
 * 인터페이스에서 선언한 추상메서드를 반드시 꼭 기필코 오버라이딩(재저의)해야한다*/
//여기서는 Comparable 인터페이스의 int,camparaTo(Object args0)을 오버라이딩해야한다
public class PersonDTO implements Comparable<PersonDTO>{
	
	//field
	private String name;//이름
	private int age;//나이
	
	//constructor
	public PersonDTO() {}
	public PersonDTO(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	//method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//정렬기능 // 트리셋에는 필수 !!! 정렬안할거면 다른 컬렉션 ㄱㄱ 
	/*Compares this object with the specified object for order. 
	 * Returns a negative integer, zero, or a positive integer  as this object  
	 * is less than, equal to, or greater than the specified object.
	 * 기준1    비교100 : 음수     1-100=-99   1-2=-1
	 * 기준 100   비교100 : 0  100-100=0    1-1=0
	 * 기준 100   비교1 : 양수   100-1=99     2-1=1
	 */
	@Override
	public int compareTo(PersonDTO obj) {
		if(this.age<obj.age) { //나이적은순부터 정렬
			return -1; 
		}else if(this.age==obj.age) {
			return 0;
		}else {
			return 1;
		}
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
}
