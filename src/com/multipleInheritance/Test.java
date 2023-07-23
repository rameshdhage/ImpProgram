package com.multipleInheritance;

public class Test implements Right,Left{

	
	public void m1() {
		//System.out.println("This is a own method");
		//Left.super.m1();
		//Right.super.m1();
		
	}
public static void main(String[] args){
	Test test=new Test();
	test.m1();
}
}
