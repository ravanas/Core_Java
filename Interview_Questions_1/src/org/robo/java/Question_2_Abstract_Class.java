package org.robo.java;

//Question 1: What is Abstract Class?
// Class which have abstract method :-) 

//Question 2: what is abstract method?
// method without body :-)

//Question 3: Is abstract class contains method with body?
// Yes abstract class is also a class so it have all the features of Class :-)

//Question 4:Is Abstract class contains Static Method?
// Yeah i already tell that abstract class is also the class so it support all the features of Class :-)

//Question 5: ok Cool let me answer if it support all the feature mean is it possible to create the Object for the Abstract Class :->
//No the object is only created for concrete Class...

//Question 6: Then what is Concrete Class...?
// The methods that declared in the class must contains the class called Concrete Class :->

//Question 7: Then what's the use of the Abstract Class
// THe developer don't know the actual purpose of the method he lead the child class to override this method
abstract class myAbstract {
	public abstract void method();

	public void method2() {

	}

	public static void methodq() {

	}
}

// Question 8: is the class that extends the abstract class must implements the
// abstract method
// Yes! the class which extends the AClass must implement the abstract method
class childAbstract extends myAbstract {

	@Override
	public void method() {
		// TODO Auto-generated method stub

	}

}

// Question 9: If a class which cannot implement the abstract method of the
// Parent?
// Then the child is also the abstract
abstract class childHimselfAbstract extends myAbstract {

}

// Question 10 then where it was handled...?
// Like this .. :-)
public class Question_2_Abstract_Class extends childHimselfAbstract {

	public static void main(String[] args) {
		// Question 11: How to call static methods of Abstract Class... :-)
		// As usual ClassName
		myAbstract.methodq();

		Question_2_Abstract_Class Baseobj = new Question_2_Abstract_Class();

		// Question 12: How to call the methods of NonStatic Methods---?
		// By casting the Object of Child Class :->
		// This will calling only the methods of the abstract class
		childHimselfAbstract obj = Baseobj;
		obj.method2();

		// This will throws the error
		// obj.myethod(); myMethod declared in Question_2 class so it is
		// impossible to call by the casting object
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub

	}

	public void myMethod() {

	}
}

abstract class sharpQuestion {

	// Question 13:is static and final methods may abstract
	// Impossible abstract method must be override
	// but the static and final modifier method intimates that this method
	// cannot be override by any other
	// abstract public static void statMethod(); ---- Not Allowed because its impossible to override :-)
	// abstract public final void finMethod(); ---- Not Allowed because its impossible to override :-)
	// abstract private void method(); ---- Not Allowed because its impossible to override :-)

	abstract void method();
}


