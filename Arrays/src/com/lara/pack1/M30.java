package com.lara.pack1;
//sorting
import java.util.Arrays;
//
//class D
//{
//	int i;
//	D(int i)
//	{
//		this.i=i;
//	}
//	@Override
//	public String toString() 
//	{
//		return "i= " + i;
//	}
//}
public class M30 
{
	public static void main(String[] args) 
	{
		D[] elements = {new D(90), new D(50), new D(9), new D(100)};
		System.out.println(Arrays.toString(elements));
		Arrays.sort(elements);//D class doesnt require some thing
		//object class cannot be sorted by default
		//by default we cannot sort multiple objects
		//we cannot substract one object one object from another object
		System.out.println(Arrays.toString(elements));
	}

}
