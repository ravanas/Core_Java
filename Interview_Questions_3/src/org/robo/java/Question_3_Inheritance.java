package org.robo.java;

//Single Inheritance
public class Question_3_Inheritance {
	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		pc.method();
		
		ChildClass cc = new ChildClass();
		cc.childMethod();
		cc.method();
	}
}

class ParentClass {
	int i = 56;

	public void method() {
		System.out.println("Hai Hello Parent Methods");
	}
}

class ChildClass extends ParentClass {
	public void childMethod() {
		method();
	}
}