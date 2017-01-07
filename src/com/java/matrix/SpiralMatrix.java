package com.java.matrix;

import com.java.utility.Alfred;

public class SpiralMatrix {

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3, 4, 5 }, 
						{ 18, 19, 20, 21, 6 },
						{ 17, 28, 29, 22, 7 },
						{ 16, 27, 30, 23, 8 },
						{ 15, 26, 25, 24, 9 },
						{ 14, 13, 12, 11, 10 } };
		
		System.out.println("Original print");
		Alfred.printMatrix(mat);
		
		printSpiral(mat);
	}
	
	public static void printSpiral(int[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		
		int rowCount =0, colCount = 0; 
		int random = 0;
		
		while(rowCount<rows || colCount<cols){
			
			for(int i = colCount ; i<cols-colCount; i++){
				System.out.print(" "+mat[rowCount][i]+" ");
				random = i;
			}
			rowCount++;
			
			for(int i = cols - colCount -1, j = random+1; j<rows; random++){
				System.out.print(" "+ mat[j][i]+" ");
			}
			colCount++;
			random--;
			
			for(int i = random, j = cols-colCount-1;j>=colCount-1;j++){
				System.out.print(" "+mat[i][j]+" ");
				random = j;
			}
			rowCount++;
			
			for(int i = random+1, j = colCount -1; i>=rowCount; i-- ){
				System.out.print(" "+mat[i][j]+" ");
				random = i;
			}
			colCount++;
			
		}
		
		
	}

}
