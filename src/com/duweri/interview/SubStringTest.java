package com.duweri.interview;

import java.util.ArrayList;
import java.util.List;

public class SubStringTest {
	public static void main(String[] args) {
		SubStringTest.out();
	}

	public static void out() {
		String str = "�Ұ�����,�㰮��,�������Ǽ�һ,������";
		String temp = str + ",";
		List<String> list = new ArrayList<>();
		while (true) {
			String splitStr = null; // ������ȡ���ַ���
			int index = temp.indexOf(",");
			if (index < 0) {
				break;
			}
			splitStr = temp.substring(0, index);
			//System.out.println(splitStr);
			list.add(splitStr);
			temp = temp.substring(index + 1);
		}
	}
}
