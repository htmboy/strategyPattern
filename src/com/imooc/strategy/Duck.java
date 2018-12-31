package com.imooc.strategy;

/**
 * ����, ����Ѽ�Ӷ�Ҫ�̳д���
 * ������Ѽ�ӵ���Ϊ: ��ʾ������
 * @author aooled-laptop
 *
 */
public abstract class Duck {

	public void quack() {
		System.out.println("�¸¸�");
	}
	
	public abstract void display();
	
	// ������в��Խӿ�
	private FlyingStragety flyingStragety;

	public FlyingStragety getFlyingStragety() {
		return flyingStragety;
	}

	public void setFlyingStragety(FlyingStragety flyingStragety) {
		this.flyingStragety = flyingStragety;
	}
	// ʵ�ַ��еĶ���
	// ����, ����˿�ܲ���
	public void fly() {
		flyingStragety.performFly();
	}
	
}
