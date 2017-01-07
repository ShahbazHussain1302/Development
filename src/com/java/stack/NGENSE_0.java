package com.java.stack;

// This program is to find the next smaller of next greater element

public class NGENSE_0 {
	public static void main(String[] args) {
		int[] arr = {4, 8, 2, 1, 9, 5, 6, 3};//{5, 1, 9, 2, 5, 1, 7};

		findNGENSE(arr);
	}
	
	public static void findNGENSE(int[] arr){
		int len = arr.length;
		
		StackG<Integer> stack = new StackG(len);
		StackG<Integer> stack2 = new StackG(len);
		
		for(int i = 0 ; i<len; i++){
			if(stack.isEmpty()){
				stack.push(arr[i]);
			}else{
				if(stack.peek() > arr[i] && stack2.isEmpty()){
					stack.push(arr[i]);
				}else if(stack.peek() < arr[i] && stack2.isEmpty()){
					stack2.push(arr[i]);
				}else if(!stack2.isEmpty() && stack2.peek()>arr[i]){
					while(!stack.isEmpty() && stack.peek() < stack2.peek()){
						System.out.println(stack.pop() +" --> "+ arr[i]);
					}
					stack.push(stack2.pop());
					stack.push(arr[i]);
				}
			}
		}
		
		while(!stack2.isEmpty()){
			System.out.println(stack2.pop() +" --> -1");
		}
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop() +" --> -1");
		}
		
	}

}
