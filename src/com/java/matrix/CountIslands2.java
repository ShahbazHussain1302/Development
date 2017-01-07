package com.java.matrix;

public class CountIslands2 {

	public static void main(String[] args) {
		int mat[][] = { { 1, 1, 1, 0, 1 }, 
						{ 1, 1, 0, 0, 1 },
						{ 0, 0, 0, 1, 0 },
						{ 1, 1, 0, 1, 0 },
						{ 1, 1, 0, 1, 1 },
						{ 0, 0, 0, 0, 0 } };
		
		countIslands(mat);
	}
	
	public static void countIslands(int[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		
		int islandCount = 0;
		
		boolean[][] visited = new boolean[rows][cols];
				
		for(int i = 0 ; i< rows; i++){
			for(int j = 0; j<cols; j++){
				if(mat[i][j] == 1 && !visited[i][j] ){
					island(i,j, mat, visited);
					islandCount++;
				}
			}
		}
		
		System.out.println("Total no of islands present "+ islandCount);
	}
	
	public static void island(int i, int j, int[][] mat, boolean[][] visited){

		int[] rowArr = {-1,-1,-1,0,0,1,1,1};
		int[] colArr = {-1,0,1,-1,1,-1,0,1};
		visited[i][j]  = true;
		for(int k = 0; k<rowArr.length; k++){
			if(i+rowArr[k]>=0 && i+rowArr[k]<mat.length && j+colArr[k]>=0 && j+colArr[k]<mat[0].length && !visited[i+rowArr[k]][j+colArr[k]] && mat[i+rowArr[k]][j+colArr[k]]==1){
				island(i+rowArr[k], j+colArr[k], mat, visited);
			}
		}
	}

}
