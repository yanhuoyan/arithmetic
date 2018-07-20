package com.tansun.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ArraySortUtil {
	
	private static Map<Integer,Integer> sortNumber = new HashMap<Integer,Integer>();

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
