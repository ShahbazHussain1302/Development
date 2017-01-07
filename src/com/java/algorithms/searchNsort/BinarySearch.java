package com.java.algorithms.searchNsort;

import com.java.utility.Alfred;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = Alfred.createSortedArray(50);
		
		int element = 0;
		
		binarySearch(arr, element);
		System.out.println("Element is search in recursively manner "+ recursiveBinarySearch(arr, 0, arr.length-1, element));

	}
	
	public static int recursiveBinarySearch(int []arr, int lower, int upper, int element)
	{
		if(lower<=upper)
		{
			int middle = lower + (upper - lower)/2;
			
			if(arr[middle] == element)
				return middle;
			
			if(element < arr[middle])
				return recursiveBinarySearch(arr, lower, middle -1, element);
			
			return recursiveBinarySearch(arr, lower + 1, upper, element);
		}
		return -1;
	}
	
	public static void binarySearch(int arr[], int element)
	{
		int lower = 0;
		int upper = arr.length-1;
		int middle;
		
		while(lower<upper)
		{
			middle = lower + (upper - lower)/2;
			
			if(arr[middle] == element)
			{
				System.out.println("Element is present at "+middle+" location");
				return;
			}
			else if(arr[middle]<element)
			{
				lower = middle+1;
			}
			else
			{
				upper = middle-1;
			}
		}
		System.out.println("Element is not present");
	}
	

}
