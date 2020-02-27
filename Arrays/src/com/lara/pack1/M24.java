package com.lara.pack1;

import java.util.Arrays;

class B
{
	int i;
	B(int i)
	{
		this.i=i;
	}
	
	@Override
	public String toString() 
	{
		
		return  "i=" + i;
	}
}
public class M24 
{
	public static void main(String[] args) 
	{
		B[] elements = {new B(90), new B(0), new B(100)};
		System.out.println(Arrays.toString(elements));
	}

}
