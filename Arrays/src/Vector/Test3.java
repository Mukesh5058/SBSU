package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test3
{
	public static void main(String[] args)
	{
		Vector<product> v = new Vector<product>();
		v.add(new product(3, "soap", 30));
		v.add(new product(3, "vax", 30.35));
		v.add(new product(3, "lim", 3.50));
		
		System.out.println("Using Enumerator");
		Enumeration<product> enu = v.elements();
		while(enu.hasMoreElements())
		{
			product p3 = enu.nextElement();
			System.out.println(p3.id + " " + p3.name + " " + p3.cost);
		}
		
		System.out.println("\nUsing Iterator");
		Iterator<product> it = v.iterator();
		while (it.hasNext())
		{
			product p3 = (product) it.next();
			System.out.println(p3.id + " " + p3.name + " " + p3.cost);			
		}
		
		System.out.println("\nUsing ListIterator");
		ListIterator<product> lit = v.listIterator();
		while (lit.hasNext())
		{
			product p3 = (product) lit.next();
			System.out.println(p3.id + " " + p3.name + " " + p3.cost);			
		}
	}
}
