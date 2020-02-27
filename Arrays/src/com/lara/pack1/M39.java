package com.lara.pack1;
interface R
{
	void test1(int i);
}
public class M39 
{
	public static void main(String[] args) 
	{
//		R r1 =(i) -> System.out.println("from test1:" + i);
//		r1.test1(20);
//		System.out.println("-----------------------------");
		
//		R r2 = x -> System.out.println("from test1 :" + x);
//		r2.test1(30);
		//representing argument through x (scalar method)
		R r3 = x -> {
			          System.out.println("from test" + x);
			          System.out.println("from test" + x);
		};
		r3.test1(34);
	}

}
