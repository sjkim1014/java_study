package java11_api;

public class StringBufferEx {
	public static void main(String[] args) {
		
		String str = new String();
		StringBuffer sb = new StringBuffer();
		
		System.out.println("---String---");
		System.out.println("str.length() : "+str.length());
		
		System.out.println("\n---StringBuffer()---");
		System.out.println("sb.length() : "+sb.length());
		System.out.println("sb.capacity() : "+sb.capacity());
		
		System.out.println("\n---StringBuffer(\"hello\")---");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println("sb2.length() : "+sb2.length());
		System.out.println("sb2.capacity() : "+sb2.capacity());

		System.out.println("\n---StringBuffer(5)---");
		StringBuffer sb3 = new StringBuffer(5);
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		
		System.out.println("\n-----Apple�߰�-----");
		sb3.append("Apple");
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3);
		
		System.out.println("\n-----Banana�߰�-----");
		sb3.append("Banana");
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3);
		
		//5��° �ε��� (5 offset)�� "Orange" �ְ� ���	
		System.out.println("\n-----5 offset Orange �߰�-----");
		sb3.insert(5, "Orange");
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3);
		
		//3��° �ε��� �����ϰ� ���	
		System.out.println("\n-----3��° �ε��� �����ϰ� ���-----");
		sb3.deleteCharAt(3);
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3);
		
		//delete(0,3) ȣ�� �� ��� 0~2���� ������ ���
		System.out.println("\n-----delete(0,3) ȣ�� �� ���-----");
		sb3.delete(0, 3);
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3);
		
		//substring(1,7) ��� ��� 1~6���� ���
		System.out.println("\n-----substring(1,7) ��� ���-----");
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3.substring(1, 7));
		
		//trimToSize() - capa�� length��ŭ ���̱�
		System.out.println("\n-----trimToSize() - capa�� length��ŭ ���̱�-----");
		sb3.trimToSize();
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3);
		
		//reverse() ȣ�� �� ��� Ȯ�� --- ����� ���
		System.out.println("\n-----reverse() ȣ�� �� ��� Ȯ��-----");
		sb3.reverse();
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3);
		
		
		
		
		
	}
}
