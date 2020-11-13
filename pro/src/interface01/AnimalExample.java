package interface01;
//1028-7 실행클래스
public class AnimalExample {

	public static void main(String[] args) {
		//Animal animal = new Animal();에러
		Puppy puppy = new Puppy();
		Cat cat = new Cat();
		puppy.sound();
		cat.sound();
		System.out.println();
		
		//변수의 다형성 =>변수자동타입변환
		Animal animal = null; //추상클래스 참조변수 선언
		animal = cat;
		animal.sound(); //오버라이딩된 메서드호출
		animal = puppy;
		animal.sound();	//오버라이딩된 메서드호출
		System.out.println();
		
		animalSound(cat);
		animalSound(puppy);
		animalSound(animal);
	}
	//매개변수의 다형성:부모클래스매개변수에 자식객체사용가능
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
