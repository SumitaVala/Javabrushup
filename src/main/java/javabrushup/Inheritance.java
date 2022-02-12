package javabrushup;

import net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ChildFirst;

public class Inheritance {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 cd =new child1();
		child2 cd1 =new child2();
		cd.addition();
		cd.addition();
		}
} 
  
class child1 {

	
	void addition() {
		// TODO Auto-generated method stub
		float a= 21.5f;
		int b=10;
		
		float sum =a+b;
		System.out.println(sum);
	}
		
	
}
class child2 extends child1{

	
	void addition() {
		// TODO Auto-generated method stub
		float a= 4.5f;
		int b= 6;
		float sum =a+b;
		System.out.println(sum);
	}
		 
}