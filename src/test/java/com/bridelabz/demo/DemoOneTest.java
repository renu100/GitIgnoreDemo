package com.bridelabz.demo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class DemoOneTest {
	@Test
	public void addNode() {
		DemoOne firstNode =new DemoOne(10);
		assertEquals(10,firstNode.data);
	}

}
