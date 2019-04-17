package java11_api;

public class StringEx {
	public static void main(String[] args) {
		String str = "Hello Java";
		//String str = new String("Hello Java");
		System.out.println("-----str문자열-----");
		System.out.println(str);
		
		System.out.println("\n-----length()-----");//길이
		System.out.println("str의 길이 : " + str.length());
		
		System.out.println("\n-----toLowerCase()-----");//소문자
		System.out.println("toUpperCase() : "+str.toLowerCase());
		
		System.out.println("\n-----toUpperCase()-----");//대문자
		System.out.println("toUpperCase() : "+str.toUpperCase());
		
		//"Hello Java"에서 J값을 얻어서 char변수 ch에 저장하고 출력
		//->charAt()
		char ch = str.charAt(6);
		System.out.println("\n-----\"Hello Java\"에서 J값을 얻어서 char변수 ch에 저장하고 출력----");
		System.out.println(ch);
		
		
		//str에 ", HIHI"라는 문자열을 추가하고 출력
		String hi = str.concat(", HIHI");
		System.out.println("\n-----str에 \", HIHI\"라는 문자열을 추가하고 출력----");
		System.out.println(hi);
		//concat() .. 괄호 안에 있는 문자를 추가해서 알려줌
		
		
		//'l'을 'x'로 변환
		String x = str.replace('l', 'x');
		System.out.println("\n-----'l'을 'x'로 변환----");
		System.out.println(x);
		//replace('oldchar','newcher')..oldchar을 newchar로 바꿔줌
		
		
		//"ava"를 "AVA"로 변환		
		String x1 = str.replace("ava", "AVA");
		System.out.println("\n-----\"ava\"를 \"AVA\"로 변환----");
		System.out.println(x1);
		//toUpperCase .. 소문자를 대문자로
		//toLowerCase .. 대문자를 소문자로
		
		
		//str에 "Java"라는 내용이 있는지 판별 -> true/false 출력
		System.out.println("\n-----str에 \"Java\"라는 내용이 있는지 판별 -> true/false 출력----");
		System.out.println(str.contains("Java"));
		//contains("문자열") .. contains안에 문자열이 str에 있는지 없는지 판별
		
		//str에서 "Ja"찾아서 따로 저장, 출력
		System.out.println("\n-----substring()-----");
		//Hello Java
		System.out.println(str.substring(6,8));
		
		System.out.println("\n-----trim()-----");
		//trim() : 양사이드 빈칸을 제거해준다.
		String trim = "   AAADS 123123\t\t\t\n\n\n\n     ";
		System.out.println("trim() : "+trim.trim());
		
		System.out.println("\n-----split()-----");
		String splitData = "1,2,3,4,5";
		String[] splitted = splitData.split(",");
		for(int i=0; i<splitted.length; i++) {
			System.out.println(splitted[i]);
		}
		
		System.out.println("------");
		for(String s : splitted) {	//foreach문
			System.out.println(s);
		}
		//for(변수선언 : 배열){
		//	//반복코드
		//}
		//배열의 원소를 하나씩 선언된 변수에 담고 반복코드를 수행한다
		
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
		//10글자, 20바이트
		
		byte[] res = str.getBytes();
		System.out.println("res[0] : "+res[0]);
		System.out.println("res[1] : "+res[1]);
		System.out.println("res[2] : "+res[2]);
		System.out.println("res[3] : "+res[3]);
		
		
		
		
		
		
	}
}


















