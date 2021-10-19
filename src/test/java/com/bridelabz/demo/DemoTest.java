package com.bridelabz.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DemoTest {
	@Test
		public void testUserInput()
		{
			Demo obj = new Demo();
			
			assertTrue(obj.checkUserInput("abcs"));
		}

	}



