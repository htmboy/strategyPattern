package com.imooc.impl;

import com.imooc.strategy.FlyingStragety;

public class FlyNoWay implements FlyingStragety {

	@Override
	public void performFly() {
		System.out.println("我不会飞行...有点羞涩!");
	}

}
