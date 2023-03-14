/**
 * 
 */
package com.daniel.classes;

import com.daniel.implementations.FlyWithWings;
import com.daniel.implementations.Quack;

/**
 * created by dft8 on Feb 27, 2023
 */
public class MallardDuck extends Duck{
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
}
