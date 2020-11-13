package polymorphism;

public class CastingEx01 {
	public static void main(String[] args) {
		Parent p = new Child();// 자식=>부모//자동형변환
		p.field = "새값"; //부모클래스의 멤버에만 접근가능
		p.m1();
		p.m2();
		
		Child ch = (Child)p;//자식클래스 변수 = (자식클래스)parent, 강제변환!!
		ch.m3();
		ch.field2 = "강제변환하니까 자식클래스멤버에 접근가능";
		
		Child ch2 = (Child)new Parent(); //?????
		
	}

}
class Parent {
	public String field;
	public void m1() {System.out.println("Parent의 m1()");}
	public void m2() {System.out.println("Parent의 m2()");}
	
}
class Child extends Parent{
	public String field2;
	public void m3() {System.out.println("Child의 m3()");}
	
}
