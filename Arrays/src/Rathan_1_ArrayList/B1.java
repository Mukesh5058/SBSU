package Rathan_1_ArrayList;

import java.util.ArrayList;

public class B1
{
public static void main(String[] args)
{
	ArrayList al = new ArrayList();
	
	al.add(new Emp(1,"wipro"));
	al.add(new Student(101, "muru"));
	
	
	Emp e = (Emp) al.get(0);
	System.out.println(e.eid + " "+e.ename);
	
	Student s = (Student) al.get(1);
	System.out.println(s.sid + " "+s.sname);
	
	
	
	Object o = al.get(0);
	if(o instanceof Emp)
	{
		Emp e1 = (Emp) al.get(0);
		System.out.println();
		System.out.println("type casting =>"+ e1.eid + " "+e1.ename);
	}
	
	if(o instanceof Student)
	{
		Student s1 = (Student) al.get(1);
		System.out.println("type casting =>"+ s1.sid + " "+s1.sname);
	}
}
}
