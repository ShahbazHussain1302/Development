package com.java.stack;

import com.java.utility.Alfred;

public class RecursionSortStack2 {
	
	public static void sortStack(StackG<Integer> stack){
		if(!stack.isEmpty()){
			int temp = stack.pop();
			
			sortStack(stack);
			
			insertInSortOrder(stack, temp);
		}
	}
	
	public static void insertInSortOrder(StackG<Integer> stack, int temp){
		
		if(stack.isEmpty() || temp > stack.peek()){
			stack.push(temp);
		}else{
			int curr = stack.pop();
			
			insertInSortOrder(stack, temp);
			
			stack.push(curr);
		}
		
		
	}

	public static void main(String[] args) {
		
		int[] arr = {1,48,12,54,74,32,23,98,96,100};

		StackG<Integer> stack = Alfred.returnPopulatedStack(arr);

		System.out.println("Before\n");
		Alfred.printStack(stack);

		sortStack(stack);

		System.out.println("\nAfter\n");
		Alfred.printStack(stack);
	}

}
