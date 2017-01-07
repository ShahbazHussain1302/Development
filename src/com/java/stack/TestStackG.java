package com.java.stack;

public class TestStackG {

	public static void testStackG(){
		StackG<Integer> stack = new StackG(10);
		
		System.out.println("Pushing/Peeking test");
		for(int i = 0; i<12; i++){
			System.out.println("Peeking :"+stack.peek());
			stack.push(i);
		}
		
		System.out.println("Popping test");
		for(int i=0;i<12;i++){
			System.out.println(stack.pop());
		}
	}
	
	public static void main(String[] args) {
		testStackG();
	}

}
