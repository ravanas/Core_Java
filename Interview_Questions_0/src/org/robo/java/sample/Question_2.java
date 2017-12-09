package org.robo.java.sample;

import org.robo.java.Question_1_MainMethod;

//Question 5: Is it possible to create 2 classes in same name ?
//Yes... Then how to call them 
//By using the full name i.e path 
//Here is the example Question_1_MainMethod is the class declared in 2 different package it is differentiate only by using full path
//Question_1_MainMethod --------------------------inside the same package
//org.robo.java.Question_1_MainMethod-------------from different package

public class Question_2 {
	public Question_2() {
		Question_1_MainMethod qm = new Question_1_MainMethod();
		org.robo.java.Question_1_MainMethod qm1 = new Question_1_MainMethod();

		qm.method();
		qm1.method();
	}
}
