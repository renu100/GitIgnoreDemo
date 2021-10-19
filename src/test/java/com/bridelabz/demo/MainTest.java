package com.bridelabz.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		String result = new Main("renu").getName();
		assertEquals("renu", result);
	}
}
