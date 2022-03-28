package com.wangxingdi.basis.polymorphism.byabstract;

/**
 * 猫
 * @author wangxd
 */
public class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("猫吃小鱼");
	}

}
