package com.tutorial.rama.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTutorial {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(5, "Willow");
		map.put(7, "AliBaba");
		map.put(4, "Barbar");
		map.put(2, "Tutiop");
		map.put(1, "Zebra");
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}
}
