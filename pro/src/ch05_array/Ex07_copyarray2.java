package ch05_array;

import java.util.Arrays;

public class Ex07_copyarray2 {

	public static void main(String[] args) {
		int[] oldArr1 = {11,12,13,14,15};
		int[] newArr1 = new int[10];
		
		System.out.println("배열복사 전의  oldArr1------");
		for(int i=0; i<oldArr1.length ;i++) {
			System.out.print(oldArr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("배열복사 전의 newArr1------");
		for(int i=0; i<newArr1.length ;i++) {
			System.out.print(newArr1[i]+" ");
		}
		System.out.println();
		//p624
		System.out.println("Arrays.toString 을 쓴결과");
		
		System.out.println(Arrays.toString(newArr1));
		
		System.out.println();
		//System.arraycopy()를 이용하면 원본배열의 일부데이터를 원하는 새배열 위치부터 넣을 수 있다!
		System.arraycopy(oldArr1, 2, newArr1, 5, 3);
			
			System.out.println("배열복사 후의 newArr1-------");
			for(int temp :newArr1){
				System.out.println(temp+" "); //0 0 0 0 0 13 14 15 0 0
			}
			
			/* System.arraycopy(oldArr1, 0, newArr1, 0, oldArr1.length);
			
			System.out.println("배열복사 후의 newArr1-------");
			for(int temp :newArr1){
				System.out.println(temp+" ");
			} */
		
		
	}

}
