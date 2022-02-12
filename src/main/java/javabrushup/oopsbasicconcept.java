package javabrushup;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class oopsbasicconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1, j=1, sum=0, l=0,m=0;
		
		
		for(i=1;i<4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");
		
		for(i=1;i<4;i++)
		{
			for(j=1;j<=4-i;j++)
			{
				System.out.print("*");
				System.out.print("\t");
			}
		System.out.println();

		}
		System.out.println("----------------------------------------");
		
		for(i=1;i<4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		for(i=1;i<4;i++)
		{
			for(j=1;j<=4-i;j++)
			{
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		for(i=1;i<4;i++)
		{
			for(j=1;j<=i;j++)
			{
				sum=i*j;
				System.out.print(sum);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		for(i=1;i<4;i++)
		{
			for(j=1;j<=i;j++)
			{
				l++;
				System.out.print(l);
				System.out.print("\t");
			}
			System.out.println();
		}	
		System.out.println("----------------------------------------");
		
		for(i=1;i<4;i++)
		{
			for(j=1;j<=4-i;j++)
			{
				m++;
				System.out.print(m);
				System.out.print("\t");
				
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		

	}
	

}