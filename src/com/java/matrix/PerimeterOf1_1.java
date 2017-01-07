package com.java.matrix;

public class PerimeterOf1_1 {

	public static void main(String[] args) {
		int[][] mat =  {{ 0, 1, 0, 0, 0,},
						{1, 1, 1, 0, 0,},
						{1, 0, 0, 0, 1,}
		    			};
		findParameter(mat);
	}
	
	public static int calcSurrounding(int[][] mat, int i, int j){
		int count = 0;
		
		if(i-1>=0 && mat[i-1][j] ==1)
			count++;
		
		if(i+1<mat.length && mat[i+1][j] == 1)
			count++;
		
		if(j-1>=0 && mat[i][j-1]==1)
			count++;
		
		if(j+1<mat[0].length && mat[i][j+1] == 1)
			count++;
		
		return count;
	}
	
	public static void findParameter(int[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		int parameter = 0;
		
		for(int i = 0 ; i<rows ; i++){
			for(int j = 0 ; j<cols; j++){
				if(mat[i][j] == 1)
				parameter = parameter + (4 - calcSurrounding(mat, i, j));
			}
		}
		
		System.out.println("Parameter of 1s in given matrix is "+parameter);
	}

}
