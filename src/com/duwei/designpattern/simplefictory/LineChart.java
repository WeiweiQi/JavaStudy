package com.duwei.designpattern.simplefictory;

//����ͼ�ࣺ�����Ʒ��  
class LineChart implements Chart {  
  public LineChart() {  
      System.out.println("��������ͼ��");  
  }  
    
  public void display() {  
      System.out.println("��ʾ����ͼ��");  
  }  
}  