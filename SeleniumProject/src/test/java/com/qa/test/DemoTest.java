package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum()
	{
		System.out.println("sum method");
		int a=10;
		int b=20;
	Assert.assertEquals(30, a+b);
	}
	@Test
	public void sub()
	{
		System.out.println("sub method");
		int a=10;
		int b=20;
	Assert.assertEquals(10, b-a);
		
	}

}
