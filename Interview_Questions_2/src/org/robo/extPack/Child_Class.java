package org.robo.extPack;

import org.robo.java.Parent_Class;

//the method or variable which are declared as the protected 
// those are access with in the package via objects 
// allow the child to acces those member variables are declared as protected
public class Child_Class extends Parent_Class {

	public Child_Class() {
		// TODO Auto-generated constructor stub
		System.out.println(protected_var); // ------ allowed its a child class
		// System.out.println(q11.private_var); ------ Not inside the same Class
		System.out.println(public_var);
	}

}
