package org.robo.java;

public class Class_Inside_Package {
	public Class_Inside_Package() {
		
		Parent_Class q11=new Parent_Class();
		
		System.out.println(q11.protected_var);// ------  allowed inside the same package
//		System.out.println(q11.private_var); ------ Not inside the same Class
		System.out.println(q11.public_var);	}

}
