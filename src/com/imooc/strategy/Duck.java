package com.imooc.strategy;

/**
 * 超类, 所有鸭子都要继承此类
 * 抽象了鸭子的行为: 显示和鸣叫
 * @author aooled-laptop
 *
 */
public abstract class Duck {

	public void quack() {
		System.out.println("嘎嘎嘎");
	}
	
	public abstract void display();
	
	// 定义飞行策略接口
	private FlyingStragety flyingStragety;

	public FlyingStragety getFlyingStragety() {
		return flyingStragety;
	}

	public void setFlyingStragety(FlyingStragety flyingStragety) {
		this.flyingStragety = flyingStragety;
	}
	// 实现飞行的动作
	// 到此, 完成了框架操作
	public void fly() {
		flyingStragety.performFly();
	}
	
}
