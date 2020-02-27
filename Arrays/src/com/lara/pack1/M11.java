package com.lara.pack1;

public class M11 
{
	public static void main(String[] args) 
	{
		int[] x={10, 20, 30, 0, 2, 40};
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
		System.out.println(x[5]);
		
		x[2]=100;
		x[4]=10;
		
		System.out.println("==========");
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
		System.out.println(x[5]);
	}

}
