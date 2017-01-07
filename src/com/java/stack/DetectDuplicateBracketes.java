package com.java.stack;

import java.util.Stack;

public class DetectDuplicateBracketes {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		String exp = "(((a+(b)))+(c+d))";

		for(char c: exp.toCharArray()){
			if(stack.isEmpty()){
				stack.push(c);
			}else{
				if(c == ')'){
					if(stack.peek()=='('){
						System.out.println("Duplicate Bracket is detected");
						return;
					}
					while(stack.peek() != '('){
						stack.pop();
					}
					stack.pop();
				}else{
					stack.push(c);
				}
			}
		}
		
		System.out.println("No Duplicate is detected");
	}

}
