package com.duwei.thinkingjava.reflect;

public class This {
	static Other other;//����
	static{
		System.out.println("1-->This����ʼ����");//1
	}
	This(){
		System.out.println("3-->This�Ĺ��캯��");//3
	}
	public static void main(String[] args) {
		System.out.println("2-->main��ִ����");//2
		This ths = new This();
		//System.out.println(Other.AGE);//����Ҫ��ʼ�����������ı���-->�����ڳ���
		
		//Class clazz = Other.class;//������г�ʼ��
		//Class clazz = Class.forName("com.duwei.thinkingjava.reflect.Other");//�����г�ʼ��
		other = new Other();//�õ�ĳ�����ʱ���ȥ����ĳ����
	}
}
