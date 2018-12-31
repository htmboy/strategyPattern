package com.imooc.strategy;

import com.imooc.impl.FlyNoWay;

public class RubberDuck extends Duck {

	/**
	 * 
	 */
	public RubberDuck() {
		super();
		super.setFlyingStragety(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("ȫ����, ��ͺܺ�");
	}
	
	public void quack() {
		System.out.println("��~��~��~");
	}

}
