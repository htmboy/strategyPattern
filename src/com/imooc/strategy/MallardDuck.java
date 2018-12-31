package com.imooc.strategy;

import com.imooc.impl.FlyWithWin;

public class MallardDuck extends Duck {

	/**
	 * 
	 */
	public MallardDuck() {
		super();
		super.setFlyingStragety(new FlyWithWin());
	}

	@Override
	public void display() {
		System.out.println("�ҵĲ�������ɫ��");
	}

}