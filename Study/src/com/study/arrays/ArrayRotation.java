package com.study.arrays;

import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int number = 4;
		System.out.println(Arrays.toString(new ArrayRotation().rotateArray(arr, number)));
	}

	private int[] rotateArray(int[] array, int number) {
		for (int i = 0; i < number; i++) {
			int j;
			int first = array[0];
			for (j = 0; j < array.length - 1; j++) {
				array[j] = array[j + 1];
			}
			array[j] = first;
		}
		return array;
	}
}
