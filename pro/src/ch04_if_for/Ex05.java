package ch04_if_for;
//string 타입으로 switch 숙제
public class Ex05 {

	public static void main(String[] args) {
			String name = "리병";
			
			switch(name) {
			case "호리병" :
			case "그릇" : System.out.println("3000원입니다.");
			           break;
			case "물독" : System.out.println("7000원입니다.");
			           break;
			default:System.out.println("10000원입니다.");
			}

	}

}
