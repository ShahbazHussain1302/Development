package com.java.matrix;

public class Count1InLargestIsland_1 {

	public static void main(String[] args) {
		int mat[][] = { { 1, 1, 1, 0, 1 }, 
						{ 1, 1, 0, 0, 0 },
						{ 0, 0, 0, 1, 0 },
						{ 1, 1, 0, 1, 0 },
						{ 1, 1, 0, 1, 1 },
						{ 0, 0, 0, 0, 0 } };

		biggestIslandCount(mat);
	}
	
	public static boolean isSafe(int[][] mat, boolean[][] visited, int i, int j){
		return i>=0 && i<mat.length && j>=0 && j<mat[0].length && mat[i][j] ==1 && !visited[i][j];
	}
	
	public static int count1(int[][] mat, boolean[][] visited, int i, int j){
		int count = 0;
		int[] row = {-1,-1,-1,0,0,1,1,1};
		int[] col = {-1,0,1,-1,1,-1,0,1};
		visited[i][j] = true;
		
		for(int k = 0 ; k<row.length; k++){
			if(isSafe(mat, visited, i+row[k], j+col[k])){
				count = count1(mat, visited, i+row[k], j+col[k]);
			}
		}
		
		return count +1;
	}
	
	public static void biggestIslandCount(int[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		
		boolean[][] visited = new boolean[rows][cols];
		
		int max = 0, temp = 0;
		
		for(int i = 0 ; i<rows; i++){
			for(int j = 0; j<cols; j++){
				if(mat[i][j] == 1 && !visited[i][j]){
					temp = count1(mat, visited, i, j);
				}
				if(temp>max){
					max = temp;
				
			}
		}
		}
		
		System.out.println("Biggest Island Counts " + max);
	}

}
