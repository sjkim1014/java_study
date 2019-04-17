package java06_array.quiz;

import java.util.Arrays;

public class ArrayEx_Quiz02 {
	public static void main(String[] args) {
		
//		int arr[]= {10,17,3,9,27,10,8,9,13,21};
//		������ ������ Ǫ�ÿ�.
//		
//		-���� ���ڸ� invert_arr��� �迭�� �Ųٷ� �Է��Ͻÿ�.
//		
//		-���� ������(¦����° �ε��� ������ ��)-(Ȧ����° �ε��� ���������� ���)
//		
//		-���� ���ڸ� �������ڰ� 1���� �ǰ��Ͽ� rank_arr��� �迭�� ������ �Է��Ͻÿ�
//		=>arr : {10,17,3,9,27,10,8,9,13,21}
//		=>rank_arr : {5,3,10,7,1,5,9,7,4,2}
//		
//		- �ߺ��Ȱ��� over�� �ְ� �ߺ����� �������� ret_arr�� �Է��Ͻÿ�
//		���ı��� �ߴٸ� 
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
		
		//������ Ǯ��
		boolean isOverlap;
		boolean isExist; //�̹� �߰��� ��������
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
				//�̹� �߰��� �ߺ������� �˻��ϱ�
				for(int j=0; j<over_idx; j++) {
					if(over_arr[j]==arr[i]) {
						isExist = true;
						break;
					}
				}
				//�ߺ��� �迭�� ���� ��쿡�� �߰��ϱ�
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

