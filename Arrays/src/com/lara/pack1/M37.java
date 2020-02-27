package com.lara.pack1;

import java.util.Arrays;
import java.util.Comparator;

class P
{
	int i, j;
	P(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(i=" + i + ", j=" + j + ")";
	}
}
public class M37 
{
	public static void main(String[] args) 
	{
		P[] elements = {new P(10, 20), new P(9, 25), new P(15, 18), new P(0, 40), new P(20, 2), new P(5,28)};
		System.out.println(Arrays.toString(elements));
		Arrays.sort(elements, new Comparator()
		{
			public int compare(Object o1, Object o2)
			{
				return ((P)o1).i - ((P)o2).i;
			}
		});
		System.out.println("Ascending order" +Arrays.toString(elements));
		Arrays.sort(elements, new Comparator()
		{
			public int compare(Object o1, Object o2)
			{
				return ((P)o2).i - ((P)o1).i;
			}
		});
		System.out.println("i desecnding order " +Arrays.toString(elements));
		Arrays.sort(elements, new Comparator()
		{
			public int compare(Object o1, Object o2)
			{
				return ((P)o2).j - ((P)o1).j;
			}
		});
		System.out.println("j descending order" +Arrays.toString(elements));
		Arrays.sort(elements, new Comparator()
		{
			public int compare(Object o1, Object o2)
			{
				return ((P)o1).j - ((P)o2).j;
			}
		});
		System.out.println("j ascending order" +Arrays.toString(elements));
	}

}
