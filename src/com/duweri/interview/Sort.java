package com.duweri.interview;

import javax.management.Descriptor;

public class Sort {

	public static void main(String[] args) {
		int[] testArr = {1,7,3,0,4,8,3,6,2,5,9};
		Sort.insertSort(testArr);
		Sort.display(testArr);
	}
	public static void display(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	/**
	 * ��������
	 * {@link Descriptor}����iָ�����������j��ǰ����ͬʱ����
	 * ������������л��������ʱ��
	 */
	public static void insertSort(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];//��ʱ�������������
			int j;//�����ȱ�֤J����0��ȥ����arr[j]!!!!
			for (j = i-1;j >= 0 && temp > arr[j]    ; j--) {//���������д��ڵ�ǰ���о�ǰ��--���Ӵ�С����
				arr[j+1] = arr[j];
			}
			arr[j+1]=temp;
		}
	}
	/**
	 * ϣ������
	 */
	public static void shellSort(int[] arr){
		
		for (int i = arr.length/2; i >= 1; i=i/2) {//�����еĻ���
			
		}
		
	}
	/**
	 * ð������
	 */
	public static void bubbleSort(int[] arr){
		
	}
	

}
