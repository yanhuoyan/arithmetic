package com.tansun.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraySortUtilTest {

	@Test
	public void test() {
		for (int i = 0; i < 1000; i++) {
			int[] arr = RandomArrayCreater.createArray(0, 200, 100);
			ArraySortUtil.bubbleSort(arr);
		}
		ArraySortUtil.printSortNumber();
		/*RandomArrayCreater.printArray(arr);
		RandomArrayCreater.printArray(arr);*/
		
	}
	
	@Test
	public void easySelectionSort() {
		for (int i = 0; i < 1000; i++) {
			int[] arr = RandomArrayCreater.createArray(0, 200, 100);
			ArraySortUtil.easySelectionSort(arr);
		}
		ArraySortUtil.printSortNumber();
		/*
		RandomArrayCreater.printArray(arr);
		RandomArrayCreater.printArray(arr);*/
	}

}
