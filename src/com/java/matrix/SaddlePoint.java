package com.java.matrix;


/*
 * Saddle point it the value in matrix which is smallest in its row
 * and largest in it column
 * */
public class SaddlePoint {

	public static void main(String[] args) {
		int[][] mat = { {1,2,3,},
						{4,5,6,},
						{7,8,9,},};

		findSaddlePoint(mat);
	}
	
	public static void findSaddlePoint(int[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		int min = 0, max = 0, minCol = 0;
		
		for(int i = 0; i< rows; i++){
			min = mat[i][0];
			for(int j = 0 ; j<cols; j++){
				;
				if(min>mat[i][j]){
					min = mat[i][j];
					minCol = j;
				}
			}
			
			for(int k = 0; k<rows; k++){
				if(max<mat[k][minCol]){
					max = mat[k][minCol];
				}
			}
			
			if(min == max){
				System.out.println("Saddle point in given matrix is "+min);
				return;
			}
			min = 100;
		}
		
		System.out.println("No Saddle point is found in the given matrix");
	}
}
