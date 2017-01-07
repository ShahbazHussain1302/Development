package com.java.algorithms.dynamicpragrams;

public class MinCostPath {

	public static void main(String[] args) {
		int[][] costMatrix = { {1, 2, 3},
								{4, 8, 2},
								{1, 5, 3} };
		
		findMinCost(costMatrix);
	}
	
	public static int findMin(int i, int j, int k){
		return i<j && i<k? i:j<i && j<k?j:k;
	}
	
	public static void findMinCost(int[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		
		int[][] sol = new int[rows][cols];
		
		sol[0][0]=mat[0][0];
		
		for(int i = 1; i<rows; i++){
			sol[0][i] = sol[0][i-1]+ mat[0][i];
		}
		
		for(int i = 1; i<cols; i++){
			sol[i][0] = sol[i-1][0] + mat[i][0];
		}
		
		for(int i = 1; i<rows; i++){
			for(int j = 1; j<cols; j++){
				sol[i][j] = findMin(sol[i-1][j], sol[i][j-1], sol[i-1][j-1])+mat[i][j];
			}
		}
		
		System.out.println("Minimum cost to reach the end "+sol[rows-1][cols-1]);
	}

}
