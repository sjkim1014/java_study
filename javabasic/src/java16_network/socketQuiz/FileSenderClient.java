package java16_network.socketQuiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class FileSenderClient {
	public static void main(String[] args) {
		String str1=null;
		Socket sock = null; //클라이언트 통신 소켓
		PrintWriter out = null; //출력스트림
		Scanner sc = new Scanner(System.in);
		BufferedReader reader = null;	//입력스트림객체
		File file = new File("./src/java16_network/socketQuiz","Data.txt");
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");
			sock = new Socket("127.0.0.1",9988);
			
			System.out.println("클라이언트 접속 완료");
			
			//autoFlush적용한 소켓 출력스트림
			out = new PrintWriter(sock.getOutputStream(), true);
			//데이터 출력 - 서버로 전송
			
			//입력스트림 보조 변수
			int len = -1; 	//입력데이터의 길이
			char[] cbuf = new char[1024];//입력스트림 버퍼
			//파일 출력 스트림 생성
			reader = new BufferedReader(new FileReader(file));
			
			while(true) {				
				System.out.println("파일전송 Y/N");
				String str = sc.nextLine();		
				
				if(str.equals("Y") || str.equals("y")){
					while((len=reader.read(cbuf))!= -1) {
						str1=new String(cbuf,0,len);
						out.println(str1);
					}
				}else if(str.equals("N") || str.equals("n")){
					System.out.println("파일 전송이 없습니다.");
					out.println(str);
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
