package com.java.algorithms.searchNsort;

import com.java.utility.Alfred;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = Alfred.createDistinctUnSortedArray(5);
		
		Alfred.printArray(arr);
		
		bubbleSort_2(arr);
		
		Alfred.printArray(arr);
	}
	
	public static void bubbleSort(int[] arr)
	{
		for(int i = arr.length-1; i>=0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void bubbleSort_2(int[] arr)
	{
		for(int i =0; i< arr.length-1; i++)
		{
			boolean swap = false;
			for(int j = 0; j < arr.length - i - 1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			
			if(!swap)
			{
				System.out.println("Nothing to swap"+ i);
				break;
			}
		}
	}
}
