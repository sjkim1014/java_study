package java15_Io.filterstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Point1 implements Serializable{
	int x;
	int y;
	
	public Point1(int x, int y) {
		setX(x);
		setY(y);
	}	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}


	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
public class Ex05_ObjectOutputStream {
	public static void main(String[] args) {
		
		//���ϰ�ü����
		File file = new File("./src/java15_Io/filterstream","ObjectStreamTest.ser");
		
		//��½�Ʈ�� ��ü ����
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			//������ ���
			oos.writeObject(new Point(11,22));
			oos.writeObject(new Point(111,222));
			oos.writeObject(new Point(1111,2222));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {			
			try {
				if(oos!=null) oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
