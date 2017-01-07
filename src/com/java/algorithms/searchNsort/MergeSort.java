package com.java.algorithms.searchNsort;

import com.java.utility.Alfred;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = Alfred.createDistinctUnSortedArray(5);

		Alfred.printArray(arr);

		mergeSort(arr, 0, arr.length-1);

		Alfred.printArray(arr);
	}

	public static void mergeSort(int[] arr, int lower, int upper)
	{
		if(lower<upper)
		{
			int middle = lower + ( upper - lower )/2;

			mergeSort(arr, lower, middle);

			mergeSort(arr, middle+1, upper);

			merge(arr, lower, middle, upper);
		}
	}

	public static void merge(int[] arr, int lower, int middle, int upper)
	{
		int size1 = middle - lower + 1;
		int size2 = upper - middle;

		int[] left = new int[size1];
		int[] right = new int[size2];

		for(int i = 0; i<size1; i++)
		{
			left[i] = arr[lower + i];
		}

		for(int i = 0; i<size2; i++)
		{
			right[i] = arr[middle + i +1];
		}

		int i = 0, j = 0, k = lower;

		while(i < size1 && j < size2)
		{
			if(left[i] <= right[j])
			{
				arr[k] = left[i];
				i++;
			}
			else{
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		while(i<size1)
		{
			arr[k++] = left[i++];
		}

		while(j<size2)
		{
			arr[k++] = right[j++];
		}
	}

}
