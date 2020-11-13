package ch15_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

//URL - URL주소를 다루기 위해 제공되는 클래스
/*public final class URL extends Object
 * 
 * 
 * openStream(): Opens a connection to this URL and returns an InputStream for reading from that connection.
 * */


public class UrlEx {

	public static void main(String[] args) {
		URL url = null;
		InputStream  is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			url = new URL("https://opentutorials.org/");
			is = url.openStream(); //해당URL의 자원을 얻어오는 InputStream을 리턴받기
			isr = new InputStreamReader(is, "UTF-8");
			br = new BufferedReader(isr);
			
			//콘솔에 출력
			String str = null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {//자원해제
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}








