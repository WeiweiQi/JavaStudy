package com.duweri.interview;
/**
 * λ����Demo
 * @author ��ΰ
 * 
 */
public class BitCompute {

	public static void main(String[] args) {
		//���
		int a = 8;//1000
		int b = 9;//1001
		System.out.println(a^b);
		
		int x = 15;//01111=1+2+4+8
		int y = 23;//10111=1+2+4+16
		System.out.println(x^y);
		
		//������
		System.out.println(x&y);
		
		//������
		System.out.println(x|y);
		
		//����������
	}

}
