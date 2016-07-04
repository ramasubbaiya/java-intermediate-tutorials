package com.tutorial.rama.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTutorial {

	public static void main(String[] args) {
		// Unsorted, Unordered
		Map<Integer, String> hashMap = new HashMap<>();
		// Ordered, Unsorted
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		// Sorted
		Map<Integer, String> treeMap = new TreeMap<>();
		
		testMap("Hash Map",hashMap);
		testMap("Linked Hash Map", linkedHashMap);
		testMap("Tree Map", treeMap);
	}
	
	private static void testMap(String mapType, Map<Integer, String> map) {
		map.put(5, "Willow");
		map.put(7, "AliBaba");
		map.put(4, "Barbar");
		map.put(2, "Tutiop");
		map.put(1, "Zebra");
		
		System.out.println("\nMap Type : " + mapType);

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
