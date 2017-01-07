package com.java.stack;

public class NGE2 {

	public static void printNGE(int[] arr){
		StackG<Integer> stack = new StackG(arr.length);
		
		stack.push(arr[0]);
		
		for(int i = 1; i<arr.length; i++){
			
			int temp = stack.peek();
			
			while(temp<arr[i]){
				System.out.println(temp+" --> "+ arr[i]);
				stack.pop();
				if(stack.isEmpty())
					break;
				temp = stack.peek();				
			}
			
			stack.push(arr[i]);
		}
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop()+" --> -1");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,7,8,4,2,5,9,6,3};
		printNGE(arr);
	}

}
