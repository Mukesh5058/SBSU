package com.lara.pack1;

import java.util.Arrays;

class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
}
public class M21 
{
	public static void main(String[] args) 
	{
		A[] elements = new A[4];
		elements[0] = new A(90);
		A a1 = new A(10);
		elements[1] = a1;
		elements[2] = new A(10);
		elements[3] = new A(20);
		System.out.println(Arrays.toString(elements));//calls object class toString method
	}

}
/*
 * output:
 * [com.lara.pack1.A@139a55, com.lara.pack1.A@1db9742, com.lara.pack1.A@106d69c, com.lara.pack1.A@52e922]

 */

