package com.tansun.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraySortUtilTest {

	@Test
	public void test() {
		
	}
	
	
	/**
	 * 测试希尔排序是否成功
	 */
	@Test
	public void shellSortSuccessTest() {
		int[] arr = RandomArrayCreater.createArray(0, 200, 30);
		RandomArrayCreater.printArray(arr);
		ArraySortUtil.shellSort(arr);
		RandomArrayCreater.printArray(arr);
	}
	
	
	
	/**
	 * 测试插入排序是否成功
	 */
	@Test
	public void baseInsertionSortSuccessTest() {
		int[] arr = RandomArrayCreater.createArray(0, 200, 30);
		RandomArrayCreater.printArray(arr);
		ArraySortUtil.baseInsertionSort(arr);
		RandomArrayCreater.printArray(arr);
	}
	/**
	 * 测试插入排序的时间复杂度
	 */
	@Test
	public void baseInsertionSortTimeComplexityTest() {
		for (int i = 0; i < 1000; i++) {
			int[] arr = RandomArrayCreater.createArray(0, 200, 100);
			ArraySortUtil.baseInsertionSort(arr);
		}
		ArraySortUtil.printSortNumber();
	}
	
	
	/**
	 * 测试冒泡排序是否成功
	 */
	@Test
	public void bubbleSortTimeSuccessTest() {
		int[] arr = RandomArrayCreater.createArray(0, 200, 100);
		RandomArrayCreater.printArray(arr);
		ArraySortUtil.bubbleSort(arr);
		RandomArrayCreater.printArray(arr);
	}
	
	/**
	 * 测试冒泡排序的时间复杂度
	 */
	@Test
	public void bubbleSortTimeComplexityTest() {
		for (int i = 0; i < 1000; i++) {
			int[] arr = RandomArrayCreater.createArray(0, 200, 100);
			ArraySortUtil.bubbleSort(arr);
		}
		ArraySortUtil.printSortNumber();
	}
	
	/**
	 * 测试选择排序
	 */
	@Test
	public void easySelectionSortSuccessTest() {
		int[] arr = RandomArrayCreater.createArray(0, 200, 100);
		RandomArrayCreater.printArray(arr);
		ArraySortUtil.easySelectionSort(arr);
		RandomArrayCreater.printArray(arr);
	}
	
	/**
	 * 测试选择排序时间复杂度
	 */
	@Test
	public void easySelectionSortTimeComplexityTest() {
		for (int i = 0; i < 1000; i++) {
			int[] arr = RandomArrayCreater.createArray(0, 200, 100);
			ArraySortUtil.easySelectionSort(arr);
		}
		ArraySortUtil.printSortNumber();

	}

}
