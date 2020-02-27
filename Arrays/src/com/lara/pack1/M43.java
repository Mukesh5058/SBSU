package com.lara.pack1;

import java.util.Arrays;
import java.util.Comparator;
//sorting
class V
{
	int i, j;
	V(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "i(=" + i + ", j=" + j + ")";
	}
}
public class M43 
{
	public static void main(String[] args) 
	{
		V[] elements = {
				         new V(10, 20),
				         new V(5, 25),
				         new V(15, 5),
				         new V(30, 2),
				         new V(7, 35),
				         new V(1, 35)
		};
		System.out.println(Arrays.toString(elements));
		Comparator c1 =(o1, o2) -> ((V)o1).i -((V)o2).i;
		Arrays.sort(elements, c1);
		System.out.println("i ascending order"+Arrays.toString(elements));
		
		Comparator c2 =(o1, o2) -> ((V)o2).i -((V)o1).i;
		Arrays.sort(elements, c2);
		System.out.println("i descending order"+Arrays.toString(elements));
		
		Comparator c3 =(o1, o2) -> ((V)o1).j -((V)o2).j;
		Arrays.sort(elements, c3);
		System.out.println("j ascending order"+Arrays.toString(elements));
		
		Comparator c4 =(o1, o2) -> ((V)o2).j -((V)o1).j;
		Arrays.sort(elements, c4);
		System.out.println("j descending order"+Arrays.toString(elements));
	}

}
