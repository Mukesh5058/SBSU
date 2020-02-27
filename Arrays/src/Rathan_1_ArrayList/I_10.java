package Rathan_1_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class I_10
{

	public static void main(String[] args)
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("aaa");a1.add("bbb");a1.add("ccc");a1.add("ddd");a1.add("eee");
		System.out.println("before"+a1);
		Collections.swap(a1, 1, 3);
		System.out.println(a1);
		a1.add("fff");
		System.out.println(a1);
		
		System.out.println(a1.subList(2, 5));
	}

}
