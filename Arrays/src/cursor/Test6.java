package cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test6
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("mechanical");
		al.add("cse");
		al.add("it");
		al.add("ece");
		al.add("eee");
		ListIterator<String> li1 = al.listIterator();
		li1.add("biotech");
		while (li1.hasNext())
		{
			
			String s = li1.next();
			if(s.equals("eee"))
			{
				li1.remove();
			}	
			
			if(s.equals("it"))
			{
				li1.set("info_tech");
			}
		}
		System.out.println(al);
	}
}
