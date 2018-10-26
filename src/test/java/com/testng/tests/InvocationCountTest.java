package com.testng.tests;

import org.testng.annotations.Test;

public class InvocationCountTest {
	@Test(invocationCount=5)
	public void invocationCountTest()
	{
		System.out.println(" Invocation Count Test.. ");
	}
}
