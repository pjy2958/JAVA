package kr.ac.kopo.day05;

import java.util.Arrays;

public class ArrayMain07 {

	public static void main(String[] args) {
		int[][] ar = new int[3][];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = new int[3 + i];
		}
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = i * 10 + (j + 1);
				System.out.printf("ar[%d][%d] = %d\t", i, j, ar[i][j]);
			}
			System.out.println();
		}
		
		for(int[] arr : ar) {
			System.out.print(Arrays.toString(arr));
		}
		System.out.println();
		
		for(int i = 0; i < ar.length; i++) {
			for(int num : ar[i]) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
