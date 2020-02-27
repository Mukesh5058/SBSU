package Rathan_1_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class H
{

	public static void main(String[] args)
	{
		
		
		//arrays to coll converison
		String []s = {"aaa","bbb","ccc"};					//array
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(s));		//coll
		
		a1.add("muru");
		a1.add("mani");
		for(String A1:a1)
		{
			System.out.println(A1);
		}
		
		System.out.println("-----------");
		//convert coll to array
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("india");
		a2.add("pak");
		System.out.println(a2.toString());
		String[] s1 = new String[a2.size()];
		a2.toArray(s1);
		for(String A2:a2)
		{
			System.out.println(A2);
		}
		System.out.println(a2.toString());
		
		System.out.println("-----------");
		//convert soll to array
		ArrayList a3 = new ArrayList();
		a3.add("india");
		a3.add(100);
		Object[] o = a3.toArray();
		for(Object oo:o) 
		{
			System.out.println(oo);
		}
	}

}
