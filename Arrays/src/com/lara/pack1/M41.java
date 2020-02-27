package com.lara.pack1;
interface T
{
	int test(int i, int j);
}
public class M41 
{
	public static void main(String[] args) 
	{
//		T t1 =(x, y) -> 20;// 20 is returing and assigning
//		int m = t1.test(10, 20);
//		System.out.println(m);
//		 
//		T t2 = (x, y) -> x-y;
//		int n = t2.test(30, 40);
//		System.out.println(n);
		
//		T t3 = (x, y) -> x + y;
//		int p = t3.test(20, 40);
//		System.out.println(p);
		
		T t4 = (i, j) -> {
			System.out.println("from test");
			return i + j;
		};
		int q = t4.test(20, 40);
		System.out.println(q);
	}

}
