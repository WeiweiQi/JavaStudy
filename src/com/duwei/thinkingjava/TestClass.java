package com.duwei.thinkingjava;

public class TestClass {
////	static int x;//Ĭ�ϻ��ʼ��
//	
//	public static void main(String[] args) {
////		int y = 0;//�����Լ���ʼ��
//		SubClazz clazz = new SubClazz(1);
//		clazz.subFunction();
////		System.out.println("x=" + x+",y=" +y);
//		
//	}
	
	
	public static void main(String[] args) {
		//SubClazz sub = (SubClazz) new FuClazz();
		//sub.fuSay();//classCastExcept
		FuClazz fu = new FuClazz();
		SubClazz sub = (SubClazz) fu;
		//sub.fuSay();
		//sub.subSay();
		
	}

}
