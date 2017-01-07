package com.java.stack;

public class NGE3 {

	public static void main(String[] args) {
		int[] arr = {9,5,3,1,7,8,6,2,4};
		
		NGE(arr);
	}

		public static void NGE(int[] arr){
			StackG<Integer> stack = new StackG<Integer>(arr.length);
			
			for(int i : arr){
				if(stack.isEmpty() || stack.peek() > i){
					stack.push(i);
				}else{
					while(stack.peek()<i){
						System.out.println(stack.pop()+"-->"+ i);
					}
					stack.push(i);
				}
			}
			
			while(!stack.isEmpty()){
				System.out.println(stack.pop() +"--> -1");
			}
		}
}
