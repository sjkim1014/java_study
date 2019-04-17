package java06_array.basic;

public class ArrayEx_02 {
	public static void main(String[] args) {
		
		int[] arr=new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = i+1;
			
		}
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------------");
		
		int[] arr2 = {10,20,30,40,50};
//		arr2 = new int[5];
//		arr2[0]=10;
//		arr2[1]=20;
//		...
		
		for(int i=0; i<5; i++) {
			System.out.println(arr2[i]);
		}
		
		
	
	}
}
