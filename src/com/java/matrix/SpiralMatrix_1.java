package com.java.matrix;

import com.java.utility.Alfred;

public class SpiralMatrix_1 {

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3, 4, 5 }, 
				{ 18, 19, 20, 21, 6 },
				{ 17, 28, 29, 22, 7 },
				{ 16, 27, 30, 23, 8 },
				{ 15, 26, 25, 24, 9 },
				{ 14, 13, 12, 11, 10 } };
		
		Alfred.printMatrix(mat);
		
		System.out.println("\nPrinting Spiral\n");
		
		printSpiral(mat);
	}
	
	public static void printSpiral(int[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		
		int rowBegin = 0, colBegin = 0, iterator = 0;
		
		while(rowBegin < rows && colBegin < cols){
			for(iterator = colBegin; iterator<cols; iterator++){
				System.out.print(" "+mat[rowBegin][iterator]+" ");
			}
			rowBegin++;
			
			for(iterator = rowBegin; iterator<rows; iterator++){
				System.out.print(" "+mat[iterator][cols-1]+" ");
			}
			cols--;
			if(rowBegin<rows && colBegin<cols){
				for(iterator = cols-1; iterator>=colBegin; iterator--){
					System.out.print(" "+mat[rows-1][iterator]+" ");
				}
				rows--;
				
				for(iterator = rows-1; iterator>=rowBegin; iterator--){
					System.out.print(" "+mat[iterator][colBegin]+" ");
				}
				colBegin++;
			}
		}
	}

}
