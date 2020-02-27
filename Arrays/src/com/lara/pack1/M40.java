package com.lara.pack1;
interface S
{
	int test();
}
public class M40 
{
	public static void main(String[] args) 
	{
//		S s1 = () -> 10;//specifying the final return value (i.e) 10
//		int i = s1.test();
//		System.out.println("done:" + i);
		
		S s2 = () -> {
			System.out.println("from test");
			return 20;
		};
		int j= s2.test();
		System.out.println(j);
	}

}
