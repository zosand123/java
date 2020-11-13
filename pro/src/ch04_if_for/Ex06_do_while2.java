package ch04_if_for;

// i가 4가되면 빠져나와라
public class Ex06_do_while2 {

	public static void main(String[] args) {
			int i =1;
			do {
				System.out.println("i="+i);
				i++;
				if(i==5) {
					break;
				}
			}while(i<11);
			System.out.println("do while문 밖");
	}

}
