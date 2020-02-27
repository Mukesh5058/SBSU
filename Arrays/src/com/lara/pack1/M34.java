package com.lara.pack1;

import java.util.Arrays;

public class M34 
{
    public static void main(String[] args) 
    {
		F[] elements ={new F(10, 20), new F(5, 30), new F(14, 10), new F(8, 40), new F(10, 25)};
		System.out.println("original" + Arrays.toString(elements));
//		Arrays.sort(elements, new G());
//		System.out.println("i ascending:" +Arrays.toString(elements));
		Arrays.sort(elements, new H());
		System.out.println("i descending:"+Arrays.toString(elements));
//		Arrays.sort(elements, new M());
//		System.out.println("j ascending"+Arrays.toString(elements));
//		Arrays.sort(elements, new N());
//		System.out.println("j descending"+Arrays.toString(elements));
	}


}
