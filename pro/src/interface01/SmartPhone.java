package interface01;
//1028-2 Phone추상클래스를 상속받는 실체클래스
//SmartPhone은 Phone의 실체클래스이므로
//Phone의 생성자를 호출해야한다
public class SmartPhone extends Phone {

	//constructor
	public SmartPhone(String owner) {
		super(owner);
	}

	public void internet() {
		System.out.println("인터넷 사용");
	}

}
