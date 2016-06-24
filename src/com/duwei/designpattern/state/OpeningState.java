package com.duwei.designpattern.state;

public class OpeningState extends LiftState{

	@Override
	public void open() {
		System.out.println("�����ſ��ˡ�����");
	}

	@Override
	public void close() {
		super.context.setLiftState(Context.CLOSEING_STATE);
		super.context.getLiftState().stop();
	}

	@Override
	public void run() {
	}

	@Override
	public void stop() {
	}

}
