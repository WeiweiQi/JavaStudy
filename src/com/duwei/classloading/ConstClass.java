package com.duwei.classloading;

public class ConstClass {
	static {
		System.out.println("Const ����ʼ����");
	}
	//�����ڱ���׶λ������ĳ������У������ϲ�û��ֱ�����õ����峣�������У���˲��ᴥ�����峣������ĳ�ʼ��
	public static final String HELLO_WORD = "hello word";
}
