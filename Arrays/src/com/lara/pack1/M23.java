package com.lara.pack1;

import java.util.Arrays;

public class M23 
{
	public static void main(String[] args) 
	{
		String[] elements ={"abc", "xyz", new String("hello")};
		System.out.println(Arrays.toString(elements));
	}
//here we get content not addres becz inside string class objectclass toString got overrided
}

