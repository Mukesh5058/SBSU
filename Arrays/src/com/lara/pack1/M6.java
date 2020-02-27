package com.lara.pack1;

public class M6 
{
	public static void main(String[] args) 
	{
		int[] data = new int[4];
		data[2] = 20;
		System.out.println("before calling test" + data[2]);
		test(data);
		System.out.println("after calling test"+data[2]);
	}
	static void test(int[] x)
	{
		x[2] = 30;
	}

}
//data and x both are pointing to the same object