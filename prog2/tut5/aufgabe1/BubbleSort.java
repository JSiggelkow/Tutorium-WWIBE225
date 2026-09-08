package prog2.tut5.aufgabe1;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {


		Arrays.stream(bubbleSort(new int[]{4,8,2,4,6,9,1,2,0})).forEach(System.out::println);
	}

	public static int[] bubbleSort(int[] arr) {

		int n = arr.length;
		int temp = 0;

		for (int i = 0; i < n - 1; i++) {

			for (int k = 0; k < n - i - 1; k++) {
				if (arr[k] < arr[k + 1]) {
					temp = arr[k];
					arr[k] = arr[k + 1];
					arr[k + 1] = temp;
				}
			}
		}
		return arr;
	}
}
