package com.java.algorithms.dynamicpragrams;

public class MaxSumSubArray_1 {

	public static void main(String[] args) {
		int a[] =  {-2, -3, 4, -1, -2, 1, -5, -3};

		//findMaxSumSubArray(a);
		
		findMaxSumSubArrayForNegative(a);
	}

	public static int max(int a, int b){
		return a>b?a:b;
	}

	public static void findMaxSumSubArrayForNegative(int[] arr){
		int len = arr.length;
		int max_so_far = arr[0];
		int curr_max = arr[0];

		for (int i = 1; i < len; i++)
		{
			curr_max = max(arr[i], (curr_max+arr[i]));
			max_so_far = max(max_so_far, curr_max);
		}
		System.out.println("Max so far "+ max_so_far);
	}

		public static void findMaxSumSubArray(int[] arr){
			int len = arr.length;

			int maxSum =0;
			int tempMaxSum = 0;
			int beginIndex = -1;
			int endIndex = -1;

			for(int i = 0; i<len; i++){
				tempMaxSum = tempMaxSum + arr[i];

				if(tempMaxSum<0){
					tempMaxSum = 0;
					if(beginIndex != -1){
						beginIndex = -1;
						maxSum = 0;
					}
				}else if(tempMaxSum>maxSum){
					if(maxSum == 0){
						beginIndex = i;
					}else{
						endIndex = i;
					}
					maxSum = tempMaxSum;
				}
			}

			System.out.println("Max Sum that can be obtained is :" +maxSum);
			for(int i = beginIndex; i<=endIndex; i++){
				System.out.print(arr[i]+" ");
			}
		}
	}
