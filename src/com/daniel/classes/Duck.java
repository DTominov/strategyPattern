/**

 * 
 */
package com.daniel.classes;

import com.daniel.interfaces.FlyBehavior;
import com.daniel.interfaces.QuackBehavior;

/**
 * created by dft8 on Feb 27, 2023
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void display(String str) {
		System.out.println("\n----" + str + "----");
	}
	
	public void swim() {
		System.out.println("All ducks float(even decoys).");
	}
}
