package javabrushup;

public class Constructor {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor cd = new Constructor();
		//Constructor ab =new Constructor();
		
		cd.Constructor(5, 6);
		cd.Constructor(20, 20);
		cd.Constructor(20, 20);
		cd.Constructor(null, 0);
		cd.Constructor(null, 6, 6);
		cd.Constructor("Aarvi");
		
	}

	public Constructor() {
		// TODO Auto-generated constructor stub				
		System.out.println("Hello");
	}
	
	public Constructor(Constructor cd) {
		// TODO Auto-generated constructor stub				
		System.out.println("Hello");
	}

	
	public void Constructor(int a,int b) {
		// TODO Auto-generated method stub
		
		int add;
		add=a+b;
		System.out.println(add);
		
	}
	void Constructor(String a,int b) {
		
		a="Hi";
		System.out.println(a);
	}

	
	  private void Constructor(String d,int c,int e) {
	  
	  d="World";
	  int add=c+e;
	  System.out.println(d); 
	  System.out.println(add); }
	 
	
	void Constructor(String d) 
	{
		 
		  System.out.println(d); 
		  
	}
	
}