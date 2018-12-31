package com.imooc.strategy;

import com.imooc.impl.FlyNoWay;

public class BigYellow extends Duck {

	/**
	 * 
	 */
	public BigYellow() {
		super();
		super.setFlyingStragety(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("�ҵ�����ܴ�");
	}

	@Override
	public void quack() {
		System.out.println("���Ѽ ~��~��~��~");
	}
	
	

}
