package com.imooc.strategy;

public class DuckTest {

	public static void main(String[] args) {
		System.out.println("²âÊÔÑ¼×Ó³ÌĞò");
		System.out.println("---------");
		Duck duck = null;
		duck = new SpaceDuck();
		
		duck.display();
		duck.quack();
		duck.fly();
		
		System.out.println("----------");
		System.out.println("²âÊÔÍê±Ï");
	}

}
