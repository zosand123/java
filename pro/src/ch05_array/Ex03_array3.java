package ch05_array;

//배열변수생성과 값할당
// 방법1 : 생성후 값을 할당
// 방법2 : 생상하면서 값을 할당
public class Ex03_array3 {

	public static void main(String[] args) {
			//방법1 : 생성후 값을 할당
			int nums[] = new int[3];  //생성
			nums[0] = 10;// 값을 할당
			nums[1] = 20;
			nums[2] = 30;
			
			for(int num : nums) {
				System.out.println(num);
			}
			
			//방법2 : 생상하면서 값을 할당
			//char[] c = new char[3] { 'a','b','c' }; 는 컴파일에러 발생 
			//Cannot define dimension expressions when an array initializer is provided
			
			//char[] c = new char[] { 'a','b','c' }; 또는
			char[] c = { 'a','b','c' };  //훨신 간단
			for(char temp : c) {
				System.out.println(temp);
			}
	}

}
