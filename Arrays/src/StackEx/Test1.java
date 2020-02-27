package StackEx;

import java.util.Stack;

public class Test1
{
	public static void main(String[] args)
	{
		Stack<String> st = new Stack<String>();
		st.push("aaa"); st.push("bbb"); st.push("ccc"); st.push("ddd"); st.push("eee");
		System.out.println(st);
		System.out.println(st.search("ccc"));
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.empty());
		st.clear();
		System.out.println(st.empty());
	}
}
