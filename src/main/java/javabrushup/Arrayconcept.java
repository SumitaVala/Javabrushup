package javabrushup;

import java.util.Arrays;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.min;

public class Arrayconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//////Array and Arraylist
		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		int arr1[]= {10,20,30,40,50};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		String name="Mumbai";
		System.out.println(name);
		Arrayconcept objarr= new Arrayconcept();
		objarr.matrix();
		
	}
	void matrix()
	{

		  		
		  int ab[][]= {{2,4,6},{4,5,1},{7,8,9}}; 
		  int min=ab[0][0];
		  
		  for(int i=0;i<3;i++) 
		  { 
			  for(int j=0;j<3;j++) 
			  {
					
					  if(ab[i][j]<min) 
					  { 
						  min= ab[i][j]; 
					  }
					 
				 
			  }
		  //System.out.print(ab[i][j]+" "); }
		  }
		  
		  System.out.println(min); 
		  System.out.println();
		  
		
	}

}