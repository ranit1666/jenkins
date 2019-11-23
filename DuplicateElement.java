package demo;

import org.testng.annotations.Test;

public class DuplicateElement 
{
	@Test
	public void arraytest()
	{
	int a[]= {10,20,5,8,5,10,30,5};

for(int i=0;i<a.length-1;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==a[j] && i!=j)
		{
			System.out.println(a[j]);
			break;
		}
		
	}
}
	
	}	
	
	
	
	
	
	
}
