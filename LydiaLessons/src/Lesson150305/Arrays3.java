package Lesson150305;

import java.util.Arrays;

public class Arrays3 {
	public static void main(String[] args) {
		int a [] = {1, 2, 3, 4, 5};
		int b [] = new int [a.length];
		System.arraycopy(a, 0, b, 0, a.length); // копирование массива, работает быстрее, чем исполнение руками
		int [][] c = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int [][] d = new int [a.length][];
		System.arraycopy(c, 0, d, 0, c.length);
		printMatrix(d);
		System.out.println(Arrays.deepToString(c));
		
	}

	private static void printMatrix(int[][] b) {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.println(b[i][j]);
			}
			System.out.println();
		}
	}
}
