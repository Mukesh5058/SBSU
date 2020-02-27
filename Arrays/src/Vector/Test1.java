package Vector;

import java.util.ArrayList;
import java.util.Vector;

public class Test1
{
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>(2,6);
				System.out.println(v.capacity());
				v.add("aaa"); v.add("bbb"); v.add("ccc"); v.add("ddd");
				System.out.println(v);
				System.out.println(v.capacity());
				
				
				v.removeAll(v);
				System.out.println("-------------");
				ArrayList<String> al = new ArrayList<String>();
				al.add("mani");al.add("madhu");
				
				Vector<String> v1 = new Vector<String>(al);
				v1.add("aaa"); v1.add("bbb"); v1.add("ccc"); v1.add("ddd");
				System.out.println(v1);
	}
}
