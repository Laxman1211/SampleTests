package com.testng.tests;

import org.testng.annotations.Test;

public class InfiniteLoopTest {
	
	/*@Test(invocationTimeOut=1)
	public void infiniteLoop()
	{
		int i = 1;
		while(i == 1)
		{
		System.out.println(" infinite Loop.. ");
		}
		i++;
	}
	*/
	@Test(expectedExceptions=NumberFormatException.class)
	public void numberFormat()
	{
		String a="100A";
		Integer.parseInt(a);
		System.out.println("Number Format Exception..");
	}
}
