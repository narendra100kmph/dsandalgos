package com.naren.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] array = new int[] {10,23,37,14,6,1};
		System.out.println("Before sort-->"+Arrays.toString(array));
		array = selectionsort(array);
		System.out.println("After sort-->"+Arrays.toString(array));

	}

	private static int[] selectionsort(int[] array) {		
		for (int i=0;i<=array.length-1;i++) {
			 int small = array[i];
		 for (int j=i;j<=array.length-1;j++) {
			 if(small > array[j]) {
				 //swap				 
				 small = small+array[j]; 
				 array[j]=  small-array[j]; 
				 small=  small- array[j]; 
				}
		 }		
		 array[i] = small;
		}
		return array;
	}
	
	
}
