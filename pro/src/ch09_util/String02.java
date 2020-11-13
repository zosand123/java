package ch09_util;

import java.io.UnsupportedEncodingException;

//1029-2

//예)네트워크로 문자열을 전송하거나, 문자열을 암호화할 때 문자열을 바이트 배열로 변환한다
//getBytes() : String을 byte배열로 변환 =>예)byte[] b = "문자열".getBytes();
//getBytes(Charset charset) : String을 byte배열로 변환 =>예)byte[] b = "문자열".getBytes(Charset charset);

/*참고
 * 어떤 charset 으로 인코딩하느냐에 따라서 바이트배열의 크기가 달라진다
 * "EUC-KR" 알파벳은 1byte, 한글은 2byte로 변환
 * "UTF-8" 알파벳은 1byte, 한글은 3byte로 변환
 */
public class String02 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "안녕하세요";
		
		byte[] b1 = str.getBytes();
		System.out.println(b1.length);//15
		
		String str1 = new String(b1); //new String(byte[] bytes);
		System.out.println("b1->String으로 변환=>"+str1);
		System.out.println("---------------------");
		
		//EUC-KR을 이용해서 인코딩
		byte[] b2 = str.getBytes("EUC-KR");
		System.out.println(b2.length);//10
		
		//EUC-KR을 이용해서 디코딩
		String str2 = new String(b2,"EUC-KR");//new String(byte[] bytes, Charset charset)
		System.out.println(str2);
		System.out.println("---------------");
		
		//UTF-8을 이용해서 인코딩
		byte[] b3 = str.getBytes("UTF-8");
		System.out.println(b3.length);//15
		
		//UTF-8을 이용해서 디코딩
		String str3 = new String(b3,"UTF-8");//new String(byte[] bytes, Charset charset)
		System.out.println(str3);
		System.out.println("---------------");
	}

}
