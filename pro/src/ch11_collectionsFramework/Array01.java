package ch11_collectionsFramework;

public class Array01 {

	public static void main(String[] args) {
		//문자열 5개를 저장하는 배열 생성   타입[] 배열변수명 = new 타입[크기];
		String[] arr = new String[5];
		
		//문자열데이터를 추가
		arr[0] = "천우희";
		arr[1] = "김태리";
		arr[2] = "샬럿";
		arr[3] = "고고싱";
		arr[4] = "에머thi스트";
		 
		//데이터의 개수조회
		System.out.println("저장된 데이터의 총 갯수"+arr.length);
		
		//데이터꺼내기
		System.out.println("\n"+arr[0]+"\n"+arr[1]+"\n"+arr[2]+"\n"+arr[3]+"\n"+arr[4]);
		
		System.out.println("----------------------------------------------------");
		//데이터 for문으로 꺼내기
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------------------------------------------");
		//향상된 for문 이용 
		for (String temp : arr) {
			System.out.println(temp);
		}
	}

}
