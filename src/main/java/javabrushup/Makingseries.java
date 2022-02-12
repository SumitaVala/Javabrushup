package javabrushup;

public class Makingseries {

	
	  public static void main(String[] args) { // TODO Auto-generated method stub
	  //fibonacci series
	  
	  int p=0,q=1,n,count= 10; 
	  System.out.print(p+" "+q);
	  
	  for(int i=2;i<count;i++)
	  {
		  n=p+q; 
		  System.out.print(" "+n);
		  p=q; 
		  q=n;
	  
	  }
	  System.out.println();
	  
	  Makingseries obj = new Makingseries();
	  obj.prime();
	  obj.reverse();
	  obj.evnoddnumber();
	
	  }
	 
	

	  void prime() {
		  int b=0,i = 0,flag=0;
		  int a=13;
		  b=a/2;
		  
	  if(a==0 & a==1)
	  {
		  System.out.println(a +"  is not prime number");
		  
	  }
	  else
	  {
		  for(i=2;i<a;i++)
		  {
			  if(a%i==0)
			  {
				  System.out.println(a+" is not prime number");
				  flag=1;
				  break;
			  }
		  }  
			
			  if(flag==0)
			  { 
				  System.out.println(a+" is prime number");
			  
			  }
			 
			  
		  }
	  }
	  
	  
		
		  void reverse() 
		  { 
			  int number = 323, reverse = 0; //we have not mentioned the initialization part of the for loop 
			  for( ;number != 0; number=number/10)
		  	  { 
				  int remainder = number % 10; 
				  reverse = reverse * 10 + remainder; 
		  	  }
			  System.out.println("The reverse of the given number is: " + reverse);
		  }
		  
		void evnoddnumber()
		{
			int i,no = 5;
			
			if(no%2==0)
			{
				System.out.println("The given number is even number");
			}
			else
			{
				System.out.println("The given number is odd");
			}
		}
	  
}

	

		
	
	



