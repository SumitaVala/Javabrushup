package javabrushup;

import net.bytebuddy.asm.Advice.This;

interface idemo {
	abstract void method1();

	abstract void method2();
}

interface idemo2 {
	abstract void method1();
}

public class Practiceabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			// int j=10/0;

			shape obj = new rectangle();
			//shape obj1 = new circle();
			obj.draw();
			//obj1.draw();

			// shape s1= new shape();

		} catch (Exception e) {

			System.out.println("Unable to execute code and throwing exception");
			e.printStackTrace();
			System.out.println("************************************");

		} finally {
			System.out.println("Inside finally block");
		}

	}

}

abstract class shape {
	 void draw() {
		System.out.println("parent");
	}
}
class rectangle extends shape{

	
	
	void draw()
	{
		System.out.println("Draw rectangle");
	}
	
		
	}
