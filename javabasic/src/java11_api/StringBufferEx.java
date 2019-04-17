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
		
		System.out.println("\n-----Apple추가-----");
		sb3.append("Apple");
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3);
		
		System.out.println("\n-----Banana추가-----");
		sb3.append("Banana");
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3);
		
		//5번째 인덱스 (5 offset)에 "Orange" 넣고 출력	
		System.out.println("\n-----5 offset Orange 추가-----");
		sb3.insert(5, "Orange");
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3);
		
		//3번째 인덱스 삭제하고 출력	
		System.out.println("\n-----3번째 인덱스 삭제하고 출력-----");
		sb3.deleteCharAt(3);
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3);
		
		//delete(0,3) 호출 후 출력 0~2까지 삭제후 출력
		System.out.println("\n-----delete(0,3) 호출 후 출력-----");
		sb3.delete(0, 3);
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3);
		
		//substring(1,7) 결과 출력 1~6까지 출력
		System.out.println("\n-----substring(1,7) 결과 출력-----");
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3.substring(1, 7));
		
		//trimToSize() - capa를 length만큼 줄이기
		System.out.println("\n-----trimToSize() - capa를 length만큼 줄이기-----");
		sb3.trimToSize();
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3);
		
		//reverse() 호출 후 결과 확인 --- 뒤집어서 출력
		System.out.println("\n-----reverse() 호출 후 결과 확인-----");
		sb3.reverse();
		System.out.println("sb3.length() : "+sb3.length());
		System.out.println("sb3.capacity() : "+sb3.capacity());
		System.out.println("sb3 : "+sb3);
		
		
		
		
		
	}
}
