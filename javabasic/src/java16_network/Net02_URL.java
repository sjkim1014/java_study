package java16_network;

import java.net.MalformedURLException;
import java.net.URL;

public class Net02_URL {
	public static void main(String[] args) {
		String urlStr = "https://www.oracle.com/downloads/index.html";
		URL url=null;
		try {
			url = new URL(urlStr);	//URL 정보 객체 생성
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로토콜 : "+url.getProtocol());
		System.out.println("호스트 : "+url.getHost());
		System.out.println("포트번호 : "+url.getPort());
		System.out.println("파일경로 : "+url.getFile());
		System.out.println("전체 : "+url.toExternalForm());
	}
}
