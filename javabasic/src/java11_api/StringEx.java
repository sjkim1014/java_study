package java11_api;

public class StringEx {
	public static void main(String[] args) {
		String str = "Hello Java";
		//String str = new String("Hello Java");
		System.out.println("-----str���ڿ�-----");
		System.out.println(str);
		
		System.out.println("\n-----length()-----");//����
		System.out.println("str�� ���� : " + str.length());
		
		System.out.println("\n-----toLowerCase()-----");//�ҹ���
		System.out.println("toUpperCase() : "+str.toLowerCase());
		
		System.out.println("\n-----toUpperCase()-----");//�빮��
		System.out.println("toUpperCase() : "+str.toUpperCase());
		
		//"Hello Java"���� J���� �� char���� ch�� �����ϰ� ���
		//->charAt()
		char ch = str.charAt(6);
		System.out.println("\n-----\"Hello Java\"���� J���� �� char���� ch�� �����ϰ� ���----");
		System.out.println(ch);
		
		
		//str�� ", HIHI"��� ���ڿ��� �߰��ϰ� ���
		String hi = str.concat(", HIHI");
		System.out.println("\n-----str�� \", HIHI\"��� ���ڿ��� �߰��ϰ� ���----");
		System.out.println(hi);
		//concat() .. ��ȣ �ȿ� �ִ� ���ڸ� �߰��ؼ� �˷���
		
		
		//'l'�� 'x'�� ��ȯ
		String x = str.replace('l', 'x');
		System.out.println("\n-----'l'�� 'x'�� ��ȯ----");
		System.out.println(x);
		//replace('oldchar','newcher')..oldchar�� newchar�� �ٲ���
		
		
		//"ava"�� "AVA"�� ��ȯ		
		String x1 = str.replace("ava", "AVA");
		System.out.println("\n-----\"ava\"�� \"AVA\"�� ��ȯ----");
		System.out.println(x1);
		//toUpperCase .. �ҹ��ڸ� �빮�ڷ�
		//toLowerCase .. �빮�ڸ� �ҹ��ڷ�
		
		
		//str�� "Java"��� ������ �ִ��� �Ǻ� -> true/false ���
		System.out.println("\n-----str�� \"Java\"��� ������ �ִ��� �Ǻ� -> true/false ���----");
		System.out.println(str.contains("Java"));
		//contains("���ڿ�") .. contains�ȿ� ���ڿ��� str�� �ִ��� ������ �Ǻ�
		
		//str���� "Ja"ã�Ƽ� ���� ����, ���
		System.out.println("\n-----substring()-----");
		//Hello Java
		System.out.println(str.substring(6,8));
		
		System.out.println("\n-----trim()-----");
		//trim() : ����̵� ��ĭ�� �������ش�.
		String trim = "   AAADS 123123\t\t\t\n\n\n\n     ";
		System.out.println("trim() : "+trim.trim());
		
		System.out.println("\n-----split()-----");
		String splitData = "1,2,3,4,5";
		String[] splitted = splitData.split(",");
		for(int i=0; i<splitted.length; i++) {
			System.out.println(splitted[i]);
		}
		
		System.out.println("------");
		for(String s : splitted) {	//foreach��
			System.out.println(s);
		}
		//for(�������� : �迭){
		//	//�ݺ��ڵ�
		//}
		//�迭�� ���Ҹ� �ϳ��� ����� ������ ��� �ݺ��ڵ带 �����Ѵ�
		
		System.out.println("----------");
		int[] arr = {10,20,30,40,50};
		for(int num : arr) {
			num*=10;
		}
		for(int num : arr) {
			System.out.println(num);
		}
		
		System.out.println("\n-----getBytes()-----");
		//"Hello Java"
		//10����, 20����Ʈ
		
		byte[] res = str.getBytes();
		System.out.println("res[0] : "+res[0]);
		System.out.println("res[1] : "+res[1]);
		System.out.println("res[2] : "+res[2]);
		System.out.println("res[3] : "+res[3]);
		
		
		
		
		
		
	}
}


















