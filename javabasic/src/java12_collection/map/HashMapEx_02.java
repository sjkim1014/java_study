package java12_collection.map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

public class HashMapEx_02 {
	public static void main(String[] args) {
		
		//hashmap�� ���� ����ȭ ó���Ǿ�����
		Map map = new Hashtable();
		
		//Properties
		Properties prop = new Properties();
		//.properties ���� : �ַ� �ý����� ������ �����ϴ� ����
		
		try {
			prop.load(new FileReader("./src/java12_collection/map/user.properties"));
			
			System.out.println(prop);
			System.out.println("-----");
			String user = prop.getProperty("username");
			System.out.println("user : "+user);
			String pass = prop.getProperty("password");
			System.out.println("pass : "+pass);
			System.out.println("-----");
			//�Ӽ��� �ٲٱ�
			//������ ������� ����
			prop.setProperty("password","abcd");
			System.out.println(prop);
			System.out.println("-----");
			
			prop.store(new FileWriter("./src/java12_collection/map/user.properties"),"Store TEST");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}















