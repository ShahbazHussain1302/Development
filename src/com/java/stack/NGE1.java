package com.java.stack;

public class NGE1 {

	public static void main(String[] args) {	
		int[] arr = {1,2,3,43,12,45,4,2,6,34,64};
		
		printNGE(arr);
	}
	
	public static void printNGE(int[] arr){
		StackG<Integer> stack = new StackG<Integer>(arr.length);
		
		for(int i = 0; i<arr.length; i++){
			if(stack.isEmpty()){
				stack.push(arr[i]);
			}else{
				while(!stack.isEmpty() && stack.peek() < arr[i]){
					System.out.println(stack.pop()+" --> "+arr[i]);
				}
				stack.push(arr[i]);
			}
		}
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop()+" NGE not found");
		}
		
		
	}

}
