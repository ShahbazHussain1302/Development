package com.java.queue;

import com.java.stack.QueueG;

public class RottenOranges {

	public static void main(String[] args) {
		int[][] mat = { {2, 1, 0, 2, 1},
						{1, 0, 1, 0, 1},
						{1, 0, 0, 1, 1},
						{0, 1, 0, 1, 0}};

		printMinTimeToRotAll(mat);
	}

	public static void printMinTimeToRotAll(int[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		int time = 0;
		int[] rowArr = {-1,-1,-1,0,0,1,1,1};
		int[] colArr = {-1,0,1,-1,1,-1,0,1};
		QueueG<Delimiter> q = new QueueG<>(rows*cols);

		
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<cols; j++){
				if(mat[i][j] == 2){
					q.enqueue(new Delimiter(i,j));
				}
			}
		}
		//Adding the ending
		q.enqueue(new Delimiter(-1,-1));

		//Finding the Time for to Rot all
		while(!q.isEmpty()){
			Delimiter d = q.dequeue();

			if(d.i != -1 && d.j != -1){
				for(int i = 0; i<rowArr.length; i++){
					if(d.i+rowArr[i]>=0 && d.i+rowArr[i]<rows && d.j+colArr[i]>=0 && d.j+colArr[i]<cols && mat[d.i+rowArr[i]][d.j+colArr[i]]==1){
						mat[d.i+rowArr[i]][d.j+colArr[i]] = 2;
						q.enqueue(new Delimiter(d.i+rowArr[i],d.j+colArr[i]));
					}
				}
			}else{
				if(!q.isEmpty()){
					q.enqueue(new Delimiter(-1,-1));
					time++;
				}
			}
		}
		
		//Check for fresh orange in Matrix
		for(int i = 0; i<rows; i++){
			for(int j = 0; j<cols; j++){
				if(mat[i][j] == 1){
					System.out.println("Not all oranges can be rotten");
					return;
				}
			}
		}
		
		System.out.println("Time take for all oranges to rot "+time);
	}

	static class Delimiter{
		int i, j;
		public Delimiter(int i, int j){
			this.i = i;
			this.j = j;
		};
	}
}
