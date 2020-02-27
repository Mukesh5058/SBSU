package com.lara.pack1;

public class M15 
{
	public static void main(String[] args) 
	{
		int[] x = new int[3];
		Object y = x;
		int[] z = (int[]) y;
		System.out.println(x[0]);
//		System.out.println(y[0]);
		System.out.println(z[0]);
	}

}
