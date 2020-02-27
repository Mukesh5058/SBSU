package cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test4
{

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("rathan"); al.add("lara"); al.add("muru"); al.add("cs");
		
		Iterator<String> itr1 = al.iterator();
		while(itr1.hasNext())
		{
			String s = itr1.next();
			if(s.equals("cs"))
			{
				itr1.remove();
			}
			System.out.println(s);
			
		}
		System.out.println(al);	
		
		System.out.println("--------------");
		Iterator<String> itr2 = al.iterator();
		while(itr2.hasNext())
		{
			String s = itr2.next();
			if(s.equals("cs"))
			{
				itr2.remove();
			}
			System.out.println(s);
			
		}
		System.out.println(al);	
	
	
			
	}

}
