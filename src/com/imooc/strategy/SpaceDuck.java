package com.imooc.strategy;

import com.imooc.impl.FlyWithRocket;

public class SpaceDuck extends Duck {

	/**
	 * 
	 */
	public SpaceDuck() {
		super();
		super.setFlyingStragety(new FlyWithRocket());
	}

	@Override
	public void display() {
		System.out.println("我头戴宇航头盔");

	}

	@Override
	public void quack() {
		System.out.println("无线电: ~嘎~嘎~嘎~");
	}

}
