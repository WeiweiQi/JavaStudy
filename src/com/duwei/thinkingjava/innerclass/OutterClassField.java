package com.duwei.thinkingjava.innerclass;
/**
 * �ڲ�������ⲿ�������
 * @author ��ΰ
 */
public class OutterClassField {
	
	private String name = "duwei";
	public String sex = "nan";

	
	class Chinese{
		
		public void say(){
			//�ڲ�������ⲿ���˽������
			System.out.println("�ڲ�������ⲿ���˽������"+new OutterClassField().name);
			System.out.println("�ڲ�������ⲿ��Ĺ�������"+new OutterClassField().sex);
			
		}
		
	}
	
	public static void main(String[] args) {
		new	OutterClassField().new Chinese().say();

	}

}
