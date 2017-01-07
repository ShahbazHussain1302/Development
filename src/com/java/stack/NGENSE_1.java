package com.java.stack;

public class NGENSE_1 {

	public static void main(String[] args) {
		int[] arr = {4, 8, 2, 1, 9, 5, 6, 3};//{5, 1, 9, 2, 5, 1, 7};

		findNGENSE(arr);
	}

	public static void findNGENSE(int[] arr){
		int len = arr.length;
		
		int[] NG = new int[len];
		int[] NS = new int[len];
		
		findNext(arr, "Greater", NG);
		findNext(arr, "Smaller", NS);
		
		for(int i = 0 ; i<arr.length; i++){
			System.out.println(arr[i]+" --> "+arr[NS[NG[i]]]);
		}
	}
	
	public static void findNext(int[] arr, String token, int[] nxt){
		StackG<Integer> stack = new StackG(arr.length);
		
		for(int i = arr.length -1; i>=0; i--){
			while(!stack.isEmpty() && (token == "Greater" ? arr[stack.peek()] <= arr[i]:arr[stack.peek()]>=arr[i])){
				stack.pop();
			}
			if(stack.isEmpty()){
				nxt[i] = -1;
			}else{
				nxt[i] = stack.peek();
			}
			stack.push(i);
			
		}
	}
}
