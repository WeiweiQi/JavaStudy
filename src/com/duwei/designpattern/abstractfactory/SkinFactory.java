package com.duwei.designpattern.abstractfactory;

//����Ƥ�������ӿڣ����󹤳�  
interface SkinFactory {  
  public Button createButton();  
  public TextField createTextField();  
  public ComboBox createComboBox();  
}  
