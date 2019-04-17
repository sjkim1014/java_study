package java16_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Net03_URLConnection {
	public static void main(String[] args) {
		String urlStr = "https://www.oracle.com:443/downloads/index.html";
		
		URL url = null;	//URL정보객체
		URLConnection conn = null;	//URL접속객체
		
		BufferedReader reader = null;	//입력스트림객체
		
		//출력대상 파일
		File file = new File("./src/java16_network","down");
		BufferedWriter writer = null; 	//출력스트림 객체
		
		try {
			url = new URL(urlStr);	//연결함 URl 정보 생성
			conn = url.openConnection();	//URL에 연결수립
			
			//연결 객체로부터 입력스트림 얻기
			
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			//url //->conn
			//conn->InputStream
			//InputStream -> Reader
			//Reader -> BufferedReader
			
			//입력스트림 보조 변수
			int len = -1; 	//입력데이터의 길이
			char[] cbuf = new char[1024];//입력스트림 버퍼
			//파일 출력 스트림 생성
			writer = new BufferedWriter(new FileWriter(file));

			//URL 요청결과 파일로 저장하기
			// URL -> FILE
			
			while((len=reader.read(cbuf))!= -1) {
				writer.write(cbuf,0,len);
				writer.flush();
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			try {
				if(writer != null) writer.close();
				if(reader != null) reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
