package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum()
	{
		System.out.println("sum method after changes");
		int a=10;
		int b=50;
	Assert.assertEquals(60, a+b);
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
