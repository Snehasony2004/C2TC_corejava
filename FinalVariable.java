package edu.atria.b94java.finalkeyword;

public class FinalVariable {
	//final-int x;//final instance variable must be initialized
	
	final int x=100;
	
	//Declare a static blank final variable.
	final static int y;
	
	//Declare & intialize static final variable.
	final static int z=10;
	
	//instance method
	void chnage() {
		//x=30;
		//y=200;
	}

	//@Override
	//public String toString() 
		//return "FinalVariable [x=" + x + ",y="+y+"]";
static {
	y=20;
	//z=100;
	System.out.println("value of y:"+y);
}
}
