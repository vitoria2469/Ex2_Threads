package view;

import controller.RedThreads;

public class main {

	public static void main(String[] args) {
		
		int[][] matrix = generate();
		RedThreads[] mThreads = new RedThreads[3];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				mThreads[i] = new RedThreads(matrix[i][j],i);
				mThreads[i].start();
			}
		}

	}
	
	public static int[][] generate() {
		int[][] matrix = new int[3][5];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				matrix[i][j] = (int) (Math.random() * 100);
			}
		}
		
		return matrix;
	}

}