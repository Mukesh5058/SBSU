package Rathan_1_ArrayList;

import java.util.ArrayList;

public class G
{
	public static void main(String[] args)
	{
		Emp e1 = new Emp(111, "aaa");
		Emp e2 = new Emp(222, "bbb");
		Emp e3 = new Emp(333, "ccc");
		Emp e4 = new Emp(444, "ddd");
		
		ArrayList<Emp> a1 = new ArrayList<Emp>();
			a1.add(e1);
			a1.add(e2);
			for(Emp e :a1)
			System.out.println(e.eid + " "+e.ename);
			System.out.println("------------------------");
			
			ArrayList<Emp> a2 = new ArrayList<Emp>();
			a2.addAll(a1);
			a2.add(e3);
			a2.add(e4);
			
			
			
//			System.out.println(a2.contains(e1));
//			System.out.println(a2.containsAll(a1));
//			a2.remove(e1);
//			System.out.println(a2.contains(e1));
//			System.out.println(a2.containsAll(a1));
			
//			a2.removeAll(a1);
			a2.retainAll(a1);
			
			System.out.println("------------------------");
			for(Emp ee :a2)
				
			System.out.println(ee.eid + " "+ee.ename);
	}
	
}
