package javabrushup;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo d1=new demo();
		demo d2=new demo(10,"Alpesh");

		d2.getstudentdetails();

		
		
	}

	
}



class demo{
	String studentname; int rollno;
	
	
	demo(){
	System.out.println("inside default constructor");	
	}
	
	demo(int i,String stdname){
		rollno=i;
		studentname=stdname;
	System.out.println("inside parameterized constructor value="+ i);
	System.out.println("inside parameterized constructor value="+ stdname);	
	}

	public void getstudentdetails() {
		
		System.out.println("student name=" + studentname);
		System.out.println("rollno=" + rollno);
		
	}
	
}