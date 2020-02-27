package com.lara.pack1;
//sorting
import java.util.Arrays;

class D implements Comparable
{
	int i;
	D(int i)
	{
		this.i=i;
	}
	@Override
	public String toString() {
		return "i= " + i;
	}
	@Override
	public int compareTo(Object o) 
	{
		return i - ((D)o).i;
	}
}
public class M31 
{
	public static void main(String[] args) 
	{
		D[] elements = {new D(9), new D(1), new D(12), new D(8), new D(0)};
		System.out.println(Arrays.toString(elements));
		Arrays.sort(elements);
		System.out.println(Arrays.toString(elements));
	}
}
/*
 
 
 */

