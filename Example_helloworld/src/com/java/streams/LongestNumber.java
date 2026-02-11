package com.java.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestNumber {
	public static void main(String[] args) {
		// interface <generics> object = class.staticmethod(only accepts 10 to 15 input parameters);
		List<Integer> list = Arrays.asList(10, 45, 3, 99, 23); 

		//Datatype variableInstallization = Assignvaluesin collections.staticMethod(list);
		int max = Collections.max(list);

		//Class.staticvarible.staicMethod
		System.out.println("Using max " + max);

		//Datatype variableInstallization = int varibles
		int[] arr = { 10, 45, 3, 99, 23 };

		//Datatype variableInstallization = ArraysClass.streamStaticMethod.maxMethod.
		int max1 = Arrays.stream(arr).max().orElseThrow();

		System.out.println("Using Array " + max1);

		int usingStreams = list.stream().mapToInt(Integer::intValue).max().orElseThrow();

		System.out.println("usingStreams " + usingStreams);

	}
}
