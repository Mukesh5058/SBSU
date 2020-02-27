package Rathan_1_ArrayList;

import java.util.ArrayList;

public class D
{

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(10);				//0th index
		al.add(10.5);			//1st index 
		al.add("xyz");
		al.add(null);
		al.add(10);				//4th
		
		System.out.println(al);				//[10, 10.5, xyz, null, 10]
		// int i = al.size();
		System.out.println(al.size());		//5
		al.add(2 , "abc");
		System.out.println(al);				//[10, 10.5, abc, xyz, null, 10]
		al.remove(3);
		System.out.println(al);				//[10, 10.5, abc, null, 10]
		al.remove("xyz");					//[10, 10.5, abc, null, 10]
		al.set(6, "setdata");				//if index value not suitable we get java.lang.IndexOutOfBoundsException
		System.out.println(al);
		System.out.println(al.isEmpty());	//false
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());    //true
		al.remove(10);						  //java.lang.IndexOutOfBoundsException: (10 is index not data)
	}
	

}
