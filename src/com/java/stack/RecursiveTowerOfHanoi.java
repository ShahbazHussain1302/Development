package com.java.stack;

public class RecursiveTowerOfHanoi {

	public static void towerOfHanoi(int n, String from, String to, String aux){
		if(n == 1){
			System.out.println("Move disk "+n+" from: "+from+" to: "+to);
			return;
		}
		towerOfHanoi(n-1, from, aux, to);
		
		System.out.println("Move disk "+n+" from: "+from+" to: "+to);
		
		towerOfHanoi(n-1, aux, to, from);
	}
	
	public static void main(String[] args) {
		towerOfHanoi(5, "A", "C", "B");

	}

}
