/**
 * 
 */
package com.daniel.classes;

import com.daniel.interfaces.QuackBehavior;

/**
 * created by dft8 on Feb 27, 2023
 */
public abstract class DuckCall {
	QuackBehavior quackBehavior;
	

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void display(String str) {
		System.out.println("\n----" + str + "----");
	}
	
}
