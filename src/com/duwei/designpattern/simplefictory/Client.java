package com.duwei.designpattern.simplefictory;

class Client {  
    public static void main(String args[]) {  
        Chart chart;  
        chart = ChartFactory.getChart("histogram"); //ͨ����̬��������������Ʒ  
        chart.display();  
    }  
}  
