package com.cdac.acts.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTester {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Ganesh","Dinesh","Ramesh","Suresh"));
		//Using map method of stream
		//1. Convert to stream
		//2. Perform operation
		//3. Collect from Stream to collection


		Stream<String> stream = list.stream(); // Convert to stream
		stream = stream.map((s) -> s.toLowerCase()); // Process
		List<String> processedLlist = stream.collect(Collectors.toList()); //Collect in collection
		System.out.println(processedLlist);
		
		processedLlist.forEach(System.out::println);
		
		List<String> newList = list.stream() // Convert to stream
				.map((s) -> s.toUpperCase()) // Process
				.collect(Collectors.toList()); //Collect in collection
		System.out.println(newList);
		newList.forEach(System.out::println);
	}

}
