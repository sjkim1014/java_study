package java06_array.quiz;

import java.util.Arrays;

public class ArrayEx_Quiz02 {
	public static void main(String[] args) {
		
//		int arr[]= {10,17,3,9,27,10,8,9,13,21};
//		선언후 문제를 푸시오.
//		
//		-위의 숫자를 invert_arr라는 배열에 거꾸로 입력하시오.
//		
//		-위의 숫자의(짝수번째 인덱스 내용의 합)-(홀수번째 인덱스 내용의합을 계산)
//		
//		-위의 숫자를 높은숫자가 1등이 되게하여 rank_arr라는 배열에 순위르 입력하시오
//		=>arr : {10,17,3,9,27,10,8,9,13,21}
//		=>rank_arr : {5,3,10,7,1,5,9,7,4,2}
//		
//		- 중복된값은 over에 넣고 중복되지 않은값은 ret_arr에 입력하시오
//		정렬까지 했다면 
//		=>over_arr:{9,10}
//		=>ret_arr:{3,8,13,17,21,27}
		
		int arr[]= {10,17,3,9,27,10,8,9,13,21};
		
		System.out.println("Q1");
		int[] invert_arr;
		invert_arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			invert_arr[i] = arr[(arr.length-1)-i];		    
		}
		System.out.println(Arrays.toString(invert_arr)+"\n");
		
		System.out.println("Q2");
		int sum=0,sum1=0;
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				sum += arr[i];
			}else {
				sum1 += arr[i];
			}
		}
		System.out.println(sum+"-"+sum1+"="+(sum-sum1)+"\n");
		
		System.out.println("Q3");
		int[] rank_arr;
		
		rank_arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			int count=1;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					count++;
				}
			}
			rank_arr[i]=count;			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rank_arr)+"\n");
		
		System.out.println("Q4");
		int[] over_arr,ret_arr;
		over_arr=new int[10];
		ret_arr=new int[10];
		
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<i; j++) {
//				if(arr[i]==arr[j]) {
//					over_arr[i]=arr[i];								
//				}				
//			}	
//			int count=0;
//			for(int j=0; j<arr.length; j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//				}
//			}
//			if(count!=2) {
//				ret_arr[i]=arr[i];					
//			}
//		}
		
		//선생님 풀이
		boolean isOverlap;
		boolean isExist; //이미 추가한 숫자인지
		int over_idx=0,ret_idx=0;
		
		for(int i=0; i<arr.length; i++) {
			isOverlap = false;
			
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j] && i!=j) {
					isOverlap = true;
					break;
				}
			}
			isExist=false;
			if(isOverlap) {
				//이미 추가된 중복값인지 검사하기
				for(int j=0; j<over_idx; j++) {
					if(over_arr[j]==arr[i]) {
						isExist = true;
						break;
					}
				}
				//중복값 배열에 없는 경우에만 추가하기
				if(!isExist) {
					over_arr[over_idx++]=arr[i];
				}
			}
			else {
				ret_arr[ret_idx++]=arr[i];
			}
		}
		
		for(int i=0; i<over_arr.length-1; i++) {
			for(int j=0; j<over_arr.length-1-i; j++) {
				if(over_arr[j]>over_arr[j+1] && over_arr[j+1]!=0) {
					int temp = over_arr[j];
					over_arr[j] = over_arr[j+1];
					over_arr[j+1] = temp;
				}
			}	
		}
		
		for(int i=0; i<ret_arr.length-1; i++) {
			for(int j=0; j<ret_arr.length-1-i; j++) {
				if(ret_arr[j]>ret_arr[j+1] && ret_arr[j+1]!=0) {
					int temp = ret_arr[j];
					ret_arr[j] = ret_arr[j+1];
					ret_arr[j+1] = temp;
				}
			}	
		}
//	Arrays.sort(over_arr);
//	Arrays.sort(ret_arr);
		System.out.println(Arrays.toString(over_arr));
		System.out.println(Arrays.toString(ret_arr));
		
		
		
		
	}

}

