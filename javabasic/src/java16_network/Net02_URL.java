package java16_network;

import java.net.MalformedURLException;
import java.net.URL;

public class Net02_URL {
	public static void main(String[] args) {
		String urlStr = "https://www.oracle.com/downloads/index.html";
		URL url=null;
		try {
			url = new URL(urlStr);	//URL ���� ��ü ����
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("�������� : "+url.getProtocol());
		System.out.println("ȣ��Ʈ : "+url.getHost());
		System.out.println("��Ʈ��ȣ : "+url.getPort());
		System.out.println("���ϰ�� : "+url.getFile());
		System.out.println("��ü : "+url.toExternalForm());
	}
}
