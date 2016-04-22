package com.duwei.designpattern.factorymethod;

class Client {  
    public static void main(String args[]) {  
        LoggerFactory factory;  
        Logger logger;  
        factory = new FileLoggerFactory(); //�����������ļ�ʵ��  
        logger = factory.createLogger();  
        logger.writeLog();  
    }  
}  
