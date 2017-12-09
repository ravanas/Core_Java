package org.robo.java;

//Question 1: is it possible a file contains 2 Public Class
//No its throws the error

//Question 2: is External class allow private, protected 
//No it allows public,default and abstract,But inner class may be private, protected

//Question 3: what if external class will be private or protected
//No use of that classes :->
public class Question_1_Access_Specifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	private class subClass
	{
		
	}
	
	protected class subClass2
	{
		
	}
}

class Ques
{
	
}

abstract class Ques2
{
	
}