package com.toutiao;

import java.util.Scanner;

/**
 * ���Ľ���
 * @author ��ΰ
 */
public class HuiWenDecode {

	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		String _string = input.nextLine();
		int a = input.nextInt();
		for (int i = 0; i < a; i++) {//ִ��a�β�����ÿ��2������
			int s1 = input.nextInt();
			int s2 = input.nextInt();
			_string = getString(_string, s1, s2);
		}
		System.out.println(_string);
	}

	public static String getString(String inString, int a, int b) {
		String _part = inString.substring(a, a + b);
		StringBuilder _part2 = new StringBuilder(_part);
		String part3 = _part2.reverse().toString();
		return inString.substring(0, a + b) + part3 + inString.substring(a + b);
	}

}
