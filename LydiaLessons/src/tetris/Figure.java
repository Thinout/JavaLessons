package tetris;

import java.util.Random;

import org.junit.Test;

public class Figure {
	
	public static final Figure FOUR_HORIZONTAL;
	
	private static int[][] T = new int[][] {
		{0,2,2,2},
		{0,0,2,0},
		{0,0,0,0},
		{0,0,0,0},
	};
	
	private static int[][] L = new int[][] {
		{0,3,0,0},
		{0,3,0,0},
		{0,3,3,0},
		{0,0,0,0},
	};
	private static int[][] I = new int[][] {
		{0,4,0,0},
		{0,4,0,0},
		{0,4,0,0},
		{0,4,0,0},
	};
	private static int[][] S = new int[][] {
		{0,1,0,0},
		{1,1,0,0},
		{1,0,0,0},
		{0,0,0,0},
	};
	private static int[][] Z = new int[][] {
		{0,3,0,0},
		{0,3,3,0},
		{0,0,3,0},
		{0,0,0,0},
	};
	private static int[][] Q = new int[][] {
		{2,2,0,0},
		{2,2,0,0},
		{0,0,0,0},
		{0,0,0,0},
	};
	private static int[][] J = new int[][] {
		{0,0,1,0},
		{0,0,1,0},
		{0,1,1,0},
		{0,0,0,0},
	};
	
		public static int[][][] FIGURES = {
		T, L, I, S, Z, Q, J
	};

		private static Random random = new Random();
	
	static {
		FOUR_HORIZONTAL = new Figure();
		FOUR_HORIZONTAL._data = new int[][] {
				{0,0,0,0},
				{0,0,0,0},
				{1,1,1,1},
				{0,0,0,0},
		};
	}
	
	int[][] _data;

	public Figure() {
		_data = new int[4][4];
	}

	public int[][] getData() {
		return _data;
	}

	public static Figure randomFigure() {
		Figure figure = new Figure();
		figure._data = FIGURES[random.nextInt(FIGURES.length)];
		return figure;
	}
	
}
