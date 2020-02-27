package com.lara.pack1;
interface U
{
	int test(String s1, int i, boolean j);
}
public class M42 
{
	public static void main(String[] args) 
	{
//		U u1 = (i, j, k) -> i.length() + j + (k ? i.length() : j);
//		//(K ? i.length() : j)if k boolean is a true then consider length if k is false then consider : j
//		int i = u1.test("abc", 10, true); 
//		int j = u1.test("abc", 10, false);
//		System.out.println(i);
//		System.out.println(j);
		
		U u2 = (p, q, r) -> {
			System.out.println("from test");
			return p.length() + q + (r ? q : (p.length() + q));
		};
		int i = u2.test("abc", 10, true);
		int j = u2.test("abc", 10, false);
		System.out.println(i);
		System.out.println(j);
	}

}
