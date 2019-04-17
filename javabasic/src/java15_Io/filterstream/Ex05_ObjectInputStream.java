package java15_Io.filterstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Ex05_ObjectInputStream {
	public static void main(String[] args) {
		
		//파일객체선언
		File file = new File("./src/java15_Io/filterstream","ObjectStreamTest.ser");
		
		//출력스트림 객체 선언
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			
			Object obj = ois.readObject();
			System.out.println(obj);
			
			Point1 p1 = (Point1) ois.readObject();
			Point1 p2 = (Point1) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			try {
				if(ois!=null) ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
