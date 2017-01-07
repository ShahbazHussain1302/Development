package com.java.stack;

import java.util.concurrent.SynchronousQueue;

import com.java.utility.Alfred;

public class ReverseStack {

	static StackG<Integer> stack;
	public static void reverseStack(){
		if(!stack.isEmpty()){
			int temp = stack.pop();
			
			reverseStack();
			
			pushInStack(temp);
		}
	}
	
	public static void pushInStack(int val){
		if(!stack.isEmpty()){
			int temp = stack.pop();
			
			pushInStack(val);
			
			stack.push(temp);
		}else{
			stack.push(val);
			return;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,4,3,2,1};
		stack = Alfred.returnPopulatedStack(arr);
		
		System.out.println("Before ");
		Alfred.printStack(stack);
		
		reverseStack();
		
		System.out.println("\nAfter");
		Alfred.printStack(stack);
		
	}

}
