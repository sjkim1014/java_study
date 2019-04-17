package java16_network.socketQuiz;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SenderClient {
	public static void main(String[] args) {
		Socket sock = null; //클라이언트 통신 소켓
		PrintWriter out = null; //출력스트림
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
			sock = new Socket("127.0.0.1",9988);
			
			System.out.println("클라이언트 접속 완료");
			
			//autoFlush적용한 소켓 출력스트림
			out = new PrintWriter(sock.getOutputStream(), true);
			//데이터 출력 - 서버로 전송
			while(true) {				
				System.out.print(" >> 보낼메시지 입력 : ");
				System.out.println("(종료시 /EXIT 입력)");
				String str = sc.nextLine();				
				out.println(str);				
				if(str.equals("/EXIT")) {
					break;
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			out.close();	//출력스트림 닫기
		}
	}
}
