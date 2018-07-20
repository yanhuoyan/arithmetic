package com.tansun.util;

import java.util.Random;

public class RandomArrayCreater {
	
	public static int[] createArray(int min, int max, int number) {
		int[] result = new int[number];
		Random random = new Random();
		for (int i = 0; i < number; i++) 
			result[i] = random.nextInt(max -min) + min;
		return result;
	}
	
	public static void printArray(int[] arr) {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < arr.length; i++) {
			if(i == (arr.length -1))
				sb.append(arr[i] + "");
			else
				sb.append(arr[i] + ",");
		}
		sb.append("]");
		
		System.out.println(sb.toString());
	}
}
