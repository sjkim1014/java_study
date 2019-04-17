package java09_abstract.quiz;

import java.util.List;

public class Array implements ArrayAction {
	String[] arr = new String[10];
	int count = 0;
	@Override
	public void add(String element) {
		// TODO Auto-generated method stub		
		for(int i=count; i<arr.length && i<=count; i++) {
			arr[i] = element;
		}
		count++;
	}

	@Override
	public void remove(String element) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element) {
				arr[i] = null;
				for(int j=i; j<arr.length-1; j++) {
					arr[j] = arr[j+1];
				}
			}
			
		}
	}

	@Override
	public String get(int idx) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			if(i==idx) {
				return arr[i];
			}
		}
		return null;
	}

	@Override
	public int find(String element) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==element) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != null) {
				System.out.println(arr[i]);
			}
//			System.out.println(arr[i]);
			
		}
	}
		
}
