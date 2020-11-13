package other;

public class MyClass01 {
	//field 접근제어자 속성 데이터타입 변수명 = 초기값;
	public int pub = 10;
	protected int pro = 20;
			int dft = 30;
	private int pri = 40;
	//constructor 접근제어자 클래스명(매변리){}
	
	//method 접근제어자 속성 리턴유형 메소드명(매개변수리스트){}
	 void test() { 
		//아래 4개 접제자는 동일 클래스내에서 접근 허용함을 보여준다 
		pub = 11;
		pro = 22;
		dft = 33;
		pri = 44;
	}
	 {//메소드접근허용여부 체크
		 pubMethod(); 
		 proMethod();
		 packMethod(); 
		 priMethod();
	 }
	 public void pubMethod() {
		 System.out.println("MyClass01의 pubMethod()다");
	 }
	 protected void proMethod() {
		 System.out.println("MyClass01의 proMethod()다");
	 }
	 void packMethod() {
		 System.out.println("MyClass01의 packMethod()다");
	 }
	 private void priMethod() {
		 System.out.println("MyClass01의 priMethod()다");
	 }
}                                                                                                              
