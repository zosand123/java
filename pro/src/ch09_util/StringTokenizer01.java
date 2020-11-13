package ch09_util;

import java.util.StringTokenizer;

/*java.util.StringTokenizer클래스 514p
문자열이 특정 구분자로 연결되어 있을 경우, 구분자를 기준으로 문자열을 분리할 때 사용된다.
비교) java.lang.String클래스의 split()도 동일기능이지만 리턴유형은 String[]
*/
public class StringTokenizer01 {

	public static void main(String[] args) {
		//split()
		String str = "유관순/보부아르,서희 헬렌켈러+신사임당&마리퀴리";
		//str.split(스트링타입의 정규식)
		String[] names = str.split(",| |&|/");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("========================================");
		//java.util.StringTokenizer클래스
		String text2 = "유관순/보부아르,서희 헬렌켈러+신사임당";
		StringTokenizer st = new StringTokenizer(text2,"/, +"); //여러개 구분자 사용가능
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		String text = "J'ai trop sommeil jpp";
		//방법1 : 전체 토큰수를 얻어 for문으로 반복작업
		StringTokenizer stkn = new StringTokenizer(text);
									//delimiter 안넣으면 공백을 기준으로 자름
		int count = stkn.countTokens();
		System.out.println("count="+count+"\n");
		for(int i=0; i<count; i++) {
			String token = stkn.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		//방법2 : while
		stkn = new StringTokenizer(text," ");
		while(stkn.hasMoreTokens()) {
			String token = stkn.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		//방법3 : hasMoreElements() while문 이용
		stkn = new StringTokenizer(text," ");
		while(stkn.hasMoreElements()) {
			//nextElement()의 리턴유형이 Object이므로 String으로 강제클래스형변환
			String token = (String)stkn.nextElement();
			System.out.println(token);
		}
	}

}
