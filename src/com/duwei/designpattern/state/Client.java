package com.duwei.designpattern.state;
/**
 * ״̬ģʽ�Ķ��壺
 * ��һ����������״̬�ı�ʱ������ı���Ϊ
 * ״̬�ĸı���������Ϊ�ĸı�
 * @author ��ΰ
 *
 */
public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setLiftState(new ClosingState());
		context.open();
		context.close();
		context.run();
		context.stop();
	}

}
