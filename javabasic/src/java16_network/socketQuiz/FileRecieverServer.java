package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class FileRecieverServer {
	public static void main(String[] args) {
		ServerSocket servSock = null; // 서버리슨소켓
		Socket sock = null;	// 서버 통신 소켓
		BufferedReader in = null;	//입력스트림
		BufferedReader in1 = null;	//입력스트림
		FileOutputStream fos = null;
		File file = new File("./src/java16_network/socketQuiz","recieve.txt");
		try {
			//서버 리슨소켓 생성
			fos = new FileOutputStream(file);
			servSock = new ServerSocket(9988);
			System.out.println("+ + + 서버 소켓 생성 + + +");
			
			//클라이언트 접속 대기
			System.out.println("-----------------------");
			System.out.println("Listening Port : "+servSock.getLocalPort());
			System.out.println("-----------------------");
			sock = servSock.accept();	//Listen
			//--------BLOCKED------------
			System.out.println("클라이언트 연결됨");
			
			//클라이언트 IP 정보 얻기
			InetAddress ip = sock.getInetAddress();
			System.out.println(" >> 클라이언트 IP : " + ip.getHostAddress());
			System.out.println(" >> 클라이언트 port : " + sock.getPort());
			System.out.println(" >> 로컬 Port : "+sock.getLocalPort());
			
//			sock.getOutputStream();	//서버에서 보내는것			
//			sock.getInputStream();	//클라이언트에서 받는것
			
			//소켓 입력 스트림
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			//데이터입력 - 클라이언트로부터 받기
			while(true) {
				String str = in.readLine();	
				
				if(str.equals("N") || str.equals("n")){					
					sock = servSock.accept();	//Listen
					System.out.println("연결대기");
				}else{					
					fos.write(str.getBytes());
					System.out.println("파일이 복사되었습니다.");
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in!=null)in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
