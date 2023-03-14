/**
 * 
 */
package com.daniel.implementations;

import com.daniel.interfaces.QuackBehavior;

/**
 * created by dft8 on Feb 27, 2023
 */
public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak Squeak!");

	}

}
