package org.robo.java;

//Question 1: What is polymorphism in java
//1.Overloading --- Same name varying parameter
//		1.1.Method Overloading
//		1.2.Constructor Overloading
//2.Overriding --- Same as the method defined in parent

public class Question_1_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//Question 2: Constructor with different parameter called constructor overloading
	//First one is the default constructor.
	//Second one have the additional parameter.
	public Question_1_Super() {
		// TODO Auto-generated constructor stub
	}
	
	public Question_1_Super(int x)
	{
		
	}
	
	//Method with different parameter called method overloading
	public void method(int k)
	{
		
	}
	
	public void method(String g)
	{
		
	}
	
	//Return type cannot consider as overloading methods are only differentiated by the parameter not by the return type
	/*public int method()
	{
		
	}*/	
}