package com.java.algorithms.searchNsort;

import com.java.utility.Alfred;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = Alfred.createUnSortedArray(10);
		
		Alfred.printArray(arr);
		
		selectionSort(arr);
		
		Alfred.printArray(arr);
	}
	
	public static void selectionSort(int[] arr)
	{
		for(int i = 0 ; i < arr.length; i++)
		{
			int smallestIndex = findSmallestIndex(arr, i);
			int temp = arr[i];
			arr[i] = arr[smallestIndex];
			arr[smallestIndex] = temp;
		}
	}
	
	public static int findSmallestIndex(int[] arr, int begin)
	{
		if(begin == arr.length-1)
			return begin;
		
		int index = begin ;
		
		for(int j = begin + 1; j<=arr.length-1;  j++)
		{
			if(arr[index]<arr[j]){}
				//index = i;
			else
				index = j;
		}
		
		return index;
	}

}
