package com.duwei.thinkingjava.innerclass;
/**
 * ���ʷǾ�̬�ڲ���ķ���
 * �����ⲿ�������
 * @author ��ΰ
 */
public class OutterClass {
	private String name = "duwei";		//˽�б���
	public String sex = "man";			//���б���
	private static int age = 15;		//��̬����
	
	interface IPrintString{
		String print();
	}

	public String sayOutter()  {		//�ֲ��ڲ���
		class PrintString implements IPrintString{
			@Override
			public String print() {
				return "Outter";
			}
		}
		return new PrintString().print();
	}
	
	public String sayOutter2(){
		return new IPrintString() {		//���������ڲ���
			@Override
			public String print() {
				return "Outter2";
			}
		}.print();
	}

	class InnerClass {
		//private static String name = "123";//�������о�̬����
		public void sayInner() {			//�����ⲿ���˽�У����У���̬����
			System.out.println("inner��name="+name+",sex="+sex+",age = "+age);
			System.out.println(OutterClass.this.sayOutter()+";�����ڲ��ࣺ"
			+OutterClass.this.sayOutter2());//�����ⲿ��ķ���
		}
	}

	public static void main(String[] args) {
		OutterClass outter = new OutterClass();
		InnerClass inner = outter.new InnerClass();//�ڲ������ĳ�ʼ����ʽ
		inner.sayInner();
	}
}
