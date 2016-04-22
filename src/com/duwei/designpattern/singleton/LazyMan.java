package com.duwei.designpattern.singleton;

public class LazyMan {
	private static LazyMan instance = null; // �ӳټ���

	private LazyMan() {
	}

	synchronized public static LazyMan getInstance() {
		if (instance == null) {
			instance = new LazyMan();
		}
		return instance;
	}
}
