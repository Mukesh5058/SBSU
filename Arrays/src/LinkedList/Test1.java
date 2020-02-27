package LinkedList;

import java.util.LinkedList;

public class Test1
{

	public static void main(String[] args)
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("aaa"); ll.add("bbb"); ll.add("ccc"); ll.add("ddd"); ll.add("eee");
		System.out.println(ll);
		ll.addFirst("aaa1");
		ll.addLast("eee1");
		System.out.println(ll.size());
		System.out.println(ll);
		ll.add(1, "bbb1");
		System.out.println(ll);
		ll.set(1,"zzz");
		System.out.println(ll);
		ll.remove(5);
		ll.remove("bbb1");
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		ll.clear();
		System.out.println(ll.isEmpty());
		
	}

}
