package com.java.stack;

import com.java.utility.Alfred;

public class RecursionReverseStack {

	public static void reverseStack(StackG stack){
		if(!stack.isEmpty()){
			Object temp = stack.pop();
			
			reverseStack(stack);
			
			insertAtBegining(stack, temp);
		}
	}
	
	public static void insertAtBegining(StackG stack, Object temp){
		if(!stack.isEmpty()){
			Object tmp = stack.pop();
			
			insertAtBegining(stack, temp);
			
			stack.push(tmp);
		}else{
			stack.push(temp);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,48,12,54,74,32,23,98,96,100};
		
		StackG<Integer> stack = Alfred.returnPopulatedStack(arr);
		
		System.out.println("Before\n");
		Alfred.printStack(stack);
		
		reverseStack(stack);
		
		System.out.println("\nAfter\n");
		Alfred.printStack(stack);
	}

}
