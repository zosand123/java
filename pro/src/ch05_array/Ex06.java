package ch05_array;

//사용자 입력받기 - 커맨드라인 교재p212
//프롬프트창에서 실행시에는 java Ex06 홍의장군 123 "dwdwdw"
//이클립스에서 실행시에는 run configuration의 arguments 탭에서 입력 //공백있으면 큰따옴표로 묶어줘야함 
public class Ex06 {
	
	public static void main(String[] args) {
		System.out.println("args[0]="+args[0]);
		System.out.println("args[2]="+args[2]);
		
		System.out.println("--------------------------------");
		
		//함수호출(p254) : 함수명();
		showMsg("유관순");
		showMsg("이순신");
		showMsg();
	}
	
	//메소드(함수)선언
	//함수종류 4개중에서 2개
	//메소드 오버로딩 p283
	public static void showMsg(String name, String msg) {
		System.out.println(name+" "+msg);
	}
	
	public static void showMsg(String name) {
		System.out.println(name+"님 환영해요!");
	}
	public static void showMsg() {
		System.out.println("show");
	}
}
