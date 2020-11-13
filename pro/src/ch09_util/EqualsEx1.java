package ch09_util;

public class EqualsEx1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같다");
		else
			System.out.println("v1과 v2는 다르다");
		
		v1.value = 10;
		v2.value = 10;
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같다");
		else
			System.out.println("v1과 v2는 다르다");
		
	}
}
class Value{
	int value;
	Value(int value){
		this.value = value;
	}
}
