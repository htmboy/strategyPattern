package com.imooc.strategy;

public class DuckTest {

	public static void main(String[] args) {
		System.out.println("����Ѽ�ӳ���");
		System.out.println("---------");
		Duck duck = null;
		duck = new SpaceDuck();
		
		duck.display();
		duck.quack();
		duck.fly();
		
		System.out.println("----------");
		System.out.println("�������");
	}

}
