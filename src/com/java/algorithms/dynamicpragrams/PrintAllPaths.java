package com.java.algorithms.dynamicpragrams;

public class PrintAllPaths {

	public static void main(String[] args) {
		int[][] mat = { {1, 2, 3},
						{4, 8, 2},
						{1, 5, 3} };
		
		String path = "";
		printAllPaths(mat, 0, 0, path);
	}
	
	public static void printAllPaths(int[][] mat, int i, int j, String path){
		path = path +" --> " + mat[i][j];
		
		if(i == mat.length-1 && j == mat.length-1){
			System.out.println(path);
			return;
		}
		
		if(i+1<mat.length){
			printAllPaths(mat, i+1, j, path);
		}
		if(j+1<mat[0].length){
			printAllPaths(mat, i, j+1, path);
		}
		
	}

}
