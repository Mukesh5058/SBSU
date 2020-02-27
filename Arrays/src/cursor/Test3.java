package cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test3
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("rathan"); al.add("lara"); al.add("muru"); al.add("cs");
		ListIterator lit1 = al.listIterator();
		while(lit1.hasNext())
		{
			String s = (String) lit1.next();
			System.out.println(s);
		}
		while(lit1.hasPrevious())
		{
			String s = (String) lit1.previous();
			System.out.println(s);
		}
		
		
		System.out.println("------");
		ListIterator<String> lit2 = al.listIterator();
		while(lit2.hasNext())
		{
			String s =  lit2.next();
			System.out.println(s);
		}
		while(lit2.hasPrevious())
		{
			String s = lit2.previous();
			System.out.println(s);
		}
		
		
		
	}
}
