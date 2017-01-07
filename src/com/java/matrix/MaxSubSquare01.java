package com.java.matrix;

public class MaxSubSquare01 {

	public static void main(String[] args) {
		int mat[][] = { { 1, 1, 1, 0, 1 }, 
				{ 1, 1, 0, 1, 0 },
				{ 0, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1 },
				{ 0, 1, 1, 1, 1 } };
		
		printMaxSubSquare(mat);
	}
	
	public static void printMaxSubSquare(int[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		
		for(int i = 1; i<rows; i++){
			for(int j = 1; j<cols; j++){
				if(mat[i][j] ==1){
					mat[i][j] = Math.min(mat[i-1][j-1], Math.min(mat[i][j-1], mat[i-1][j]))+1;
				}
			}
		}
		
		int max = 0;
		
		for(int i =0 ;i<rows ;i++){
			for(int j= 0; j<cols;j++){
				if(mat[i][j]>max){
					max = mat[i][j];
				}
			}
		}
		
		for(int i = 0; i<max ; i++){
			for(int j = 0; j<max; j++){
				System.out.print(" 1 ");
			}
			System.out.println();
		}
	}

}
