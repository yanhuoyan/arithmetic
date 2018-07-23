package com.tansun.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArraySortUtil {
	
	private static Map<Integer,Integer> sortNumber = new HashMap<Integer,Integer>();

	
	/**
	 * 希尔排序
	 */
	public static void shellSort(int[] arr) {
		int gap = 1,
			timeComplexity = 0;
		while(gap <= arr.length / 3)
			gap = gap * 3 + 1;
		
		for (; gap > 0; gap = (gap-1) / 3) {
			for (int i = gap; i < arr.length; i += gap) {
				if(arr[i] < arr[i - gap]) {
					int temp = arr[i];
					int j = i - gap;
					
					while(j >= 0 && arr[j] > temp) {
						arr[j + gap] = arr[j] ;
						j -= gap;
						timeComplexity++;
					}
					arr[j + gap] = temp;
				}
			}
		}
		writeRunNumber(sortNumber,timeComplexity);
	}
	/**
	 * 简单插入排序
	 * 	最坏时间复杂度：O(n^2)
	 * 	最好时间复杂度：O(n)
	 * 	平均时间复杂度：O(n^2)
	 *  稳定
	 */
	public static void baseInsertionSort(int[] arr) {
		int timeComplexity = 0;
		for (int i = 1; i < arr.length; i++) {
			int preIndex = i - 1;
			int current = arr[i];
			while(preIndex >= 0 && arr[preIndex] > current) {
				arr[preIndex + 1] = arr[preIndex];
				preIndex --;
				timeComplexity++;
			}
			arr[preIndex + 1] = current;
		}
		writeRunNumber(sortNumber,timeComplexity);
	}
	/**
	 * 冒泡排序
	 * 	最坏时间复杂度：O(n^2)
	 * 	最好时间复杂度：O(n)
	 * 	平均时间复杂度：O(n^2)
	 * 	稳定
	 */
	public static void bubbleSort(int[] arr){
		int len = arr.length;
		int timeComplexity = 0;
		for (int i = 0; i < len - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < len -1 -i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j + 1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					flag = false;
				}
				timeComplexity++;
			}
			if(flag)
				break;
		}
		writeRunNumber(sortNumber,timeComplexity);
	}
	
	/**
	 * 简单选择排序：
	 * 	最坏时间复杂度：O(n^2)
	 * 	最好时间复杂度：O(n^2)
	 * 	平均时间复杂度：O(n^2)
	 * 	不稳定
	 * 	
	 */
	public static void easySelectionSort(int[] arr) {
		int timeComplexity = 0;
		for (int i = 0; i < arr.length -1 ; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) 
					minIndex = j;
				timeComplexity++;
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		writeRunNumber(sortNumber,timeComplexity);
	}
	
	private static void writeRunNumber(Map<Integer,Integer> map, int number){
		Integer value = map.get(number);
		if(value == null) {
			map.put(number, 1);
		} else {
			map.put(number, map.get(number) + 1);
		}
	}
	
	public static void printSortNumber() {
		printMap(sortNumber);
	}
	
	private static void printMap(Map<?,?> map) {
		StringBuilder sb = new StringBuilder("{");
		for (Entry<?, ?> entry : map.entrySet()) {
			sb.append(entry.getKey() + "=" + entry.getValue() + ",");
		}
		sb.append("}");
		System.out.println(sb);
	}
}
