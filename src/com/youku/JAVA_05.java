package com.youku;

public class JAVA_05 {
	
	//�ڲ���
	private class InterClass{
		//���캯��
		public InterClass(){
			System.out.println("i an interclass");
		}
	}
	//���캯��
	public JAVA_05(){
		InterClass interclass = new InterClass();
		System.out.println("i am JAVA_05");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JAVA_05 o = new JAVA_05();
	}

}
