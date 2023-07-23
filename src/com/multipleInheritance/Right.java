package com.multipleInheritance;

public interface Right {
	
	default void m1() {
		System.out.println("This is a Right interface m1 method");
	}

}
   