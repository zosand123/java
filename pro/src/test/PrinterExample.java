package test;

public class PrinterExample {

	public static void main(String[] args) {
		Printer p = new Printer();
		System.out.println(p.println(10));
		System.out.println(p.println(true));
		System.out.println(p.println(5.7));
		System.out.println(p.println("홍길동"));
	}

}
