package com.java.stack;

public class NextGreaterElement {
	
	public static void findNGEUsingLoops(int[] arr){
		boolean found = false;
		for(int i = 0 ; i<arr.length; i++){
			found = false;
			for(int j =i+1; j<arr.length;j++){
				if(arr[j]>arr[i]){
					System.out.println(arr[i]+" --> " +arr[j]);
					found = true;
					break;
				}
			}
			if(!found){
				System.out.println(arr[i] +" --> -1");
			}
		}
	}

	public static void findNGE(int[] arr){
		StackG<Integer> stack = new StackG(arr.length);
		
		stack.push(arr[0]);
		
		for(int i=1;i<arr.length;i++){
			int temp = stack.pop();
			
			while(arr[i]>temp){
				System.out.println(temp +" --> "+arr[i]);					
				
				if(!stack.isEmpty()){
					temp = stack.pop();
				}else{
					break;
				}
			}
			if(arr[i] < temp){
				stack.push(temp);
			}
			stack.push(arr[i]);
		}
		
		while(!stack.isEmpty()){
			int temp = stack.pop();
			System.out.println(temp +" --> -1");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {12,3,4,11,23,1,5,24,6,2};
		//findNGE(arr);
		findNGEUsingLoops(arr);
	}

}
