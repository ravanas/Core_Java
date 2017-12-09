package org.robo.java;

public class Question_1_MainMethod {

	// Question 1:Is main-method is overloaded...
	// Yes
	// Question 2:Then which main method will called automatically
	// public static void main(String[] args) this is the default main method
	// this method called by JVM automatically
	public static void main(String[] args) {

	}

	public static void main() {

	}

	public static void main(String j) {

	}

	public void method() {
		System.out.println(" ---- Hello ---- ");
	}
}

// Question 3: Is it possible to declare main(String[] args) in interface
// Yeah...But only from java8

// Question 4: Is it visible to JVM
// Static mean that member or method will be visible to all from initial state
// of execution
interface mainInerface {
	public static void main(String args[]) {

	}
}

// Question 5: Is it possible to declare main(String[] args) in Abstract Class
// Yeah...Abstract class is also a class
abstract class mainAbstract {
	public static void main(String args[]) {

	}
}