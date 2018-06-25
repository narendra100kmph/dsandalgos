package com.naren.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = new int[] {5,3,7,1,16,4};
		System.out.println("Before sort-->"+Arrays.toString(array));
		array = insertionSort(array);
		System.out.println("After sort-->"+Arrays.toString(array));
	}

	private static int[] insertionSort(int[] array) {
		for (int i=1;i<array.length;i++) {			
				if(  array[i] < array[i-1] ) {
				 int current = array[i];
				 int j=i-1;
					while (j>=0 &&  array[j] > current ) {
						array[j+1] = array[j];
						j--;						
					} 
					array[j+1] = current;					
				
				}
		 }		
		
		
		return array;
	}

}
