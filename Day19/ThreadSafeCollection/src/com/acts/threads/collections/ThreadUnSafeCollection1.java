package com.acts.threads.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class ThreadUnSafeCollection1 {
	public static void main(String[] args) throws Exception {
		List<Integer> list = new ArrayList<>();
		list = Collections.synchronizedList(list);
		
		
		Set<Integer> set = new HashSet();
		set = Collections.synchronizedSet(set);
		
		Map<String, String> map = new HashMap<>();
		map = Collections.synchronizedMap(map);
		
	}
}