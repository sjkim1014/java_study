package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Q03_FileRecieverServer_answer {
	public static void main(String[] args) {

		ServerSocket servSock = null; //리슨소켓
		Socket sock = null; //통신소켓

		BufferedReader in = null; //입력스트림
		PrintWriter out = null; //출력스트림
		
		//출력대상 파일
		File file = new File("./src/java16_network/socketQuiz", "recieve.txt");

		try {
			servSock = new ServerSocket(10007); //리슨소켓 생성
			
			while(true) {
				System.out.println("[SYSTEM] 서버 활성화중입니다");
				System.out.println("[SYSTEM] 3...");
				System.out.println("[SYSTEM] 2...");
				System.out.println("[SYSTEM] 1...");
				System.out.println("[SYSTEM] OK...!");
				
				System.out.println("\n[SYSTEM] Listening... ["+servSock.getLocalPort()+"]");
				sock = servSock.accept(); //리슨
				
				//클라이언트 접속 정보 
				InetAddress ip = sock.getInetAddress(); //클라이언트 ip정보
				System.out.println("\n[SYSTEM] 클라이언트 접속("
						+ip.getHostAddress()+":"+sock.getPort()+")");
				
				//입력스트림 생성
				in = new BufferedReader(
						new InputStreamReader(sock.getInputStream())); 
	
				//출력스트림 생성, autoFlush=true
				out = new PrintWriter(new FileWriter(file), true);

				//입출력 보조 변수
				char[] cbuf = new char[1024];
				int len = -1;
				int total = 0;

				//스트림입력 및 파일 출력
				while( (len=in.read(cbuf)) != -1 ) {
					out.write(cbuf, 0, len);
					total+=len;
				}
				
				System.out.println("[SYSTEM] 복사된 문자 수 : "+total);
				System.out.println();
				
				if(in!=null)	in.close(); //입력스트림닫기
				if(out!=null)	out.close(); //출력스트림닫기
				if(sock!=null)	sock.close(); //통신소켓닫기
			} //while(true) end
		} catch (IOException e) {
			e.printStackTrace();
		} //try end
	} //main end
}
