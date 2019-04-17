package java15_Io.filterstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex06_ObjectInputStream_List {
public static void main(String[] args) {
		
		//파일객체선언
		File file = new File("./src/java15_Io/filterstream","ObjectStreamTest1.ser");
		
		//출력스트림 객체 선언
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			
			Object obj = ois.readObject();
			System.out.println(obj);
			
			Point p1 = (Point) ois.readObject();
			Point p2 = (Point) ois.readObject();
			
			List<Point> list = new ArrayList<>();
			
			list.add(p1);
			list.add(p2);
			System.out.println(list);
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
