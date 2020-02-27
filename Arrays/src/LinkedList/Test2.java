package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Test2
{

	public static void main(String[] args)
	{
		LinkedList<Book> ll = new LinkedList<Book>();
		ll.add(new Book(111, "java", "ratan"));
		ll.add(new Book(222, "c", "siva"));
		ll.add(new Book(333, "spring", "james"));
		ll.add(new Book(444, "hibernate", "camuraun"));
		
		System.out.println("LINKED LIST METHOD");
		ListIterator<Book> li = ll.listIterator();
		while(li.hasNext())
		{
			Book b = li.next(); 
			System.out.println(b.id + " " + b.name + " " + b.auther);
		}
		
		
		System.out.println("\n GET METHOD");
		Book b1 = ll.get(0);
		System.out.println(b1.id + " " + b1.name + " " + b1.auther);
		
		
		System.out.println("\n FOR LOOP METHOD");
		for(Book b2 : ll)
		{
			System.out.println(b2.id + " " + b2.name + " " + b2.auther);
		}
		
		
		System.out.println("\n REMOVE METHOD");
		ListIterator<Book> l2 = ll.listIterator();
		while(l2.hasNext())
		{
			Book b3 = l2.next();
			if(b3.name.equals("c"))
			{
				l2.remove();
			}
		}
			for(Book bb : ll)
			{
			//	Book bbb = li.next(); 
				System.out.println(bb.id + " " + bb.name + " " + bb.auther);
			}
		
		

	}

}
