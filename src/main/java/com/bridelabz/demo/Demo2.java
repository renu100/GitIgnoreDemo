package com.bridelabz.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo2 {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
			myList.add(i);

		// Method 5: Implicit Lambda Function
		myList.forEach(n -> {
			System.out.println("Mth5: forEach Lambda impl Value::" + n);
		});
		myList.stream().forEach(n -> {
			System.out.println("Mth5: Stream forEach Value::" + n);
		});

		// method 6
		Function<Integer, Double> toDoubleFunction = Integer::doubleValue;
		myList.forEach(n -> {
			System.out.println("Math5 : forEach Lambda double Value::" + toDoubleFunction.apply(n));
		});

		myList.stream().map(toDoubleFunction).forEach(System.out::println);
		List<Double> doubleList = myList.stream().map(toDoubleFunction).collect(Collectors.toList());

		System.out.println("Printing Double List:" + doubleList);

		// Method7

		Predicate<Integer> isEvenFunction = n -> n % 2 == 0;
		myList.forEach(n -> {
			System.out.println("Math5: forEach value of : " + n + "check for Even: " + isEvenFunction.test(n));
		});

		List<Integer> evenList = myList.stream().filter(isEvenFunction).collect(Collectors.toList());
		System.out.println("Printing Even List: " + evenList);

		// method 8

		Integer first = myList.stream().filter(isEvenFunction).peek(n -> System.out.println("Pea Even Number: " + n))
				.findFirst().orElse(null);
		System.out.println("Math8: First Even:" + first);
		
		//method 13
		List<Integer> sortedList = myList.stream().sorted((n1,n2) -> n2.compareTo(n1)).collect(Collectors.toList());
		System.out.println("math13:"+sortedList);
		
		//method 11 sum count average of number
		
	}

}
