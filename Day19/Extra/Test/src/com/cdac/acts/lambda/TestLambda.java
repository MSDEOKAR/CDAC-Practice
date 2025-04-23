package com.cdac.acts.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import static java.lang.System.*;

public class TestLambda{
	public static void main(String... args) {
		out.println("Hello world " + args[0]);
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		out.println(add.apply(100, 200));
		Comparator<String> comparator = (left, right) -> left.compareTo(right);
		List<String> list = new ArrayList<>();
		list.add("Myname");
		list.stream().forEach(str -> out.println(str));
	}
}
