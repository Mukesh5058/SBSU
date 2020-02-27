package cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("rathan"); al.add("lara"); al.add("muru"); al.add("cs");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("=================");
		Iterator<String> itr1 = al.iterator();
		while(itr1.hasNext())
		{
			
			String s = itr1.next();
			System.out.println(s);
		}
		
	}
}
