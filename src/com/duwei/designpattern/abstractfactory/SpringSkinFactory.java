package com.duwei.designpattern.abstractfactory;

//SpringƤ�����������幤��  
class SpringSkinFactory implements SkinFactory {  
  public Button createButton() {  
      return new SpringButton();  
  }  

  public TextField createTextField() {  
      return new SpringTextField();  
  }  

  public ComboBox createComboBox() {  
      return new SpringComboBox();  
  }  
}  