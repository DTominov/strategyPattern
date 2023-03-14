/**
 * 
 */
package com.daniel.implementations;

import com.daniel.interfaces.FlyBehavior;

/**
 * created by dft8 on Feb 27, 2023
 */
public class FlyNoWay implements FlyBehavior {
	
	@Override
	public void fly(){
		System.out.println("Sadly, I cannot fly!");
	}

}
