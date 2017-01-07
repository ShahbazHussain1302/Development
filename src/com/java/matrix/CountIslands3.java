package com.java.matrix;

public class CountIslands3 {
	public static void main(String[] args) {
		int mat[][] = { { 1, 1, 1, 0, 1 }, 
						{ 1, 1, 0, 0, 0 },
						{ 0, 0, 0, 1, 0 },
						{ 1, 1, 0, 1, 0 },
						{ 1, 1, 0, 1, 1 },
						{ 0, 0, 0, 0, 0 } };

		islandCount(mat);
	}
	
	public static boolean isSafe(int[][] mat, boolean[][] visited, int i, int j){
		return i>=0 && i<mat.length && j>=0 && j<mat[0].length && mat[i][j] == 1 && !visited[i][j];
	}
	
	public static void markIsland(int[][] mat, boolean[][] visited, int i, int j){
		int[] x = {-1,-1,-1,0,0,1,1,1};
		int[] y = {-1,0,1,-1,1,-1,0,1};
		
		visited[i][j] = true;
		
		for(int k = 0; k<x.length; k++){
			if(isSafe(mat, visited, i+x[k], j+y[k])){
				markIsland(mat, visited, i+x[k], j+y[k]);
			}
		}
	}
	
	public static void islandCount(int[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		
		boolean[][] visited = new boolean[rows][cols];
		int count = 0;
		for(int i = 0 ; i<rows; i++){
			for(int j = 0 ; j<cols; j++){
				if(isSafe(mat, visited, i,j)){
					count++;
					markIsland(mat, visited, i, j);
				}
			}
		}
		
		System.out.println("Island Count "+ count);
	}
}
