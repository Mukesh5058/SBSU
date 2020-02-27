package cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class Test5
{
	public static void main(String[] args)
	{
		ArrayList<Book> al = new ArrayList<Book>();
		al.add(new Book(111, "aaa", "xyz"));
		al.add(new Book(222, "bbb", "fcd"));
		al.add(new Book(333, "ccc", "mno"));
		
		Iterator<Book> it = al.iterator();
		while(it.hasNext())
		{
			Book b = it.next();
			if(b.id == 111)
			{
				it.remove();
			}
			if(b.auther == "mno")
			{
				it.remove();
			}
		}
		
		for(Book b : al)
		{
			System.out.println(b.id + " " + b.name + " " + b.auther);
		}
	}
}
