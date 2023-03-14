/**
 * 
 */
package com.daniel.test;

import com.daniel.classes.Duck;
import com.daniel.classes.DuckCall;
import com.daniel.classes.MallardCall;
import com.daniel.classes.MallardDuck;
import com.daniel.classes.RubberDucky;
import com.daniel.implementations.FlyRocketPowered;
import com.daniel.implementations.Squeak;

/**
 * created by dft8 on Feb 27, 2023
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display("Mallard Duck");
		mallard.performFly();
		mallard.performQuack();
		mallard.swim();
		
		//changeded on the fly
		Duck ducky = new RubberDucky();
		ducky.display("Rubber Duck");
		ducky.performFly();
		ducky.setFlyBehavior(new FlyRocketPowered());
		ducky.performFly();
		ducky.performQuack();
		ducky.swim();
		
		DuckCall dc = new MallardCall();
		dc.display("Mallard Call");
		dc.performQuack();
		System.out.println("Changing to squeak");
		dc.setQuackBehavior(new Squeak());
		dc.performQuack();

	}

}
