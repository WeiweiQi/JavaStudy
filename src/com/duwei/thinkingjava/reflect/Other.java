package com.duwei.thinkingjava.reflect;

public class Other extends OtherFather{
	
	static final int AGE = 24;
	
	static {
		System.out.println("5-->Other����ʼ����");
	}
	
	Other(){
		System.out.println("7-->Other���캯��");
	}

}
