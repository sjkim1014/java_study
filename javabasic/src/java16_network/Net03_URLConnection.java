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
		
		URL url = null;	//URL������ü
		URLConnection conn = null;	//URL���Ӱ�ü
		
		BufferedReader reader = null;	//�Է½�Ʈ����ü
		
		//��´�� ����
		File file = new File("./src/java16_network","down");
		BufferedWriter writer = null; 	//��½�Ʈ�� ��ü
		
		try {
			url = new URL(urlStr);	//������ URl ���� ����
			conn = url.openConnection();	//URL�� �������
			
			//���� ��ü�κ��� �Է½�Ʈ�� ���
			
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			//url //->conn
			//conn->InputStream
			//InputStream -> Reader
			//Reader -> BufferedReader
			
			//�Է½�Ʈ�� ���� ����
			int len = -1; 	//�Էµ������� ����
			char[] cbuf = new char[1024];//�Է½�Ʈ�� ����
			//���� ��� ��Ʈ�� ����
			writer = new BufferedWriter(new FileWriter(file));

			//URL ��û��� ���Ϸ� �����ϱ�
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
