package com.duwei.thinkingjava.innerclass;
/**
 * ��̬�ڲ���
 * @author ��ΰ
 */
public class StaticInnerClassTest {
	private String name = "StaticInnerClassTest";
	private static String name2 = "StaticInnerClassTest2";
	
	interface InnerClassInterface{	//�ӿ����涨����
		void print();
		class TestInnerClassInterface implements InnerClassInterface{//�ӿ�����������ʵ�ָýӿ�
			@Override
			public void print() {
				System.out.println("InnerClassInterface");
			}
		}
	}
	
	static class InnerClass{
		private static String name = "innerclass";
		private int age = 25;
		public void say(){
			System.out.println("inner="+name);
			System.out.println("age="+age);
			//System.out.println(StaticInnerClassTest.this.name);//�ڲ����ȼ����ˣ��ⲿ�಻�ɴ�
		}
	}

	public static void main(String[] args) {
		InnerClass inner = new InnerClass();
		inner.say();
		System.out.println(inner.name);
		new StaticInnerClassTest.InnerClassInterface.TestInnerClassInterface().print();
	}

}
