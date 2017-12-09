package org.robo.java;

public class Question_0_Blocks {

	public static void main(String[] args) {
		Question_0_Blocks qo = new Question_0_Blocks();
	}

	// Static Block
	static {
		// All the static variables are initialized here
		// This block will called before the main-method of java
		System.out.println("Hai am static block");
	}

	// Non-Static Block
	{
		// All the non static variables are instantiate here
		// This block has called when objects are created
		System.out.println("Hai am Non static block");
	}

}