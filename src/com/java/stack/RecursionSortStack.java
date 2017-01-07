package com.java.stack;

import com.java.utility.Alfred;

public class RecursionSortStack {

	public static void sortStack(StackG<Integer> stack){
		if(!stack.isEmpty()){
			int temp = stack.pop();
			
			sortStack(stack);
			
			insertSortOrder(stack, temp);
		}
	}
	
	public static void insertSortOrder(StackG<Integer> stack, int temp){
		if(!stack.isEmpty()){
			/*int curr = stack.pop();
			
			if(curr>temp){
				insertSortOrder(stack, temp);
				stack.push(curr);
			}else{
				stack.push(curr);
				stack.push(temp);
			}
			*/
			if(temp>stack.peek()){
				stack.push(temp);
				return;
			}
			
			int c = stack.pop();
			
			insertSortOrder(stack, temp);
			
			stack.push(c);
		}else{
			stack.push(temp);
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


