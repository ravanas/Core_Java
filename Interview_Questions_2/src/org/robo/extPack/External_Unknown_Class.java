package org.robo.extPack;

import org.robo.java.Parent_Class;

public class External_Unknown_Class {

	public External_Unknown_Class() {
		
		Parent_Class q11=new Parent_Class();
		
//		System.out.println(q11.protected_var); ------ Not allowed not inside the same package && Not a child class
//		System.out.println(q11.private_var); ------ Not inside the same Class
		System.out.println(q11.public_var);
	}
	
}
