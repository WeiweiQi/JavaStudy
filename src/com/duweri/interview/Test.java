package com.duweri.interview;

public class Test {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		
//		int[][] arr = new int[3][4];
//		
//		System.out.println(arr.length);
//		
//
//	}
	
	
	
	private static final String MESSAGE="taobao";
	  public static void main(String [] args) {
	    String a ="tao"+"bao";//�ڳ��д���tao��bao����ָ��taobao������
	    String b="tao";//ָ����е�tao
	    String c="bao";//ָ����е�bao
	    String d = b+c;//���д���d
	    System.out.println(a==MESSAGE);
	    System.out.println("-------------");
	    System.out.println((b+c)==MESSAGE);//����
	    
	    System.out.println(d.hashCode()+"+"+MESSAGE.hashCode());
	    System.out.println((b+c).length()+"+"+MESSAGE.length());
	  }

}
