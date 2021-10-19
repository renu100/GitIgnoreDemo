package com.bridelabz.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	boolean checkUserInput(String name) {
		Pattern pat= Pattern.compile("^[A-Z]{1}[a-z]*$");
		Matcher match=pat.matcher(name);
		boolean result = match.matches();
		return result;
	}
	
	}


