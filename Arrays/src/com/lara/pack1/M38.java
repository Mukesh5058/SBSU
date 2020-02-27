package com.lara.pack1;
interface Q
{
	void test1();//interface which have only one method that is called functional interface(ex: runnnable, Comparable)
}
public class M38 
{
    public static void main(String[] args) 
    {
		class A implements Q
		{
			@Override
			public void test1() 
			{
				System.out.println("from A test1");
			}
		}
		A a1 = new A();
		a1.test1();
		
		//annonymous inner class
		Q q1 = new Q()
				{
                     public void test1() 
                     {
                    	 System.out.println("feom AIC");
                     };			
				};
				q1.test1();
				
		Q q2= () -> System.out.println("from lamda exp");
		q2.test1();
		//lamda expression are only for single method interface
		
		Q q3 = () -> {
			System.out.println("from lamda exp");
			System.out.println("from lamda exp");
			System.out.println("from lamda exp");
		};
		q3.test1();
	}      
}
