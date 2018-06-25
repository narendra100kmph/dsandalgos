package com.naren.sorting;

public class SortingUtil {

	public static int  swap(int i , int j) {
	 i = i+j ; //i = 2 , j= 3 -->2+3 i = 5 , j=3 
	 j= i-j;  // 5-3 = 2 
	 i=i-j;  // 5-2 = 3
	 return i ;
	}
}
