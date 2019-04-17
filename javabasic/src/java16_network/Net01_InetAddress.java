package java16_network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Net01_InetAddress {
	public static void main(String[] args) {
		//InetAddress - IP 정보 클래스
		
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getByName("www.iei.or.kr");
			//홈페이지 주소에 해당하는 IP정보를 얻어옴
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("HostName : "+ip.getHostName());
		System.out.println("HostAddress : "+ip.getHostAddress());
		System.out.println("toString : "+ip);
		
		System.out.println("-----------------------");
		//IP주소를 byte[]로 반환받기
		
		byte[] ipAddr = ip.getAddress();
		System.out.println("getAddress : "+Arrays.toString(ipAddr));
		
		for(byte b : ipAddr) {
			System.out.print((b<0)? b+256 : b);
			System.out.print(".");
		}
		System.out.println();
		System.out.println("----------------------");
		
		try {
			//자기 자신의 호스트 정보 얻기
			//localHost
			ip = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("LocalHostName : "+ip.getHostName());
		System.out.println("LocalHostAddress : "+ip.getHostAddress());
		System.out.println("toString : "+ip);
	}
}
