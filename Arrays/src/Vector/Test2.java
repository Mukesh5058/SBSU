package Vector;

import java.util.Iterator;
import java.util.Vector;

public class Test2
{

	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<Integer>();
		for(int i = 0; i < 20; i++)
		{
			v.add(i);
		}
		System.out.println(v);
		
		Iterator<Integer> itr= v.iterator();
		while (itr.hasNext())
		{
			Integer s = (Integer) itr.next();
			if(s%2 == 0)
				System.out.println(s);
				else
				itr.remove();
		}
		System.out.println(v);
	}

}
