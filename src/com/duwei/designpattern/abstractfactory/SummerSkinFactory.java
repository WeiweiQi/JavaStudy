package com.duwei.designpattern.abstractfactory;

//SummerƤ�����������幤��  
class SummerSkinFactory implements SkinFactory {  
  public Button createButton() {  
      return new SummerButton();  
  }  

  public TextField createTextField() {  
      return new SummerTextField();  
  }  

  public ComboBox createComboBox() {  
      return new SummerComboBox();  
  }  
}  