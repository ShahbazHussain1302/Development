package com.java.matrix;

import com.java.utility.Alfred;

public class RotateMat {

	public static void main(String[] args) {

		int rows = 6, cols = 5;
		int mat[][] = { { 1, 1, 1, 0, 1 }, 
						{ 1, 1, 0, 1, 0 },
						{ 0, 1, 1, 1, 0 },
						{ 1, 1, 0, 1, 0 },
						{ 1, 1, 1, 1, 1 },
						{ 0, 0, 0, 0, 0 } };

		System.out.println("Original matrix");
		Alfred.printMatrix(mat);
		
		rotate90degree(mat);
	}
	
	public static void rotate90degree(int[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		
		int[][] temp = new int[cols][rows];
			
		for(int i=0; i<rows; i++){
			for(int j = 0; j<cols; j++){
				temp[j][rows-i-1] = mat[i][j];
			}
		}
		
		System.out.println("\n Rotated matrix");
		Alfred.printMatrix(temp);
		}

}
