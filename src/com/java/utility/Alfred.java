package com.java.utility;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.java.stack.StackG;

public class Alfred {
	
	public static void printMatrix(int[][] mat){
		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat[0].length; j++){
				System.out.print(" "+mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static StackG<Integer> returnPopulatedStack(int[] arr){
		StackG<Integer> stack = new StackG<Integer>(arr.length);
		
		for(int i = 0; i<arr.length; i++){
			stack.push(arr[i]);
		}
	
		return stack;
	}
	
	public static void printStack(StackG stack){
		if(!stack.isEmpty()){
			Object tmp = stack.pop();
			System.out.println(tmp);
			
			printStack(stack);
			
			stack.push(tmp);
		}
	}
	
	public static int[] createSortedArray(int len)
	{
		Random random= new Random(100);
		int arr[] = new int[len];
		
		for(int i = 0; i < len; i++)
		{
			arr[i] = i;// random.nextInt();
		}
		
		return arr;
	}
	
	public static int[] createUnSortedArray(int len)
	{
		Random random= new Random();
		int arr[] = new int[len];
		
		for(int i = 0; i < len; i++)
		{
			arr[i] = random.nextInt(len);
		}
		
		return arr;
	}
	
	public static int[] createDistinctUnSortedArray(int len)
	{
		
		Set<Integer> set = new HashSet<Integer>();
		Random random= new Random();
		int arr[] = new int[len];
		
		while(set.size() != len)
		{
			set.add(random.nextInt(100));
		}
		
		Integer[] temp = set.toArray(new Integer[set.size()]);
		
		for(int i = 0 ; i< temp.length; i++)
		{
			arr[i] = temp[i];
		}
		
		return arr;
	}
	
	public static void swapInt(int[]arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void printArray(int[] arr)
	{
		System.out.println("Array Elements ");
		for(int i: arr)
			System.out.print(i +" ");
		System.out.println();
	}
}
