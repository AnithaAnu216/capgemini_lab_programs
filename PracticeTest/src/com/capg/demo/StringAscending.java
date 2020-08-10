package com.capg.demo;
import java.util.Arrays;
public class StringAscending {

	public static void main(String[] args) {
		String[] list = {"apple","banana","grapes","sapota"};
		Arrays.sort(list,(x,y)->Integer.compare(x.length(),y.length()));
		System.out.println(Arrays.deepToString(list));

	}

}
