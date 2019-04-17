package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Q02_EchoClient_answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//키보드 입력 객체
		
		Socket sock = null; //통신소켓
		
		PrintWriter out = null; //출력스트림
		BufferedReader in = null; //입력스트림
		
		try {
			sock = new Socket("localhost", 10006); //서버 접속
			
			//출력스트림 생성
			out = new PrintWriter(sock.getOutputStream());
			
			//입력스트림 생성
			in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			
			//메시지 반복 입력 및 전송
			while(true) {
				//메시지 입력
				System.out.print(">>메시지 입력 : ");
				String msg = sc.nextLine();
				
				//메시지 입력 중단 - 프로그램 종료
				if("/EXIT".equals(msg))	break;
				
				out.println(msg); //메시지 전송
				out.flush(); //출력버퍼비우기
				
				//반송메시지 처리
				String recieved = in.readLine();
				System.out.println("\t>>반송메시지 : "+recieved);
				System.out.println();
				
			} //while(true) end
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in!=null)	in.close(); //입력스트림 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(out!=null)	out.close(); //출력스트림 닫기
			if(sc!=null)	sc.close(); //입력스트림 닫기
			
			try {
				if(sock!=null)	sock.close(); //소켓닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		} //try end
	} //main end
}
