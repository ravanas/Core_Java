package org.robo.java;

//Multiple Inheritance
public class Question_4_MultiLevel {
	public static void main(String[] args) {
		ParentClass_ML pc = new ParentClass_ML();
		pc.method();

		// Here we use the single object to access the both the parent and grant parent
		ChildClass_ML cc = new ChildClass_ML();
		cc.childMethod();
		cc.method();
		cc.GPmethod();
	}
}

class GrandParent {
	public void GPmethod() {
		System.out.println("Hai Hello Parent Methods");
	}

}

class ParentClass_ML extends GrandParent {
	int i = 56;

	public void method() {
		System.out.println("Hai Hello Parent Methods");
	}
}

class ChildClass_ML extends ParentClass_ML {
	public void childMethod() {
		method();
	}
}