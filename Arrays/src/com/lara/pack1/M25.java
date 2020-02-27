package com.lara.pack1;

import java.util.Arrays;

class C
{
	int i, j;
	C(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString() {
		return "(i=" + i + ", j=" + j + ")";
	}
}
public class M25 
{
	public static void main(String[] args) 
	{
		C[] elements = {new C(10, 20), new C(0, 1), new C(20, 5)};
		System.out.println(Arrays.toString(elements));
	}

}
