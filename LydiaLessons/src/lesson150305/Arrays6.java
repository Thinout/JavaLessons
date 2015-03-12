package lesson150305;

import java.util.Arrays;

public class Arrays6 {
	public static void main(String[] args) {
		int a [] = new int [20];
		fillRandoms(a);
		Arrays.sort(a);
		int index = Arrays.binarySearch(a, 2); //массив должен быть отсортирован
		int index2 = Arrays.binarySearch(a, 2); //массив должен быть отсортирован
		//primitive types -- timSort (quick sort variant)
		//object types -- merge sort (n log n)
		System.out.println(Arrays.toString(a));
		System.out.println(index);
		
		
	}

	private static void fillRandoms(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 10);
		}
	}
}
