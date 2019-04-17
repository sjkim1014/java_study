package java16_network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Net01_InetAddress {
	public static void main(String[] args) {
		//InetAddress - IP ���� Ŭ����
		
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getByName("www.iei.or.kr");
			//Ȩ������ �ּҿ� �ش��ϴ� IP������ ����
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("HostName : "+ip.getHostName());
		System.out.println("HostAddress : "+ip.getHostAddress());
		System.out.println("toString : "+ip);
		
		System.out.println("-----------------------");
		//IP�ּҸ� byte[]�� ��ȯ�ޱ�
		
		byte[] ipAddr = ip.getAddress();
		System.out.println("getAddress : "+Arrays.toString(ipAddr));
		
		for(byte b : ipAddr) {
			System.out.print((b<0)? b+256 : b);
			System.out.print(".");
		}
		System.out.println();
		System.out.println("----------------------");
		
		try {
			//�ڱ� �ڽ��� ȣ��Ʈ ���� ���
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
