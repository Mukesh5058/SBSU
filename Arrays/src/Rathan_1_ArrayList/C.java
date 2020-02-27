package Rathan_1_ArrayList;

import java.util.ArrayList;

public class C
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		
		al.add(new Emp(1,"wipro"));
		al.add(new Student(101, "muru"));
		
		Emp e = (Emp) al.get(0);
		System.out.println(e.eid + " " + e.ename);
		
		Student s = (Student) al.get(1);
		System.out.println(s.sid + " " +s.sname);
		
		System.out.println("-----------------------------");
		
		Object o = al.get(0);
		if(o instanceof Emp)
		{
			Emp e1 = (Emp) al.get(0);
		System.out.println(e1.eid + " " + e1.ename);
		}
		
		if(o instanceof Student)
		{
			Student s1 = (Student) al.get(0);
		System.out.println(s1.sid + " " + s1.sname);
		}
		
		System.out.println("-----------------------------");
		
		Object oo = al.get(1);
		if(oo instanceof Emp)
		{
			Emp e1 = (Emp) al.get(0);
		System.out.println(e1.eid + " " + e1.ename);
		}
		
		if(oo instanceof Student)
		{
			Student s1 = (Student) al.get(1);
		System.out.println(s1.sid + " " + s1.sname);
		}
		
		System.out.println("-----------------------------");
		
		ArrayList<Emp> a2 = new ArrayList<Emp>();
		a2.add(new Emp(111, "mani"));
		a2.add(new Emp(222, "muru"));
		for(Emp ee: a2)
		{
			System.out.println(ee.eid + " " + ee.ename);
		}
		System.out.println("-----------------------------");
		
		Emp e1 = a2.get(0);
		System.out.println(e1.eid + " " + e1.ename);
		
System.out.println("-----------------------------");
		
		Emp e2 = a2.get(1);
		System.out.println(e2.eid + " " + e2.ename);
	}
}
