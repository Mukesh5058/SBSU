package cursor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Test1
{
	public static void main(String[] args)
	{
		Vector<String> a1= new Vector<String>();
		a1.add("aaa");
		a1.add("bbb");
		a1.add("ccc");
		a1.add("ddd");
		Enumeration e = a1.elements();
		while(e.hasMoreElements())
		{
			String s = (String) e.nextElement();
			System.out.println(s);
		}
		
		Enumeration<String> e1 = a1.elements();
		while (e1.hasMoreElements())
		{
			String s1 =  e1.nextElement();
			System.out.println(s1);
		}
	}
}
