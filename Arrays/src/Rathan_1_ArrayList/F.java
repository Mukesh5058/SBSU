package Rathan_1_ArrayList;

import java.util.ArrayList;

public class F
{

	public static void main(String[] args)
	{
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(10);				//0th index
		al.add(100);			//1st index 
		
		System.out.println(al);						//[10, 100]
		ArrayList a2 = new ArrayList(al);
		a2.add("abc");				//0th index
		a2.add("bbb");			//1st index 
		a2.add("xyz");
		System.out.println(a2);						//[10, 100, abc, bbb, xyz]
		
		
		
		ArrayList<Integer> b1 = new ArrayList<Integer>();
		b1.add(10);
		b1.add(100);
		ArrayList<Integer> b2 = new ArrayList<Integer>(b1); //approch NO 1
		b2.add(20);
		b2.add(200);
		System.out.println(b2);		//	[10, 100, 20, 200]
		b2.addAll(b1);										//Approch NO 2
		b2.addAll(al);
		System.out.println(b2);		//  [10, 100, 20, 200, 10, 100] 
		
	}

}
