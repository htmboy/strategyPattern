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
		System.out.println("我的身体很大");
	}

	@Override
	public void quack() {
		System.out.println("大黄鸭 ~嘎~嘎~嘎~");
	}
	
	

}
