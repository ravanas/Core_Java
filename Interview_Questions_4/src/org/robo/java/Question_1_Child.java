package org.robo.java;

public class Question_1_Child extends Question_1_Super{

	//Question 3: what is the purpose of the super()?
	//which is called inside as first statement of the parent constructor
	//It is impossible to call the super() as second or other lines
	public Question_1_Child() {
		super();//----> which calls the default constructor of the parent
		super(2);//---->it is impossible to call the two constructor of the parent
	}
	
	//Question 4: Then what is the super keyword
	//super is the keyword which is used to call the methods of the parent class 
	//it is not necessary to call super.method() as the first line
	
	//Question 5: Is it possible to override the constructor?
	//flop question we only define the constructor inside the class only then how it is possible :-#
	@Override
	public void method(int k) {
		// TODO Auto-generated method stub
		super.method(k);
	}
	
	//Question 6: Diff this() and super()
	//super() -> which calls the constructor of the parent
	//this() ->which calls the constructor of the same class
	public Question_1_Child(int k)
	{
		//this will also be the first statement of the constructor
		//Question 7: is it possible to use both super() and this() 
		//No its impossible //Both expecting the same place 1st :->>
		this();//---->Which calls the default constructor of this class
	}
}
