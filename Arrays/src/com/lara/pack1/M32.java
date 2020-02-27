package com.lara.pack1;

import java.util.Arrays;

class E implements Comparable
{
	int i, j;
	E(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString() {
		return "(i= " + i + ", j= " + j + ")";
	}
	@Override
	public int compareTo(Object o) 
	{
		return i - ((E)o).i - i;//ascending order
//		return ((E)o).i - i;//descending order
	}

}
public class M32 
{
	public static void main(String[] args) 
	{
		E[] elements = {new E(10, 5), new E(4, 9), new E(15, 2), new E(2, 20)};
		System.out.println(Arrays.toString(elements));
		Arrays.sort(elements);
		System.out.println(Arrays.toString(elements));
	}

}
