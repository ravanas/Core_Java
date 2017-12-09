package org.robo.java;

//Question - Is it possible to use this keyword inside the Static context

public class Question_1_this {

	public int data1;
	public String Info;
	static Question_1_this mc;

	public static void main(String[] args) {
		mc = new Question_1_this();

	}

	// here we use the this keyword inside the non static method
	// this intimates this object
	public void setData(int data1) {
		this.data1 = data1;
	}

	// it is impossible to use this keyword inside the static method
	// but static belongs to the global so its is not possible to use this
	// inside the static
	public static void setInfo(String Info) {
		// this.Info = Info;
		mc.Info = Info;
	}
}
