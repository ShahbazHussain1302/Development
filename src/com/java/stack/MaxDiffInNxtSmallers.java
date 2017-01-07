package com.java.stack;

/*
 * Given array of integers, the task is to find the
 *  maximum absolute difference between nearest left and right smaller element
 *   of every element in array.
 * */

public class MaxDiffInNxtSmallers {

	public static void main(String[] args) {
		int arr[] = {2, 4, 8, 7, 7, 9, 3};
		
		findMaxDiff(arr);
	}
	
	public static void findMaxDiff(int[] arr){
		int len = arr.length;
		
		int[] left = new int[len];
		int[] right = new int[len];
		
		StackG<Integer> stack = new StackG(len);
		
		for(int i = 0; i<len ;i++){
			if(stack.isEmpty()){
				left[i] = 0;
				stack.push(arr[i]);
			}else if(stack.peek() < arr[i]){
				left[i] = stack.peek();
				stack.push(arr[i]);				
			}else if(stack.peek() >= arr[i]){
				while(!stack.isEmpty() && stack.peek()>=arr[i]){
					stack.pop();
				}
				if(stack.isEmpty()){
					left[i] = 0;
				}else{
					left[i] = stack.peek();
				}
				stack.push(arr[i]);
			}
		}
		
		stack = new StackG(len);
		
		for(int i = len-1; i>=0 ;i--){
			if(stack.isEmpty()){
				right[i] = 0;
				stack.push(arr[i]);
			}else if(stack.peek() < arr[i]){
				right[i] = stack.peek();
				stack.push(arr[i]);				
			}else if(stack.peek() >= arr[i]){
				while(!stack.isEmpty() && stack.peek()>=arr[i]){
					stack.pop();
				}
				if(stack.isEmpty()){
					right[i] = 0;
				}else{
					right[i] = stack.peek();
				}
				stack.push(arr[i]);
			}
		}
		System.out.print("Main Array :    ");
		for(int i: arr){
			System.out.print(i+" ");
		}
		System.out.print("\nLeft Smaller :  ");
		for(int i: left){
			System.out.print(i+" ");
		}
		System.out.print("\nRight Smaller : ");
		for(int i: right){
			System.out.print(i+" ");
		}
		
		int max = -1;
		
		for(int i = 0 ; i<len; i++)
		{
			if(Math.abs(left[i]-right[i])>max){
				max = left[i]-right[i];
			}
		}
		
		System.out.println("\nMax Difference is :"+max);
	}

}
