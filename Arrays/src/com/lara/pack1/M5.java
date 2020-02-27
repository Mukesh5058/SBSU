package com.lara.pack1;

public class M5 
{
	public static void main(String[] args) 
	{
		int[] data = new int[4];
		int[] x= data;
		data[2] = 20;
		x[0]=30;
		System.out.println(data[0]);
		System.out.println(x[2]);
		System.out.println(data[2]);
		System.out.println(x[0]);

	}

}
