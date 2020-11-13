package ch15_network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

//TCP통신
//클라이언트 역할 클래스
public class ClientTCP {

	public static void main(String[] args) {
		//2.클라이언트는 접속할 서버의 IP주소와 포트정보로 소켓을 생성해서 서버에 연결을 요청한다.
		Socket socket = null;
		
		try {
			socket = new Socket(); //소켓생성
			socket.connect(new InetSocketAddress("192.168.0.51",5002));
			System.out.println("[서버와 연결성공]");
		//-------------------------------------	
			String message = null;
			byte[] bytes = null;
			OutputStream os = socket.getOutputStream();//서버로 보내기위한 아웃풋스트림
			
			message="Hola hola server!";
			bytes = message.getBytes("UTF-8");
			
			os.write(bytes);
			os.flush();
			System.out.println("[서버에 메세지를 보냈습니다.]");
			
			//-------------
			bytes = new byte[500];
			String msg = null;
			InputStream is = null;
			
			is = socket.getInputStream(); //socket을 이용해 InputStream생성
			int readByteCount = is.read(bytes); //생성된 InputStream통해서  bytes[]를 읽기
			
			msg = new String(bytes, 0, readByteCount);//bytes[]를 문자열로 변환
			System.out.println("서버로부터  받은 메세지 : "+msg);
			
			is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
