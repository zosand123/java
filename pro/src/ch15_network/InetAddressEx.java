package ch15_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터의 IPv4주소 : "+local.getHostAddress());
			System.out.println();
			String host ="www.naver.com";
			InetAddress[] inetArr = InetAddress.getAllByName(host);
			for(InetAddress remote : inetArr) {
				System.out.println(host+"의 IP : "+remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
