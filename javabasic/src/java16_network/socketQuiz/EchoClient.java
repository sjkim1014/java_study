package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args) {
		Socket sock = null; //클라이언트 통신 소켓
		PrintWriter out = null; //출력스트림
		BufferedReader in = null;	//입력스트림
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
			sock = new Socket("127.0.0.1",9988);
			
			System.out.println("클라이언트 접속 완료");
			
			//autoFlush적용한 소켓 출력스트림
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
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
				String str1 = in.readLine();
				System.out.println("\n>> 반송데이터 : "+str1);
				System.out.println();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(in!=null)in.close();
				if(out!=null)out.close();	//출력스트림 닫기
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	//출력스트림 닫기
		}
	}
}
