/**
 * 
 */
package com.daniel.classes;

import com.daniel.implementations.FlyNoWay;
import com.daniel.implementations.Squeak;

/**
 * created by dft8 on Feb 27, 2023
 */
public class RubberDucky extends Duck {
	public RubberDucky() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	public void display() {
		System.out.println("/n----Rubber Ducky----");
	}
}
