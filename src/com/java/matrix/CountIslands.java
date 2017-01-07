package com.java.matrix;

public class CountIslands {

	public static void main(String[] args) {

		int mat[][] = { { 1, 1, 1, 0, 1 }, 
						{ 1, 1, 0, 0, 0 },
						{ 0, 0, 0, 1, 0 },
						{ 1, 1, 0, 1, 0 },
						{ 1, 1, 0, 1, 1 },
						{ 0, 0, 0, 0, 0 } };
		
		countIslands(mat);

	}
	
	public static boolean isSafe(int[][] mat, boolean[][] visited, int i, int j){
		return i>=0 && i<mat.length && j>=0 && j<mat[0].length && mat[i][j] ==1 && !visited[i][j];
	}
	
	public static void DFS(int[][] mat, boolean[][] visited, int i, int j){
		int rows = mat.length;
		int cols = mat[0].length;
		
		int[] x = {-1,-1,-1,0,0,1,1,1,};
		int[] y = {-1,0,1,-1,1,-1,0,1,};
		visited[i][j] = true;
		
		for(int k = 0; k<x.length; k++){
			if(isSafe(mat, visited, i+x[k],j+y[k])){
				DFS(mat, visited, i+x[k],j+y[k]);
			}
		}
	}
	
	public static void countIslands(int[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		int count = 0;
		
		boolean[][] visited = new boolean[rows][cols];
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				if(isSafe(mat, visited, i, j)){
					DFS(mat, visited, i, j);
					count++;
				}
			}
		}
		
		System.out.println("No. of Islads are "+count);
	}
}
