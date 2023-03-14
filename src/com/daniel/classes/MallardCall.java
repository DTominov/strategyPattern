/**
 * 
 */
package com.daniel.classes;

import com.daniel.implementations.Quack;

/**
 * created by dft8 on Feb 27, 2023
 */
public class MallardCall  extends DuckCall{

	public MallardCall() {
		quackBehavior = new Quack();
	}
}
