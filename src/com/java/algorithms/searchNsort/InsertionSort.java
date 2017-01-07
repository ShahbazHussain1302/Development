package com.java.algorithms.searchNsort;

import com.java.utility.Alfred;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = Alfred.createDistinctUnSortedArray(5);
		
		Alfred.printArray(arr);
		
		insertionSort(arr);
		
		Alfred.printArray(arr);
	}
	
	public static void insertionSort(int[] arr)
	{
		for(int i = 0; i< arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[i])
				{
					Alfred.swapInt(arr, i, j);
				}
			}
		}
	}
}
