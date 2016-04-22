package com.duwei.thinkingjava.innerclass;

public class PrivateInnerClassTest {
	private int x = 10;
	private int[] arr;
	
	public PrivateInnerClassTest(){
		arr = new int[10];
	}
	
	
	private class Inner implements Func{

		@Override
		public int add(int a, int b) {
			return a+b;
		}
		
		public void say(){
			System.out.println("x��ֵ"+x);//�����ⲿ���˽�з���
		}
	}
	

	public static void main(String[] args) {
		
		Inner f = new PrivateInnerClassTest().new Inner();//���Է���˽���ڲ���
		
		System.out.println(f.add(10, 20));
		f.say();

	}

}


interface Func{
	int add(int a ,int b);
	
}