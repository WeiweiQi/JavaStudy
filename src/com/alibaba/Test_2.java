package com.alibaba;

public class Test_2 {
	
	public static void main(String[] args){
		int i = 3000;
		Integer j = new Integer(3000);
		
		System.out.println(i == j);
		//�Զ�����
		
		System.out.println(j.equals(i));
		//�Զ�װ��
		//Integer��equals�����Ƚϵ���ֵ���ǵ�ַ
		//String,Integer,Date����Щ�൱��equals���������ʵ�֣��������ǱȽ����ڶ��ڴ��еĴ�ŵ�ַ�ˡ�
	}

}
