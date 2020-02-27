package com.lara.pack1;

import java.util.Arrays;
import java.util.Collections;

public class M28 
{

	public static void main(String[] args) 
	{
		String[] elements ={"hello", "abc", "xyz", "check", "test"};
		System.out.println(Arrays.toString(elements));
		Arrays.sort(elements, Collections.reverseOrder());
		System.out.println(Arrays.toString(elements));
	}

}
