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
		System.out.println("��ͷ���ͷ��");

	}

	@Override
	public void quack() {
		System.out.println("���ߵ�: ~��~��~��~");
	}

}
