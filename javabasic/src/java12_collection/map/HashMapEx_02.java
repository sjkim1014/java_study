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
		
		//hashmap과 같고 동기화 처리되어있음
		Map map = new Hashtable();
		
		//Properties
		Properties prop = new Properties();
		//.properties 파일 : 주로 시스템의 설정을 저장하는 파일
		
		try {
			prop.load(new FileReader("./src/java12_collection/map/user.properties"));
			
			System.out.println(prop);
			System.out.println("-----");
			String user = prop.getProperty("username");
			System.out.println("user : "+user);
			String pass = prop.getProperty("password");
			System.out.println("pass : "+pass);
			System.out.println("-----");
			//속성값 바꾸기
			//파일은 영향받지 않음
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















