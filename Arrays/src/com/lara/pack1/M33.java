package com.lara.pack1;
import java.util.Arrays;
//sorting based on ascending order
import java.util.Comparator;

class F
{
	int i,j;
	F(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	@Override
	public String toString() 
	{
		return "(i= " + i + ",j= " + j +")";
	}
	
}

class G implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		return ((F)o1).i - ((F)o2).i;
	}
   
}

class H implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		return ((F)o2).i - ((F)o1).i;
	}
}


class M implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		return ((F)o1).j - ((F)o2).j;
	}
   
}

class N implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		return ((F)o2).j - ((F)o1).j;
	}
}

public class M33 
{
    public static void main(String[] args) 
    {
		F[] elements ={new F(10, 20), new F(5, 30), new F(14, 10), new F(8, 40), new F(10, 25)};
		System.out.println("original" + Arrays.toString(elements));
		Arrays.sort(elements, new G());
		System.out.println("i ascending:" +Arrays.toString(elements));
		Arrays.sort(elements, new H());
		System.out.println("i descending:"+Arrays.toString(elements));
		Arrays.sort(elements, new M());
		System.out.println("j ascending"+Arrays.toString(elements));
		Arrays.sort(elements, new N());
		System.out.println("j descending"+Arrays.toString(elements));
	}
}
