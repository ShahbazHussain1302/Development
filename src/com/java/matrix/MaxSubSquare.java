package com.java.matrix;

import com.java.utility.Alfred;

public class MaxSubSquare {

	public static void main(String[] args) {
		int rows = 6, col = 5;
		int mat[][] = { { 1, 1, 1, 0, 1 }, 
						{ 1, 1, 0, 1, 0 },
						{ 0, 1, 1, 1, 0 },
						{ 1, 1, 1, 1, 0 },
						{ 1, 1, 1, 1, 1 },
						{ 0, 0, 0, 0, 0 } };
		
		System.out.println("Original Matrix");
		Alfred.printMatrix(mat);

		findMaxSubSquareMat(mat, rows, col);
	}

	public static void findMaxSubSquareMat(int[][] mat, int rows, int cols) {
		int[][] temp = new int[rows][cols];

		// copying first row to temp
		for (int i = 0; i < cols; i++) {
			temp[0][i] = mat[0][i];
		}

		// copying the first column to temp
		for (int i = 0; i < rows; i++) {
			temp[i][0] = mat[i][0];
		}

		// Populating the remaining temp
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (mat[i][j] == 0) {
					temp[i][j] = 0;
				} else {
					int val = Math.min(temp[i - 1][j], Math.min(temp[i][j - 1], temp[i - 1][j - 1])) + 1;
					temp[i][j] = val;
				}
			}
		}

		int tempRow =0, tempCol=0, max=0;
		// find max value in temp
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(temp[i][j]>max){
					tempRow = i;
					tempCol = j;
					max = temp[i][j];
				}
			}
		}
		System.out.println("\nTemprory Matrix");
		Alfred.printMatrix(temp);

		
		System.out.println("\nSquare sub matrix");
		//Printing Max sub square matrix
		for(int i = tempRow, t = max ; t>0; t--){
			for(int j = tempCol, tc = max; tc>0; tc--){
				System.out.print(" "+mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
